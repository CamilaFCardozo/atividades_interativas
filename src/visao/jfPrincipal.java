package visao;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class jfPrincipal extends JFrame
{
//  private PopupMenu sobre;
  private static File dir1 = new File(".");
  public static String caminho = "";
 // private JLabel jLabel1;
 // private JLabel jLabel2;
 // private JButton jbJogo2;
 // private JButton jbJogo3;
 // private JButton jbJogo4;
 // private JButton jbJogo5;
  private JButton jbNivel1;
  private JButton jbNivel2;
//  private JButton jbSair;
//  private JButton jbSobre;
  private JDesktopPane jdpPrincipal;
  
  public jfPrincipal()
  {
    initComponents();
    try
    {
      Image icon = Toolkit.getDefaultToolkit().getImage("src/imagens/outros/EJA.jpg");
      setIconImage(icon);
      setExtendedState(6);
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e, "Erro!", 0);
    }
  }
  
  public jfPrincipal(String nome)
  {
    initComponents();
    try
    {
      Image icon = Toolkit.getDefaultToolkit().getImage("src/imagens/outros/EJA.jpg");
      setIconImage(icon);
      setExtendedState(6);
      setTitle(nome);
      
      caminho = dir1.getCanonicalPath();
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e, "Erro!", 0);
    }
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jbNivel1 = new javax.swing.JButton();
        jbNivel2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ALFABETIZANDO");
        setAlwaysOnTop(true);

        jdpPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        jbNivel1.setText("jButton1");
        jbNivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNivel1ActionPerformed(evt);
            }
        });

        jbNivel2.setText("2222");
        jbNivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNivel2ActionPerformed(evt);
            }
        });

        jdpPrincipal.setLayer(jbNivel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jbNivel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbNivel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jbNivel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jbNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        setSize(new java.awt.Dimension(477, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNivel1ActionPerformed
        
    if (VerificaJogo())
    {
      CliqueLetras jbJogo3 = new CliqueLetras();
      jbJogo3.setVisible(true);
    }
    else
    {
      JOptionPane.showMessageDialog(this, "Voc� est� com outro jogo aberto.");
    }
    }//GEN-LAST:event_jbNivel1ActionPerformed

    private void jbNivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNivel2ActionPerformed
        CliqueLetras Jogo3 = new CliqueLetras();
        Jogo3.setVisible(true);
    }//GEN-LAST:event_jbNivel2ActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbNivel1;
    private javax.swing.JButton jbNivel2;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
  */
    private boolean VerificaJogo() {
        return jdpPrincipal.getAllFrames().length <= 0;
    }
}