package MenuUtama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
import java.util.Date;

public class Pembayaran {
    private int idBayar;
    private int idCust;
    private int idSewa;
    private String keterangan;
    private double nominal;
    private String tanggal;
    

    public Pembayaran(int idBayar, int idCust, int idSewa, String keterangan, double nominal, String tanggal) {
        this.idBayar = idBayar;
        this.idCust = idCust;
        this.idSewa = idSewa;
        this.keterangan = keterangan;
        this.nominal = nominal;
        this.tanggal = tanggal;
    }

    // Getter methods
    public int getIdBayar() {
        return idBayar;
    }

    public int getIdCust() {
        return idCust;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public double getNominal() {
        return nominal;
    }

    public String getTanggal() {
        return tanggal;
    }

    // Setter methods
    public void setIdBayar(int idBayar) {
        this.idBayar = idBayar;
    }

    public void setIdCust(int idCust) {
        this.idCust = idCust;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}

