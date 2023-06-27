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
public class dataSetPenyewaan {
    private ArrayList<Double> hrgSewa;
    private ArrayList<Integer> idAlat;
    private ArrayList<Integer> idCust;
    private ArrayList<Integer> idSewa;
    private ArrayList<String> noPol;
    private ArrayList<String> tglSewa;
    private ArrayList<Double> totalSewa;
    
    public dataSetPenyewaan(){
        hrgSewa = new ArrayList<Double>();
        idAlat = new ArrayList<Integer>();
        idCust = new ArrayList<Integer>();
        idSewa = new ArrayList<Integer>();
        noPol = new ArrayList<String>();
        tglSewa = new ArrayList<String>();
        totalSewa = new ArrayList<Double>();
    }

    public void hrgSewa(double a) {
        hrgSewa.add(a);
    }
    
    public ArrayList<Double> getdataSetHrgSewa() {
        return this.hrgSewa;
    }

    public void idAlat(int b) {
        idAlat.add(b);
    }

    public ArrayList<Integer> getdataSetIdAlat() {
        return this.idAlat;
    }

    public void idCust(int c) {
        idCust.add(c);
    }

    public ArrayList<Integer> getdataSetIdCust() {
        return this.idCust;
    }

    public void idSewa(int d) {
        idSewa.add(d);
    }

    public ArrayList<Integer> getdataSetIdSewa() {
        return this.idSewa;
    }

    public void noPol(String value) {
        noPol.add(value);
    }

    public ArrayList<String> getdataSetNoPol() {
        return this.noPol;
    }

    public void tglSewa(String g) {
        tglSewa.add(g);
    }

    public ArrayList<String> getdataSetTglSewa() {
        return this.tglSewa;
    }

    public void totalSewa(double h) {
        totalSewa.add(h);
    }

    public ArrayList<Double> getdataSetTotalSewa() {
        return this.totalSewa;
    }

    public void tambahPenyewaan(double hrgSewa, int idAlat, int idCust, int idSewa, String noPol, String tglSewa, double totalSewa) {
        this.hrgSewa.add(hrgSewa);
        this.idAlat.add(idAlat);
        this.idCust.add(idCust);
        this.idSewa.add(idSewa);
        this.noPol.add(noPol);
        this.tglSewa.add(tglSewa);
        this.totalSewa.add(totalSewa);
    }
    
    
}
