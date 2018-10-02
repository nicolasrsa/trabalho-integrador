package br.com.transportadora.model;


public enum ClasseCNH {

  B("B"),
  C("C"),
  D("D"),
  E("E");

  private final String tipo;

  ClasseCNH(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return this.tipo;
  }

}
