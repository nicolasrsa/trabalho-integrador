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
public class PanelDetalheVeiculo extends javax.swing.JPanel {

  /**
   * Creates new form PanelDetalheVeiculo
   */
  public PanelDetalheVeiculo() {
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

    jLabel5 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    outputMarca = new javax.swing.JLabel();
    outputModelo = new javax.swing.JLabel();
    outputAno = new javax.swing.JLabel();
    outputPlaca = new javax.swing.JLabel();
    outputCNH = new javax.swing.JLabel();
    outputMotorista = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    listaCarga = new javax.swing.JList<>();
    jLabel14 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();

    jLabel5.setText("jLabel5");

    jLabel15.setText("jLabel15");

    setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Marca:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(jLabel1, gridBagConstraints);

    jLabel2.setText("Modelo:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(jLabel2, gridBagConstraints);

    jLabel3.setText("Ano:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(jLabel3, gridBagConstraints);

    jLabel4.setText("Placa:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(jLabel4, gridBagConstraints);

    jLabel6.setText("Classe CNH:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(jLabel6, gridBagConstraints);

    jLabel7.setText("Motorista:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(jLabel7, gridBagConstraints);

    outputMarca.setText("marca");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(outputMarca, gridBagConstraints);

    outputModelo.setText("modelo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(outputModelo, gridBagConstraints);

    outputAno.setText("ano");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(outputAno, gridBagConstraints);

    outputPlaca.setText("placa");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(outputPlaca, gridBagConstraints);

    outputCNH.setText("cnh");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(outputCNH, gridBagConstraints);

    outputMotorista.setText("motorista");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(outputMotorista, gridBagConstraints);

    jScrollPane1.setMinimumSize(new java.awt.Dimension(20, 150));
    jScrollPane1.setPreferredSize(new java.awt.Dimension(48, 150));

    listaCarga.setModel(new javax.swing.AbstractListModel<String>() {
      String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
      public int getSize() { return strings.length; }
      public String getElementAt(int i) { return strings[i]; }
    });
    listaCarga.setMinimumSize(new java.awt.Dimension(45, 100));
    listaCarga.setPreferredSize(new java.awt.Dimension(45, 100));
    jScrollPane1.setViewportView(listaCarga);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(jScrollPane1, gridBagConstraints);

    jLabel14.setText("Carga:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 3, 0, 3);
    add(jLabel14, gridBagConstraints);

    jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/van.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(jLabel16, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JList<String> listaCarga;
  private javax.swing.JLabel outputAno;
  private javax.swing.JLabel outputCNH;
  private javax.swing.JLabel outputMarca;
  private javax.swing.JLabel outputModelo;
  private javax.swing.JLabel outputMotorista;
  private javax.swing.JLabel outputPlaca;
  // End of variables declaration//GEN-END:variables
}
