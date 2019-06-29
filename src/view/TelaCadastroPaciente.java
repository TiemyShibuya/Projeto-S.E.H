package view;

import control.ControlFicha;
import control.ControlPaciente;
import control.conexaoDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Ficha;
import projeto.Paciente;

public class TelaCadastroPaciente extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    ResultSet rs = null;
    int emergencia;

    public TelaCadastroPaciente() {
        initComponents();

    }

    public void CadastrarPaciente() {
        String query = "insert into paciente(nome,cpf,sexo,idade,dataNasc,telefone,endereco,rg,emergencia) values(?,?,?,?,?,?,?,?,?)";
        con.Connect();

        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldcpf.getText());
            pst.setString(3, jTextFieldSexo.getText());
            pst.setInt(4, Integer.parseInt(jTextFieldIdade.getText()));
            pst.setDate(5, Date.valueOf(jTextFieldData.getText()));
            pst.setInt(6, Integer.parseInt(jTextFieldTel.getText()));
            pst.setString(7, jTextFieldEnd.getText());
            pst.setString(8, jFormattedTextFieldRG.getText());
            pst.setInt(9, Integer.parseInt(jTextFieldEme.getText()));

            rs = pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limparCampo() {
        jTextFieldNome.setText("");
        jTextFieldIdade.setText("");
        jTextFieldcpf.setText("");
        jTextFieldData.setText("");
        jTextFieldEnd.setText("");
        jTextFieldTel.setText("");
        jFormattedTextFieldRG.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldEnd = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jTextFieldEme = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nome Completo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 100, 160, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Idade:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 160, 70, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 100, 70, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("CPF:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 210, 36, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Data de Nascimento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 270, 220, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Endereço:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(160, 330, 100, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Telefone:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(550, 150, 80, 22);

        jCheckBox1.setText("F");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(760, 40, 40, 23);

        jCheckBox2.setText("M");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(800, 40, 60, 23);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(310, 100, 170, 30);
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(310, 150, 70, 30);

        jTextFieldcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcpf);
        jTextFieldcpf.setBounds(310, 200, 180, 30);
        getContentPane().add(jTextFieldData);
        jTextFieldData.setBounds(340, 270, 150, 30);
        getContentPane().add(jTextFieldEnd);
        jTextFieldEnd.setBounds(340, 320, 160, 30);

        jTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTel);
        jTextFieldTel.setBounds(640, 150, 180, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("CADASTRO DO PACIENTE");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 10, 340, 40);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSalvar.setText("Ficha");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(740, 650, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nurse.jpeg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 120, 50, 60);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome da Enfermeira");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 190, 120, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 150, 700);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("RG:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 200, 29, 20);

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFieldRG);
        jFormattedTextFieldRG.setBounds(640, 200, 180, 28);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(640, 100, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Tipo de emergência:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 570, 170, 22);

        jToggleButton1.setText("1");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(420, 490, 60, 50);

        jToggleButton2.setText("2");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(480, 490, 60, 50);

        jToggleButton3.setText("3");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(540, 490, 60, 50);

        jToggleButton4.setText("4");
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(600, 490, 60, 50);
        getContentPane().add(jTextFieldEme);
        jTextFieldEme.setBounds(460, 570, 70, 30);

        setSize(new java.awt.Dimension(909, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (con.status() == false) {
            JOptionPane.showMessageDialog(null, "banco de dados não conectado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            CadastrarPaciente();
            new TelaFicha(jTextFieldNome.getText()).setVisible(true);
        }
        this.dispose();

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelActionPerformed

    private void jTextFieldcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcpfActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEme;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldcpf;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
