package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Camila Cardozo
 */
public class TelaAcesso extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    MenuAtividades enviatexto;

    public TelaAcesso() {
        initComponents();
        con.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnComecar = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();
        lblProfessor = new javax.swing.JLabel();
        idAluno = new javax.swing.JFormattedTextField();
        btnAcesso = new javax.swing.JButton();
        fundoTela = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::::PROFESSOR::::");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 382));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComecar.setBackground(new java.awt.Color(102, 255, 102));
        btnComecar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnComecar.setText("Começar");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, 50));

        btnProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professor.png"))); // NOI18N
        btnProfessor.setBorder(null);
        btnProfessor.setBorderPainted(false);
        btnProfessor.setContentAreaFilled(false);
        getContentPane().add(btnProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 210, 200));

        lblProfessor.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblProfessor.setText("PROFESSOR");
        lblProfessor.setToolTipText("");
        getContentPane().add(lblProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 240, 40));

        idAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        idAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idAluno.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        idAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlunoActionPerformed(evt);
            }
        });
        idAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idAlunoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idAlunoKeyReleased(evt);
            }
        });
        getContentPane().add(idAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, 80));

        btnAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        btnAcesso.setContentAreaFilled(false);
        btnAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 50, 50));

        fundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundodetela.jpg"))); // NOI18N
        fundoTela.setToolTipText("");
        getContentPane().add(fundoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   /*VERIFICAR SE O NUMERO DO ALUNO ESTA CADASTRADO E PERMITIR ACESSO*/
    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed

        try {
            con.executaSql("select * from alunos where cod_acesso='" + idAluno.getText() + "'");
            con.rs.first();
            if (con.rs.getString("cod_acesso").equals(idAluno.getText())) {
                //AQUI UTILIZO O System.setProperty()
                System.setProperty("login",idAluno.getText());
                MenuAtividades menu = new MenuAtividades();
                menu.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "TENTE DE NOVO! ");
                //Limpando Campos após excluir
                idAluno.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, " DIGITE ALGO E TENTE DE NOVO! ");
            //Limpando Campos após excluir
            idAluno.setText("");

        }
    }//GEN-LAST:event_btnComecarActionPerformed
    /*VERIFICAR SE A SENHA POSSUI A QUANTIDADE CERTA DE NUMEROS*/
    private void idAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idAlunoKeyPressed
        String senha = idAluno.getText();

        int quantCaracteres = senha.length();
        if (quantCaracteres > 2) {
            senha = senha.substring(0, senha.length() - 1);
            idAluno.setText(senha);
        }
    }//GEN-LAST:event_idAlunoKeyPressed
    /*VERIFICAR SE A SENHA POSSUI APENAS NUMEROS*/
    private void idAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idAlunoKeyReleased
        Integer valor;
        try {
            valor = Integer.parseInt(idAluno.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "APENAS NUMEROS!");
            //Limpando Campos após excluir
            idAluno.setText("");

        }
    }//GEN-LAST:event_idAlunoKeyReleased
    /*VERIFICAR SE OS DADOS DO LOGIN ESTÃO CORRETOS E PERMITIR ACESSO AO MENU ADMIBISTRATIVO*/
    private void btnAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessoActionPerformed
        TelaOpAdministrativas opadm = new TelaOpAdministrativas();
        opadm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAcessoActionPerformed

    private void idAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAlunoActionPerformed
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
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaAcesso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcesso;
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnProfessor;
    private javax.swing.JLabel fundoTela;
    private javax.swing.JFormattedTextField idAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblProfessor;
    // End of variables declaration//GEN-END:variables
}
