package br.com.transportadora.model;

import java.util.Date;

public class Encomenda {

  private long proxCodigo;
  private Remetente remetente;
  private Destinatario destinatario;
  private Date datacadastro;
  private double peso;
  private Long codigo;
  private StatusEncomenda statusEncomenda;
  
  public long getProxCodigo() {
    return proxCodigo;
  }

  public void setProxCodigo(long proxCodigo) {
    this.proxCodigo = proxCodigo;
  }

  public Remetente getRemetente() {
    return remetente;
  }

  public void setRemetente(Remetente remetente) {
    this.remetente = remetente;
  }

  public Destinatario getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(Destinatario destinatario) {
    this.destinatario = destinatario;
  }

  public Date getDatacadastro() {
    return datacadastro;
  }

  public void setDatacadastro(Date datacadastro) {
    this.datacadastro = datacadastro;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public StatusEncomenda getStatusEncomenda() {
    return statusEncomenda;
  }

  public void setStatusEncomenda(StatusEncomenda statusEncomenda) {
    this.statusEncomenda = statusEncomenda;
  }

}
