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
public class dataSetAkun {
    private ArrayList<Integer> idAkun;
    private ArrayList<String> jenisAkun;
    private ArrayList<String> namaAkun;
    private ArrayList<String> saldoNormal;
    
    public dataSetAkun(){
        idAkun = new ArrayList<Integer>();
        jenisAkun = new ArrayList<String>();
        namaAkun = new ArrayList<String>();
        saldoNormal = new ArrayList<String>();
    }
    
    public void idAkun(int x){
        idAkun.add(x);
    }
    
    public ArrayList<Integer> getdataSetidAkun(){
        return this.idAkun;
    }
    
    public void JenisAkun(String value){
        jenisAkun.add(value);
    }
    
    public ArrayList<String> getdataSetJenisAkun(){
        return this.jenisAkun;
    }

    public void namaAkun(String value) {
        namaAkun.add(value);
    }
    
    public ArrayList<String> getdataSetNamaAkun() {
        return this.namaAkun;
    }

    public void saldoNormal(String value) {
       saldoNormal.add(value);
    }

    public ArrayList<String> getdataSetSaldoNormal() {
        return this.saldoNormal;
    }
    
    public void tambahAkun(int idAkun, String jenisAkun, String namaAkun, String saldoNormal){
        this.idAkun.add(idAkun);
        this.jenisAkun.add(jenisAkun);
        this.namaAkun.add(namaAkun);
        this.saldoNormal.add(saldoNormal);
    }
       
            
    
}

