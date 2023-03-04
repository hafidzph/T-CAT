/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Connection.Conn;
import MainClasses.User;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import MainClasses.Movies;
import MainClasses.Ticket;
import MainClasses.Drink;
import MainClasses.Food;
import MainClasses.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Rafly
 */
public class Dashboard extends javax.swing.JFrame {

 private String name;
 private String email; 
 private String password;
 private String gender;
 private User user;
 private Movies movie;
 private Ticket ticket;
 private Drink drink;
 private Conn con;
 private Food food;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
         
        initComponents();
        this.setup(); 
        this.image();

    }
  public Dashboard(User user) { 
         
        initComponents();
        this.user = user;
        this.label.setText(user.getName());
        this.labelEmail.setText(user.getEmail());
         this.setImage(user.getGender());
         this.setup();
         this.image();
  }
  void image(){ 
             String path = "src/Assets";
      File tempatTujuan = new File(path + "/" + "Logo_Jadi.png" );
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      this.setIconImage(icon.getImage());
  }
  
  
  public Dashboard(Movies movie) { 
          initComponents();
             this.label.setText("Admin");
         this.labelEmail.setText("mimintcat@gmail.com");
        this.hideComponent();
        this.setImage();
        this.setup(); 
        this.movie = movie;
        this.setup();
     this.image();
  }
//  public Dashboard(User user, Ticket ticket) { 
//              initComponents();
//        this.user = user;
//        this.ticket = ticket;
//        this.label.setText(user.getName());
//        this.labelEmail.setText(user.getEmail());
//         this.setImage(user.getGender());
//         this.setup();
//        this.image();
//  }
//  
  public Dashboard(User user, Ticket ticket, Food food, Drink drink) {
        initComponents();
        this.user = user;
        this.label.setText(user.getName());
        this.ticket = ticket;
        this.food = food; 
        this.drink = drink;
        this.labelEmail.setText(user.getEmail());
        this.setImage(user.getGender());
        this.setup();
       this.image();
 
      
  }
  
  private void setup() { 
       this.con = new Conn();
      if(this.user == null) { 
        this.label.setText("Admin");
        this.labelEmail.setText("admin@t-cat.co.id");
        this.hideComponent();
        this.setImage();
      }else { 
             
      if(upAdmin instanceof Component) { 
          Component comp = (Component) upAdmin;
          comp.setVisible(false); 
      }
      
      if(deleteMovies instanceof Component) { 
        Component comp2 = (Component) deleteMovies;
        comp2.setVisible(false);
      }
      
      }
      
       this.setLocationRelativeTo(null);
        this.setTitle("Main Page");
         this.setTicket(this.gambarMakanan, "food.png");
         this.setTicket(this.gambarMinuman, "drink.png");
        this.setTicket(this.gambarTicket, "ticketcinema.png");
      
  }

  
  void hideComponent() { 
      
//      Memainkan Operator Instance Of untuk terjadinya DownCasting 
      if(labelProfile instanceof Component) { 
          Component comp = (Component) labelProfile;
          Component comp2 = (Component)jLabel5;
          Component comp3 = (Component) gambarTicket;
          Component comp4 = (Component) gambarMakanan;
          Component comp5 = (Component) gambarMinuman;
          Component comp6 = (Component) oFood;
          Component comp7 = (Component) oDrink;
          Component comp8 = (Component) oTiket;
          Component comp9  = (Component) jLabel6;
           comp.setVisible(false);
          comp2.setVisible(false);
          comp3.setVisible(false);
          comp4.setVisible(false);
          comp5.setVisible(false);
          comp6.setVisible(false);
          comp7.setVisible(false);
          comp8.setVisible(false);
          comp9.setVisible(false);
          
          
          
      }
      
  }
  //Overloading dengan setImage(String gender) 
  void setImage() { 
      String path = "src/Assets";
      File tempatTujuan = new File(path +"/AdminMan.png");
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      Image img = icon.getImage().getScaledInstance(labelGambar.getWidth(), labelGambar.getHeight(), java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(img); 
      labelGambar.setIcon(icon);
      }
  
  void setTicket(JLabel label, String extension) { 
      
      String path = "src/Assets";
      File tempatTujuan = new File(path +"/" + extension);
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      Image img = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(img); 
      label.setIcon(icon);
      
  }
  //Overloading
  void setImage(String gender) { 
      
      if(gender.equals("laki-laki")) { 
            String path = "src/Assets";
      File tempatTujuan = new File(path +"/laki.png");
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      Image img = icon.getImage().getScaledInstance(labelGambar.getWidth(), labelGambar.getHeight(), java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(img); 
      labelGambar.setIcon(icon);
      }else { 
              String path = "src/Assets";
      File tempatTujuan = new File(path +"/Perempuan.png");
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      Image img = icon.getImage().getScaledInstance(labelGambar.getWidth(), labelGambar.getHeight(), java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(img); 
      labelGambar.setIcon(icon);
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

        dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        deleteMovies = new javax.swing.JLabel();
        labelProfile = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelProfile1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        oTiket = new javax.swing.JLabel();
        gambarTicket = new javax.swing.JLabel();
        oFood = new javax.swing.JLabel();
        gambarMakanan = new javax.swing.JLabel();
        oDrink = new javax.swing.JLabel();
        gambarMinuman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelGambar = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        upAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteMovies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteMovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/DeleteM.png"))); // NOI18N
        deleteMovies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMoviesMouseClicked(evt);
            }
        });
        jPanel1.add(deleteMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 270, 80));

        labelProfile.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelProfile.setForeground(new java.awt.Color(0, 0, 0));
        labelProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/ChangeProfile_Jadi.png"))); // NOI18N
        labelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelProfileMouseEntered(evt);
            }
        });
        jPanel1.add(labelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CheckOut_jadi.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 90, 30));

        labelProfile1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelProfile1.setForeground(new java.awt.Color(0, 0, 0));
        labelProfile1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProfile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LogOut_Jadi.png"))); // NOI18N
        labelProfile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelProfile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelProfile1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelProfile1MouseEntered(evt);
            }
        });
        jPanel1.add(labelProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 100, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/History_Jadi.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 90, -1));

        oTiket.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        oTiket.setText("ORDER TICKET");
        jPanel1.add(oTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 186, 37));

        gambarTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gambarTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambarTicketMouseClicked(evt);
            }
        });
        jPanel1.add(gambarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, 150));

        oFood.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        oFood.setText("ORDER FOOD");
        jPanel1.add(oFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 186, 37));

        gambarMakanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gambarMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambarMakananMouseClicked(evt);
            }
        });
        jPanel1.add(gambarMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 180, 140));

        oDrink.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        oDrink.setText("ORDER DRINK");
        jPanel1.add(oDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 186, 37));

        gambarMinuman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gambarMinuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gambarMinumanMouseClicked(evt);
            }
        });
        jPanel1.add(gambarMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 180, 140));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/AboutUs_Jadi.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 170, 50));
        jPanel1.add(labelGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 140));

        label.setFont(new java.awt.Font("Anonymous Pro", 1, 20)); // NOI18N
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 260, 30));

        labelEmail.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 260, 30));

        upAdmin.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        upAdmin.setForeground(new java.awt.Color(0, 0, 0));
        upAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/INSERTM.png"))); // NOI18N
        upAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upAdminMouseClicked(evt);
            }
        });
        jPanel1.add(upAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 280, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/UserD_Jadi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelProfileMouseClicked
        // TODO add your handling code here:
        ChangeData cData = new ChangeData(user.getName(), user.getEmail(), user.getPassword(), user.getGender()); 
        cData.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_labelProfileMouseClicked

    private void labelProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelProfileMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelProfileMouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         if(this.user != null) { 
          AboutUs about = new AboutUs(user); 
         about.setVisible(true);
         this.setVisible(false);
         this.dispose();   
         }else { 
           AboutUs about = new AboutUs(); 
         about.setVisible(true);
         this.setVisible(false);
         this.dispose();   
         }
         
    }//GEN-LAST:event_jLabel4MouseClicked

    private void upAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upAdminMouseClicked
        // TODO add your handling code here:
           InsertMovies movie = new InsertMovies();
           movie.setVisible(true);
           this.setVisible(false);
           this.dispose();
    }//GEN-LAST:event_upAdminMouseClicked

    private void gambarTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambarTicketMouseClicked
        // TODO add your handling code here:
         ShowMovies show = new ShowMovies(user, this.ticket, this.food, this.drink);
         show.setVisible(true);
         this.setVisible(false);
         this.dispose();
    }//GEN-LAST:event_gambarTicketMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
          if(this.ticket == null && this.drink == null && this.food  == null) { 
              JOptionPane.showMessageDialog(null, "Anda belum Memesan apapun", "Failed!",JOptionPane.ERROR_MESSAGE);
          }else { 
            CheckOut check = new CheckOut(this.user, this.ticket, this.food, this.drink);
            check.setVisible(true);   
            this.setVisible(false);
            this.dispose();
          }
          
    }//GEN-LAST:event_jLabel5MouseClicked

    private void labelProfile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelProfile1MouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_labelProfile1MouseClicked

    private void labelProfile1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelProfile1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelProfile1MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

              DefaultTableModel model  = new DefaultTableModel(new String[]{"No." ,"Nama Barang", "Jumlah Barang", "Harga Barang", "Discount"}, 0);
             
        JTable table = new JTable();

        System.out.println();
        String read = ("SELECT * FROM `history` where username_user = '" + this.user.getName() +"';");
        
     try {
         this.con.setRs(con.getStm().executeQuery(read));
         int x=1;
         while(this.con.getRs().next()) { 
             
             String namaB  = this.con.getRs().getString("nama_barang");
             String jBarang = this.con.getRs().getString("jumlah_barang");
             String hBarang = this.con.getRs().getString("harga");
             String disBarang = this.con.getRs().getString("discount");
             model.addRow(new Object[]{x, namaB, jBarang,hBarang, (int)(Double.parseDouble(disBarang)*100d) + "%"});
               table.setModel(model);
              TableColumnModel columnmodel = table.getColumnModel();
                columnmodel.getColumn(4).setPreferredWidth(60);
              columnmodel.getColumn(3).setPreferredWidth(100);
              columnmodel.getColumn(2).setPreferredWidth(100);
              columnmodel.getColumn(1).setPreferredWidth(230);
              columnmodel.getColumn(0).setPreferredWidth(50);
              
         
         x++;
         }
     } catch (SQLException ex) {
         Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
     }
        
   
                

        
        
        table.setEnabled(false);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
           table.setFillsViewportHeight(true);
        JPanel panel = new JPanel(); 
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);
        dialog.setContentPane(panel);
        dialog.pack();
        dialog.setTitle("History Pembelian");
        dialog.setVisible(true); 
        dialog.setSize(600,400);
        dialog.setLocationRelativeTo(null);
    
        
        
     
        
        
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void gambarMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambarMakananMouseClicked
        // TODO add your handling code here:
        FoodOrder food1 = new FoodOrder(user, this.ticket, this.food,this.drink);
        food1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_gambarMakananMouseClicked

    private void gambarMinumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gambarMinumanMouseClicked
        // TODO add your handling code here:
        DrinkOrder xx = new DrinkOrder(user, this.ticket, this.food, this.drink);
        xx.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_gambarMinumanMouseClicked

    private void deleteMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMoviesMouseClicked
        // TODO add your handling code here:
        DeleteMovies del = new DeleteMovies();
        del.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_deleteMoviesMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteMovies;
    private javax.swing.JDialog dialog;
    private javax.swing.JLabel gambarMakanan;
    private javax.swing.JLabel gambarMinuman;
    private javax.swing.JLabel gambarTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGambar;
    private javax.swing.JLabel labelProfile;
    private javax.swing.JLabel labelProfile1;
    private javax.swing.JLabel oDrink;
    private javax.swing.JLabel oFood;
    private javax.swing.JLabel oTiket;
    private javax.swing.JLabel upAdmin;
    // End of variables declaration//GEN-END:variables
}
