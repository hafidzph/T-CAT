/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

/**
 *
 * @author Rafly
 */
public class Movies {
    private String nama, harga, kode, tahun , sinopsis, namaFile, trailer;

    public Movies(String nama, String tanggal, String kode, String harga) { 
       
       this.setNama(nama);
       this.setTahun(tanggal);
       this.setKode(kode);
       this.setHarga(harga);
        
    }
   public Movies() { 
       
   }
    
    
    
    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }


    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return Integer.parseInt(this.harga);
    }

    public String getKode() {
        return kode;
    }

    public String getTahun() {
        return tahun;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getNamaFile() {
        return namaFile;
    }
    
    
}
