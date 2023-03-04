/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafly
 */
public class Conn { 
    private static Connection con; 
    private static Statement stm; 
    private static ResultSet rs = null; 
    
     public Conn() { 
        koneksi();
        
    } 
    public static void koneksi() { 
        try{ 
            String url = "jdbc:mysql://localhost:3306/pboproject";
            String user = "root"; 
            String pass =""; 
            con = DriverManager.getConnection(url,user,pass); 
            stm = con.createStatement(); 
        }catch(SQLException e) { 
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
   

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Connection getCon() {
        return con;
    }

    public Statement getStm() {
        return stm;
    }

    public ResultSet getRs() {
        return rs;
    }
    
    
    
    
    

//    public ResultSet resultData(String query) throws SQLException { 
//        ResultSet rs = stm.executeQuery(query);   
//        return rs;     
//    }
//    
//    //Overloading 
//    public ResultSet resultData() { 
//        return this.rs;
//    }
//    
  
//    
    
    
}
