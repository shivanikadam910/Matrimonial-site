
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivani Kadam
 */
public class viewProfile extends javax.swing.JFrame {

    /**
     * Creates new form viewProfile
     */
    public static int searchid;
    public static int j;
    public viewProfile() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        if(quality.Matchid!=0){
            jTextField1.setText(quality.match_name);
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("High Tower Text", 0, 36)); // NOI18N
        jLabel2.setText("View Profile");
        jLabel2.setOpaque(true);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\i\\Downloads\\forever.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 13, 1406, 290);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(700, 350, 486, 62);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 350, 103, 62);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 490, 62, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Age");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 580, 40, 29);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Height");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 670, 68, 29);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Weight");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(470, 760, 74, 29);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Cast");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(470, 850, 46, 29);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Lifestyle");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(990, 490, 87, 29);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Education");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(990, 570, 102, 29);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("MotherTongue");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(990, 660, 154, 29);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("job");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(990, 760, 33, 29);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Salary");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(990, 850, 65, 29);
        getContentPane().add(name);
        name.setBounds(700, 490, 154, 36);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13);
        jTextField13.setBounds(700, 570, 154, 34);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(700, 670, 154, 38);
        getContentPane().add(jTextField15);
        jTextField15.setBounds(700, 760, 154, 36);

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16);
        jTextField16.setBounds(700, 850, 154, 37);
        getContentPane().add(jTextField17);
        jTextField17.setBounds(1270, 490, 162, 38);
        getContentPane().add(jTextField18);
        jTextField18.setBounds(1270, 570, 162, 37);
        getContentPane().add(jTextField19);
        jTextField19.setBounds(1270, 660, 162, 38);
        getContentPane().add(jTextField20);
        jTextField20.setBounds(1270, 760, 162, 37);
        getContentPane().add(jTextField21);
        jTextField21.setBounds(1270, 850, 162, 35);

        jButton2.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jButton2.setText("Send Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(760, 900, 198, 62);

        jButton3.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1020, 900, 195, 62);

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1470, 10, 235, 288);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\freestocks-org-82348-unsplash.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 3510, 1210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String in=jTextField1.getText();
         Connection con;
        Statement st = null;
        //Statement str = null;

        ResultSet rs;
        DefaultTableModel model;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectx", "root", "");
            st=con.createStatement();

            //"INSERT INTO `customer_details`() VALUES ('"+ persnl_detail.first +"','"+ persnl_detail.last +"',"+ persnl_detail.fmember +",'"+ persnl_detail.num +"',"+ persnl_detail.heig +","+ persnl_detail.weig +",'"+ education.educ +"','"+ education.uni +"','"+ education.yea +"',"+ education.ag +",'"+ education.jo +"','"+ education.salar +"','"+ religious.cas +"','"+ religious.subcas +"','"+ religious.mtongu +"','"+ religious.lifestyl +"','"+ religious.bgrou +"','"+ religious.explai +"','"+ religious.habit +"','"+ religious.marita +"',"+ demo3.count+")";
            int i = 0;
//              int i = str.executeUpdate(sti);
//            if (i == 1) {
//                System.out.println("updated successfully");
//            } else {
//                System.out.println("not upadted");
//            }

           // System.out.println(st2);

           String str1="SELECT * FROM `customer_details`, `customer` WHERE customer_details.first_name='"+in+"' && customer.CustomerName='"+in+"' ";
           rs=st.executeQuery(str1);
           while(rs.next()){
               name.setText(rs.getString(1));
               jTextField13.setText(rs.getString(11));
               jTextField14.setText(rs.getString(6));
               jTextField15.setText(rs.getString(7));
               jTextField16.setText(rs.getString(14));
               jTextField17.setText(rs.getString(17));
               jTextField18.setText(rs.getString(8));
               jTextField19.setText(rs.getString(16));
               jTextField20.setText(rs.getString(12));
               jTextField21.setText(rs.getString(13));
                ImageIcon imageicon=new ImageIcon("D:\\oop_assignments\\project\\image\\user"+rs.getString(24)+".jpeg");
            Image img=imageicon.getImage();
            Image newimg=img.getScaledInstance(250, 350,Image.SCALE_SMOOTH);
            ImageIcon imgicon=new ImageIcon(newimg);
            
               jLabel3.setIcon(imgicon);
               quality.Matchid=0;
           }
                   } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.getText();
         Connection con;
        Statement st = null,st1=null;
        //Statement str = null;
 String in=jTextField1.getText();
        ResultSet rs;
        
       // DefaultTableModel model;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectx", "root", "");
//            st=con.createStatement();
            st1=con.createStatement();
            
            String jk;
            String str2=Homepage.username;
            String str="SELECT * FROM `customer_details` WHERE first_name='"+str2+"'";
            PreparedStatement ps0=con.prepareStatement(str);
        rs=ps0.executeQuery(str);
           while(rs.next()){
              j= rs.getInt(23);
                System.out.println(j);
                System.out.println(str2);
                
           }
            String str1="INSERT INTO `request`(`send_name`, `send_req`,  `detail_id`) VALUES (?,?,?)";
             PreparedStatement pst = con.prepareStatement(str1);
//          rs1=st1.executeQuery(str1);
         pst.setString(1, in);
         pst.setInt(2, 1);
         pst.setInt(3,j );
         pst.executeUpdate();
        String str3="SELECT * FROM `customer_details` WHERE first_name='"+in+"'";
        
       PreparedStatement pst1=con.prepareStatement(str3);
       ResultSet rs1=pst1.executeQuery();
        
        int k=0;
        
        while(rs1.next()){
            k=rs1.getInt(23);
            System.out.println(k);
        }
        
            String str4= "INSERT INTO `request`( `rece_name`, `rece_req`, `detail_id`) VALUES (?,?,?)";
            PreparedStatement pst2=con.prepareStatement(str4);
            pst2.setString(1, str2);
            pst2.setInt(2, 1);
            pst2.setInt(3, k);
            pst2.executeUpdate();
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        ImageIcon imageicon=new ImageIcon("D:\\oop_assignments\\project\\image\\user"+in.searchid+".jpeg");
//            Image img=imageicon.getImage();
//            Image newimg=img.getScaledInstance(imageicon.getIconWidth(), imageicon.getIconHeight(),Image.SCALE_SMOOTH);
//            ImageIcon imgicon=new ImageIcon(newimg);
//            jLabel3.setIcon(imgicon);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       home2 vr=new home2();
        vr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
