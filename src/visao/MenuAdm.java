
package visao;

import javax.swing.JFrame;

/**
 *
 * @author Cah
 */
public class MenuAdm extends JFrame {

  
    public MenuAdm() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcessoProf = new javax.swing.JButton();
        btnAcessoAdm = new javax.swing.JButton();
        btnSairSistema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fundoMenuAdm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GERENCIAMENTO DE USUÁRIOS");
        setResizable(false);
        getContentPane().setLayout(null);

        btnAcessoProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professores.png"))); // NOI18N
        btnAcessoProf.setBorder(null);
        btnAcessoProf.setBorderPainted(false);
        btnAcessoProf.setContentAreaFilled(false);
        btnAcessoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessoProfActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessoProf);
        btnAcessoProf.setBounds(80, 140, 140, 110);

        btnAcessoAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Administrador.png"))); // NOI18N
        btnAcessoAdm.setBorder(null);
        btnAcessoAdm.setBorderPainted(false);
        btnAcessoAdm.setContentAreaFilled(false);
        btnAcessoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessoAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessoAdm);
        btnAcessoAdm.setBounds(290, 140, 110, 100);

        btnSairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairSistema.png"))); // NOI18N
        btnSairSistema.setBorderPainted(false);
        btnSairSistema.setContentAreaFilled(false);
        btnSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSairSistema);
        btnSairSistema.setBounds(420, 280, 83, 60);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Professores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 240, 110, 26);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Gerenciamento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 30, 170, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Admnistradores");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 240, 140, 26);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*Cadastro de funcionários");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-30, 70, 300, 34);

        fundoMenuAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundodetela.jpg"))); // NOI18N
        getContentPane().add(fundoMenuAdm);
        fundoMenuAdm.setBounds(0, 0, 530, 360);

        setSize(new java.awt.Dimension(529, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessoProfActionPerformed
          CadastroProfessores cadpro = new CadastroProfessores();
               cadpro.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnAcessoProfActionPerformed

    private void btnAcessoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessoAdmActionPerformed
          CadastroAdm cadadm = new CadastroAdm();
               cadadm.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnAcessoAdmActionPerformed

    private void btnSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessoAdm;
    private javax.swing.JButton btnAcessoProf;
    private javax.swing.JButton btnSairSistema;
    private javax.swing.JLabel fundoMenuAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
