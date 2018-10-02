package br.com.transportadora.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;


public class RoteiroDiario implements Comparable<RoteiroDiario> {

  private LocalDate data;
  private List<Roteiro> roteiros;

  public RoteiroDiario(LocalDate data, List<Roteiro> roteiros) {
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
    final RoteiroDiario other = (RoteiroDiario) obj;
    if (!Objects.equals(this.data, other.data)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(RoteiroDiario o) {
    return this.data.compareTo(o.data);
  }

  @Override
  public String toString() {
    return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
  }

  public boolean registrarEntregaRealizada(Encomenda encomenda) {
    for (Roteiro roteiro : getRoteiros()) {
      for (Encomenda e : roteiro.getEncomendas()) {
        if (e.equals(encomenda)) {
          return roteiro.resgistrarEntregaRealizada(encomenda);
        }
      }
    }
    return false;
  }

  public boolean registrarEntregaNaoRealizada(Encomenda encomenda) {
    for (Roteiro roteiro : getRoteiros()) {
      for (Encomenda e : roteiro.getEncomendas()) {
        if (e.equals(encomenda)) {
          return roteiro.resgistrarEntregaNaoRealizada(encomenda);
        }
      }
    }
    return false;
  }

}
