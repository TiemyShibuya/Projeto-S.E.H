package view;

import control.conexaoDB;

public class TelaPerfilFuncionario extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();

    public TelaPerfilFuncionario(String usuario) {
        initComponents();
        jLabelNome.setText(usuario);

    }

    public void VoltarTela() {
        //con.Disconnect();
        this.dispose();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundoLateral = new javax.swing.JPanel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelNomeC = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldNomeC = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelEnd = new javax.swing.JLabel();
        jTextFieldEnd = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jCheckBoxFeminino = new javax.swing.JCheckBox();
        jCheckBoxMasculino = new javax.swing.JCheckBox();
        jLabelCargoFunc = new javax.swing.JLabel();
        jPanelFundoSuperior = new javax.swing.JPanel();
        jLabelPerfilFunc = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelFundoLateral.setBackground(new java.awt.Color(0, 0, 153));
        jPanelFundoLateral.setLayout(null);

        jLabelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jPanelFundoLateral.add(jLabelPerfil);
        jLabelPerfil.setBounds(20, 50, 80, 84);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome do func.");
        jPanelFundoLateral.add(jLabelNome);
        jLabelNome.setBounds(20, 140, 100, 14);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelFundoLateral.add(jButtonVoltar);
        jButtonVoltar.setBounds(20, 500, 100, 30);

        getContentPane().add(jPanelFundoLateral);
        jPanelFundoLateral.setBounds(0, 30, 140, 550);

        jLabelNomeC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeC.setText("Nome completo:");
        getContentPane().add(jLabelNomeC);
        jLabelNomeC.setBounds(200, 130, 130, 20);

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCPF.setText("CPF:");
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(200, 200, 50, 30);
        getContentPane().add(jTextFieldNomeC);
        jTextFieldNomeC.setBounds(200, 160, 220, 30);

        jLabelTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTel.setText("Telefone:");
        getContentPane().add(jLabelTel);
        jLabelTel.setBounds(200, 290, 100, 20);

        jLabelRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRG.setText("RG:");
        getContentPane().add(jLabelRG);
        jLabelRG.setBounds(510, 130, 40, 22);

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSexo.setText("Sexo:");
        getContentPane().add(jLabelSexo);
        jLabelSexo.setBounds(510, 220, 50, 22);

        jLabelEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEnd.setText("Endereço:");
        getContentPane().add(jLabelEnd);
        jLabelEnd.setBounds(200, 380, 100, 20);
        getContentPane().add(jTextFieldEnd);
        jTextFieldEnd.setBounds(200, 410, 280, 30);

        jLabelCargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCargo.setText("Cargo:");
        getContentPane().add(jLabelCargo);
        jLabelCargo.setBounds(170, 70, 60, 22);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(730, 530, 40, 40);

        jCheckBoxFeminino.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBoxFeminino.setText("Feminino");
        jCheckBoxFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFemininoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxFeminino);
        jCheckBoxFeminino.setBounds(540, 250, 100, 27);

        jCheckBoxMasculino.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBoxMasculino.setText("Masculino");
        getContentPane().add(jCheckBoxMasculino);
        jCheckBoxMasculino.setBounds(540, 280, 120, 27);

        jLabelCargoFunc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCargoFunc.setText("Cargo do funcionário");
        getContentPane().add(jLabelCargoFunc);
        jLabelCargoFunc.setBounds(230, 60, 180, 40);

        jPanelFundoSuperior.setBackground(new java.awt.Color(102, 102, 255));
        jPanelFundoSuperior.setLayout(null);

        jLabelPerfilFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPerfilFunc.setText("Perfil do funcionário");
        jPanelFundoSuperior.add(jLabelPerfilFunc);
        jLabelPerfilFunc.setBounds(650, 10, 130, 14);

        getContentPane().add(jPanelFundoSuperior);
        jPanelFundoSuperior.setBounds(0, 0, 780, 30);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(200, 230, 220, 30);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(200, 330, 220, 30);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(519, 160, 200, 28);

        setSize(new java.awt.Dimension(798, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxFemininoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        VoltarTela();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxFeminino;
    private javax.swing.JCheckBox jCheckBoxMasculino;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCargoFunc;
    private javax.swing.JLabel jLabelEnd;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeC;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfilFunc;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanelFundoLateral;
    private javax.swing.JPanel jPanelFundoSuperior;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldNomeC;
    // End of variables declaration//GEN-END:variables
}
