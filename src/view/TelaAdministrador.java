package view;

import control.conexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import projeto.Enfermeira;
import projeto.Medico;

public class TelaAdministrador extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    ResultSet rs = null;
    PreparedStatement pst = null;
    Medico med = new Medico();
    Enfermeira en = new Enfermeira();

    public TelaAdministrador(String usuario) throws ClassNotFoundException {
        initComponents();
        jLabelNomeAdmin.setText(usuario);
        con.Connect();
        listarFuncionario();
        listarEnfermeira();
    }

    public void listarFuncionario() throws ClassNotFoundException {

        String query = "select nome,cpf,telefone,especialidade from medico order by idMed Asc";

        try {

            pst = con.conn.prepareStatement(query);
            rs = pst.executeQuery();
            jTableNome.setModel(DbUtils.resultSetToTableModel(rs));

            jTableNome.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTableNome.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTableNome.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            jTableNome.getColumnModel().getColumn(3).setHeaderValue("Especialidade");
            jTableNome.getTableHeader().resizeAndRepaint();

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void pesquisarFuncionario() {
        String query = "select nome,cpf,telefone,especialidade from medico where nome like ?";

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jFormattedTextFieldNome.getText() + "%");
            rs = pst.executeQuery();
            jTableNome.setModel(DbUtils.resultSetToTableModel(rs));

            jTableNome.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTableNome.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTableNome.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            jTableNome.getColumnModel().getColumn(3).setHeaderValue("Cargo");

            jTableNome.getTableHeader().resizeAndRepaint();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void listarEnfermeira() throws ClassNotFoundException {

        String query = "select nome,cpf,telefone,cargo from enfermeira order by idEnf Asc";

        try {

            pst = con.conn.prepareStatement(query);
            rs = pst.executeQuery();
            jTableEnf.setModel(DbUtils.resultSetToTableModel(rs));

            jTableEnf.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTableEnf.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTableEnf.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            jTableEnf.getColumnModel().getColumn(3).setHeaderValue("Cargo");

            jTableEnf.getTableHeader().resizeAndRepaint();

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void pesquisarEnfermeira() {
        String query = "select * from enfermeira where nome like ?";

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jTextFieldNomeEnf.getText() + "%");
            rs = pst.executeQuery();
            jTableEnf.setModel(DbUtils.resultSetToTableModel(rs));

            jTableEnf.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTableEnf.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTableEnf.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            jTableEnf.getColumnModel().getColumn(3).setHeaderValue("Cargo");
            //jTableNome.getColumnModel().getColumn(4).setHeaderValue("Marca");
            jTableEnf.getTableHeader().resizeAndRepaint();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAdministrador = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jToggleButtonPerfil = new javax.swing.JToggleButton();
        jButtonMensagem = new javax.swing.JButton();
        jButtonMedico = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomeEnf = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEnf = new javax.swing.JTable();

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
        jButtonMedico.setToolTipText("Funcionário");
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
        jButtonMedico.setBounds(250, 100, 60, 60);

        jButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jButtonPaciente.setToolTipText("Paciente");
        jButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPaciente);
        jButtonPaciente.setBounds(430, 100, 60, 60);

        jButtonRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jButtonRelatorio.setToolTipText("Relatório");
        jButtonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelatorio);
        jButtonRelatorio.setBounds(610, 100, 60, 60);

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
        jScrollPane1.setBounds(210, 280, 460, 90);

        jFormattedTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldNome);
        jFormattedTextFieldNome.setBounds(210, 230, 280, 30);

        jToggleButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jToggleButtonPesquisar.setText(" Pesquisar");
        jToggleButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonPesquisar);
        jToggleButtonPesquisar.setBounds(520, 225, 120, 30);

        jLabelCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastrar.setText("Cadastrar:");
        getContentPane().add(jLabelCadastrar);
        jLabelCadastrar.setBounds(250, 70, 70, 14);

        jLabelPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPesquisar.setText("Pesquisar Médico:");
        getContentPane().add(jLabelPesquisar);
        jLabelPesquisar.setBounds(210, 190, 180, 30);

        jLabelPacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPacientes.setText("Pacientes:");
        getContentPane().add(jLabelPacientes);
        jLabelPacientes.setBounds(420, 70, 70, 17);

        jLabelRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRelatorio.setText("Relatório:");
        getContentPane().add(jLabelRelatorio);
        jLabelRelatorio.setBounds(600, 70, 80, 17);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar Enfermeira:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 390, 190, 22);
        getContentPane().add(jTextFieldNomeEnf);
        jTextFieldNomeEnf.setBounds(220, 430, 290, 30);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jToggleButton1.setText("Pesquisar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(530, 423, 130, 30);

        jTableEnf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableEnf);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(220, 470, 452, 90);

        setSize(new java.awt.Dimension(816, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicoActionPerformed

        new TelaCadastroFuncionario().setVisible(true);
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
        pesquisarFuncionario();
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
        try {
            new TelaPerfilFuncionario(jLabelNomeAdmin.getText()).setVisible(true);
            //this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonPerfilActionPerformed

    private void jButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacienteActionPerformed

        new TelaPesqPaciente().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButtonPacienteActionPerformed

    private void jButtonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioActionPerformed

        new TelaRelatorio().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButtonRelatorioActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        pesquisarEnfermeira();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMedico;
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JButton jButtonPaciente;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEnf;
    private javax.swing.JTable jTableNome;
    private javax.swing.JTextField jTextFieldNomeEnf;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButtonPerfil;
    private javax.swing.JToggleButton jToggleButtonPesquisar;
    // End of variables declaration//GEN-END:variables
}
