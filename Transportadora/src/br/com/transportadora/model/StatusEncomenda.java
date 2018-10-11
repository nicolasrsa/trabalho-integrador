package br.com.transportadora.model;

import java.io.Serializable;


public enum StatusEncomenda implements Serializable {

  AGUARDANDO_TRANSPORTE("Aguardando Transporte"),
  EM_TRANSPORTE("Em Transporte"),
  ENTREGUE("Entregue");

  private String nomeStatus;

  private StatusEncomenda(String nome) {
    this.nomeStatus = nome;
  }

  @Override
  public String toString() {
    return nomeStatus;
  }

}
