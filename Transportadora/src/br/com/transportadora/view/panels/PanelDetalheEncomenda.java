package br.com.transportadora.view.panels;

import br.com.transportadora.model.Encomenda;
import java.awt.Color;
import java.time.format.DateTimeFormatter;


public class PanelDetalheEncomenda extends javax.swing.JPanel {

  /**
   * Creates new form PanelDetalheEncomenda
   */
  public PanelDetalheEncomenda() {
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

    panelRemetente = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    panelEnderecoRemetente = new br.com.transportadora.view.panels.PanelDetalheEndereco();
    outputNomeRemetente = new javax.swing.JLabel();
    panelDestinatario = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    panelEnderecoDestinatario = new br.com.transportadora.view.panels.PanelDetalheEndereco();
    outputNomeDestinatario = new javax.swing.JLabel();
    panelInfoObjeto = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    outputCodigoLocalizador = new javax.swing.JLabel();
    outputPeso = new javax.swing.JLabel();
    outputDataDeposito = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    outputStatus = new javax.swing.JLabel();

    setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    setLayout(new java.awt.GridBagLayout());

    panelRemetente.setBorder(javax.swing.BorderFactory.createTitledBorder("Remetente"));
    panelRemetente.setLayout(new java.awt.GridBagLayout());

    jLabel2.setText("Nome:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    panelRemetente.add(jLabel2, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    panelRemetente.add(panelEnderecoRemetente, gridBagConstraints);

    outputNomeRemetente.setText("Remetente");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    panelRemetente.add(outputNomeRemetente, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    add(panelRemetente, gridBagConstraints);

    panelDestinatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Destinatário"));
    panelDestinatario.setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Nome:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    panelDestinatario.add(jLabel1, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    panelDestinatario.add(panelEnderecoDestinatario, gridBagConstraints);

    outputNomeDestinatario.setText("Destinatário");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    panelDestinatario.add(outputNomeDestinatario, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    add(panelDestinatario, gridBagConstraints);

    panelInfoObjeto.setLayout(new java.awt.GridBagLayout());

    jLabel3.setText("Data de Depósito:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    panelInfoObjeto.add(jLabel3, gridBagConstraints);

    jLabel4.setText("Peso do Objeto:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    panelInfoObjeto.add(jLabel4, gridBagConstraints);

    jLabel5.setText("Código Localizador:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    panelInfoObjeto.add(jLabel5, gridBagConstraints);

    outputCodigoLocalizador.setText("código");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
    panelInfoObjeto.add(outputCodigoLocalizador, gridBagConstraints);

    outputPeso.setText("peso");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
    panelInfoObjeto.add(outputPeso, gridBagConstraints);

    outputDataDeposito.setText("data");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
    panelInfoObjeto.add(outputDataDeposito, gridBagConstraints);

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    panelInfoObjeto.add(jLabel6, gridBagConstraints);

    jLabel7.setText("Status:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    panelInfoObjeto.add(jLabel7, gridBagConstraints);

    outputStatus.setText("status");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
    panelInfoObjeto.add(outputStatus, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    add(panelInfoObjeto, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel outputCodigoLocalizador;
  private javax.swing.JLabel outputDataDeposito;
  private javax.swing.JLabel outputNomeDestinatario;
  private javax.swing.JLabel outputNomeRemetente;
  private javax.swing.JLabel outputPeso;
  private javax.swing.JLabel outputStatus;
  private javax.swing.JPanel panelDestinatario;
  private br.com.transportadora.view.panels.PanelDetalheEndereco panelEnderecoDestinatario;
  private br.com.transportadora.view.panels.PanelDetalheEndereco panelEnderecoRemetente;
  private javax.swing.JPanel panelInfoObjeto;
  private javax.swing.JPanel panelRemetente;
  // End of variables declaration//GEN-END:variables

  public void atualizarInfoEncomenda(Encomenda encomenda) {
    outputCodigoLocalizador.setText(encomenda.getCodigo());
    outputDataDeposito.setText(encomenda.getDataCadastro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    outputPeso.setText(Double.toString(encomenda.getPeso()));
    outputNomeDestinatario.setText(encomenda.getDestinatario().getNome());
    outputNomeRemetente.setText(encomenda.getRemetente().getNome());
    panelEnderecoDestinatario.atualizarInfoEndereco(encomenda.getDestinatario().getEndereco());
    panelEnderecoRemetente.atualizarInfoEndereco(encomenda.getRemetente().getEndereco());
    outputStatus.setText(encomenda.getStatusEncomenda().toString());

    switch (encomenda.getStatusEncomenda()) {
      case AGUARDANDO_TRANSPORTE:
        setBorder(javax.swing.BorderFactory.createLineBorder(Color.YELLOW));
        break;
      case EM_TRANSPORTE:
        setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLUE));
        break;
      case ENTREGUE:
        setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
        break;
      default:
        break;
    }
  }
}
