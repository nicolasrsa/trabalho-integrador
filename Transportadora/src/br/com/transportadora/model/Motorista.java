package br.com.transportadora.model;


public class Motorista extends Pessoa{
  
  private Roteiro roteiro;
  private Veiculo veiculo;
  
  public Motorista(){}

  public Motorista(Roteiro roteiro, Veiculo veiculo, String nome, Endereco edereco) {
    super(nome, edereco);
    this.roteiro = roteiro;
    this.veiculo = veiculo;
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
}
