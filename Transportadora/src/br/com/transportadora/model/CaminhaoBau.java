package br.com.transportadora.model;

import java.io.Serializable;


public class CaminhaoBau extends Veiculo implements Serializable {

  public transient static final int CAPACIDADE = 3;
  public transient static final ClasseCNH CNH_MINIMA = ClasseCNH.C;

  public CaminhaoBau() {
    super(CaminhaoBau.CAPACIDADE, CaminhaoBau.CNH_MINIMA);
  }

  @Override
  public boolean podeSerDirigidoPor(Motorista motorista) {
    switch (motorista.getCnh().getClasse()) {
      case B:
      case C:
        return true;
      default:
        return false;
    }
  }
}
