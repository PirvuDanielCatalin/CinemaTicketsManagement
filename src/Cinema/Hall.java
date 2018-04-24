/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.awt.Color;
import java.awt.GridLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Johannes
 */
public class Hall extends javax.swing.JFrame {

    Connection con;
    String User;
    int CM;
    int maxnr;
    
    public void DatabaseConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinemamanagement", //database name
                    "root", //user
                    "");                                            //password 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hall.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Hall(String user,int _CM,String Name,int nmbr) 
    {
        DatabaseConnect();
        initComponents();
        User=new String(user);
        CM=_CM;
        
        
        maxnr=nmbr;
        
        String Logged="Hello "+user;
        if(CM==1)
        {
            Logged=Logged+" ( M )";
            
        }  
        else
        {
             Logged=Logged+" ( C )";
             EditHallInfo.setVisible(false);
        }
           
        UserLogged.setText(Logged);
        HallAccesed.setText(Name);
        ChairsPanel.setLayout(new GridLayout(5,12));
        for(int i=1;i<=maxnr;i++)
        {
            JButton J=new JButton(""+i);
            //J.setBackground(Color.GREEN);
            /*
            * Culoare in functie de cum sunt in baza de date
            * Green=Loc liber=Nu se afla in baza de date
            * Red=Loc ocupat=Exista in baza de date
            */
            
            J.setVisible(true);
            ChairsPanel.add(J);
        }
        
        
                
        /*
        HallLayout.setLayout(new GridLayout(6,5));
        for(int i=1;i<=30;i++)
        {
            JButton J=new JButton("S "+i);
            J.addActionListener((ActionEvent e) -> 
            {
                Hall H=new Hall(user,_CM, ( (JButton)e.getSource() ).getText() );
                H.setVisible(true);
                H.setResizable(false);
            });
            J.setVisible(false);
            HallLayout.add(J);
        }
        */
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        LogOutBtn = new javax.swing.JButton();
        UserLogged = new javax.swing.JLabel();
        HallAccesed = new javax.swing.JLabel();
        EditHallInfo = new javax.swing.JButton();
        ChairsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(getPreferredSize());

        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        LogOutBtn.setText("LogOut");

        UserLogged.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UserLogged.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        HallAccesed.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        HallAccesed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        EditHallInfo.setText("Edit");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(HallAccesed, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditHallInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379)
                .addComponent(UserLogged, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditHallInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(HallAccesed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserLogged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ChairsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ChairsPanelLayout = new javax.swing.GroupLayout(ChairsPanel);
        ChairsPanel.setLayout(ChairsPanelLayout);
        ChairsPanelLayout.setHorizontalGroup(
            ChairsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ChairsPanelLayout.setVerticalGroup(
            ChairsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ChairsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChairsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new Hall().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChairsPanel;
    private javax.swing.JButton EditHallInfo;
    private javax.swing.JLabel HallAccesed;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel UserLogged;
    // End of variables declaration//GEN-END:variables
}
