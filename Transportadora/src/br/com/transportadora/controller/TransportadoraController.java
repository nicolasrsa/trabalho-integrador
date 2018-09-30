package br.com.transportadora.controller;

import br.com.transportadora.model.Encomenda;
import br.com.transportadora.model.Motorista;
import br.com.transportadora.model.Transportadora;
import br.com.transportadora.model.Veiculo;
import java.util.List;


public class TransportadoraController {

  private static TransportadoraController instance = null;

  private TransportadoraController() {
  }

  public static TransportadoraController getInstance() {
    if (instance == null) {
      instance = new TransportadoraController();
    }
    return instance;
  }

  public void salvarMotorista(Motorista motorista) {
    Transportadora.getInstance().getMotoristas().add(motorista);
  }

  public List<Motorista> listarMotoristas() {
    return Transportadora.getInstance().getMotoristas();
  }

  public void salvarVeiculo(Veiculo veiculo) {
    Transportadora.getInstance().getVeiculos().add(veiculo);
  }

  public List<Veiculo> listarVeiculos() {
    return Transportadora.getInstance().getVeiculos();
  }

  public List<Encomenda> listarEncomendas() {
    return Transportadora.getInstance().getEncomendas();
  }

  public void salvarEncomenda(Encomenda encomenda) {
    Transportadora.getInstance().getEncomendas().add(0, encomenda);
  }

}
