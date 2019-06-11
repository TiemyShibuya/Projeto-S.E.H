/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Tiemy Shibuya
 */
public class TelaMensagem extends javax.swing.JFrame {

    /**
     * Creates new form TelaMensagem
     */
    public TelaMensagem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPriori = new javax.swing.JLabel();
        jLabelHospital = new javax.swing.JLabel();
        jToggleButtonExcluir = new javax.swing.JToggleButton();
        jToggleButtonEnviar = new javax.swing.JToggleButton();
        jComboBoxMensagem = new javax.swing.JComboBox<>();
        jComboBoxNomes = new javax.swing.JComboBox<>();
        jLabelPara = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jComboBoxMensagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preciso de ajuda aqui na recepção", "Encaminhando o paciente" }));
        getContentPane().add(jComboBoxMensagem);
        jComboBoxMensagem.setBounds(100, 80, 220, 70);

        jComboBoxNomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Maria", "Natália", "Lugi", "Nádia" }));
        jComboBoxNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomes);
        jComboBoxNomes.setBounds(100, 30, 180, 30);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMensagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxMensagem;
    private javax.swing.JComboBox<String> jComboBoxNomes;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelHospital;
    private javax.swing.JLabel jLabelPara;
    private javax.swing.JLabel jLabelPriori;
    private javax.swing.JToggleButton jToggleButtonEnviar;
    private javax.swing.JToggleButton jToggleButtonExcluir;
    // End of variables declaration//GEN-END:variables
}