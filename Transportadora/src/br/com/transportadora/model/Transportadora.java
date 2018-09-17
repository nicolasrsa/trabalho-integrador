package br.com.transportadora.model;


public class Transportadora {
    private static Transportadora instance = null;

    private Transportadora() {
    }

    public static Transportadora getInstance() {
        if (instance == null) {
            instance = new Transportadora();
        }
        return instance;
    }
    
    
    
    
    
}
