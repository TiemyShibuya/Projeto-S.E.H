package view;

import control.ControlFicha;
import control.ControlPaciente;
import control.conexaoDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import projeto.Ficha;
import projeto.Paciente;

public class TelaCadastroPaciente extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaCadastroPaciente() {
        initComponents();

    }

    public void CadastrarPaciente() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String query = "insert into paciente(nome,cpf,sexo,idade,dataNasc,telefone,endereco,rg,emergencia) values(?,?,?,?,?,?,?,?,?)";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldcpf.getText());
            /*como pegar o sexo do paciente?*/
            pst.setInt(4, Integer.parseInt(jTextFieldIdade.getText()));
            pst.setDate(5, Date.valueOf(jTextFieldData.getText()));
            pst.setInt(6, Integer.parseInt(jTextFieldTel.getText()));
            pst.setString(7, jTextFieldEnd.getText());
            pst.setString(8, jFormattedTextFieldRG.getText());

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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldEnd = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();

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
        jLabel6.setBounds(170, 150, 70, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 100, 70, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Peso:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 190, 60, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("CPF:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 230, 36, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Altura:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 150, 70, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Data de Nascimento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 260, 220, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Endereço:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 300, 100, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Telefone:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(550, 200, 80, 22);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Descrição:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(180, 360, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Tipo de Emergência");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 550, 160, 30);

        jCheckBox1.setText("F");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(620, 100, 40, 23);

        jCheckBox2.setText("M");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(670, 100, 60, 23);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(310, 100, 150, 20);
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(230, 150, 60, 20);
        getContentPane().add(jTextFieldPeso);
        jTextFieldPeso.setBounds(220, 190, 70, 20);
        getContentPane().add(jTextFieldAltura);
        jTextFieldAltura.setBounds(620, 150, 50, 20);
        getContentPane().add(jTextFieldcpf);
        jTextFieldcpf.setBounds(220, 230, 180, 20);
        getContentPane().add(jTextFieldData);
        jTextFieldData.setBounds(340, 260, 150, 20);
        getContentPane().add(jTextFieldEnd);
        jTextFieldEnd.setBounds(260, 300, 160, 20);

        jTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTel);
        jTextFieldTel.setBounds(640, 200, 180, 20);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 360, 450, 130);

        jButton1.setText("1");
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 550, 70, 40);

        jButton2.setText("2");
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 550, 80, 40);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 550, 80, 40);

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 550, 100, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("CADASTRO DO PACIENTE");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 10, 340, 40);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(330, 660, 120, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("CANCELAR");
        getContentPane().add(jButton6);
        jButton6.setBounds(540, 660, 119, 31);

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
        jLabel4.setBounds(560, 250, 29, 20);

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFieldRG);
        jFormattedTextFieldRG.setBounds(640, 250, 180, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        Paciente pac = new Paciente();
        Ficha f = new Ficha();
        ControlPaciente cp = new ControlPaciente();
        ControlFicha fi = new ControlFicha();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        pac.setNome(jTextFieldNome.getText());
        pac.setIdade(Integer.parseInt(jTextFieldIdade.getText()));
        f.setPeso(Integer.parseInt(jTextFieldPeso.getText()));
        pac.setCpf(jTextFieldcpf.getText());
        pac.setDataNasc(Date.valueOf(jTextFieldData.getText()));
        pac.setTelefone(jTextFieldTel.getText());
        pac.setEndereco(jTextFieldEnd.getText());
        pac.setRg(jFormattedTextFieldRG.getText());
        f.setDescricao(jTextAreaDescricao.getText());
        f.setAltura(Integer.parseInt(jTextFieldAltura.getText()));

        cp.Create(pac);
        fi.Create(f);

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldcpf;
    // End of variables declaration//GEN-END:variables
}
