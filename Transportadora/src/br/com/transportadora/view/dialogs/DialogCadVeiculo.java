package br.com.transportadora.view.dialogs;

import br.com.transportadora.model.CaminhaoBau;
import br.com.transportadora.model.Carreta;
import br.com.transportadora.model.Van;
import br.com.transportadora.model.Veiculo;
import javax.swing.DefaultComboBoxModel;


public class DialogCadVeiculo extends javax.swing.JDialog {

  private boolean salvo;

  /**
   * Creates new form DialogCadVeiculo
   */
  public DialogCadVeiculo(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  public boolean isSalvo() {
    return salvo;
  }

  public Veiculo gerarVeiculo() {
    TipoVeiculo tipoVeiculo = (TipoVeiculo) inputTipo.getSelectedItem();
    Veiculo veiculo = null;

    switch (tipoVeiculo) {
      case CAMINHAO_BAU:
        veiculo = new CaminhaoBau();
        break;
      case CARRETA:
        veiculo = new Carreta();
        break;
      case VAN:
        veiculo = new Van();
        break;
      default:
        break;
    }

    veiculo.setAno(new Integer(((Number) inputAno.getValue()).intValue()));
    veiculo.setModelo(inputModelo.getText());
    veiculo.setPlaca(inputPlaca.getText());
    veiculo.setMarca(inputMarca.getText());
    return veiculo;
  }


  enum TipoVeiculo {

    CAMINHAO_BAU("Caminhão Baú"), VAN("Van"), CARRETA("Carreta");

    private final String tipo;

    TipoVeiculo(String tipo) {
      this.tipo = tipo;
    }

    @Override
    public String toString() {
      return this.tipo;
    }

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
    jLabel5 = new javax.swing.JLabel();
    inputMarca = new javax.swing.JTextField();
    inputModelo = new javax.swing.JTextField();
    inputAno = new javax.swing.JSpinner();
    inputPlaca = new javax.swing.JTextField();
    inputTipo = new javax.swing.JComboBox<>();
    lblIcon = new javax.swing.JLabel();
    btnSalvar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastrar Veículo");
    setAlwaysOnTop(true);
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Marca");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jLabel1, gridBagConstraints);

    jLabel2.setText("Modelo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jLabel2, gridBagConstraints);

    jLabel3.setText("Ano");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jLabel3, gridBagConstraints);

    jLabel4.setText("Placa");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jLabel4, gridBagConstraints);

    jLabel5.setText("Tipo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(jLabel5, gridBagConstraints);

    inputMarca.setMinimumSize(new java.awt.Dimension(150, 23));
    inputMarca.setPreferredSize(new java.awt.Dimension(150, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(inputMarca, gridBagConstraints);

    inputModelo.setMinimumSize(new java.awt.Dimension(150, 23));
    inputModelo.setPreferredSize(new java.awt.Dimension(150, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(inputModelo, gridBagConstraints);

    inputAno.setModel(new javax.swing.SpinnerNumberModel(2005, 1900, null, 1));
    inputAno.setMinimumSize(new java.awt.Dimension(80, 26));
    inputAno.setPreferredSize(new java.awt.Dimension(80, 26));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(inputAno, gridBagConstraints);

    inputPlaca.setMinimumSize(new java.awt.Dimension(150, 23));
    inputPlaca.setPreferredSize(new java.awt.Dimension(150, 23));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(inputPlaca, gridBagConstraints);

    inputTipo.setModel(new DefaultComboBoxModel<TipoVeiculo>(TipoVeiculo.values()));
    inputTipo.setMinimumSize(new java.awt.Dimension(150, 25));
    inputTipo.setPreferredSize(new java.awt.Dimension(150, 25));
    inputTipo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputTipoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(inputTipo, gridBagConstraints);

    lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caminhao-bau.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(lblIcon, gridBagConstraints);

    btnSalvar.setText("Salvar");
    btnSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    getContentPane().add(btnSalvar, gridBagConstraints);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void inputTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoActionPerformed
    // TODO add your handling code here:
    TipoVeiculo tipoVeiculo = (TipoVeiculo) inputTipo.getSelectedItem();

    if (tipoVeiculo.equals(TipoVeiculo.CAMINHAO_BAU)) {
      lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caminhao-bau.png")));
    } else if (tipoVeiculo.equals(TipoVeiculo.CARRETA)) {
      lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carreta.png")));
    } else if (tipoVeiculo.equals(TipoVeiculo.VAN)) {
      lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/van.png")));
    }
    }//GEN-LAST:event_inputTipoActionPerformed

  private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    // TODO add your handling code here:
    salvo = true;
    dispose();
  }//GEN-LAST:event_btnSalvarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnSalvar;
  private javax.swing.JSpinner inputAno;
  private javax.swing.JTextField inputMarca;
  private javax.swing.JTextField inputModelo;
  private javax.swing.JTextField inputPlaca;
  private javax.swing.JComboBox<TipoVeiculo> inputTipo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel lblIcon;
  // End of variables declaration//GEN-END:variables
}