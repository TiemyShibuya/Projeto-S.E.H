package view;

import control.conexaoDB;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto.Medico;
import net.proteanit.sql.DbUtils;

public class TelaEnfermeira extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Medico med = new Medico();

    public TelaEnfermeira(String usuario) throws ClassNotFoundException {
        initComponents();
        jLabelNomeEnfermeira.setText(usuario);
        con.Connect();
        ListarMedico();

    }

    public void ListarMedico() throws ClassNotFoundException {
        System.out.println("aqui");

        String query = "select idMed,nome,especialidade from medico order by idMed Asc";

        try {

            pst = con.conn.prepareStatement(query);
            rs = pst.executeQuery();
            jTableMedico.setModel(DbUtils.resultSetToTableModel(rs));

            jTableMedico.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTableMedico.getColumnModel().getColumn(1).setHeaderValue("Nome");
            jTableMedico.getColumnModel().getColumn(2).setHeaderValue("Especialidade");

            jTableMedico.getTableHeader().resizeAndRepaint();

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void PesquisarMedico() {
        String query = "select idMed,nome,especialidade from medico where nome like ?";

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jFormattedTextFieldNome.getText() + "%");
            rs = pst.executeQuery();
            jTableMedico.setModel(DbUtils.resultSetToTableModel(rs));

            jTableMedico.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTableMedico.getColumnModel().getColumn(1).setHeaderValue("Nome");
            jTableMedico.getColumnModel().getColumn(2).setHeaderValue("Especialidade");

            jTableMedico.getTableHeader().resizeAndRepaint();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        jButtonSair = new javax.swing.JButton();
        jButtonMensagem = new javax.swing.JButton();
        jLabelNomeEnfermeira = new javax.swing.JLabel();
        jLabelFotoEnfermeira = new javax.swing.JLabel();
        jToggleButtonPaciente = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        jToggleButton2.setText("Perfil");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(10, 120, 140, 40);

        jButtonSair.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSair.setForeground(new java.awt.Color(204, 204, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(10, 520, 40, 40);

        jButtonMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mensagem.png"))); // NOI18N
        jButtonMensagem.setToolTipText("Mensagem");
        jButtonMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensagemActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMensagem);
        jButtonMensagem.setBounds(710, 520, 50, 40);

        jLabelNomeEnfermeira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeEnfermeira.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeEnfermeira.setText("Nome da enfermeira");
        getContentPane().add(jLabelNomeEnfermeira);
        jLabelNomeEnfermeira.setBounds(20, 80, 140, 17);

        jLabelFotoEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enfermeira.png"))); // NOI18N
        getContentPane().add(jLabelFotoEnfermeira);
        jLabelFotoEnfermeira.setBounds(60, 20, 50, 70);

        jToggleButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jToggleButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonPaciente);
        jToggleButtonPaciente.setBounds(260, 90, 60, 60);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(580, 90, 60, 60);

        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "ESPECIALIDADE"
            }
        ));
        jScrollPane1.setViewportView(jTableMedico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 370, 400, 90);

        jFormattedTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNomeActionPerformed(evt);
            }
        });
        jFormattedTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldNomeKeyPressed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldNome);
        jFormattedTextFieldNome.setBounds(200, 320, 260, 30);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jToggleButton3.setText("Pesquisar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(490, 320, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar médico de plantão:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 270, 270, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 180, 570);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cadastrar Paciente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 50, 160, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fichas:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 50, 60, 22);

        setSize(new java.awt.Dimension(794, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try {
            new TelaPerfilFuncionario(jLabelNomeEnfermeira.getText()).setVisible(true);
            //this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaEnfermeira.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaEnfermeira.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        JOptionPane.showMessageDialog(null, "Você vai sair", "logout", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensagemActionPerformed
        new TelaMensagem().setVisible(true);
    }//GEN-LAST:event_jButtonMensagemActionPerformed

    private void jToggleButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPacienteActionPerformed
        //System.out.println("aqui");
        new TelaCadastroPaciente().setVisible(true);

    }//GEN-LAST:event_jToggleButtonPacienteActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        //ListarMedico();
        PesquisarMedico();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jFormattedTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNomeActionPerformed

    private void jFormattedTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNomeKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // PesquisarMedico();

        }
    }//GEN-LAST:event_jFormattedTextFieldNomeKeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        new TelaFichaPaciente(jFormattedTextFieldNome.getText()).setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFotoEnfermeira;
    private javax.swing.JLabel jLabelNomeEnfermeira;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedico;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButtonPaciente;
    // End of variables declaration//GEN-END:variables
}
