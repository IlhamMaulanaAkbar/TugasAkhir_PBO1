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
public class dataSetPengiriman {
    private ArrayList<Integer> idCust;
    private ArrayList<Integer> idKirim;
    private ArrayList<Integer> idSewa;
    private ArrayList<String> noPol;
    private ArrayList<String> operator;
    private ArrayList<String> tanggal;
    
    public dataSetPengiriman(){
        idCust = new ArrayList<Integer>();
        idKirim = new ArrayList<Integer>();
        idSewa = new ArrayList<Integer>();
        noPol = new ArrayList<String>();
        operator = new ArrayList<String>();
        tanggal = new ArrayList<String>();
    }
    
    public void idCust(int a){
        idCust.add(a);
    }
    
    public ArrayList<Integer> getdataSetidCust(){
        return this.idCust;
    }
    
    public void idKirim(int b){
        idKirim.add(b);
    }
    
    public ArrayList<Integer> getdataSetidKirim(){
        return this.idKirim;
    }
    
    public void idSewa(int c){
        idSewa.add(c);
    }
    
    public ArrayList<Integer> getdataSetidSewa(){
        return this.idSewa;
    }
    
    public void noPol(String value){
        noPol.add(value);
    }
    
    public ArrayList<String> getdataSetnoPol(){
        return this.noPol;
    }
    
    public void operator(String value){
        operator.add(value);
    }
    
    public ArrayList<String> getdataSetoperator(){
        return this.operator;
    }
    
    public void tanggal(String d){
        tanggal.add(d);
    }
    
    public ArrayList<String> getdataSettanggal(){
        return this.tanggal;
    }
    
    public void tambahPengiriman(int idCust, int idKirim, int idSewa, String noPol, String operator, String tanggal){
        this.idCust.add(idCust);
        this.idKirim.add(idKirim);
        this.idSewa.add(idSewa);
        this.noPol.add(noPol);
        this.operator.add(operator);
        this.tanggal.add(tanggal);
    }
}
