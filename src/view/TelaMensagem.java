package view;

import control.conexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.Medico;

public class TelaMensagem extends javax.swing.JFrame {

    /*rs manda as informações para o banco*/
    ResultSet rs = null;
    /*pst pega os dados da tela*/
    PreparedStatement pst = null;
    conexaoDB con = new conexaoDB();
    Medico med = new Medico();

    public TelaMensagem() {
        initComponents();
    }

    private Medico Mensagem(Medico med) {
        String query = "select nome from medico";
        con.Connect();
        jComboBoxNomes.removeAllItems();

        try {
            pst = con.conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                jComboBoxNomes.addItem(rs.getString(1));
            }
            jComboBoxNomes.updateUI();

        } catch (SQLException e) {
            System.err.println("Nao foi possivel conectar ao Banco de Dados.");
            JOptionPane.showMessageDialog(null, "Nao foi possivel recuperar dados!", "Falha no Banco", JOptionPane.ERROR_MESSAGE);
        }
        return med;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("hospital_S.E.H?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        pessoaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("select p.nome from funcionario f join pessoa p on f.Pessoa_cpf=p.cpf");
        pessoaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pessoaQuery.getResultList();
        jLabelPriori = new javax.swing.JLabel();
        jLabelHospital = new javax.swing.JLabel();
        jToggleButtonExcluir = new javax.swing.JToggleButton();
        jToggleButtonEnviar = new javax.swing.JToggleButton();
        jComboBoxNomes = new javax.swing.JComboBox<>();
        jComboBoxMensagem = new javax.swing.JComboBox<>();
        jLabelPara = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelPriori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prori.png"))); // NOI18N
        getContentPane().add(jLabelPriori);
        jLabelPriori.setBounds(70, 120, 20, 30);

        jLabelHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hospital.png"))); // NOI18N
        getContentPane().add(jLabelHospital);
        jLabelHospital.setBounds(30, 90, 60, 40);

        jToggleButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jToggleButtonExcluir.setText("Excluir");
        getContentPane().add(jToggleButtonExcluir);
        jToggleButtonExcluir.setBounds(210, 170, 110, 30);

        jToggleButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enviar.png"))); // NOI18N
        jToggleButtonEnviar.setText("Enviar");
        getContentPane().add(jToggleButtonEnviar);
        jToggleButtonEnviar.setBounds(60, 170, 120, 30);

        jComboBoxNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomes);
        jComboBoxNomes.setBounds(100, 30, 220, 30);

        jComboBoxMensagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preciso de ajuda aqui na recepção", "Encaminhando o paciente" }));
        getContentPane().add(jComboBoxMensagem);
        jComboBoxMensagem.setBounds(100, 80, 220, 70);

        jLabelPara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPara.setText("Para:");
        getContentPane().add(jLabelPara);
        jLabelPara.setBounds(50, 34, 34, 20);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo6.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 360, 230);

        setSize(new java.awt.Dimension(372, 269));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomesActionPerformed

    }//GEN-LAST:event_jComboBoxNomesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JComboBox<String> jComboBoxMensagem;
    private javax.swing.JComboBox<Object> jComboBoxNomes;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelHospital;
    private javax.swing.JLabel jLabelPara;
    private javax.swing.JLabel jLabelPriori;
    private javax.swing.JToggleButton jToggleButtonEnviar;
    private javax.swing.JToggleButton jToggleButtonExcluir;
    private java.util.List<view.Pessoa> pessoaList;
    private javax.persistence.Query pessoaQuery;
    // End of variables declaration//GEN-END:variables
}
