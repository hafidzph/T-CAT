/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

/**
 *
 * @author Rafly
 */
public class Drink extends Item {
    private String size; 
    public Drink(String name, String price, String size, int jumlah) { 
        super(name,price, 0.10, jumlah);
        this.setSize(size);
        this.isitDiscount(size, jumlah);
    }
 
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void isitDiscount(String size, int jumlah) { 
        
        if(size.equalsIgnoreCase("large")) { 
            super.isitDiscount(0.15,jumlah);
        }else if(size.equalsIgnoreCase("medium")) { 
            super.isitDiscount(0.10,jumlah);
        }else { 
            super.isitDiscount(0.5, jumlah);
        }
        
    }
    
}
