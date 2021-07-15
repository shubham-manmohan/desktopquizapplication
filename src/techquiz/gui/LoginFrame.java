/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techquiz.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import techquiz.dao.UserDAO;
import techquiz.dbutil.DBConnection;
import techquiz.pojo.UserPOJO;
import techquiz.pojo.UserProfile;


/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class LoginFrame extends javax.swing.JFrame {

    private String userId;
    private String password;
    
    public LoginFrame() {
       this.setTitle("Login - "+"OnlineTechQuizApp");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelLogin = new javax.swing.JPanel();
        lblUserLoginScreen = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbStudent = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        panelLogin.setBackground(new java.awt.Color(0, 102, 102));
        panelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLoginMouseClicked(evt);
            }
        });

        lblUserLoginScreen.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblUserLoginScreen.setForeground(new java.awt.Color(204, 255, 102));
        lblUserLoginScreen.setText("User Login Screen");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 255));
        lblPassword.setText("Password");

        lblUserId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(153, 153, 255));
        lblUserId.setText("User ID");

        lblUserType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(153, 153, 255));
        lblUserType.setText("User Type");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/appimages/loginscreen.gif"))); // NOI18N

        jrbAdmin.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbAdmin);
        jrbAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbAdmin.setForeground(new java.awt.Color(102, 255, 153));
        jrbAdmin.setText("Admin");

        jrbStudent.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbStudent);
        jrbStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbStudent.setForeground(new java.awt.Color(102, 255, 153));
        jrbStudent.setText("Student");

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 102, 0));
        btnLogin.setText("Login");
        btnLogin.setAlignmentX(1.0F);
        btnLogin.setAlignmentY(2.0F);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setName(""); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(0, 102, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(102, 102, 0));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/appimages/animatedlogin.gif"))); // NOI18N

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblUserLoginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserId)
                                    .addComponent(lblPassword))
                                .addGap(66, 66, 66)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserId)
                                    .addComponent(txtPassword)))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addComponent(lblUserType)
                                .addGap(64, 64, 64)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLoginLayout.createSequentialGroup()
                                        .addComponent(btnLogin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnQuit)
                                        .addGap(23, 23, 23))
                                    .addGroup(panelLoginLayout.createSequentialGroup()
                                        .addComponent(jrbAdmin)
                                        .addGap(18, 28, Short.MAX_VALUE)
                                        .addComponent(jrbStudent)))))))
                .addGap(26, 26, 26))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserLoginScreen)
                .addGap(52, 52, 52)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserId)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbAdmin)
                                .addComponent(jrbStudent))
                            .addComponent(lblUserType))))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuit)
                            .addComponent(btnLogin))
                        .addContainerGap())
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
    int a=JOptionPane.showConfirmDialog(null, "Are you sure to QUIT!!!", "Exit!!!", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(a==JOptionPane.YES_OPTION)
    {
        DBConnection.closeConnection();
        JOptionPane.showMessageDialog(null, "Thank you for using App....");
        System.exit(0);
    }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     boolean isValidInput=validateInputs();
     if(isValidInput==false)
        {
            JOptionPane.showMessageDialog(null, "Username or Password cannot be left blank!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
          String userType=getUserType();
        if(userType==null)
         {
     JOptionPane.showMessageDialog(null, "Please Choose User Type","Error!",JOptionPane.ERROR_MESSAGE);
            return;
          }
      try
        {
         UserPOJO user = new UserPOJO();
         user.setUserId(userId);
         user.setPassword(password);
         user.setUserType(userType);
         boolean validUser=UserDAO.validateUser(user);
             if(validUser==true)
             {
            JOptionPane.showMessageDialog(null, "Login Accepted!","Welcome "+userId,JOptionPane.INFORMATION_MESSAGE);
            UserProfile.setUserName(userId);
            UserProfile.setUserType(userType);
                if(user.getUserType().equalsIgnoreCase("Admin")==true)
               {
                AdminOptionsFrame adminFrame=new AdminOptionsFrame();
                adminFrame.setVisible(true);
               }
               else
               {
               StudentOptionsFrame studentFrame=new StudentOptionsFrame();
               studentFrame.setVisible(true);
               }
                 this.dispose();
            }

            else
         JOptionPane.showMessageDialog(null, "Invalid UserId/Password or UserType","Login Denied!",JOptionPane.ERROR_MESSAGE);
          
        }
      catch(SQLException sq)
        {
       JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE); 
        sq.printStackTrace();
        }
     
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void panelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseClicked
      buttonGroup1.clearSelection();
    }//GEN-LAST:event_panelLoginMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbStudent;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserLoginScreen;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
       userId=txtUserId.getText();
        char[] pwd=txtPassword.getPassword();

       if(userId.isEmpty()|| pwd.length==0 )
            return false;
       else
       {
           password=String.valueOf(pwd);
           return true;
       }
    }

     private String getUserType() {
    if(jrbAdmin.isSelected())
            return jrbAdmin.getText().toLowerCase();
        else if(jrbStudent.isSelected())
            return jrbStudent.getText().toLowerCase();
        else
            return null;
    }
}
