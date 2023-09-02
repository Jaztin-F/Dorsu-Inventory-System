

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
public class Movie extends javax.swing.JFrame {
   
    
    public Movie() {
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
        jLabel6 = new javax.swing.JLabel();
        genre = new javax.swing.JComboBox<>();
        pc = new javax.swing.JTextField();
        lin = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
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
        form.setMinimumSize(new java.awt.Dimension(580, 470));
        form.setResizable(false);
        form.setSize(new java.awt.Dimension(570, 441));
        form.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 0, 0,80
        ));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(520, 440));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year Released");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 180, 30));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Length in Minutes");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, 30));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Production Company");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 190, 30));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genre");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 100, -1));

        genre.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Drama", "Horror" }));
        panel.add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 270, 30));

        pc.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 266, 32));

        lin.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(lin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 266, 32));

        year.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 266, 32));

        title.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 266, 32));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Director");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, -1));

        director.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        panel.add(director, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 266, 32));

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        panel.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 50));

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        panel.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 110, 50));

        form.getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/bg.jpg"))); // NOI18N
        form.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, 0, 590, 440));

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
                "Title ", "Year", "Length in Minutes", "Production Company", "Director", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
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

        getContentPane().add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 940, 430));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Movie");
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
            title.requestFocus();
            title.setText("");
            year.setText("");
            lin.setText("");
            pc.setText("");
            director.setText("");
            genre.setSelectedIndex(0);
        }
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       // Back to Main menu
        new Main().setVisible(true);
        dispose();
  
    }//GEN-LAST:event_ExitActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
          // Add Movie Function
           DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
          
            if(title.getText().equals("")||year.getText().equals("")||lin.getText().equals("")||pc.getText().equals("")
            ||director.getText().equals("")){  
           //if any of the following field leave blank then show message
            JOptionPane.showMessageDialog(this,"Please Fill up all Data!" );
            
          }else
            {
            //store entered data into string array --data--
            String data[]={title.getText(),year.getText(),lin.getText(),pc.getText(),director.getText(),genre.getSelectedItem().toString()};

           
            
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
            
            String Ttl = title.getText();
            String Yr = year.getText();
            String Lin = lin.getText();
            String  PC = pc.getText();
            String Drt = director.getText();
            String Gnr = genre.getSelectedItem().toString();
            
            tblModel.setValueAt(Ttl, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt(Yr, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt(Lin, jTable1.getSelectedRow(), 2);
            tblModel.setValueAt(PC, jTable1.getSelectedRow(), 3);
            tblModel.setValueAt(Drt, jTable1.getSelectedRow(), 4);
            tblModel.setValueAt(Gnr, jTable1.getSelectedRow(), 5);
            
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
        String tbltitle = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String tblyear = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tbllin = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tblpc = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String tbldirector = tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        String tblgenre = tblModel.getValueAt(jTable1.getSelectedRow(),5).toString();
        
        //set to textfield
        title.setText(tbltitle);
        year.setText(tblyear);
        lin.setText(tbllin);
        pc.setText(tblpc);
        director.setText(tbldirector);
        genre.setSelectedItem(tblgenre);
        
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
    private javax.swing.JTextField director;
    private javax.swing.JFrame form;
    private javax.swing.JComboBox<String> genre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    javax.swing.JTable jTable1;
    private javax.swing.JTextField lin;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField title;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
