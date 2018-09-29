package br.com.transportadora.model;

import java.time.LocalDate;


public class Motorista extends Pessoa{
  
  private Roteiro roteiro;
  private Veiculo veiculo;
  private Cnh cnh;
  private LocalDate nascimento;
 
  
  public Motorista(){}

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

}
