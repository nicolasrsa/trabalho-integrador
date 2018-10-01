package br.com.transportadora.model;

import java.time.LocalDate;


public class Motorista extends Pessoa {

  private static long proxCodigo = 1;

  private Roteiro roteiro;
  private Veiculo veiculo;
  private Cnh cnh;
  private LocalDate nascimento;
  private long codigo = proxCodigo++;

  public Motorista() {
  }

  public Motorista(Roteiro roteiro, Veiculo veiculo, Cnh cnh, LocalDate nascimento, String nome, Endereco endereco) {
    super(nome, endereco);
    this.roteiro = roteiro;
    this.veiculo = veiculo;
    this.cnh = cnh;
    this.nascimento = nascimento;
  }

  public Roteiro getRoteiro() {
    return roteiro;
  }

  public void setRoteiro(Roteiro roteiro) {
    this.roteiro = roteiro;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public Cnh getCnh() {
    return cnh;
  }

  public void setCnh(Cnh cnh) {
    this.cnh = cnh;
  }

  public LocalDate getNascimento() {
    return nascimento;
  }

  public void setNascimento(LocalDate nascimento) {
    this.nascimento = nascimento;
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
    final Motorista other = (Motorista) obj;
    if (this.codigo != other.codigo) {
      return false;
    }
    return true;
  }

}
