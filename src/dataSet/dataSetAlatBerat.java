/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSet;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class dataSetAlatBerat {
    private ArrayList<Integer> beratAlat;
    private ArrayList<Integer> hargaSatuan;
    private ArrayList<Integer> idAlat;
    private ArrayList<String> namaAlat;
    private ArrayList<Integer> stok;
    
    
    
    public dataSetAlatBerat() 
    {
        beratAlat = new ArrayList<Integer>();
        hargaSatuan = new ArrayList<Integer>();
        idAlat = new ArrayList<Integer>();
        namaAlat = new ArrayList<String>();
        stok = new ArrayList<Integer>();
    }

    public void beratAlat(int x) {
        beratAlat.add(x);
    }
    
    public ArrayList<Integer> getdataSetberatAlat() {
        return this.beratAlat;
    }   

    public void hargaSatuan(int y) {
       hargaSatuan.add(y);
    }
    
    public ArrayList<Integer> getdataSetHargaSatuan() {
        return this.hargaSatuan;
    }   

    public void idAlat(int z) {
        idAlat.add(z);
    }
    
    public ArrayList<Integer> getdataSetIdAlat() {
        return this.idAlat;
    }

    public void namaAlat(String value) {
        namaAlat.add(value);
    }
    
    public ArrayList<String> getdataSetNamaAlat() {
        return this.namaAlat;
    }

    public void stok(int a) {
        stok.add(a);
    }
    
    public ArrayList<Integer> getdataSetStok() {
        return this.stok;
    }

    public void tambahAlatBerat(int beratAlat, int hargaSatuan, int idAlat, String namaAlat, int stok){
        this.beratAlat.add(beratAlat);
        this.hargaSatuan.add(hargaSatuan);
        this.idAlat.add(idAlat);
        this.namaAlat.add(namaAlat);
        this.stok.add(stok);
    }
    
    
}
