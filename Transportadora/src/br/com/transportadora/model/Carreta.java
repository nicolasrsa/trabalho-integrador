package br.com.transportadora.model;

import java.io.Serializable;


public class Carreta extends Veiculo implements Serializable {

  public transient static final int CAPACIDADE = 10;
  public transient static final ClasseCNH CNH_MINIMA = ClasseCNH.C;

  public Carreta() {
    super(Carreta.CAPACIDADE, Carreta.CNH_MINIMA);
  }

  @Override
  public boolean podeSerDirigidoPor(Motorista motorista) {
    switch (motorista.getCnh().getClasse()) {
      case C:
        return true;
      default:
        return false;
    }
  }
}
