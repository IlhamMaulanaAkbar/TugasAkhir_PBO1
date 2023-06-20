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
public class dataSetCostumer {
    private ArrayList<Integer> idCust;
    private ArrayList<String> nmCust;
    private ArrayList<String> Alamat;
    private ArrayList<String> Telp;
    
    
    public dataSetCostumer(){
        idCust = new ArrayList<Integer>();
        nmCust= new ArrayList<String>();
        Alamat = new ArrayList<String>();
        Telp = new ArrayList<String>();
    }
    
    public void tambahidCust(int x){
        idCust.add(x);
    }
    
    public ArrayList<Integer> getDatasetidCust(){
        return this.idCust;
    }
    
    public void tambahnmCust(String value) {
        nmCust.add(value);
    }
    
    public ArrayList<String> getDatasetnmCust(){
        return this.nmCust;
    }
    
    public void tambahAlamat(String value){
        Alamat.add(value);
    }
    
    public ArrayList<String> getDatasetAlamat(){
        return this.Alamat;
    }
    
    public void tambahTelp(String value){
        Telp.add(value);
    }
    
    public ArrayList<String> getDatasetTelp(){
        return this.Telp;
    }
    
    public void tambahData(String Alamat, String Telp, int idCust, String nmCust){
        this.Alamat.add(Alamat);
        this.Telp.add(Telp);
        this.idCust.add(idCust);
        this.nmCust.add(nmCust);
    }

    
}
