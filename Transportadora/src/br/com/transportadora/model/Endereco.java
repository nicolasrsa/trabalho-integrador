package br.com.transportadora.model;

import java.io.Serializable;


public class Endereco implements Serializable {

  private String rua;
  private String numero;
  private String complemento;
  private String bairro;
  private String cidade;
  private Estado estado;
  private String cep;

  public Endereco() {
  }

  public Endereco(String rua, String numero, String complemento, String bairro, String cidade, Estado estado, String cep) {
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  @Override
  public String toString() {
    return "Rua:" + rua + "\nNúmero: " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: "
            + cidade + "\nEstado: " + estado + "\nCep: " + cep;
  }

}
