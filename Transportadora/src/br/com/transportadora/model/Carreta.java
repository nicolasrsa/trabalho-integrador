package br.com.transportadora.model;


public class Carreta extends Veiculo {

  public static final int CAPACIDADE = 10;
  public static final ClasseCNH CNH_MINIMA = ClasseCNH.C;

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
