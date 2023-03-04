/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

import Connection.Conn;
import GUI.Dashboard;

/**
 *
 * @author Rafly
 */
public class User { 
private  String name; 
private  String email; 
private  String gender;
private String password;
private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

  public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
   public User() { 
       
   }
    public  String getName() {
        return name;
    }

    public  String getEmail() {
        return this.email;
    }
    
    public  String getGender() { 
        
        return this.gender;
    }
    
    public String getPassword(){
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
  

 



}