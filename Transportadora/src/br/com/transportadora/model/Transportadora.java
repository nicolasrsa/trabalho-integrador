package br.com.transportadora.model;

import br.com.transportadora.model.utils.GerenciadorSerializacao;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Transportadora implements Serializable {

  private static Transportadora instance = null;

  private List<Motorista> motoristas;
  private List<Veiculo> veiculos;
  private List<Encomenda> encomendas;
  private List<RoteiroDiario> roteirosDiarios;

  private Transportadora() {
    motoristas = new ArrayList<>();
    veiculos = new ArrayList<>();
    encomendas = new LinkedList<>();
    roteirosDiarios = new LinkedList<>();
  }

  public static Transportadora getInstance() {
    if (instance == null) {
      try {
        instance = GerenciadorSerializacao.carregarTransportadora();
      } catch (IOException ex) {
        Logger.getLogger(Transportadora.class.getName()).log(Level.INFO, "Nenhum arquivo encontrado.");
      } catch (ClassNotFoundException ex) {
        Logger.getLogger(Transportadora.class.getName()).log(Level.INFO, "Classe não encontrado.");
      }

      if (instance == null) {
        Logger.getLogger(Transportadora.class.getName()).log(Level.INFO, "Gerando nova instância para transportadora.");
        instance = new Transportadora();
      }
    }
    return instance;
  }

  public void cadastrarMotorista(Motorista motorista) {
    this.motoristas.add(motorista);
    Collections.sort(motoristas);
    Collections.reverse(motoristas);
    salvarEmArquivo();
  }

  public List<Motorista> getMotoristas() {
    return motoristas;
  }

  public void cadastrarVeiculo(Veiculo veiculo) {
    this.veiculos.add(veiculo);
    Collections.sort(veiculos);
    Collections.reverse(veiculos);
    salvarEmArquivo();
  }

  public List<Veiculo> getVeiculos() {
    return veiculos;
  }

  public void cadastrarEncomenda(Encomenda encomenda) {
    this.encomendas.add(encomenda);
    Collections.sort(encomendas);
    salvarEmArquivo();
  }

  public List<Encomenda> getEncomendas() {
    return encomendas;
  }

  public List<RoteiroDiario> getRoteirosDiarios() {
    return roteirosDiarios;
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

  public void gerarRoteirosDiarios(LocalDate data) {
    List<Encomenda> encomendasNaoEntregues = encomendasNaoEntregues();
    List<Motorista> motoristasDisponiveis = motoristasDisponiveisParaRoteiro();
    List<Roteiro> roteiros = new LinkedList<>();

    for (Veiculo veiculo : this.veiculos) {
      Motorista motorista = buscarMotoristaParaVeiculo(motoristasDisponiveis, veiculo);
      if (motorista != null) {
        motoristasDisponiveis.remove(motorista);
        if (encomendasNaoEntregues.size() > 0) {
          Roteiro roteiro = new Roteiro(data, motorista, veiculo);
          for (int i = 0; i < roteiro.getVeiculo().getCapacidadeDeCarga() && encomendasNaoEntregues.size() > 0; i++) {
            Encomenda encomenda = encomendasNaoEntregues.get(0);
            roteiro.alocarEncomenda(encomenda);
            encomendasNaoEntregues.remove(encomenda);
          }
          roteiros.add(roteiro);
        }
      }
    }

    this.roteirosDiarios.add(new RoteiroDiario(data, roteiros));
    salvarEmArquivo();
  }

  private List<Motorista> motoristasDisponiveisParaRoteiro() {
    List<Motorista> motoristas = new ArrayList<>();
    for (Motorista motorista : this.motoristas) {
      motoristas.add(motorista);
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

  public void salvarEmArquivo() {
    try {
      GerenciadorSerializacao.salvarTransportadora(getInstance());
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Falha ao salvar em arquivo." + ex);
    }
  }

}
