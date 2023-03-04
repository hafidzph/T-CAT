/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

import InterfaceData.getDiscount;

/**
 *
 * @author Rafly
 */
public class Item implements getDiscount {
    //Encapsulation
    private String name; 
    private String price;
    private double discount;
    private double total = 0;
    private int jumlah;
    public Item(String name, String price) { 
        this.setName(name);
        this.setPrice(price);
        
    }
    public Item(String name, String price, double discount, int jumlah) { 
        this.setName(name);
        this.setPrice(price); 
        this.discount = discount;
        this.setJumlah(jumlah);
        
    }
    /**
     * 
     * get User's name and set it to name variable(global) 
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice() {
        return price;
    }
 
    public double getDiscount() {
        return discount;
    }
    public double getTotal() {
        return total;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void isitDiscount(double discount, int jumlah) {
        double temp = Double.parseDouble(this.getPrice())* jumlah * discount;
        this.total  = Double.parseDouble(this.getPrice()) * jumlah - temp; 
    }
   
   
    
    
    
    
}
