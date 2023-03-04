/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

import InterfaceData.getDiscount;
import java.util.ArrayList;

/**
 *
 * @author Rafly
 */
public class Ticket extends Movies implements getDiscount {
    
    private ArrayList<String> kursi = new ArrayList<String>(); 
    private int jumlah;
    private String jam;
    private String tanggalPilih;
    private double total;
    private  double discount;
    public double getDiscount() {
        return discount;
    }
 
    public String getTanggalPilih() {
        return tanggalPilih;
    }

    public void setKursi(ArrayList<String> kursi) {
        this.kursi = kursi;
    }

    public void setTanggalPilih(String tanggalPilih) {
        this.tanggalPilih = tanggalPilih;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }
    
    public Ticket(String namafilm, String tanggal, String  kode, String harga) { 
        super(namafilm+"(Ticket)", tanggal,kode,harga);
    }

    public Ticket(String kursi, String kode, int jumlah, String jam) {
        this.setJumlah(jumlah);
        this.setKursi(kursi);
    }
    public ArrayList<String> getKursi() {
        return kursi;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setKursi(String kursi) {
        this.kursi.add(kursi);
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void remove(String namaKursi) { 
        this.kursi.remove(namaKursi);
    }

    @Override
    public void isitDiscount(double discount, int jumlah) {
        this.discount = discount;
       this.total = this.getHarga() * jumlah * discount;
       this.total = (this.getHarga()*jumlah - this.total);
       
    }
    //Overloading
    public void isitDiscount(int jumlah) { 
        this.total = jumlah * this.getHarga();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
   
  
    
}
