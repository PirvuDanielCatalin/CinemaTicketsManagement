package Cinema;

import Infos.HallInfo_CU;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;


public class Halls extends javax.swing.JFrame {

    Connection con;
    String User;
    int CM;
    int nmbr;
    
    public void DatabaseConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinemamanagement", //database name
                    "root", //user
                    "");                                            //password 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Halls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Halls(String user,int _CM) {
        DatabaseConnect();
        initComponents();
        
        User=new String(user);
        CM=_CM;
        nmbr=60; // Se suprascrie cu un nr de scaune introdus de manager 
        
        String Logged="Hello "+user;
        if(CM==1)
        {
            Logged=Logged+" ( M )";
            
        }  
        else
        {
             Logged=Logged+" ( C )";
             RightPanelLayout.setVisible(false);
             AddHallBtn.setVisible(false);
        }
           
        UserLogged.setText(Logged);
        
        HallLayout.setLayout(new GridLayout(6,5));
        
        for(int i=1;i<=30;i++)
        {
            JButton J=new JButton("S "+i);
            J.addActionListener((ActionEvent e) -> 
            {
                Hall H=new Hall(user,_CM, ((JButton)e.getSource()).getText(),nmbr);
                H.setVisible(true);
                H.setResizable(false);
            });
            /*Salile vizibile sunt cele existente in baza de date*/
            //J.setVisible(false); //
            HallLayout.add(J);
        }
        
        /* Verificarea in baza de date a ce sali sunt deja adaugate*/
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        AddHallBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        UserLogged = new javax.swing.JLabel();
        HallLayout = new javax.swing.JPanel();
        RightPanelLayout = new javax.swing.JPanel();
        RaportsTitle = new javax.swing.JLabel();
        RaportLayout = new javax.swing.JPanel();
        Report1 = new javax.swing.JPanel();
        Date1lb = new javax.swing.JLabel();
        Date2lb = new javax.swing.JLabel();
        Date1Txt = new javax.swing.JTextField();
        Date2Txt = new javax.swing.JTextField();
        Rap1GoBtn = new javax.swing.JButton();
        Report2 = new javax.swing.JPanel();
        HallTxt = new javax.swing.JTextField();
        Hallb = new javax.swing.JLabel();
        Rap2GoBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getPreferredSize());

        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        AddHallBtn.setText("Add");
        AddHallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddHallBtnActionPerformed(evt);
            }
        });

        LogOutBtn.setText("LogOut");

        UserLogged.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UserLogged.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddHallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(619, 619, 619)
                .addComponent(UserLogged, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddHallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogOutBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddHallBtn, LogOutBtn, UserLogged});

        HallLayout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout HallLayoutLayout = new javax.swing.GroupLayout(HallLayout);
        HallLayout.setLayout(HallLayoutLayout);
        HallLayoutLayout.setHorizontalGroup(
            HallLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HallLayoutLayout.setVerticalGroup(
            HallLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        RightPanelLayout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RaportsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RaportsTitle.setText("Raports");
        RaportsTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RaportLayout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Report1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Date1lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date1lb.setText("Date1");
        Date1lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Date2lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date2lb.setText("Date2");
        Date2lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Date1Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Rap1GoBtn.setText("Go");

        javax.swing.GroupLayout Report1Layout = new javax.swing.GroupLayout(Report1);
        Report1.setLayout(Report1Layout);
        Report1Layout.setHorizontalGroup(
            Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Report1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Report1Layout.createSequentialGroup()
                        .addComponent(Date2lb, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Date2Txt))
                    .addGroup(Report1Layout.createSequentialGroup()
                        .addComponent(Date1lb, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Date1Txt)))
                .addGap(25, 25, 25))
            .addGroup(Report1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Rap1GoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Report1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Date1lb, Date2lb});

        Report1Layout.setVerticalGroup(
            Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Report1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Date1Txt)
                    .addComponent(Date1lb, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Report1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Date2lb, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(Date2Txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rap1GoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        Report1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Date1lb, Date2lb});

        Report2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        HallTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Hallb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hallb.setText("Hall");
        Hallb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Rap2GoBtn1.setText("Go");

        javax.swing.GroupLayout Report2Layout = new javax.swing.GroupLayout(Report2);
        Report2.setLayout(Report2Layout);
        Report2Layout.setHorizontalGroup(
            Report2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Report2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Hallb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HallTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Report2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rap2GoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        Report2Layout.setVerticalGroup(
            Report2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Report2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Report2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hallb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HallTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(Rap2GoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RaportLayoutLayout = new javax.swing.GroupLayout(RaportLayout);
        RaportLayout.setLayout(RaportLayoutLayout);
        RaportLayoutLayout.setHorizontalGroup(
            RaportLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Report1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Report2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RaportLayoutLayout.setVerticalGroup(
            RaportLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RaportLayoutLayout.createSequentialGroup()
                .addComponent(Report1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Report2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout RightPanelLayoutLayout = new javax.swing.GroupLayout(RightPanelLayout);
        RightPanelLayout.setLayout(RightPanelLayoutLayout);
        RightPanelLayoutLayout.setHorizontalGroup(
            RightPanelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RaportsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RaportLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RightPanelLayoutLayout.setVerticalGroup(
            RightPanelLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayoutLayout.createSequentialGroup()
                .addComponent(RaportsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RaportLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HallLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RightPanelLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightPanelLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HallLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddHallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddHallBtnActionPerformed
        HallInfo_CU HICU =new HallInfo_CU(User);
        HICU.setVisible(true);
        HICU.setResizable(false);
        
    }//GEN-LAST:event_AddHallBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Halls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Halls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Halls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Halls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       // HallsLayout.setLayout(new GridLayout(6, 5));
        
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new Halls().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddHallBtn;
    private javax.swing.JTextField Date1Txt;
    private javax.swing.JLabel Date1lb;
    private javax.swing.JTextField Date2Txt;
    private javax.swing.JLabel Date2lb;
    private javax.swing.JPanel HallLayout;
    private javax.swing.JTextField HallTxt;
    private javax.swing.JLabel Hallb;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Rap1GoBtn;
    private javax.swing.JButton Rap2GoBtn1;
    private javax.swing.JPanel RaportLayout;
    private javax.swing.JLabel RaportsTitle;
    private javax.swing.JPanel Report1;
    private javax.swing.JPanel Report2;
    private javax.swing.JPanel RightPanelLayout;
    private javax.swing.JLabel UserLogged;
    // End of variables declaration//GEN-END:variables

}
