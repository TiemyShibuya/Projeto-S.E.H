package view;

import control.conexaoDB;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {

    /*Utilizado para fazer o controle do banco*/
 /*rs manda as informações para o banco*/
    ResultSet rs = null;
    ResultSet rs2 = null;
    /*pst pega os dados da tela*/
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    /*instanciando o banco*/
    conexaoDB con = new conexaoDB();

    int permissao;

    public Login() {
        initComponents();

    }

    private boolean login(int user) throws ClassNotFoundException {
        /*o que estou passando para o banco*/
        String query;
        if (user == 1) {
            query = "select * from medico where usuario=? and senha=? ";
        } else if (user == 2) {
            query = "select * from medico where usuario=? and senha=? ";
        } else {
            query = "select * from enfermeira where usuario=? and senha=?";
        }

        try {
            pst = con.conn.prepareStatement(query);

            pst.setString(1, jTextFieldUsuario.getText());
            pst.setString(2, String.valueOf(jPasswordFieldSenha.getPassword()));

            /*mandei p o banco as informações*/
            rs = pst.executeQuery();

            /*esperando a resposta*/
            if (rs.next()) {
                permissao = rs.getInt("permissao");
                //System.out.println(permissao);
                /*se o usuário n existir no banco fecha a conexão com o banco p ele poder tentar de novo*/
                try {
                    pst.close();
                    rs.close();
                    con.Disconnect();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
                }
                /*o usuário existe no banco*/
                JOptionPane.showMessageDialog(null, "Bem vindo(a) : " + jTextFieldUsuario.getText(), "Acessou", JOptionPane.INFORMATION_MESSAGE);
                switch (permissao) {
                    case 1:
                        new TelaAdministrador(jTextFieldUsuario.getText()).setVisible(true);
                        this.dispose();
                        break;
                    case 2:
                        new TelaMedico(jTextFieldUsuario.getText()).setVisible(true);
                        this.dispose();
                        break;
                    case 3:
                        new TelaEnfermeira(jTextFieldUsuario.getText()).setVisible(true);
                        this.dispose();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Você não tem permissão", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                return true;

            } else if (jTextFieldUsuario.getText().isEmpty() && jPasswordFieldSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuário e senha em branco", "erro", JOptionPane.ERROR_MESSAGE);

            } else {
                if (user == 3) {
                    JOptionPane.showMessageDialog(null, "Usuário e senha incorretos", "erro", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuário = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        getContentPane().add(jLabelUser);
        jLabelUser.setBounds(340, 60, 96, 80);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/selecionar.png"))); // NOI18N
        jToggleButton1.setText("Acessar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(271, 290, 100, 25);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(410, 290, 90, 25);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(310, 160, 160, 30);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(310, 210, 160, 30);

        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(260, 220, 50, 14);

        jLabelUsuário.setText("Usuário:");
        getContentPane().add(jLabelUsuário);
        jLabelUsuário.setBounds(260, 160, 60, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo6.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 390, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo6.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 0, 150, 370);

        setSize(new java.awt.Dimension(533, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (con.status() == false) {
            JOptionPane.showMessageDialog(null, "banco de dados não conectado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean teste = false;
            try {
                teste = login(1);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (teste == false) {
                try {
                    teste = login(2);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (teste == false) {
                    try {
                        login(3);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsuário;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
