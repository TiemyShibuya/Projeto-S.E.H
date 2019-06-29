package view;

import control.conexaoDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaFicha extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaFicha(String pac) {
        initComponents();
        jLabelNome.setText(pac);
    }

    public void PreencherFicha() {
        String query = "insert into ficha(peso,altura,alergia,descricao,tipoSG,medicamento,date) values(?,?,?,?,?,?,?)";
        con.Connect();
        try {
            pst = con.conn.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(jTextFieldPeso.getText()));
            pst.setInt(2, Integer.parseInt(jTextFieldAlt.getText()));
            pst.setString(3, jTextFieldAle.getText());
            pst.setString(4, jTextAreaDesc.getText());
            pst.setString(7, jTextFieldTS.getText());
            pst.setString(7, jTextFieldMed.getText());
            //pst.setDate(5, Date.valueOf(.getText())); data do dia

            rs = pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabelNome = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAle = new javax.swing.JTextField();
        jTextFieldTS = new javax.swing.JTextField();
        jTextFieldAlt = new javax.swing.JTextField();
        jTextFieldMed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName.setText("Paciente:");
        getContentPane().add(jLabelName);
        jLabelName.setBounds(190, 110, 90, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Altura:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(530, 150, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Peso:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 160, 60, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Alergia:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 210, 59, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Tipo sanguíneo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 260, 140, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Descrição:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(190, 340, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Tipo de Emergência");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(180, 530, 160, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ficha.jpeg"))); // NOI18N
        jPanel2.add(jLabel22);
        jLabel22.setBounds(588, 36, 50, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 120, 690);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ficha.jpeg"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(790, 10, 60, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("FICHA DO PACIENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 0, 380, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Medicamento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 210, 130, 22);

        jToggleButton1.setText("1");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(360, 530, 80, 40);

        jToggleButton2.setText("2");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(440, 530, 70, 40);

        jToggleButton3.setText("3");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(510, 530, 70, 40);

        jToggleButton4.setText("4");
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(580, 530, 70, 40);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(280, 110, 90, 0);

        jToggleButton5.setText("Salvar");
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(460, 600, 63, 40);

        jToggleButton6.setText("Cancelar");
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(640, 600, 75, 40);
        getContentPane().add(jTextFieldPeso);
        jTextFieldPeso.setBounds(270, 160, 150, 30);
        getContentPane().add(jTextFieldAle);
        jTextFieldAle.setBounds(290, 210, 140, 30);

        jTextFieldTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTSActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTS);
        jTextFieldTS.setBounds(350, 260, 90, 30);
        getContentPane().add(jTextFieldAlt);
        jTextFieldAlt.setBounds(590, 150, 150, 30);
        getContentPane().add(jTextFieldMed);
        jTextFieldMed.setBounds(660, 210, 140, 30);

        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 330, 510, 170);

        setSize(new java.awt.Dimension(877, 699));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTSActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextFieldAle;
    private javax.swing.JTextField jTextFieldAlt;
    private javax.swing.JTextField jTextFieldMed;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldTS;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    // End of variables declaration//GEN-END:variables
}
