package br.com.transportadora.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Roteiro implements Serializable {

  private LocalDate data;
  private Motorista motorista;
  private Veiculo veiculo;
  private List<Encomenda> encomendas;
  private List<Encomenda> entregasRealizadas;
  private List<Encomenda> entregasNaoRealizadas;

  public Roteiro(LocalDate data, Motorista motorista, Veiculo veiculo) {
    this.data = data;
    this.motorista = motorista;
    this.veiculo = veiculo;
    this.encomendas = new ArrayList<>();
    this.entregasRealizadas = new ArrayList<>();
    this.entregasNaoRealizadas = new ArrayList<>();
  }

  public LocalDate getData() {
    return data;
  }

  public Motorista getMotorista() {
    return motorista;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public List<Encomenda> getEncomendas() {
    return encomendas;
  }

  public List<Encomenda> getEntregasRealizadas() {
    return entregasRealizadas;
  }

  public List<Encomenda> getEntregasNaoRealizadas() {
    return entregasNaoRealizadas;
  }

  public void alocarEncomenda(Encomenda encomenda) {
    encomenda.setStatusEncomenda(StatusEncomenda.EM_TRANSPORTE);
    this.encomendas.add(encomenda);
  }

  public boolean resgistrarEntregaRealizada(Encomenda encomenda) {
    if (encomenda != null && !entregasRealizadas.contains(encomenda)) {
      encomenda.setStatusEncomenda(StatusEncomenda.ENTREGUE);
      entregasRealizadas.add(encomenda);
      return true;
    }
    return false;
  }

  public boolean resgistrarEntregaNaoRealizada(Encomenda encomenda) {
    if (encomenda != null && !entregasNaoRealizadas.contains(encomenda)) {
      encomenda.setStatusEncomenda(StatusEncomenda.AGUARDANDO_TRANSPORTE);
      entregasNaoRealizadas.add(encomenda);
      return true;
    }
    return false;
  }

  public Encomenda buscarEncomendaPorCodigo(String codigo) {
    Encomenda encomenda = null;
    for (Encomenda e : encomendas) {
      if (e.getCodigo().equals(encomenda.getCodigo())) {
        return e;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return motorista.getNome();
  }
}
