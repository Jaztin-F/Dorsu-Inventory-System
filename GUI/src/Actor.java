

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAZTIN
 */
public class Actor extends javax.swing.JFrame {
   
    
    public Actor() {
        initComponents();
        Seticon();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.setLocationRelativeTo(null);
        form = new javax.swing.JFrame();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        movie = new javax.swing.JTextField();
        birth = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        View = new javax.swing.JToggleButton();
        Delete = new javax.swing.JButton();
        Hide = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        form.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        form.setFocusTraversalPolicyProvider(true);
        form.setLocation(new java.awt.Point(400, 150));
        form.setMinimumSize(new java.awt.Dimension(560, 335));
        form.setResizable(false);
        form.setSize(new java.awt.Dimension(560, 335));
        form.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 0, 0,80
        ));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Actor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panel.setMinimumSize(new java.awt.Dimension(560, 340));
        panel.setPreferredSize(new java.awt.Dimension(560, 340));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Birth Date");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 30));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Movie");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, 30));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Role");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 160, 30));

        role.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 266, 32));

        movie.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 266, 32));

        birth.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 266, 32));

        name.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 266, 32));

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        panel.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 110, 50));

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        panel.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 50));

        form.getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 340));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/bg.jpg"))); // NOI18N
        form.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, 0, 580, 440));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Exit.setText("Back");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 120, 50));

        View.setBackground(new java.awt.Color(255, 255, 255));
        View.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        View.setText("View Form");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        getContentPane().add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 120, 50));

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 110, 50));

        jTable1.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Birth Date", "Movie", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setRequestFocusEnabled(false);
        jTable1.setSelectionBackground(new java.awt.Color(255, 0, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        Hide.setViewportView(jTable1);

        getContentPane().add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 780, 430));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Actor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 130, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/bgcpng.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       private void Seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Design/film.png")));
    }
    private void clearField(){
            
            //clear text field for new entry
            name.requestFocus();
            name.setText("");
            birth.setText("");
            movie.setText("");
            role.setText("");
            
        }
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       // Back to Main menu
        new Main().setVisible(true);
        dispose();
  
    }//GEN-LAST:event_ExitActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
          // Add Movie Function
           DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
          
            if(name.getText().equals("")||birth.getText().equals("")||movie.getText().equals("")||role.getText().equals("")){  
           //if any of the following field leave blank then show message
            JOptionPane.showMessageDialog(this,"Please Fill up all Data!" );
            
          }else
            {
            //store entered data into string array --data--
            String data[]={name.getText(),birth.getText(),movie.getText(),role.getText()};

           
            
            // add string array data
            tblModel.addRow(data);//row added
            
            //successfully added message
            JOptionPane.showMessageDialog(this,"Data added Succesfully! " );
            
            //reset field
            clearField();
            }
    }//GEN-LAST:event_AddActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        if(View.isSelected()){
            View.setText("Hide Form");
            form.show(true);
        }
        else{
            form.show(false);
            View.setText("View Form");
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
           DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

        //delete row
        if(jTable1.getSelectedRowCount()==1){
            //if single row is selected then delete
            tblModel.removeRow(jTable1.getSelectedRow());
            // delete message
            JOptionPane.showMessageDialog(this,"Deleted succesfully!" );
            clearField();
            }
        else{
            if(jTable1.getRowCount()==0){
                //if table is empty(no data) then display message
                JOptionPane.showMessageDialog(this,"Table is Empty!" );
            }else{
                // if table is not empty but row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this,"Please Select Row to Delete!" );
            }
            
            
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount() ==1){
            
            String N = name.getText();
            String B = birth.getText();
            String M = movie.getText();
            String R = role.getText();
            
            
            tblModel.setValueAt(N, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt(B, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt(M, jTable1.getSelectedRow(), 2);
            tblModel.setValueAt(R, jTable1.getSelectedRow(), 3);
            
            
            // update message display
            JOptionPane.showMessageDialog(this,"Successfuly Updated!" );
            
            //reset for new entry
            clearField();
            
             }else{
            if(jTable1.getRowCount()==0){
                //if table is empty
                JOptionPane.showMessageDialog(this,"Table is Empty!");
            }else{
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this,"Please select Single row to update!");
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

        // set data to text field when row is selected
        String tblname = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String tblbirth = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tblmovie = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tblrole = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        
        
        //set to textfield
        name.setText(tblname);
        birth.setText(tblbirth);
        movie.setText(tblmovie);
        role.setText(tblrole);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JScrollPane Hide;
    private javax.swing.JButton Update;
    private javax.swing.JToggleButton View;
    private javax.swing.JTextField birth;
    private javax.swing.JFrame form;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    javax.swing.JTable jTable1;
    private javax.swing.JTextField movie;
    private javax.swing.JTextField name;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField role;
    // End of variables declaration//GEN-END:variables
}
