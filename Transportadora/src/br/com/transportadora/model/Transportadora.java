package br.com.transportadora.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Transportadora {

  private static Transportadora instance = null;

  private List<Motorista> motoristas;
  private List<Veiculo> veiculos;
  private List<Encomenda> encomendas;

  private Transportadora() {
    motoristas = new ArrayList<>();
    veiculos = new ArrayList<>();
    encomendas = new LinkedList<>();
  }

  public static Transportadora getInstance() {
    if (instance == null) {
      instance = new Transportadora();
    }
    return instance;
  }

  public List<Motorista> getMotoristas() {
    return motoristas;
  }

  public List<Veiculo> getVeiculos() {
    return veiculos;
  }

  public List<Encomenda> getEncomendas() {
    return encomendas;
  }

  boolean codigoJaExiste(String codigo) {
    for (Encomenda encomenda : encomendas) {
      if (encomenda.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

}
