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

    public void VoltarTela() {
        //con.Disconnect();
        this.dispose();
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
            pst.setString(2, jFormattedTextFieldcpf.getText());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jFormattedTextFieldcpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(220, 110, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 110, 60, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 160, 40, 22);

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel.setText("Sexo:");
        getContentPane().add(jLabel);
        jLabel.setBounds(420, 100, 50, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Idade:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 160, 60, 22);
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(490, 160, 60, 30);

        jLabelTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTel.setText("Telefone: ");
        getContentPane().add(jLabelTel);
        jLabelTel.setBounds(150, 270, 90, 22);

        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFieldTel);
        jFormattedTextFieldTel.setBounds(250, 270, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 330, 100, 22);
        getContentPane().add(jTextFieldEnd);
        jTextFieldEnd.setBounds(250, 330, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Especialidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 390, 120, 20);

        jTextFieldEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEspActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEsp);
        jTextFieldEsp.setBounds(280, 390, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Permissão:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 210, 100, 22);
        getContentPane().add(jTextFieldPer);
        jTextFieldPer.setBounds(270, 210, 60, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Usuário:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(500, 330, 70, 40);
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(580, 330, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Senha:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 380, 60, 22);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(580, 380, 130, 30);

        jToggleButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jToggleButtonSalvar.setText("Salvar");
        jToggleButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonSalvar);
        jToggleButtonSalvar.setBounds(220, 500, 130, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 570);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Data de Nascimento:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 210, 180, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setText("CADASTRO DE FUNCIONÁRIO");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(200, 0, 500, 60);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(490, 110, 60, 30);

        try {
            jFormattedTextFieldcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldcpf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jFormattedTextFieldcpf);
        jFormattedTextFieldcpf.setBounds(220, 160, 130, 30);

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jFormattedTextFieldData);
        jFormattedTextFieldData.setBounds(590, 200, 130, 35);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jToggleButton1.setText("Cancelar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(470, 500, 140, 40);

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

    private void jTextFieldEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEspActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        VoltarTela();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JFormattedTextField jFormattedTextFieldcpf;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldEsp;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPer;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
