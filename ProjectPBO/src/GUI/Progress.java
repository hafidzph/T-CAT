/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Connection.Conn;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import MainClasses.User;
/**
 *
 * @author Rafly
 */
public class Progress extends javax.swing.JFrame {
    progThread threadprog; 
    Dashboard dash; 
    User user;
    /**
     * Creates new form Progress
     */
    public Progress() {
         Conn.koneksi();
       initComponents();
        this.setTitle("Loading...Please Wait");
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        threadprog = new progThread(progressBar, this);
        threadprog.start();
        this.setLocationRelativeTo(null);
        progressBar.setForeground(Color.white);
   
    }
        //Jalan ketika yang masuk adalah User
        public Progress(User user) {
         Conn.koneksi();
       initComponents();
        this.setTitle("Loading...Please Wait");
        //Atur Value awalnya
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        threadprog = new progThread(progressBar, this, user);
        //Jalankan Thread 
        threadprog.start();
        
        this.setLocationRelativeTo(null);
        //Ubah Warna Teks
        progressBar.setForeground(Color.white);
         
   
    }

    class progThread extends Thread  { 
      JProgressBar progBar ;    
       Progress prog;
       User user;
       //Constructor akan jalan ketika admin yang masuk
      progThread(JProgressBar pbar, Progress prog) { 
         this.progBar = pbar;   
         this.prog = prog;
        
      }
    //Constructor akan jalan ketika User yang masuk
        public progThread(JProgressBar pbar, Progress prog, User user) {
         this.progBar = pbar;   
         this.prog = prog;
         this.user =user;
    
        }
        //Jalankan method run
      public void run() { 
          int min = 0; 
          int max = 100; 
          
           progressBar.setMinimum(min);
           progressBar.setMaximum(max);
           progressBar.setValue(0);
          //Atur Loading nya agar menambah hingga 100%
           for(int i = 0; i <=max; ) { 
            progressBar.setValue(i);
            
              try {
                  sleep(200);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Progress.class.getName()).log(Level.SEVERE, null, ex);
              }
              //Naikan nilai secara Random agar lebih realistis
             i+= (int)Math.floor(Math.random() * (5 - 1 + 1) + 1);
           }
           progressBar.setValue(100);
        //Check apakah Yang masuk user? atau admin
          if(this.user == null) { 
            Dashboard dash = new Dashboard(); 
             dash.setVisible(true);
          }else { 
               Dashboard dash = new Dashboard(this.user); 
                dash.setVisible(true);
              }
      //Tampilkan Dashboard
       this.prog.setVisible(false);
        this.prog.dispose();
        
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
        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 223, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 395, 34));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(226, 179, 116));
        jLabel1.setText("Mohon Tunggu Sebentar....");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loading_1.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 210, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Progress().setVisible(true);
            }
        });
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
