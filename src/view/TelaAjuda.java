/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Natalia
 */
public class TelaAjuda extends javax.swing.JFrame {

    /**
     * Creates new form TelaAjuda
     */
    public TelaAjuda() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 479);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 100, 730);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ajuda");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 20, 60, 30);

        jLabel2.setText("1) Problema na Tela de Acesso?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 90, 200, 30);

        jLabel3.setText(" É necessário colocar o login e a senha para poder ter acesso ao sistema.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 120, 430, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 280, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/que.jpeg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 20, 40, 40);

        jLabel6.setText("2) Problema na Tela de Usuário?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 220, 230, 16);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Dependendo de qual tipo de usuário entrar no sistema ele será direcionado para a sua tela inicial.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 150, 570, 16);

        jLabel8.setText("O administrador é o único usuário capaz de gerenciar outras contas.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 170, 430, 16);

        jLabel9.setText("Uma barra de pesquisa também está na tela inicial para ser feita as consultas de fichas de pacientes ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 250, 600, 16);

        jLabel10.setText("no banco de dados. ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 270, 140, 16);

        jLabel11.setText(" Clicando no botão “Novo Cadastro” o usuário com permissão");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 300, 360, 16);

        jLabel12.setText(", há somente dois tipos de usuários ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(480, 300, 207, 16);

        jLabel13.setText("que podem fazer cadastros no sistema");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(130, 320, 230, 16);

        jLabel14.setText(", o Administrador e a(o) Enfermeira(o).");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 320, 230, 16);

        jLabel15.setText("3) Problema na Tela de Cadastro?");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(130, 370, 240, 16);

        jLabel16.setText("Na tela de cadastro o usuário tem que preencher todos os campos obrigatórios. Se for o cadastro");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(130, 400, 580, 16);

        jLabel17.setText("de um paciente, é obrigatório selecionar o nível de emergência.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(130, 420, 390, 16);

        jLabel18.setText("4) Problema na Tela Ficha do Paciente?");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(130, 470, 260, 16);

        jLabel19.setText("O médico pode apenas visualizar a ficha do paciente, esse tipo de usuário tem como tela da ficha");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(130, 500, 580, 20);

        jLabel20.setText("somente no modo de leitura, não podendo editar nenhum campo.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(130, 520, 440, 16);

        jLabel21.setText("5) Problema na Tela do Administrador?");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(130, 560, 330, 16);

        jLabel23.setText("O Administrador tem uma tela aonde é possível gerenciar todas as contas do sistema, podendo excluir");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(130, 590, 900, 16);

        jLabel24.setText("alguma conta. Esse tipo de usuário pode também ter acesso à ficha dos pacientes.");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(130, 610, 520, 16);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Mais dúvidas? Acesse projetoseh@gmail.com");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(230, 690, 560, 29);

        pack();
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
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAjuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
