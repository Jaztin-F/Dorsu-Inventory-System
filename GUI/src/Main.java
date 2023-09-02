
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAZTIN
 */
public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        Seticon();
    }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Movie = new javax.swing.JButton();
        Actor = new javax.swing.JButton();
        Director = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Movie.setBackground(new java.awt.Color(0, 0, 0, 0));
        Movie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/movie.png"))); // NOI18N
        Movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieActionPerformed(evt);
            }
        });
        getContentPane().add(Movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 170, 170));

        Actor.setBackground(new java.awt.Color(0, 0, 0, 0));
        Actor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/actor.png"))); // NOI18N
        Actor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActorActionPerformed(evt);
            }
        });
        getContentPane().add(Actor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 170, 170));

        Director.setBackground(new java.awt.Color(0, 0, 0, 0));
        Director.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/director.png"))); // NOI18N
        Director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectorActionPerformed(evt);
            }
        });
        getContentPane().add(Director, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 170, 170));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 130, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Background.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Design/film.png")));
    }
    private void MovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieActionPerformed
            new Movie().setVisible(true);
            dispose();
    }//GEN-LAST:event_MovieActionPerformed

    private void ActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActorActionPerformed
                new Actor().setVisible(true);
                dispose();
    }//GEN-LAST:event_ActorActionPerformed

    private void DirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectorActionPerformed
                new Director().setVisible(true);
                dispose();
    }//GEN-LAST:event_DirectorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int a=JOptionPane.showConfirmDialog(null,"Do you really want to exit","Exit",JOptionPane.YES_NO_OPTION);
        if(a==0){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actor;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Director;
    private javax.swing.JButton Movie;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
