/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author asus
 */
public class dataSetPembayaran {
    private ArrayList<Integer> idBayar;
    private ArrayList<Integer> idCust;
    private ArrayList<Integer> idSewa;
    private ArrayList<String> keterangan;
    private ArrayList<Double> nominal;
    private ArrayList<Date> tanggal;
    
    public dataSetPembayaran(){
        idBayar = new ArrayList<Integer>();
        idCust = new ArrayList<Integer>();
        idSewa = new ArrayList<Integer>();
        keterangan = new ArrayList<String>();
        nominal = new ArrayList<Double>();
        tanggal = new ArrayList<Date>();                      
    }
    
    public void idBayar(int a){
        idBayar.add(a);
    }
    
    public ArrayList<Integer> getdataSetidBayar(){
        return this.idBayar;
    }
    
    public void idCust(int b){
        idCust.add(b);
    }
    
    public ArrayList<Integer> getdataSetidCust(){
        return this.idCust;
    }
    
    public void idSewa(int c){
        idSewa.add(c);
    }
    
    public ArrayList<Integer> getdataSetidSewa(){
        return this.idSewa;
    }
    
    public void keterangan(String value){
        keterangan.add(value);
    } 
    
    public ArrayList<String> getdataSetketerangan(){
        return this.keterangan;
    }
    
    public void nomimal(double d){
        nominal.add(d);
    }
    
    public ArrayList<Double> getdataSetnomimal(){
        return this.nominal;
    }
    
    public void tanggal(Date e){
        tanggal.add(e);
    }
    
    public ArrayList<Date> getdataSettanggal(){
        return this.tanggal;
    }
    
    public void tambahPembayaran(int idBayar, int idCust, int idSewa, String keterangan, double nomimal, Date tanggal){
        this.idBayar.add(idBayar);
        this.idCust.add(idCust);
        this.idSewa.add(idSewa);
        this.keterangan.add(keterangan);
        this.nominal.add(nomimal);
        this.tanggal.add(tanggal);
    }
    
}
