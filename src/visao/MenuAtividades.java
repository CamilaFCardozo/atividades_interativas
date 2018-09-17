package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import modeloBeans.BeansAlunos;
import modeloConection.ConexaoBD;
import modeloDao.ControleAlunos;

/**
 *
 * @author orteca
 */
public class MenuAtividades extends JFrame {

    ConexaoBD conex = new ConexaoBD();
    BeansAlunos mod = new BeansAlunos();
    ControleAlunos dao = new ControleAlunos();

    /**
     * Creates new form MenuAtividades
     */
    public MenuAtividades() {
        initComponents();
     /* modificar cadastro de alunos::: https://www.youtube.com/watch?v=tHZwJyBys5Y*/
        //Aqui trago o numero do aluno com O System.getProperty() e apresento na jlId.
        String usuario = System.getProperty("login", "");
       jlId.setText(usuario);
       conex.conexao();
       conex.executaSql("select * from alunos where cod_acesso='"+ usuario +"'");
        try {
            conex.rs.first();
            jlNome.setText(conex.rs.getString("nome"));
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(MenuAtividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
       

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNivel1 = new javax.swing.JLabel();
        btnAtividade3 = new javax.swing.JButton();
        lblNivel2 = new javax.swing.JLabel();
        btnAtividade2 = new javax.swing.JButton();
        jlQcabeca = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jlContinhas = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        btnAtividade1 = new javax.swing.JButton();
        jlClickLetras = new javax.swing.JLabel();
        fundoMenuAtividade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU DE ATIVIDADES");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNivel1.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        lblNivel1.setForeground(new java.awt.Color(102, 0, 0));
        lblNivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel1.setText("Hora de brincar");
        getContentPane().add(lblNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 250, 50));

        btnAtividade3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnAtividade3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ContinhasLogo.png"))); // NOI18N
        btnAtividade3.setBorder(null);
        btnAtividade3.setBorderPainted(false);
        btnAtividade3.setContentAreaFilled(false);
        btnAtividade3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtividade3MouseClicked(evt);
            }
        });
        btnAtividade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtividade3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtividade3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 110, 90));

        lblNivel2.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        lblNivel2.setForeground(new java.awt.Color(102, 0, 0));
        lblNivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel2.setText("Atividades");
        getContentPane().add(lblNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 180, 50));

        btnAtividade2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnAtividade2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/QuebraCabeçaLogo.png"))); // NOI18N
        btnAtividade2.setBorder(null);
        btnAtividade2.setBorderPainted(false);
        btnAtividade2.setContentAreaFilled(false);
        btnAtividade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtividade2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtividade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 90, -1));

        jlQcabeca.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jlQcabeca.setText("Quebra Cabeça");
        getContentPane().add(jlQcabeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 140, -1));

        jbSair.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairSistema.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setBorder(null);
        jbSair.setBorderPainted(false);
        jbSair.setContentAreaFilled(false);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 110, -1));

        jlId.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jlId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlId.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlIdAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 40));

        jlContinhas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jlContinhas.setText("Continhas");
        getContentPane().add(jlContinhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 90, -1));

        jlNome.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 350, 40));

        btnAtividade1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnAtividade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CliqueNasLetrasLogo.png"))); // NOI18N
        btnAtividade1.setBorder(null);
        btnAtividade1.setBorderPainted(false);
        btnAtividade1.setContentAreaFilled(false);
        btnAtividade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtividade1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtividade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 110));

        jlClickLetras.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jlClickLetras.setText("Clique nas Letras");
        getContentPane().add(jlClickLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        fundoMenuAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundodetela.jpg"))); // NOI18N
        getContentPane().add(fundoMenuAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 530));

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtividade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtividade2ActionPerformed
        MenuQuebraCabecas menu = new MenuQuebraCabecas();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtividade2ActionPerformed

    private void btnAtividade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtividade1ActionPerformed
        jfPrincipal at1 = new jfPrincipal();
        at1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtividade1ActionPerformed

    private void btnAtividade3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtividade3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtividade3MouseClicked

    private void btnAtividade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtividade3ActionPerformed
        MenuContinhas menu_at2 = new MenuContinhas();
        menu_at2.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnAtividade3ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jlIdAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlIdAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jlIdAncestorAdded

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
            java.util.logging.Logger.getLogger(MenuAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAtividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtividade1;
    private javax.swing.JButton btnAtividade2;
    private javax.swing.JButton btnAtividade3;
    private javax.swing.JLabel fundoMenuAtividade;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlClickLetras;
    private javax.swing.JLabel jlContinhas;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQcabeca;
    private javax.swing.JLabel lblNivel1;
    private javax.swing.JLabel lblNivel2;
    // End of variables declaration//GEN-END:variables

}
