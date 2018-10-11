/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.transportadora.controller;

import br.com.transportadora.view.JanelaPrincipal;
import com.bulenkov.darcula.DarculaLaf;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;


public class Main {

  public static void main(String[] args) {
    try {
      BasicLookAndFeel darcula = new DarculaLaf();
      UIManager.setLookAndFeel(darcula);
    } catch (Exception ex) {
      System.out.println("Falhou ao carregar biblioteca de tema darcula.");
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new JanelaPrincipal().setVisible(true);
      }
    });
  }

}
