package br.com.transportadora.model;

import java.io.Serializable;


public abstract class Veiculo implements Comparable<Veiculo>, Serializable {

  private String marca;
  private String modelo;
  private String placa;
  private Integer ano;
  private ClasseCNH cnhMinima;
  private final int capacidadeDeCarga;

  public Veiculo(int capacidade, ClasseCNH cnhMinima) {
    this.capacidadeDeCarga = capacidade;
    this.cnhMinima = cnhMinima;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public ClasseCNH getCnhMinima() {
    return cnhMinima;
  }

  public void setCnhMinima(ClasseCNH cnhMinima) {
    this.cnhMinima = cnhMinima;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getCapacidadeDeCarga() {
    return capacidadeDeCarga;
  }

  @Override
  public int compareTo(Veiculo outroVeiculo) {
    return this.capacidadeDeCarga - outroVeiculo.capacidadeDeCarga;
  }

  public abstract boolean podeSerDirigidoPor(Motorista motorista);
}
