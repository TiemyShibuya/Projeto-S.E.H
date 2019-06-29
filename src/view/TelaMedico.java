package view;

import control.conexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import projeto.Paciente;

public class TelaMedico extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    ResultSet rs = null;
    PreparedStatement pst = null;
    Paciente pac = new Paciente();

    public TelaMedico(String usuario) {
        initComponents();
        jLabelNomedoMedico.setText(usuario);

    }

    public void listarPaciente() {

        String query = "select * from paciente order by idPac Asc";

        try {

            pst = con.conn.prepareStatement(query);
            rs = pst.executeQuery();
            jTablePaciente.setModel(DbUtils.resultSetToTableModel(rs));

            jTablePaciente.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTablePaciente.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTablePaciente.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            //jTablePaciente.getColumnModel().getColumn(3).setHeaderValue("Cargo");
            //jTableNome.getColumnModel().getColumn(4).setHeaderValue("Marca");
            jTablePaciente.getTableHeader().resizeAndRepaint();

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void pesquisarPaciente() {
        String query = "select * from paciente where nome like ?";

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jTextFieldNome.getText() + "%");
            rs = pst.executeQuery();
            jTablePaciente.setModel(DbUtils.resultSetToTableModel(rs));

            jTablePaciente.getColumnModel().getColumn(0).setHeaderValue("Nome");
            jTablePaciente.getColumnModel().getColumn(1).setHeaderValue("CPF");
            jTablePaciente.getColumnModel().getColumn(2).setHeaderValue("Telefone");
            jTablePaciente.getColumnModel().getColumn(3).setHeaderValue("Cargo");
            //jTableNome.getColumnModel().getColumn(4).setHeaderValue("Marca");
            jTablePaciente.getTableHeader().resizeAndRepaint();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonMensagem = new javax.swing.JButton();
        jPanelFundoLateral = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelFotoMedico = new javax.swing.JLabel();
        jLabelNomedoMedico = new javax.swing.JLabel();
        jLabelPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButton1.setToolTipText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 500, 40, 40);

        jButtonMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mensagem.png"))); // NOI18N
        jButtonMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensagemActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMensagem);
        jButtonMensagem.setBounds(700, 510, 50, 40);

        jPanelFundoLateral.setBackground(new java.awt.Color(0, 0, 153));
        jPanelFundoLateral.setLayout(null);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        jToggleButton1.setText("Perfil");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanelFundoLateral.add(jToggleButton1);
        jToggleButton1.setBounds(20, 140, 150, 40);

        jLabelFotoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medico.png"))); // NOI18N
        jPanelFundoLateral.add(jLabelFotoMedico);
        jLabelFotoMedico.setBounds(70, 20, 110, 60);

        jLabelNomedoMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomedoMedico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomedoMedico.setText("Nome do médico");
        jPanelFundoLateral.add(jLabelNomedoMedico);
        jLabelNomedoMedico.setBounds(40, 80, 120, 30);

        getContentPane().add(jPanelFundoLateral);
        jPanelFundoLateral.setBounds(0, 0, 190, 570);

        jLabelPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPaciente.setText("Pacientes:");
        getContentPane().add(jLabelPaciente);
        jLabelPaciente.setBounds(200, 60, 170, 22);

        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Emergencia", "Nome", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jTablePaciente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 130, 452, 160);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(200, 90, 240, 30);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(470, 90, 120, 30);

        setSize(new java.awt.Dimension(775, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JOptionPane.showMessageDialog(null, "Você vai sair", "logout", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        new TelaPerfilFuncionario(jLabelNomedoMedico.getText()).setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButtonMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensagemActionPerformed
        new TelaMensagem().setVisible(true);
    }//GEN-LAST:event_jButtonMensagemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFotoMedico;
    private javax.swing.JLabel jLabelNomedoMedico;
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JPanel jPanelFundoLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
