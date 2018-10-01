package br.com.transportadora.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Roteiro {

  private static Long proximoCodigo = 1L;

  private List<Encomenda> entregasRealizadas;
  private List<Encomenda> entregasNaoRealizadas;
  private LocalDate data;
  private Motorista motorista;
  private Veiculo veiculo;
  private List<Encomenda> encomendas;

  public Roteiro() {
  }

  public Roteiro(LocalDate data, Motorista motorista, Veiculo veiculo) {
    this.data = data;
    this.motorista = motorista;
    this.veiculo = veiculo;
    this.encomendas = new ArrayList<>();
    this.entregasRealizadas = new ArrayList<>();
    this.entregasNaoRealizadas = new ArrayList<>();
  }

  public List<Encomenda> getEntregasRealizadas() {
    return entregasRealizadas;
  }

  public List<Encomenda> getEntregasNaoRealizadas() {
    return entregasNaoRealizadas;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Motorista getMotorista() {
    return motorista;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public List<Encomenda> getEncomendas() {
    return encomendas;
  }

  public void adicionarEncomenda(Encomenda encomenda) {
    this.encomendas.add(encomenda);
    this.veiculo.adicionarEncomenda(encomenda);
  }

  public boolean resgistrarEntregaRealizada(String codigoEncomenda) {
    Encomenda encomenda = buscarEncomendaPorCodigo(codigoEncomenda);
    if (encomenda != null) {
      encomenda.setStatusEncomenda(StatusEncomenda.ENTREGUE);
      entregasRealizadas.add(encomenda);
      return true;
    }
    return false;
  }

  public boolean resgistrarEntregaNaoRealizada(String codigoEncomenda) {
    Encomenda encomenda = buscarEncomendaPorCodigo(codigoEncomenda);
    if (encomenda != null) {
      encomenda.setStatusEncomenda(StatusEncomenda.AGUARDANDO_TRANSPORTE);
      entregasNaoRealizadas.add(encomenda);
      return true;
    }
    return false;
  }

  private Encomenda buscarEncomendaPorCodigo(String codigo) {
    Encomenda encomenda = null;
    for (Encomenda e : encomendas) {
      if (e.getCodigo().equals(encomenda.getCodigo())) {
        return e;
      }
    }
    return null;
  }
}
