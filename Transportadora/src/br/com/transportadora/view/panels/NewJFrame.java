/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.transportadora.view.panels;

import org.jdesktop.swingx.JXDatePicker;


/**
 *
 * @author hatachi
 */
public class NewJFrame extends javax.swing.JFrame {

  /**
   * Creates new form NewJFrame
   */
  public NewJFrame() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
   * content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
    panelCadVeiculo1 = new br.com.transportadora.view.panels.PanelCadVeiculo();
    panelCadMotorista1 = new br.com.transportadora.view.panels.PanelCadMotorista();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridBagLayout());
    getContentPane().add(jXDatePicker1, new java.awt.GridBagConstraints());
    getContentPane().add(panelCadVeiculo1, new java.awt.GridBagConstraints());
    getContentPane().add(panelCadMotorista1, new java.awt.GridBagConstraints());

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new NewJFrame().setVisible(true);
      }
      
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
  private br.com.transportadora.view.panels.PanelCadMotorista panelCadMotorista1;
  private br.com.transportadora.view.panels.PanelCadVeiculo panelCadVeiculo1;
  // End of variables declaration//GEN-END:variables
}
