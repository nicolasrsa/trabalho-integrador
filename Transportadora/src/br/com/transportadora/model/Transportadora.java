package br.com.transportadora.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Transportadora {

  private static Transportadora instance = null;

  private List<Motorista> motoristas;
  private List<Veiculo> veiculos;
  private List<Encomenda> encomendas;
  private List<ProgramacaoDiaria> programacoesDiarias;

  private Transportadora() {
    motoristas = new ArrayList<>();
    veiculos = new ArrayList<>();
    encomendas = new LinkedList<>();
    programacoesDiarias = new LinkedList<>();
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

  public List<ProgramacaoDiaria> getProgramacoesDiarias() {
    return programacoesDiarias;
  }

  public boolean codigoJaExiste(String codigo) {
    for (Encomenda encomenda : encomendas) {
      if (encomenda.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  public List<Encomenda> encomendasEmTransporte() {
    List<Encomenda> encomendas = new ArrayList<>();

    for (Encomenda e : this.encomendas) {
      if (e.getStatusEncomenda().equals(StatusEncomenda.EM_TRANSPORTE)) {
        encomendas.add(e);
      }
    }

    return encomendas;
  }

  public List<Encomenda> encomendasEntregues() {
    List<Encomenda> encomendas = new ArrayList<>();

    for (Encomenda e : this.encomendas) {
      if (e.getStatusEncomenda().equals(StatusEncomenda.ENTREGUE)) {
        encomendas.add(e);
      }
    }

    return encomendas;
  }

  public List<Encomenda> encomendasAguardandoTransporte() {
    List<Encomenda> encomendas = new ArrayList<>();

    for (Encomenda e : this.encomendas) {
      if (e.getStatusEncomenda().equals(StatusEncomenda.AGUARDANDO_TRANSPORTE)) {
        encomendas.add(e);
      }
    }

    return encomendas;
  }

  public List<Encomenda> encomendasNaoEntregues() {
    List<Encomenda> encomendas = new ArrayList<>();

    for (Encomenda e : this.encomendas) {
      if (!e.getStatusEncomenda().equals(StatusEncomenda.ENTREGUE)) {
        encomendas.add(e);
      }
    }

    return encomendas;
  }

  public void gerarRoteirosParaODia(LocalDate data) {
    List<Encomenda> encomendasNaoEntregues = encomendasNaoEntregues();
    List<Motorista> motoristasDisponiveis = motoristasDisponiveisParaRoteiro();
    List<Roteiro> roteiros = new ArrayList<>();

    Collections.sort(encomendasNaoEntregues);
    Collections.reverse(encomendasNaoEntregues);

    for (Veiculo veiculo : this.veiculos) {
      Motorista motorista = buscarMotoristaParaVeiculo(motoristasDisponiveis, veiculo);
      if (motorista != null) {
        motoristasDisponiveis.remove(motorista);
        Roteiro roteiro = new Roteiro(data, motorista, veiculo);
        for (int i = 0; i < roteiro.getVeiculo().getCargaMax() && encomendasNaoEntregues().size() > 0; i++) {
          Encomenda encomenda = encomendasNaoEntregues.get(0);
          roteiro.adicionarEncomenda(encomenda);
          encomendasNaoEntregues.remove(encomenda);
        }
        roteiros.add(roteiro);
      }
    }

    this.programacoesDiarias.add(new ProgramacaoDiaria(data, roteiros));
  }

  private List<Motorista> motoristasDisponiveisParaRoteiro() {
    List<Motorista> motoristas = new ArrayList<>();
    for (Motorista motorista : this.motoristas) {
      motoristas.add(motorista);
    }
    return motoristas;
  }

  private List<Motorista> motoristasComCnhClasseC() {
    List<Motorista> motoristas = new ArrayList<>();
    for (Motorista motorista : this.motoristas) {
      if (motorista.getCnh().getClasse().equals(ClasseCNH.C)) {
        motoristas.add(motorista);
      }
    }
    return motoristas;
  }

  private Motorista buscarMotoristaParaVeiculo(List<Motorista> motoristasDisponiveis, Veiculo veiculo) {
    for (Motorista motorista : motoristasDisponiveis) {
      if (veiculo.podeSerDirigidoPor(motorista)) {
        return motorista;
      }
    }
    return null;
  }
}
