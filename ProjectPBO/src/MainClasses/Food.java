/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;
import InterfaceData.getDiscount;
import java.util.logging.Logger;



/**
 *
 * @author Rafly
 */
public class Food extends Item {
    private String flavour;
    private String size;
    public Food(String name, String price, double discount, String flavour, int jumlah, String size) { 
    super(name,price, discount, jumlah);  
    this.isitDiscount(discount, jumlah);
    this.setFlavour(flavour);
    this.size = size;
    }
    @Override
    public void isitDiscount(double discount, int jumlah) {
     super.isitDiscount(discount, jumlah);  
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
 
    
    public String getSize(){
        return size;
    }
}
    
    
        
    
    
    
    
        
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    