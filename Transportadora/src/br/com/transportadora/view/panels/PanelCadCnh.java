/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.transportadora.view.panels;


/**
 *
 * @author hatachi
 */
public class PanelCadCnh extends javax.swing.JPanel {

  /**
   * Creates new form PanelCadCnh
   */
  public PanelCadCnh() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
   * content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    inputNroCNH = new javax.swing.JTextField();
    inputTipoCNH = new javax.swing.JComboBox<>();

    setBorder(javax.swing.BorderFactory.createTitledBorder("CNH"));
    setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Tipo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel1, gridBagConstraints);

    jLabel2.setText("Número");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel2, gridBagConstraints);

    inputNroCNH.setMinimumSize(new java.awt.Dimension(120, 23));
    inputNroCNH.setPreferredSize(new java.awt.Dimension(120, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputNroCNH, gridBagConstraints);

    inputTipoCNH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    inputTipoCNH.setMinimumSize(new java.awt.Dimension(120, 25));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputTipoCNH, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField inputNroCNH;
  private javax.swing.JComboBox<String> inputTipoCNH;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables
}
