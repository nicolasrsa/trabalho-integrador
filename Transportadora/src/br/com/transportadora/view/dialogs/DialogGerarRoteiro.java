package br.com.transportadora.view.dialogs;

import java.time.LocalDate;
import java.time.ZoneId;


public class DialogGerarRoteiro extends javax.swing.JDialog {

  private boolean salvo;

  /**
   * Creates new form DialogGerarRoteiro
   */
  public DialogGerarRoteiro(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  public LocalDate getData() {
    LocalDate localDate = this.jXDatePicker1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    return localDate;
  }

  public boolean isSalvo() {
    return salvo;
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
    jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Selecione uma data:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jLabel1, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jXDatePicker1, gridBagConstraints);

    jButton1.setText("Gerar Roteiro");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jButton1, gridBagConstraints);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    this.salvo = true;
    dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
  // End of variables declaration//GEN-END:variables
}
