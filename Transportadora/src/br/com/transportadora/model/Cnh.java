package br.com.transportadora.model;

import java.io.Serializable;


public class Cnh implements Serializable {

  private String numero;
  private ClasseCNH classe;

  public Cnh() {
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ClasseCNH getClasse() {
    return classe;
  }

  public void setClasse(ClasseCNH classe) {
    this.classe = classe;
  }
}
