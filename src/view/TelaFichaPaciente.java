package view;

import control.conexaoDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaFichaPaciente extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaFichaPaciente(String pac) {
        initComponents();
        jLabelNome.setText(pac);
    }

    public void PreencherFicha() {
        //"select curdate()";
        //"insert into ficha (date) values(curdate())";
        String query = "select Paciente_idPac from paciente where date";
        String query2 = "insert into ficha(Paciente_idPac,peso,altura,alergia,descricao,tipoSG,medicamento,date) values(?,?,?,?,?,?,?)";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);

            pst.setInt(1, Integer.parseInt(jTextFieldPeso.getText()));
            pst.setInt(2, Integer.parseInt(jTextFieldAlt.getText()));
            pst.setString(3, jTextFieldAler.getText());
            pst.setString(4, jTextAreaDesc.getText());
            pst.setString(5, jTextFieldTS.getText());
            pst.setString(6, jTextFieldMed.getText());
            pst.setDate(7, Date.valueOf(jFormattedTextFieldData.getText()));

            pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAlt = new javax.swing.JTextField();
        jTextFieldAler = new javax.swing.JTextField();
        jTextFieldTS = new javax.swing.JTextField();
        jTextFieldMed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldEm = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 130, 590);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("FICHA DO PACIENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 20, 240, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Paciente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 90, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Peso:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 150, 70, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Altura:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 200, 52, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Alergia:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 150, 90, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo sanguíneo: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 200, 160, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Medicamento:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 260, 130, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Descrição:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 310, 120, 22);
        getContentPane().add(jTextFieldPeso);
        jTextFieldPeso.setBounds(260, 150, 100, 30);
        getContentPane().add(jTextFieldAlt);
        jTextFieldAlt.setBounds(270, 200, 100, 30);
        getContentPane().add(jTextFieldAler);
        jTextFieldAler.setBounds(530, 150, 100, 30);
        getContentPane().add(jTextFieldTS);
        jTextFieldTS.setBounds(590, 200, 90, 30);
        getContentPane().add(jTextFieldMed);
        jTextFieldMed.setBounds(340, 260, 140, 30);

        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 320, 410, 150);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tipo de emergência:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 530, 180, 22);
        getContentPane().add(jTextFieldEm);
        jTextFieldEm.setBounds(390, 530, 70, 30);

        jLabelNome.setText("jLabel10");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(240, 100, 40, 14);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 160, 11, 14);

        jLabel11.setText("cm");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 210, 40, 14);
        getContentPane().add(jFormattedTextFieldData);
        jFormattedTextFieldData.setBounds(490, 80, 150, 20);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jToggleButton1.setText("Salvar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(610, 543, 99, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        PreencherFicha();
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextFieldAler;
    private javax.swing.JTextField jTextFieldAlt;
    private javax.swing.JTextField jTextFieldEm;
    private javax.swing.JTextField jTextFieldMed;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTS;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
