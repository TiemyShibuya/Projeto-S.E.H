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
public class TelaEnfermeira extends javax.swing.JFrame {

    /**
     * Creates new form TelaEnfermeira
     */
    public TelaEnfermeira() {
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

        jToggleButtonAjuda = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButtonSair = new javax.swing.JButton();
        jButtonMensagem = new javax.swing.JButton();
        jLabelNomeEnfermeira = new javax.swing.JLabel();
        jLabelFotoEnfermeira = new javax.swing.JLabel();
        jToggleButtonPaciente = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelFundoLateral2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToggleButtonAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajuda.png"))); // NOI18N
        jToggleButtonAjuda.setText("Ajuda & Sobre");
        getContentPane().add(jToggleButtonAjuda);
        jToggleButtonAjuda.setBounds(10, 170, 140, 40);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        jToggleButton2.setText("Perfil");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(10, 120, 140, 40);

        jButtonSair.setBackground(new java.awt.Color(153, 153, 255));
        jButtonSair.setForeground(new java.awt.Color(204, 204, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(10, 520, 40, 40);

        jButtonMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mensagem.png"))); // NOI18N
        jButtonMensagem.setToolTipText("Mensagem");
        getContentPane().add(jButtonMensagem);
        jButtonMensagem.setBounds(710, 510, 50, 40);

        jLabelNomeEnfermeira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeEnfermeira.setText("Nome da enfermeira");
        getContentPane().add(jLabelNomeEnfermeira);
        jLabelNomeEnfermeira.setBounds(20, 80, 140, 17);

        jLabelFotoEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enfermeira.png"))); // NOI18N
        getContentPane().add(jLabelFotoEnfermeira);
        jLabelFotoEnfermeira.setBounds(60, 20, 50, 70);

        jToggleButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        getContentPane().add(jToggleButtonPaciente);
        jToggleButtonPaciente.setBounds(240, 90, 60, 60);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel.png"))); // NOI18N
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(350, 90, 60, 60);

        jLabelFundoLateral2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo6.png"))); // NOI18N
        getContentPane().add(jLabelFundoLateral2);
        jLabelFundoLateral2.setBounds(0, 370, 160, 400);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 370, 400, 90);
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(200, 320, 260, 20);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jToggleButton3.setText("Pesquisar");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(490, 320, 100, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar médico de plantão:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 270, 270, 30);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 180, 220);

        setSize(new java.awt.Dimension(794, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaEnfermeira().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFotoEnfermeira;
    private javax.swing.JLabel jLabelFundoLateral2;
    private javax.swing.JLabel jLabelNomeEnfermeira;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButtonAjuda;
    private javax.swing.JToggleButton jToggleButtonPaciente;
    // End of variables declaration//GEN-END:variables
}