package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Documento;

/**
 * Classe DocumentoDao.
 */
public class DocumentoDao extends GenericDao<Documento, Integer> {
  public DocumentoDao() {
    super(Documento.class);
  }
}
