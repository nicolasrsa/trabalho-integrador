package br.com.transportadora.controller;

import br.com.transportadora.model.Encomenda;
import br.com.transportadora.model.Motorista;
import br.com.transportadora.model.RoteiroDiario;
import br.com.transportadora.model.Transportadora;
import br.com.transportadora.model.Veiculo;
import java.time.LocalDate;
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

  public void cadastrarMotorista(Motorista motorista) {
    Transportadora.getInstance().cadastrarMotorista(motorista);
  }

  public List<Motorista> listarMotoristas() {
    return Transportadora.getInstance().getMotoristas();
  }

  public void cadastrarVeiculo(Veiculo veiculo) {
    Transportadora.getInstance().cadastrarVeiculo(veiculo);
  }

  public List<Veiculo> listarVeiculos() {
    return Transportadora.getInstance().getVeiculos();
  }

  public List<Encomenda> listarEncomendas() {
    return Transportadora.getInstance().getEncomendas();
  }

  public void cadastrarEncomenda(Encomenda encomenda) {
    Transportadora.getInstance().cadastrarEncomenda(encomenda);
  }

  public List<RoteiroDiario> listarRoteirosDiarios() {
    return Transportadora.getInstance().getRoteirosDiarios();
  }

  public boolean checarDataRoteiroValida(LocalDate data) {
    for (RoteiroDiario programacaoDiaria : listarRoteirosDiarios()) {
      if (programacaoDiaria.getData().equals(data)) {
        return false;
      }
    }
    return true;
  }

  public void gerarRoteiroDiario(LocalDate data) throws RoteiroDiarioDuplicadoException {
    if (checarDataRoteiroValida(data)) {
      Transportadora.getInstance().gerarRoteirosDiarios(data);
    } else {
      throw new RoteiroDiarioDuplicadoException();
    }
  }

}
