
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\i\\Downloads\\forever.png")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\home.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\srchblk.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\filter.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(634, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 10, 1880, 306);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(760, 430, 876, 80);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "contact number", "Address", "city", "postal code", "country"
            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(600, 690, 929, 183);

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\srchblk.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(500, 430, 80, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\oop_assignments\\project\\freestocks-org-82348-unsplash.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 330, 2240, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        home2 j1=new home2();
        j1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
       
//        Connection con;
//        Statement st = null;
//        //Statement str = null;
//
//        ResultSet rs;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
//            st=con.createStatement();
//
//            //"INSERT INTO `customer_details`() VALUES ('"+ persnl_detail.first +"','"+ persnl_detail.last +"',"+ persnl_detail.fmember +",'"+ persnl_detail.num +"',"+ persnl_detail.heig +","+ persnl_detail.weig +",'"+ education.educ +"','"+ education.uni +"','"+ education.yea +"',"+ education.ag +",'"+ education.jo +"','"+ education.salar +"','"+ religious.cas +"','"+ religious.subcas +"','"+ religious.mtongu +"','"+ religious.lifestyl +"','"+ religious.bgrou +"','"+ religious.explai +"','"+ religious.habit +"','"+ religious.marita +"',"+ demo3.count+")";
//            int i = 0;
////              int i = str.executeUpdate(sti);
////            if (i == 1) {
////                System.out.println("updated successfully");
////            } else {
////                System.out.println("not upadted");
////            }
//String st2=jTextField1.getText();
//           // System.out.println(st2);
//String str1="SELECT * FROM `customer_details`,`customer` WHERE customer.CustomerName= '" + st2 + "' && customer_details.first_name= '" + st2 + "'";
////            PreparedStatement pst = con.prepareStatement(str1);
////                           
//           int j;
//                   rs=st.executeQuery(str1);
////           if(j==1){
////               System.out.println("found successfully");
////           }
////           
//           while(rs.next()){
//            System.out.println(rs.getString(1));
//           }
//        System.out.println(question1.registerid);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
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
String st2=jTextField1.getText();
           // System.out.println(st2);
String str1="SELECT  `CustomerName`, `ContactNo`, `Address`, `City`, `PostalCode`, `Country` FROM `customer`,`customer_details` WHERE customer_details.first_name='"+st2+"' && customer.CustomerName='"+st2+"' ";
//            PreparedStatement pst = con.prepareStatement(str1);
Object data[][]=new Object[3][6];
        rs=st.executeQuery(str1);
        int k=0;
        while(rs.next()){
       data[i][0]=rs.getString(1);
       data[i][1]=rs.getString(2);
       data[i][2]=rs.getString(3);
       data[i][3]=rs.getString(4);
       data[i][4]=rs.getString(5);
       data[i][5]=rs.getString(6);

           }   
        model=new DefaultTableModel();
        String [] columnnames={"Name","contact number","Address","city","postal code","country"};
        model.setDataVector(data, columnnames);
        jTable1.setRowHeight(27);
        
        jTable1.setModel(model);
           //int j;
                  
//           if(j==1){
//               System.out.println("found successfully");
//           }
//           
           
        System.out.println(question1.registerid);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
        filter j1=new filter();
        j1.setVisible(true);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
