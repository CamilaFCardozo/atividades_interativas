/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Cah
 */
public class LoginProfessor extends javax.swing.JFrame {

    /**
     * Creates new form LoginProfessor
     */
      ConexaoBD con = new ConexaoBD();
    public LoginProfessor() {
        initComponents();
        con.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloAcProfessores = new javax.swing.JLabel();
        lblProfessor = new javax.swing.JLabel();
        lblSenhaProf = new javax.swing.JLabel();
        btnEntrarProf = new javax.swing.JButton();
        txtProfessor = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();
        fundoTelaProf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACESSO DOS PROFESSORES");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloAcProfessores.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTituloAcProfessores.setForeground(new java.awt.Color(153, 0, 0));
        lblTituloAcProfessores.setText("Acesso dos Professores.");
        getContentPane().add(lblTituloAcProfessores, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 300, 30));

        lblProfessor.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblProfessor.setText("Usuário");
        getContentPane().add(lblProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 70, 50));

        lblSenhaProf.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblSenhaProf.setText("Senha");
        getContentPane().add(lblSenhaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 70, 40));

        btnEntrarProf.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEntrarProf.setText("Entrar");
        btnEntrarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarProfActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrarProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 120, 30));

        txtProfessor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, 30));

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 30));

        btnVoltar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 130, 40));

        fundoTelaProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundodetela.jpg"))); // NOI18N
        fundoTelaProf.setMaximumSize(new java.awt.Dimension(0, 0));
        fundoTelaProf.setMinimumSize(new java.awt.Dimension(0, 0));
        fundoTelaProf.setName(""); // NOI18N
        fundoTelaProf.setPreferredSize(new java.awt.Dimension(0, 0));
        getContentPane().add(fundoTelaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 410));

        setSize(new java.awt.Dimension(588, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarProfActionPerformed
           try {
            con.executaSql("select * from professores where usuario='"+txtProfessor.getText()+"'");
            con.rs.first();
            if(con.rs.getString("senha").equals(txtSenha.getText())){
                MenuProfessor menuprof = new MenuProfessor();
                menuprof.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane,"Senha ou Usuario Incorretos!");
                txtProfessor.setText("");
                txtSenha.setText("");
            }    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Senha ou Usuario Incorretos!");
            txtProfessor.setText("");
            txtSenha.setText("");
            
        }
    }//GEN-LAST:event_btnEntrarProfActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
                                          
        String senha = txtSenha.getText();

            int quantCaracteres = senha.length();
            if (quantCaracteres > 7){
            senha = senha.substring (0, senha.length() - 1);
            txtSenha.setText(senha);

}
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaOpAdministrativas acesso = new TelaOpAdministrativas();
        acesso.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarProf;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel fundoTelaProf;
    private javax.swing.JLabel lblProfessor;
    private javax.swing.JLabel lblSenhaProf;
    private javax.swing.JLabel lblTituloAcProfessores;
    private javax.swing.JTextField txtProfessor;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
    
}

