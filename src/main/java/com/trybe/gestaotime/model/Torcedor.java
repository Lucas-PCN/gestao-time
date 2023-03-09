package com.trybe.gestaotime.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Classe Torcedor.
 **/

@Entity
public class Torcedor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @ManyToMany(mappedBy = "torcedores")
  private List<Time> times;

  public Torcedor() {
    this.times = new ArrayList<Time>();
  }

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Time> getTimes() {
    return times;
  }

  public void setTimes(Time time) {
    this.times.add(time);
  }
}
