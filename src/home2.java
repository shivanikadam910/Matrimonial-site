
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author i
 */
public class home2 extends javax.swing.JFrame {

    /**
     * Creates new form home2
     */
    public static int detail_id;
    public static int validate;
    public home2() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Connection con;
        Statement st = null;

        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectx", "root", "");

            st = con.createStatement();
            File file = new File("D:\\oop_assignments\\project\\image\\user"+Homepage.uid+".jpeg");
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("created successfully");
            }
          else{
              System.out.println("not created ");
          }

           FileOutputStream fout = new FileOutputStream("D:\\oop_assignments\\project\\image\\user"+Homepage.uid+".jpeg");
            byte b[];
            Blob blob;
            
//            //JFrame f = new JFrame();
           rs = st.executeQuery("SELECT * FROM `customer_details`,`customer` WHERE customer.CustomerID='"+Homepage.uid+"' && customer_details.CustomerID='"+Homepage.uid+"'");
//            int flag = 0, i = 0;

//
            while (rs.next()) {
                home2.detail_id=rs.getInt(23);
                System.out.println(detail_id);
                blob = rs.getBlob("image");
                b = blob.getBytes(1, (int) blob.length());
                fout.write(b);
//                System.out.println("abcd");
//            }
System.out.println(question1.registerid);
            ImageIcon imageicon=new ImageIcon("D:\\oop_assignments\\project\\image\\user"+Homepage.uid+".jpeg");
            Image img=imageicon.getImage();
            Image newimg=img.getScaledInstance(250, 350,Image.SCALE_SMOOTH);
            ImageIcon imgicon=new ImageIcon(newimg);
            jLabel2.setIcon(imgicon);
            
            
//                System.out.println();

                //System.out.println(rs.getString(1));
                // System.out.println(rs.getString(2));
//                if (username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
//                    System.out.println("login successfull");
//                    flag = 1;
//                    
//                   Homepage.username=rs.getString(4);
//                    System.out.println(username);
//                     i=     JOptionPane.showOptionDialog(null, "LOGIN SUCCESSFULL", "LOGIN", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
//                
//               
//                } else {
//             //       System.out.println("failed");
//                   continue;
//
//                }
//            }
//             if(i==JOptionPane.OK_OPTION)
//                {
//                    this.setVisible(false);
//                    question1 bv=new question1();
//                    //pls o=new pls();
//                   // o.setVisible(true);
//                    //sleep(3000);
//                    //persnl_detail pd=new persnl_detail();
//                    //pd.setVisible(true);
//                    //bv.setVisible(true);
//                    pls ab=new pls();
//                    ab.setVisible(true);
//                }
//            if(flag!=1){
//                 JOptionPane.showMessageDialog(f, "LOGIN FAILED");
//            }
                // System.out.println("failed");
            

        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\i\\Downloads\\forever.png")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\filter.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\home.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\srchblk.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setOpaque(true);

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\logout.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\update-flat-icon-on-black-450w-477272503.jpg")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(22, 13, 1880, 332);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\viewprofileicon.jpeg")); // NOI18N
        jButton5.setText("View Profile");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(450, 400, 330, 170);

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\qulysrch.jpg")); // NOI18N
        jButton6.setText("Quality Search");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(830, 620, 368, 143);

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\justjoin.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(950, 800, 170, 170);

        jButton8.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\viewreq.jpeg")); // NOI18N
        jButton8.setText("view request");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1190, 400, 301, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\freestocks-org-82348-unsplash.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 330, 2950, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        filter j1=new filter();
        j1.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

//        Connection con;
//        Statement st = null;
//
//        ResultSet rs;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectx", "root", "");
//
//            st = con.createStatement();
//            File file = new File("D:\\oop_assignments\\project\\image\\user"+Homepage.uid+".jpeg");
//            boolean fvar = file.createNewFile();
//            if (fvar) {
//                System.out.println("created successfully");
//            }
//          else{
//              System.out.println("not created ");
//          }
//
//           FileOutputStream fout = new FileOutputStream("D:\\oop_assignments\\project\\image\\user"+Homepage.uid+".jpeg");
//            byte b[];
//            Blob blob;
//            
////            //JFrame f = new JFrame();
//           rs = st.executeQuery("SELECT * FROM `customer_details`,`customer` WHERE customer.CustomerID='"+Homepage.uid+"' && customer_details.CustomerID='"+Homepage.uid+"'");
////            int flag = 0, i = 0;
//
////
//            while (rs.next()) {
//                home2.detail_id=rs.getInt(23);
//                System.out.println(detail_id);
//                blob = rs.getBlob("image");
//                b = blob.getBytes(1, (int) blob.length());
//                fout.write(b);
////                System.out.println("abcd");
////            }
//System.out.println(question1.registerid);
//            ImageIcon imageicon=new ImageIcon("D:\\oop_assignments\\project\\image\\user"+Homepage.uid+".jpeg");
//            Image img=imageicon.getImage();
//            Image newimg=img.getScaledInstance(imageicon.getIconWidth(), imageicon.getIconHeight(),Image.SCALE_SMOOTH);
//            ImageIcon imgicon=new ImageIcon(newimg);
//            jLabel2.setIcon(imgicon);
//            
//            
////                System.out.println();
//
//                //System.out.println(rs.getString(1));
//                // System.out.println(rs.getString(2));
////                if (username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
////                    System.out.println("login successfull");
////                    flag = 1;
////                    
////                   Homepage.username=rs.getString(4);
////                    System.out.println(username);
////                     i=     JOptionPane.showOptionDialog(null, "LOGIN SUCCESSFULL", "LOGIN", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
////                
////               
////                } else {
////             //       System.out.println("failed");
////                   continue;
////
////                }
////            }
////             if(i==JOptionPane.OK_OPTION)
////                {
////                    this.setVisible(false);
////                    question1 bv=new question1();
////                    //pls o=new pls();
////                   // o.setVisible(true);
////                    //sleep(3000);
////                    //persnl_detail pd=new persnl_detail();
////                    //pd.setVisible(true);
////                    //bv.setVisible(true);
////                    pls ab=new pls();
////                    ab.setVisible(true);
////                }
////            if(flag!=1){
////                 JOptionPane.showMessageDialog(f, "LOGIN FAILED");
////            }
//                // System.out.println("failed");
//            

//        }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(home2.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        search j1=new search();
        j1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        quality j1=new quality();
        j1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        just j1=new just();
        j1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        viewReq vr=new viewReq();
        vr.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
       viewProfile j1=new viewProfile();
        j1.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Homepage bq=new Homepage();
        bq.setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        validate=1;
        this.setVisible(false);
        persnl_detail pd=new persnl_detail();
        pd.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(home2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
