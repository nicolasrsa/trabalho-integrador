package br.com.transportadora.model;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Veiculo {
  private String marca;
  private String modelo;
  private String placa;
  private Integer ano;
  private ClasseCNH cnhMinima;
  private final Queue<Encomenda> carga;
  private final Integer cargaMax;
  private Motorista motorista;

  public Veiculo(Integer capacidade) {
    this.cargaMax = capacidade;
    this.carga = new LinkedList<>();
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

  public Motorista getMotorista() {
    return motorista;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public Queue<Encomenda> getCarga() {
    return carga;
  }
  
  public Encomenda getProximaEncomenda() {
    return this.carga.poll();
  }
  
  public Boolean adicionarEncomenda(Encomenda encomenda) {
    if (this.carga.size() < this.cargaMax) {
      this.carga.offer(encomenda);
      return true;
    }
    return false;
  }
}
