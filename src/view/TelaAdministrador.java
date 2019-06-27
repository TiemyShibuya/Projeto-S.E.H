package view;

import control.conexaoDB;
import javax.swing.JOptionPane;

public class TelaAdministrador extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();

    public TelaAdministrador(String usuario) {
        initComponents();
        jLabelNomeAdmin.setText(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAdministrador = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jToggleButtonPerfil = new javax.swing.JToggleButton();
        jButtonMensagem = new javax.swing.JButton();
        jButtonMedico = new javax.swing.JButton();
        jButtonEnfermeira = new javax.swing.JButton();
        jButtonPaciente = new javax.swing.JButton();
        jButtonRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNome = new javax.swing.JTable();
        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jToggleButtonPesquisar = new javax.swing.JToggleButton();
        jLabelCadastrar = new javax.swing.JLabel();
        jLabelPesquisar = new javax.swing.JLabel();
        jLabelPacientes = new javax.swing.JLabel();
        jLabelRelatorio = new javax.swing.JLabel();
        jPanelFundoLateral = new javax.swing.JPanel();
        jLabelNomeAdmin = new javax.swing.JLabel();
        jLabelFotoAdmin = new javax.swing.JLabel();
        jPanelFundoSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelAdministrador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAdministrador.setText("ADMINISTRADOR");
        getContentPane().add(jLabelAdministrador);
        jLabelAdministrador.setBounds(680, 10, 110, 17);

        jButtonSair.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSair.setForeground(new java.awt.Color(204, 204, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.setBorder(null);
        jButtonSair.setBorderPainted(false);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(10, 540, 40, 40);

        jToggleButtonPerfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jToggleButtonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        jToggleButtonPerfil.setText(" Pefil");
        jToggleButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonPerfil);
        jToggleButtonPerfil.setBounds(10, 160, 140, 40);

        jButtonMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mensagem.png"))); // NOI18N
        jButtonMensagem.setToolTipText("Mensagem");
        jButtonMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensagemActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMensagem);
        jButtonMensagem.setBounds(730, 540, 50, 40);

        jButtonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medico.png"))); // NOI18N
        jButtonMedico.setToolTipText("Médico");
        jButtonMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMedicoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonMedicoMouseReleased(evt);
            }
        });
        jButtonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMedico);
        jButtonMedico.setBounds(220, 170, 60, 60);

        jButtonEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enfermeira.png"))); // NOI18N
        jButtonEnfermeira.setToolTipText("Enfermeira");
        getContentPane().add(jButtonEnfermeira);
        jButtonEnfermeira.setBounds(310, 170, 60, 60);

        jButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jButtonPaciente.setToolTipText("Paciente");
        getContentPane().add(jButtonPaciente);
        jButtonPaciente.setBounds(480, 170, 60, 60);

        jButtonRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jButtonRelatorio.setToolTipText("Relatório");
        getContentPane().add(jButtonRelatorio);
        jButtonRelatorio.setBounds(650, 170, 60, 60);

        jTableNome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTableNome);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 360, 460, 90);

        jFormattedTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldNome);
        jFormattedTextFieldNome.setBounds(210, 320, 280, 30);

        jToggleButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jToggleButtonPesquisar.setText(" Pesquisar");
        jToggleButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonPesquisar);
        jToggleButtonPesquisar.setBounds(510, 320, 120, 25);

        jLabelCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastrar.setText("Cadastrar:");
        getContentPane().add(jLabelCadastrar);
        jLabelCadastrar.setBounds(220, 130, 70, 14);

        jLabelPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPesquisar.setText("Pesquisar funcionário:");
        getContentPane().add(jLabelPesquisar);
        jLabelPesquisar.setBounds(210, 280, 180, 30);

        jLabelPacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPacientes.setText("Pacientes:");
        getContentPane().add(jLabelPacientes);
        jLabelPacientes.setBounds(480, 130, 70, 17);

        jLabelRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRelatorio.setText("Relatório:");
        getContentPane().add(jLabelRelatorio);
        jLabelRelatorio.setBounds(650, 130, 80, 17);

        jPanelFundoLateral.setBackground(new java.awt.Color(0, 0, 153));
        jPanelFundoLateral.setLayout(null);

        jLabelNomeAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeAdmin.setText("Nome do admin.");
        jPanelFundoLateral.add(jLabelNomeAdmin);
        jLabelNomeAdmin.setBounds(30, 100, 110, 20);

        jLabelFotoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/administrador.png"))); // NOI18N
        jPanelFundoLateral.add(jLabelFotoAdmin);
        jLabelFotoAdmin.setBounds(60, 30, 50, 70);

        getContentPane().add(jPanelFundoLateral);
        jPanelFundoLateral.setBounds(0, 30, 160, 560);

        jPanelFundoSuperior.setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().add(jPanelFundoSuperior);
        jPanelFundoSuperior.setBounds(0, 0, 800, 30);

        setSize(new java.awt.Dimension(816, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMedicoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        JOptionPane.showMessageDialog(null, "Você saiu", "logout", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jFormattedTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNomeActionPerformed

    private void jToggleButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPesquisarActionPerformed

    private void jButtonMedicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMedicoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMedicoMouseEntered

    private void jButtonMedicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMedicoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMedicoMouseReleased

    private void jButtonMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensagemActionPerformed
        new TelaMensagem().setVisible(true);

    }//GEN-LAST:event_jButtonMensagemActionPerformed

    private void jToggleButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPerfilActionPerformed
        new TelaPerfilFuncionario(jLabelNomeAdmin.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonPerfilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnfermeira;
    private javax.swing.JButton jButtonMedico;
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JButton jButtonPaciente;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelFotoAdmin;
    private javax.swing.JLabel jLabelNomeAdmin;
    private javax.swing.JLabel jLabelPacientes;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JPanel jPanelFundoLateral;
    private javax.swing.JPanel jPanelFundoSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNome;
    private javax.swing.JToggleButton jToggleButtonPerfil;
    private javax.swing.JToggleButton jToggleButtonPesquisar;
    // End of variables declaration//GEN-END:variables
}
