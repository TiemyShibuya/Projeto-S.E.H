package view;

import control.conexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPerfilFuncionario extends javax.swing.JFrame {

    conexaoDB con = new conexaoDB();
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    String id;
    String user;

    public TelaPerfilFuncionario(String usuario) throws ClassNotFoundException, SQLException {
        user = usuario;
        initComponents();
        jLabelNome.setText(usuario);
        con.Connect();
        boolean teste = false;
        teste = Mostrar(1);
        if (teste == false) {
            teste = Mostrar(2);
        }

    }

    public void VoltarTela() {
        //con.Disconnect();
        this.dispose();
    }

    public boolean Mostrar(int aux) throws SQLException {
        //System.out.println(user);
        String query;
        if (aux == 1) {
            query = "select * from medico where usuario = '" + user + "'";
            try {
                pst = con.conn.prepareStatement(query);
                rs = pst.executeQuery();
                if (rs.next()) {
                    jTextFieldNomeC.setText(rs.getString("nome"));
                    jFormattedTextFieldCpf.setText(rs.getString("cpf"));
                    jTextFieldSexo.setText(rs.getString("sexo"));
                    jTextFieldIdade.setText(rs.getString("idade"));
                    jFormattedTextFieldDt.setText(rs.getString("dataNasc"));
                    jFormattedTextFieldTel.setText(rs.getString("telefone"));
                    jTextFieldEnd.setText(rs.getString("endereco"));
                    jTextFieldESp.setText(rs.getString("especialidade"));
                    jTextFieldUser.setText(rs.getString("usuario"));
                    jPasswordFieldSenha.setText(rs.getString("senha"));

                }

            } catch (SQLException erro) {

                // JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        } else if (aux == 2) {
            query = "select * from enfermeira where usuario = '" + user + "'";

            try {
                pst = con.conn.prepareStatement(query);
                rs = pst.executeQuery();
                if (rs.next()) {
                    jTextFieldNomeC.setText(rs.getString("nome"));
                    jFormattedTextFieldCpf.setText(rs.getString("cpf"));
                    jTextFieldSexo.setText(rs.getString("sexo"));
                    jTextFieldIdade.setText(rs.getString("idade"));
                    jFormattedTextFieldDt.setText(rs.getString("data"));
                    jFormattedTextFieldTel.setText(rs.getString("telefone"));
                    jTextFieldEnd.setText(rs.getString("endereco"));
                    jTextFieldESp.setText(rs.getString("cargo"));
                    jTextFieldUser.setText(rs.getString("usuario"));
                    jPasswordFieldSenha.setText(rs.getString("senha"));
                }

            } catch (SQLException erro) {
                //JOptionPane.showMessageDialog(null, "Falha na conexão", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;

    }

    public boolean UpdateFuncionario(int aux) throws ClassNotFoundException {
        String query;
        if (aux == 1) {
            query = "update medico set nome=?,cpf=?,sexo=?,idade=?,dataNasc=?,telefone=?,endereco=?,especialidade=?,usuario=?,senha=? where usuario = '" + user + "'";
            try {

                pst = con.conn.prepareStatement(query);

                pst.setString(1, jTextFieldNomeC.getText());
                pst.setString(2, jFormattedTextFieldCpf.getText());
                pst.setString(3, jTextFieldSexo.getText());
                pst.setInt(4, Integer.parseInt(jTextFieldIdade.getText()));
                pst.setString(5, jFormattedTextFieldDt.getText());
                pst.setString(6, jFormattedTextFieldTel.getText());
                pst.setString(7, jTextFieldEnd.getText());
                pst.setString(8, jTextFieldESp.getText());
                pst.setString(9, jTextFieldUser.getText());
                pst.setString(10, jPasswordFieldSenha.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!", "Atualizado", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException error) {

                //JOptionPane.showMessageDialog(null, "Não foi possível atualizar!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (aux == 2) {
            query = "update enfermeira set nome=?,cpf=?,sexo=?,idade=?,dataNasc=?,telefone=?,endereco=?,cargo=?,usuario=?,senha=? where usuario = '" + user + "'";

            try {

                pst = con.conn.prepareStatement(query);

                pst.setString(1, jTextFieldNomeC.getText());
                pst.setString(2, jFormattedTextFieldCpf.getText());
                pst.setString(3, jTextFieldSexo.getText());
                pst.setInt(4, Integer.parseInt(jTextFieldIdade.getText()));
                pst.setString(5, jFormattedTextFieldDt.getText());
                pst.setString(6, jFormattedTextFieldTel.getText());
                pst.setString(7, jTextFieldEnd.getText());
                pst.setString(8, jTextFieldESp.getText());
                pst.setString(9, jTextFieldUser.getText());
                pst.setString(10, jPasswordFieldSenha.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!", "Atualizado", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException error) {

                //JOptionPane.showMessageDialog(null, "Não foi possível atualizar!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return false;

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
        jLabelSexo = new javax.swing.JLabel();
        jLabelEnd = new javax.swing.JLabel();
        jTextFieldEnd = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabelCargoFunc = new javax.swing.JLabel();
        jPanelFundoSuperior = new javax.swing.JPanel();
        jLabelPerfilFunc = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jFormattedTextFieldDt = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldESp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();

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
        jLabelNomeC.setBounds(190, 120, 130, 20);

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCPF.setText("CPF:");
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(190, 190, 50, 30);
        getContentPane().add(jTextFieldNomeC);
        jTextFieldNomeC.setBounds(190, 150, 220, 30);

        jLabelTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTel.setText("Telefone:");
        getContentPane().add(jLabelTel);
        jLabelTel.setBounds(190, 270, 100, 20);

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSexo.setText("Sexo:");
        getContentPane().add(jLabelSexo);
        jLabelSexo.setBounds(500, 120, 50, 22);

        jLabelEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEnd.setText("Endereço:");
        getContentPane().add(jLabelEnd);
        jLabelEnd.setBounds(190, 340, 100, 20);
        getContentPane().add(jTextFieldEnd);
        jTextFieldEnd.setBounds(190, 370, 280, 30);

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
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFieldCpf);
        jFormattedTextFieldCpf.setBounds(190, 220, 220, 30);

        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFieldTel);
        jFormattedTextFieldTel.setBounds(190, 300, 220, 30);
        getContentPane().add(jTextFieldSexo);
        jTextFieldSexo.setBounds(500, 150, 90, 30);

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelData.setText("Data Nascimento:");
        getContentPane().add(jLabelData);
        jLabelData.setBounds(500, 190, 140, 22);

        try {
            jFormattedTextFieldDt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFieldDt);
        jFormattedTextFieldDt.setBounds(500, 220, 220, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Especialidade:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 410, 130, 22);
        getContentPane().add(jTextFieldESp);
        jTextFieldESp.setBounds(190, 440, 230, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuário: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 270, 80, 22);
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(500, 300, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Senha: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 340, 80, 22);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(500, 370, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Idade:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 120, 60, 22);

        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(650, 150, 50, 30);

        setSize(new java.awt.Dimension(798, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        boolean teste2 = false;
        try {
            teste2 = UpdateFuncionario(1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPerfilFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (teste2 == false) {
            try {
                teste2 = UpdateFuncionario(2);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPerfilFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        VoltarTela();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDt;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCargoFunc;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEnd;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeC;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfilFunc;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanelFundoLateral;
    private javax.swing.JPanel jPanelFundoSuperior;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldESp;
    private javax.swing.JTextField jTextFieldEnd;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNomeC;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
