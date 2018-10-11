package br.com.transportadora.model;

import java.io.Serializable;


public class Remetente extends Pessoa implements Serializable {

  public Remetente(String nome, Endereco endereco) {
    super(nome, endereco);
  }
}
