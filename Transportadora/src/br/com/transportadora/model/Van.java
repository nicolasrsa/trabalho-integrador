package br.com.transportadora.model;


public class Van extends Veiculo {

  public transient static final int CAPACIDADE = 1;
  public transient static final ClasseCNH CNH_MINIMA = ClasseCNH.B;

  public Van() {
    super(Van.CAPACIDADE, Van.CNH_MINIMA);
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
