package view;

import control.conexaoDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

public class TelaCadastroFuncionario extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    ResultSet rs = null;
    PreparedStatement pst = null;

    public TelaCadastroFuncionario() {
        initComponents();
    }

    public void Cadastrar() {
        String query = null;
        int resultadoPermissao = Integer.parseInt(jTextFieldPer.getText());

        if (resultadoPermissao == 1) {
            query = "insert into medico (nome,cpf,sexo,idade,dataNasc,telefone,endereco,especialidade,permissao,usuario,senha) values(?,?,?,?,?,?,?,?,?,?,?)";
        } else if (resultadoPermissao == 2) {
            System.out.println("aqui2");
            query = "insert into medico (nome,cpf,sexo,idade,dataNasc,telefone,endereco,especialidade,permissao,usuario,senha) values(?,?,?,?,?,?,?,?,?,?,?)";
        } else if (resultadoPermissao == 3) {
            query = "insert into enfermeira (nome,cpf,sexo,idade,dataNasc,telefone,endereco,cargo,permissao,usuario,senha) values(?,?,?,?,?,?,?,?,?,?,?)";
        }

        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);
            System.out.println("aqui");

            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldCpf.getText());
            pst.setString(3, jTextFieldSexo.getText());
            pst.setInt(4, Integer.parseInt(jTextFieldIdade.getText()));
            pst.setDate(5, Date.valueOf(jFormattedTextFieldData.getText()));
            pst.setInt(6, Integer.parseInt(jFormattedTextFieldTel.getText()));
            pst.setString(7, jTextFieldEnd.getText());
            pst.setString(8, jTextFieldEsp.getText());
            pst.setInt(9, Integer.parseInt(jTextFieldPer.getText()));
            pst.setString(10, jTextFieldUser.getText());
            pst.setString(11, jPasswordFieldSenha.getText());

            pst.execute();
        } catch (SQLException e) {
            System.err.println("Nao foi possivel conectar ao Banco de Dados.");
            JOptionPane.showMessageDialog(null, "Nao foi possivel cadastrar funcionário!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelTel = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEnd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEsp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jToggleButtonSalvar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(270, 120, 120, 20);
        getContentPane().add(jTextFieldCpf);
        jTextFieldCpf.setBounds(270, 160, 130, 20);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 120, 31, 14);

        jLabel2.setText("cpf:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 160, 19, 14);

        jLabel3.setText("sexo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 210, 27, 14);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(270, 210, 120, 20);

        jLabel4.setText("idade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 260, 26, 14);
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(280, 250, 100, 20);

        jLabel5.setText("DataNasc:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(194, 310, 50, 14);
        getContentPane().add(jFormattedTextFieldData);
        jFormattedTextFieldData.setBounds(280, 300, 100, 20);

        jLabelTel.setText("Telefone: ");
        getContentPane().add(jLabelTel);
        jLabelTel.setBounds(200, 350, 60, 14);
        getContentPane().add(jFormattedTextFieldTel);
        jFormattedTextFieldTel.setBounds(280, 350, 120, 20);

        jLabel6.setText("Endereco:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(184, 390, 60, 14);
        getContentPane().add(jTextFieldEnd);
        jTextFieldEnd.setBounds(270, 390, 150, 20);

        jLabel8.setText("Especialidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(154, 440, 80, 14);
        getContentPane().add(jTextFieldEsp);
        jTextFieldEsp.setBounds(270, 430, 150, 20);

        jLabel7.setText("permissao:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 120, 70, 14);
        getContentPane().add(jTextFieldPer);
        jTextFieldPer.setBounds(510, 120, 59, 20);

        jLabel9.setText("usuario:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 190, 50, 14);
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(510, 190, 70, 20);

        jLabel10.setText("senha:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 240, 33, 14);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(500, 240, 111, 20);

        jToggleButtonSalvar.setText("Salvar");
        jToggleButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonSalvar);
        jToggleButtonSalvar.setBounds(290, 500, 63, 23);

        setBounds(0, 0, 778, 605);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSalvarActionPerformed

        if (con.status() == false) {
            JOptionPane.showMessageDialog(null, "banco de dados não conectado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            Cadastrar();
        }
        this.dispose();
    }//GEN-LAST:event_jToggleButtonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldEsp;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPer;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JToggleButton jToggleButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
