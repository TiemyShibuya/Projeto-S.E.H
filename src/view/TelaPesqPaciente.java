package view;

import control.conexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TelaPesqPaciente extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaPesqPaciente() {
        initComponents();
    }

    public void VoltarTela() {
        //con.Disconnect();
        this.dispose();
    }

    public void PesquisarPaciente() {
        String query = "select idPac,nome,emergencia from paciente where nome like ?";

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jTextFieldNome.getText() + "%");
            rs = pst.executeQuery();
            jTableNomePac.setModel(DbUtils.resultSetToTableModel(rs));

            jTableNomePac.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTableNomePac.getColumnModel().getColumn(1).setHeaderValue("Nome");
            jTableNomePac.getColumnModel().getColumn(2).setHeaderValue("Emergencia");

            jTableNomePac.getTableHeader().resizeAndRepaint();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Nao foi possivel procurar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNomePac = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextPane1.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 90, 370);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(120, 60, 290, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Digite o nome do paciente que queira pesquisar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 400, 30);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jToggleButton1.setText("Pesquisar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(460, 60, 120, 30);

        jTableNomePac.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableNomePac);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(110, 120, 550, 100);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jToggleButton2.setText("Voltar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(550, 320, 105, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        PesquisarPaciente();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        VoltarTela();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableNomePac;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
