/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.Properties;
import java.util.logging.Level;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import Connection.Conn;
import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author apit
 */
public class ForgotPassword extends javax.swing.JFrame {
Conn con;
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        this.con = new Conn();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Lupa Password?");
                    String path = "src/Assets";
      File tempatTujuan = new File(path + "/" + "Logo_Jadi.png" );
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      this.setIconImage(icon.getImage());
    }
    
    public void sendMail(String recepient, String pass, String username) throws Exception{
         Properties prop = new Properties();
      
      prop.put("mail.smtp.auth", "true");
      prop.put("mail.smtp.starttls.enable", "true");
      prop.put("mail.smtp.host", "smtp.gmail.com");
      prop.put("mail.smtp.port", "587");
      
      String email = "mimintcat@gmail.com";
      String password = "miminTcat123";
      
      Session session = Session.getInstance(prop, new Authenticator(){
          @Override
          protected PasswordAuthentication getPasswordAuthentication(){
              return new PasswordAuthentication(email, password);
          }
      });
      try {       
            MimeMessage msg = new MimeMessage(session);   
            msg.setFrom(new InternetAddress(email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            msg.setSubject("FORGOT PASSWORD");
          String mail_body = "<html><head></head><body><h1>Dear "+ username +"</h1> <hr>"+"Terima kasih karena telah menggunakan layanan kami,<br> Kami berharap anda puas dengan layanan yang kami berikan sampai saat ini.<br>Berikut kami beritahukan juga password dari akun yang anda miliki, yaitu :<h1>" +pass+"</h1><br>"
                  + "Tetap Memakai Masker, menjaga jarak serta mencuci tangan agar terhindar dari penyakit😷<br><br>"
                  + "Salam Hangat, <br><br>Mimin T-Cat"
                  + "</body></html>";
          String encodingOptions = "text/html; charset=UTF-8";

msg.setContent("Hello", "text/plain");
msg.setSubject("Halo, Sobat T-CAT");
msg.setText(mail_body);
msg.setHeader("Content-Type", encodingOptions);
msg.setSentDate(new Date());
            Transport.send(msg);
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
      JOptionPane.showMessageDialog(null, "Silahkan cek Email anda", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(null);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 400, 60));

        jLabel2.setBackground(new java.awt.Color(231, 223, 222));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Submit_JadiPanjang.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 300, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/EmailAdres_Jadi.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
              String eml = email.getText();
        String query = "SELECT * FROM `user` where email = '"+eml+"'";
        
    try {
        con.setRs(con.getStm().executeQuery(query));
        if(email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukan Email terlebih dahulu!!!");
        }else{
            if(con.getRs().next()){
                sendMail(con.getRs().getString("email"), con.getRs().getString("password"), con.getRs().getString("username"));
            }else{
                JOptionPane.showMessageDialog(null, "Email yang anda masukkan tidak ada, silahkan cek kembali");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
