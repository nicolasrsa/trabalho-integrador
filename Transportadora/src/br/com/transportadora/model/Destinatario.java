package br.com.transportadora.model;

import java.io.Serializable;


public class Destinatario extends Pessoa implements Serializable {

  public Destinatario(String nome, Endereco endereco) {
    super(nome, endereco);
  }
}
