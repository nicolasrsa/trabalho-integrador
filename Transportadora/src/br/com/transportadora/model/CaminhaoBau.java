package br.com.transportadora.model;


public class CaminhaoBau extends Veiculo {

  public static final Integer CAPACIDADE = 3;
  public static final ClasseCNH CNH_MINIMA = ClasseCNH.C;

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
