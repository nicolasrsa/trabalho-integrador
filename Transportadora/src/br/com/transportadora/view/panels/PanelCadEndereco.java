package br.com.transportadora.view.panels;

import br.com.transportadora.model.Endereco;
import br.com.transportadora.model.Estado;


public class PanelCadEndereco extends javax.swing.JPanel {

  /**
   * Creates new form panelCadVeiculo
   */
  public PanelCadEndereco() {
    initComponents();
  }

  public Endereco gerarEndereco() {
    Endereco endereco = new Endereco();
    endereco.setRua(inputRua.getText());
    endereco.setNumero(((Number) inputNro.getValue()).toString());
    endereco.setComplemento(inputComplemento.getText());
    endereco.setBairro(inputBairro.getText());
    endereco.setCidade(inputCidade.getText());
    endereco.setEstado(inputEstado.getItemAt(inputEstado.getSelectedIndex()));
    endereco.setCep(inputCep.getText());
    return endereco;
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
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    inputComplemento = new javax.swing.JTextField();
    inputBairro = new javax.swing.JTextField();
    inputNro = new javax.swing.JSpinner();
    inputCidade = new javax.swing.JTextField();
    inputEstado = new javax.swing.JComboBox<>(Estado.values());
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    inputCep = new javax.swing.JTextField();
    inputRua = new javax.swing.JTextField();

    setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
    setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Rua");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel1, gridBagConstraints);

    jLabel2.setText("Bairro");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel2, gridBagConstraints);

    jLabel3.setText("Estado");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel3, gridBagConstraints);

    jLabel4.setText("Cidade");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel4, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    add(jLabel6, gridBagConstraints);

    jLabel5.setText("Número");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel5, gridBagConstraints);

    inputComplemento.setMinimumSize(new java.awt.Dimension(120, 23));
    inputComplemento.setPreferredSize(new java.awt.Dimension(120, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputComplemento, gridBagConstraints);

    inputBairro.setMinimumSize(new java.awt.Dimension(120, 23));
    inputBairro.setPreferredSize(new java.awt.Dimension(120, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputBairro, gridBagConstraints);

    inputNro.setMinimumSize(new java.awt.Dimension(80, 26));
    inputNro.setPreferredSize(new java.awt.Dimension(80, 26));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputNro, gridBagConstraints);

    inputCidade.setMinimumSize(new java.awt.Dimension(120, 23));
    inputCidade.setPreferredSize(new java.awt.Dimension(120, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputCidade, gridBagConstraints);

    inputEstado.setMinimumSize(new java.awt.Dimension(120, 25));
    inputEstado.setPreferredSize(new java.awt.Dimension(120, 25));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputEstado, gridBagConstraints);

    jLabel7.setText("CEP");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel7, gridBagConstraints);

    jLabel8.setText("Complemento");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
    add(jLabel8, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputCep, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(inputRua, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField inputBairro;
  private javax.swing.JTextField inputCep;
  private javax.swing.JTextField inputCidade;
  private javax.swing.JTextField inputComplemento;
  private javax.swing.JComboBox<Estado> inputEstado;
  private javax.swing.JSpinner inputNro;
  private javax.swing.JTextField inputRua;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  // End of variables declaration//GEN-END:variables
}