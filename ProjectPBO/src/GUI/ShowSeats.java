/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Connection.Conn;
import MainClasses.Drink;
import MainClasses.Food;
import MainClasses.Ticket;
import MainClasses.User;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafly
 */
public class ShowSeats extends javax.swing.JFrame {
    ArrayList<String> isitBooked = new ArrayList<String>();
    boolean cancel = false;
    private User user; 
    private Food food;
    private Drink drink;
    /**
     * Creates new form ShowSeats
     */
    Ticket ticket;
    Conn con;
    public ShowSeats() {
        Conn.koneksi();
        this.con = new Conn();
        initComponents();
         this.setLocationRelativeTo(null);
        this.setup();
    }
    public ShowSeats(User user, Ticket ticket, Food food, Drink drink) { 
         Conn.koneksi();
        this.con = new Conn();
     this.user = user;
        initComponents();
         this.ticket = ticket;
         this.food = food; 
         this.drink = drink;
        this.setLocationRelativeTo(null);
        this.setTahun(this.ticket.getTahun());
        this.setTitle("Pilih Kursi");
        this.setup();
    }
    
    void setTahun(String tahun) { 
       
        String[] split = tahun.split("-");
        int tanggal = Integer.parseInt(split[0]);
       this.tanggal.addItem(tanggal +"-"+  split[1] +  "-" +split[2]);
       this.tanggal.addItem((tanggal+1) + "-" +split[1] + "-" +  split[2]);
       this.tanggal.addItem((tanggal+2) + "-" + split[1] +  "-" + split[2]);   
    }
    
    void initState() { 
        kursi1.setBackground(Color.white);
        kursi1.setOpaque(true);
          kursi2.setBackground(Color.white);
        kursi2.setOpaque(true);
          kursi3.setBackground(Color.white);
        kursi3.setOpaque(true);
          kursi4.setBackground(Color.white);
        kursi4.setOpaque(true);
          kursi5.setBackground(Color.white);
        kursi5.setOpaque(true);
          kursi6.setBackground(Color.white);
        kursi6.setOpaque(true);
          kursi7.setBackground(Color.white);
        kursi7.setOpaque(true);
          kursi8.setBackground(Color.white);
        kursi8.setOpaque(true);
          kursi9.setBackground(Color.white);
        kursi9.setOpaque(true);
          kursi10.setBackground(Color.white);
        kursi10.setOpaque(true);
          kursi11.setBackground(Color.white);
        kursi11.setOpaque(true);
          kursi12.setBackground(Color.white);
        kursi12.setOpaque(true);
        
        
        
        
        
    }
    
    void setup() { 
        
//        this.initState();
        String query = "Select * from `kursi` where kode_movie = '"+this.ticket.getKode()+"'";
        String getTanggal = this.tanggal.getSelectedItem().toString();
        String jam = this.jam.getSelectedItem().toString();
        this.ticket.setJam(jam);
        this.ticket.setTanggalPilih(getTanggal);
         boolean tanggalCon;
         boolean jamCon;
//        boolean jamCon = this.jam.getSelectedItem().toString().equals("jam")
        try {
            con.setRs(con.getStm().executeQuery(query));
        } catch (SQLException ex) {
            Logger.getLogger(ShowSeats.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(con.getRs().next()) {
                String id = con.getRs().getString("kode_kursi");
                String jamDb = con.getRs().getString("jam"); 
                String tanggalDb  = con.getRs().getString("tanggal");
                tanggalCon= this.tanggal.getSelectedItem().toString().equalsIgnoreCase(tanggalDb);
                jamCon = this.jam.getSelectedItem().toString().equals(jamDb);
              
             
                if(id.equals("A1") && jamCon && tanggalCon) { 
                    kursi1.setBackground(Color.red);
                    kursi1.setOpaque(true);
                    this.isitBooked.add("A1");
                }
                   if(id.equals("A2")&& jamCon && tanggalCon) { 
                    kursi2.setBackground(Color.red);
                    kursi2.setOpaque(true);
                     this.isitBooked.add("A2");
                }
                   if(id.equals("A3")&& jamCon && tanggalCon) { 
                    kursi3.setBackground(Color.red);
                    kursi3.setOpaque(true);
                     this.isitBooked.add("A3");
                }
                      if(id.equals("A4")&& jamCon && tanggalCon) { 
                    kursi4.setBackground(Color.red);
                    kursi4.setOpaque(true);
                     this.isitBooked.add("A4");
                }
                         if(id.equals("A5")&& jamCon && tanggalCon) { 
                    kursi5.setBackground(Color.red);
                    kursi5.setOpaque(true);
                     this.isitBooked.add("A5");
                }
                            if(id.equals("A6")&& jamCon && tanggalCon) { 
                    kursi6.setBackground(Color.red);
                    kursi6.setOpaque(true);
                     this.isitBooked.add("A6");
                }
               if(id.equals("A7")&& jamCon && tanggalCon) { 
                    kursi7.setBackground(Color.red);
                    kursi7.setOpaque(true);
                     this.isitBooked.add("A7");
                }
                 if(id.equals("A8")&& jamCon && tanggalCon) { 
                    kursi8.setBackground(Color.red);
                    kursi8.setOpaque(true);
                     this.isitBooked.add("A8");
                } 
                   if(id.equals("A9")&& jamCon && tanggalCon) { 
                    kursi9.setBackground(Color.red);
                    kursi9.setOpaque(true);
                     this.isitBooked.add("A9");
                }
                      if(id.equals("A10")&& jamCon && tanggalCon) { 
                    kursi10.setBackground(Color.red);
                    kursi10.setOpaque(true);
                     this.isitBooked.add("A10");
                }
                         if(id.equals("A11")&& jamCon && tanggalCon) { 
                    kursi11.setBackground(Color.red);
                    kursi11.setOpaque(true);
                     this.isitBooked.add("A11");
                }
                            if(id.equals("A12")&& jamCon && tanggalCon) { 
                    kursi12.setBackground(Color.red);
                    kursi12.setOpaque(true);
                     this.isitBooked.add("A12");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowSeats.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        kursi2 = new javax.swing.JLabel();
        kursi1 = new javax.swing.JLabel();
        kursi4 = new javax.swing.JLabel();
        kursi3 = new javax.swing.JLabel();
        kursi5 = new javax.swing.JLabel();
        kursi6 = new javax.swing.JLabel();
        kursi7 = new javax.swing.JLabel();
        kursi8 = new javax.swing.JLabel();
        kursi9 = new javax.swing.JLabel();
        kursi10 = new javax.swing.JLabel();
        kursi11 = new javax.swing.JLabel();
        kursi12 = new javax.swing.JLabel();
        jam = new javax.swing.JComboBox<>();
        tanggal = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(204, 204, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kursi2.setBackground(new java.awt.Color(255, 153, 102));
        kursi2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi2.setForeground(new java.awt.Color(0, 0, 0));
        kursi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi2.setText("A2");
        kursi2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi2.setOpaque(true);
        kursi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi2MouseClicked(evt);
            }
        });
        panel.add(kursi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 77, 64));

        kursi1.setBackground(new java.awt.Color(255, 153, 102));
        kursi1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi1.setForeground(new java.awt.Color(0, 0, 0));
        kursi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi1.setText("A1");
        kursi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi1.setOpaque(true);
        kursi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi1MouseClicked(evt);
            }
        });
        kursi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kursi1KeyPressed(evt);
            }
        });
        panel.add(kursi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 77, 64));

        kursi4.setBackground(new java.awt.Color(255, 153, 102));
        kursi4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi4.setForeground(new java.awt.Color(0, 0, 0));
        kursi4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi4.setText("A4");
        kursi4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi4.setOpaque(true);
        kursi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi4MouseClicked(evt);
            }
        });
        panel.add(kursi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 77, 64));

        kursi3.setBackground(new java.awt.Color(255, 153, 102));
        kursi3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi3.setForeground(new java.awt.Color(0, 0, 0));
        kursi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi3.setText("A3");
        kursi3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi3.setOpaque(true);
        kursi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi3MouseClicked(evt);
            }
        });
        panel.add(kursi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 77, 64));

        kursi5.setBackground(new java.awt.Color(255, 153, 102));
        kursi5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi5.setForeground(new java.awt.Color(0, 0, 0));
        kursi5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi5.setText("A5");
        kursi5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi5.setOpaque(true);
        kursi5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi5MouseClicked(evt);
            }
        });
        panel.add(kursi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 77, 64));

        kursi6.setBackground(new java.awt.Color(255, 153, 102));
        kursi6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi6.setForeground(new java.awt.Color(0, 0, 0));
        kursi6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi6.setText("A6");
        kursi6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi6.setOpaque(true);
        kursi6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi6MouseClicked(evt);
            }
        });
        panel.add(kursi6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 77, 64));

        kursi7.setBackground(new java.awt.Color(255, 153, 102));
        kursi7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi7.setForeground(new java.awt.Color(0, 0, 0));
        kursi7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi7.setText("A7");
        kursi7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi7.setOpaque(true);
        kursi7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi7MouseClicked(evt);
            }
        });
        panel.add(kursi7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 77, 64));

        kursi8.setBackground(new java.awt.Color(255, 153, 102));
        kursi8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi8.setForeground(new java.awt.Color(0, 0, 0));
        kursi8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi8.setText("A8");
        kursi8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi8.setOpaque(true);
        kursi8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi8MouseClicked(evt);
            }
        });
        panel.add(kursi8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 77, 64));

        kursi9.setBackground(new java.awt.Color(255, 153, 102));
        kursi9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi9.setForeground(new java.awt.Color(0, 0, 0));
        kursi9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi9.setText("A9");
        kursi9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi9.setOpaque(true);
        kursi9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi9MouseClicked(evt);
            }
        });
        panel.add(kursi9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 77, 64));

        kursi10.setBackground(new java.awt.Color(255, 153, 102));
        kursi10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi10.setForeground(new java.awt.Color(0, 0, 0));
        kursi10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi10.setText("A10");
        kursi10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi10.setOpaque(true);
        kursi10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi10MouseClicked(evt);
            }
        });
        panel.add(kursi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 77, 64));

        kursi11.setBackground(new java.awt.Color(255, 153, 102));
        kursi11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi11.setForeground(new java.awt.Color(0, 0, 0));
        kursi11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi11.setText("A11");
        kursi11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi11.setOpaque(true);
        kursi11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi11MouseClicked(evt);
            }
        });
        panel.add(kursi11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 77, 64));

        kursi12.setBackground(new java.awt.Color(255, 153, 102));
        kursi12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kursi12.setForeground(new java.awt.Color(0, 0, 0));
        kursi12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kursi12.setText("A12");
        kursi12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kursi12.setOpaque(true);
        kursi12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kursi12MouseClicked(evt);
            }
        });
        panel.add(kursi12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 77, 64));

        jam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11:30", "15:10", "19:00", "22:00" }));
        jam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jamItemStateChanged(evt);
            }
        });
        panel.add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 90, 40));

        tanggal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tanggalItemStateChanged(evt);
            }
        });
        tanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tanggalMouseClicked(evt);
            }
        });
        panel.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 150, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Submit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 100, 30));

        back.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Back_Jadi.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        panel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Seat_Jadi.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanggalMouseClicked
        // TODO add your handling code here:
        
 
    }//GEN-LAST:event_tanggalMouseClicked

    private void tanggalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tanggalItemStateChanged
        // TODO add your handling code here:
        this.setup();
       
    }//GEN-LAST:event_tanggalItemStateChanged

    private void jamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jamItemStateChanged
        // TODO add your handling code here:
        this.setup();
    }//GEN-LAST:event_jamItemStateChanged

    private void kursi1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kursi1KeyPressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_kursi1KeyPressed

    private void kursi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi1MouseClicked
       if(this.isitBooked.contains(kursi1.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi1.setBackground(new Color(255,153,102));
                this.cancel =false;
                this.ticket.getKursi().removeIf(name -> name.equals("A1"));
                
            }else { 
                 kursi1.setBackground(Color.green);
                 this.cancel = true;
                  this.ticket.setKursi("A1"); 
            }
        }        
    }//GEN-LAST:event_kursi1MouseClicked

    private void kursi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi2MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi2.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi2.setBackground(new Color(255,153,102));
                this.cancel =false;
               this.ticket.getKursi().removeIf(name -> name.equals("A2")); 
                
            }else { 
                 kursi2.setBackground(Color.green);
                 this.cancel = true;
                  this.ticket.setKursi("A2"); 
            }
        }        
    }//GEN-LAST:event_kursi2MouseClicked

    private void kursi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi3MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi3.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi3.setBackground(new Color(255,153,102));
                this.cancel =false;
              this.ticket.getKursi().removeIf(name -> name.equals("A3"));            
            }else { 
                 kursi3.setBackground(Color.green);
                 this.cancel = true;
               this.ticket.setKursi("A3"); 
            }
        }        
    }//GEN-LAST:event_kursi3MouseClicked

    private void kursi4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi4MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi4.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi4.setBackground(new Color(255,153,102));
                this.cancel =false;
             this.ticket.getKursi().removeIf(name -> name.equals("A4"));          
            }else { 
                 kursi4.setBackground(Color.green);
                 this.cancel = true;
              this.ticket.setKursi("A4"); 
            }
        }        
    }//GEN-LAST:event_kursi4MouseClicked

    private void kursi5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi5MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi5.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi5.setBackground(new Color(255,153,102));
                this.cancel =false;
              this.ticket.getKursi().removeIf(name -> name.equals("A5"));       
            }else { 
                 kursi5.setBackground(Color.green);
                 this.cancel = true;
             this.ticket.setKursi("A5"); 
            }
        }        
    }//GEN-LAST:event_kursi5MouseClicked

    private void kursi6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi6MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi6.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi6.setBackground(new Color(255,153,102));
                this.cancel =false;
                  this.ticket.getKursi().removeIf(name -> name.equals("A6"));      
            }else { 
                 kursi6.setBackground(Color.green);
                 this.cancel = true;
              this.ticket.setKursi("A6"); 
            
            }
        }        
    }//GEN-LAST:event_kursi6MouseClicked

    private void kursi7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi7MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi7.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi7.setBackground(new Color(255,153,102));
                this.cancel =false;
               this.ticket.getKursi().removeIf(name -> name.equals("A7"));      
            }else { 
                 kursi7.setBackground(Color.green);
                 this.cancel = true;
              this.ticket.setKursi("A7");
              
            }
        }        
    }//GEN-LAST:event_kursi7MouseClicked

    private void kursi8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi8MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi8.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi8.setBackground(new Color(255,153,102));
                this.cancel =false;
                this.ticket.getKursi().removeIf(name -> name.equals("A8"));        
            }else { 
                 kursi8.setBackground(Color.green);
                 this.cancel = true;
              this.ticket.setKursi("A8");
            
            }
        }        
    }//GEN-LAST:event_kursi8MouseClicked

    private void kursi9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi9MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi9.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi9.setBackground(new Color(255,153,102));
                this.cancel =false;
                this.ticket.getKursi().removeIf(name -> name.equals("A9"));       
            }else { 
                 kursi9.setBackground(Color.green);
                 this.cancel = true;
                   this.ticket.setKursi("A9");
                  
            }
        }        
    }//GEN-LAST:event_kursi9MouseClicked

    private void kursi10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi10MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi10.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi10.setBackground(new Color(255,153,102));
                this.cancel =false;
                  this.ticket.getKursi().removeIf(name -> name.equals("A10"));       
            }else { 
                 kursi10.setBackground(Color.green);
                 this.cancel = true;
              this.ticket.setKursi("A10");
             
            }
        }        
    }//GEN-LAST:event_kursi10MouseClicked

    private void kursi11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi11MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi11.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi11.setBackground(new Color(255,153,102));
                this.cancel =false;
                 this.ticket.getKursi().removeIf(name -> name.equals("A11"));     
            }else { 
                 kursi11.setBackground(Color.green);
                 this.cancel = true;
              this.ticket.setKursi("A11");
        
            }
        }        
    }//GEN-LAST:event_kursi11MouseClicked

    private void kursi12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kursi12MouseClicked
        // TODO add your handling code here:
        if(this.isitBooked.contains(kursi12.getText())) { 
            JOptionPane.showMessageDialog(null, "Kursi sudah dipilih!", "Gagal memilih Kursi",JOptionPane.WARNING_MESSAGE);
        }else { 
            if(this.cancel) { 
                kursi12.setBackground(new Color(255,153,102));
                this.cancel =false;
                   this.ticket.getKursi().removeIf(name -> name.equals("A12"));
            }else { 
                 kursi12.setBackground(Color.green);
                 this.cancel = true;
                   this.ticket.setKursi("A12");
                
            }
        }        
    }//GEN-LAST:event_kursi12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.ticket.getKursi().size()<=0) { 
          JOptionPane.showMessageDialog(null,"Anda Belum memesan Kursi", "Gagal!", JOptionPane.ERROR_MESSAGE);
        }else { 
              this.ticket.setJumlah(ticket.getKursi().size());
        Dashboard dash = new Dashboard(user, ticket, food, drink);
        dash.setVisible(true);
        this.setVisible(false);
        this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        ShowMovies show = new ShowMovies(this.user, this.ticket, this.food, this.drink);
        show.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(ShowSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowSeats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jam;
    private javax.swing.JLabel kursi1;
    private javax.swing.JLabel kursi10;
    private javax.swing.JLabel kursi11;
    private javax.swing.JLabel kursi12;
    private javax.swing.JLabel kursi2;
    private javax.swing.JLabel kursi3;
    private javax.swing.JLabel kursi4;
    private javax.swing.JLabel kursi5;
    private javax.swing.JLabel kursi6;
    private javax.swing.JLabel kursi7;
    private javax.swing.JLabel kursi8;
    private javax.swing.JLabel kursi9;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> tanggal;
    // End of variables declaration//GEN-END:variables
}
