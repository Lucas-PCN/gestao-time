package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Time;

/**
 * Classe TimeDao.
 */
public class TimeDao extends GenericDao<Time, Integer> {
  public TimeDao() {
    super(Time.class);
  }
}
