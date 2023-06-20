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
public class dataSetJurnal {
    private ArrayList<Double> debet;
    private ArrayList<Integer> idAkun;
    private ArrayList<Integer> idJurnal;
    private ArrayList<Integer> idSewa;
    private ArrayList<String> keterangan;
    private ArrayList<Double> kredit;
    private ArrayList<String> namaAkun;
    private ArrayList<Date> tanggal;
    private ArrayList<Integer> Jumlah;

    public dataSetJurnal() {
        debet = new ArrayList<Double>();
        idAkun = new ArrayList<Integer>();
        idJurnal = new ArrayList<Integer>();
        idSewa = new ArrayList<Integer>();
        keterangan = new ArrayList<String>();
        kredit = new ArrayList<Double>();
        namaAkun = new ArrayList<String>();
        tanggal = new ArrayList<Date>();
        Jumlah = new ArrayList<Integer>();
    }

    public void debet(double a) {
        debet.add(a);
    }
    
    public ArrayList<Double> getdataSetDebet() {
        return this.debet;
    }

    public void idAkun(int b) {
        idAkun.add(b);
    }

    public ArrayList<Integer> getdataSetIdAkun() {
        return this.idAkun;
    }

    public void idJurnal(int c) {
        idJurnal.add(c);
    }

    public ArrayList<Integer> getdataSetIdJurnal() {
        return this.idJurnal;
    }

    public void idSewa(int d) {
        idSewa.add(d);
    }

    public ArrayList<Integer> getdataSetIdSewa() {
        return this.idSewa;
    }

    public void keterangan(String value) {
        keterangan.add(value);
    }

    public ArrayList<String> getdataSetKeterangan() {
        return this.keterangan;
    }

    public void kredit(double e) {
        kredit.add(e);
    }

    public ArrayList<Double> getdataSetKredit() {
        return this.kredit;
    }

    public void namaAkun(String value) {
        namaAkun.add(value);
    }

    public ArrayList<String> getdataSetNamaAkun() {
        return this.namaAkun;
    }

    public void tanggal(Date f) {
        tanggal.add(f);
    }

    public ArrayList<Date> getdataSetTanggal() {
        return this.tanggal;
    }

    public void jumlah(int g) {
       Jumlah.add(g);
    }

    public ArrayList<Integer> getdataSetJumlah() {
        return this.Jumlah;
    }

    
    public void tambahJurnal(Double debet, int idAkun, int idJurnal, int idSewa, String keterangan, Double kredit, String namaAkun, Date tanggal, int Jumlah){
        this.debet.add(debet);
        this.idAkun.add(idAkun);
        this.idJurnal.add(idJurnal);
        this.idSewa.add(idSewa);
        this.keterangan.add(keterangan);
        this.kredit.add(kredit);
        this.namaAkun.add(namaAkun);
        this.tanggal.add(tanggal);
        this.Jumlah.add(Jumlah);
        
    }
          
    
}
