package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {

  private Class<T> entityClass;
  private EntityManager em;

  public GenericDao(Class<T> entityClass) {
    this.entityClass = entityClass;
    this.em = Persistence.createEntityManagerFactory("crudHibernatePU").createEntityManager();;
  }

  /**
   * Método salvar.
   */
  public void salvar(T entity) {
    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();
    em.close();
  }

  /**
   * Método atualizar.
   */
  public void editar(T entity) {
    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();
    em.close();
  }

  /**
   * Método remover.
   */
  public void deletar(Long id) {
    em.getTransaction().begin();
    T entity = em.find(classType, id);
    em.remove(entity);
    em.getTransaction().commit();
    em.close();
  }

  /**
   * Método find.
   */
  public T pegar(Long id) {
    T entity = em.find(classType, id);
    em.close();
    return entity;
  }

  /**
   * Método listar.
   */
  public List<T> listar() {
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<T> cq = cb.createQuery(classType);
    Root<T> rootEntry = cq.from(classType);
    CriteriaQuery<T> all = cq.select(rootEntry);
    TypedQuery<T> allQuery = em.createQuery(all);
    return allQuery.getResultList();
  }
}
