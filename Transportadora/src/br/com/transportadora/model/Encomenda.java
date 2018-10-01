package br.com.transportadora.model;

import java.time.LocalDate;
import java.util.Objects;


public class Encomenda implements Comparable<Encomenda> {

  private static long proximoCodigo = 1;

  private Remetente remetente;
  private Destinatario destinatario;
  private LocalDate dataCadastro;
  private double peso;
  private String codigo;
  private StatusEncomenda statusEncomenda;

  public Encomenda() {
    this.statusEncomenda = StatusEncomenda.AGUARDANDO_TRANSPORTE;
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

  public LocalDate getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(LocalDate dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    if (codigo.equals("")) {
      this.codigo = gerarCodigoValido();
    } else {
      this.codigo = codigo;
    }
  }

  public StatusEncomenda getStatusEncomenda() {
    return statusEncomenda;
  }

  public void setStatusEncomenda(StatusEncomenda statusEncomenda) {
    this.statusEncomenda = statusEncomenda;
  }

  @Override
  public String toString() {
    return codigo.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Encomenda other = (Encomenda) obj;
    if (!Objects.equals(this.codigo, other.codigo)) {
      return false;
    }
    return true;
  }

  private String gerarCodigoValido() {
    String codigo = "";

    do {
      codigo = Long.toString(proximoCodigo);
      proximoCodigo++;
    } while (Transportadora.getInstance().codigoJaExiste(codigo));

    return codigo;
  }

  @Override
  public int compareTo(Encomenda o) {
    return this.dataCadastro.compareTo(o.dataCadastro);
  }

}
