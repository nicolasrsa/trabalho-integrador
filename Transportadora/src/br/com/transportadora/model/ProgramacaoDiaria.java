package br.com.transportadora.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;


public class ProgramacaoDiaria implements Comparable<ProgramacaoDiaria> {

  private LocalDate data;
  private List<Roteiro> roteiros;

  public ProgramacaoDiaria(LocalDate data, List<Roteiro> roteiros) {
    this.data = data;
    this.roteiros = roteiros;
  }

  public LocalDate getData() {
    return data;
  }

  public List<Roteiro> getRoteiros() {
    return roteiros;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final ProgramacaoDiaria other = (ProgramacaoDiaria) obj;
    if (!Objects.equals(this.data, other.data)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(ProgramacaoDiaria o) {
    return this.data.compareTo(o.data);
  }

  @Override
  public String toString() {
    return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
  }

  public void registrarEntregaRealizada(String codigoEncomenda) {
    for (Roteiro roteiro : getRoteiros()) {
      for (Encomenda encomenda : roteiro.getEncomendas()) {
        if (encomenda.getCodigo().equals(codigoEncomenda)) {
          roteiro.resgistrarEntregaRealizada(codigoEncomenda);
          return;
        }
      }
    }
  }

  public void registrarEntregaNaoRealizada(String codigoEncomenda) {
    for (Roteiro roteiro : getRoteiros()) {
      for (Encomenda encomenda : roteiro.getEncomendas()) {
        if (encomenda.getCodigo().equals(codigoEncomenda)) {
          roteiro.resgistrarEntregaNaoRealizada(codigoEncomenda);
          return;
        }
      }
    }
  }

}
