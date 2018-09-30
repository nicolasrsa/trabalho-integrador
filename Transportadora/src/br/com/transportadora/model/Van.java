package br.com.transportadora.model;


public class Van extends Veiculo {

  public static final Integer CAPACIDADE = 1;
  public static final ClasseCNH CNH_MINIMA = ClasseCNH.B;

  public Van() {
    super(Van.CAPACIDADE, Van.CNH_MINIMA);
  }
}
