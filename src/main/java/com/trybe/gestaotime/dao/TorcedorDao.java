package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Torcedor;

/**
 * Classe TorcedorDao.
 */
public class TorcedorDao extends GenericDao<Torcedor, Integer> {
  public TorcedorDao() {
    super(Torcedor.class);
  }
}
