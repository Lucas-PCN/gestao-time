package com.trybe.gestaotime.dao;

/**
 * Classe AplicacaoBD.
 **/

public class AplicacaoBD {

  private TimeDao timeDao;
  private JogadorDao jogadorDao;
  private TorcedorDao torcedorDao;
  private DocumentoDao documentoDao;

  /**Construtor.*/
  public AplicacaoBD() {
    this.timeDao = new TimeDao();
    this.jogadorDao = new JogadorDao();
    this.torcedorDao = new TorcedorDao();
    this.documentoDao = new DocumentoDao();
  }

  public TimeDao timeDao() {
    return timeDao;
  }

  public JogadorDao jogadorDao() {
    return jogadorDao;
  }

  public TorcedorDao torcedorDao() {
    return torcedorDao;
  }

  public DocumentoDao documentoDao() {
    return documentoDao;
  }

}
