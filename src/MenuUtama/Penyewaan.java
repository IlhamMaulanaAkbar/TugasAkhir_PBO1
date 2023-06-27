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

public class Penyewaan {
    private double hrgSewa;
    private int idAlat;
    private int idCust;
    private int idSewa;
    private String noPol;
    private String tglSewa;
    private double totalSewa;

    public Penyewaan(double hrgSewa, int idAlat, int idCust, int idSewa, String noPol, String tglSewa, double totalSewa) {
        this.hrgSewa = hrgSewa;
        this.idAlat = idAlat;
        this.idCust = idCust;
        this.idSewa = idSewa;
        this.noPol = noPol;
        this.tglSewa = tglSewa;
        this.totalSewa = totalSewa;
    }

    // Getter methods
    public double getHrgSewa() {
        return hrgSewa;
    }

    public int getIdAlat() {
        return idAlat;
    }

    public int getIdCust() {
        return idCust;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getTglSewa() {
        return tglSewa;
    }

    public double getTtlSewa() {
        return totalSewa;
    }

    // Setter methods
    public void setHrgSewa(double hrgSewa) {
        this.hrgSewa = hrgSewa;
    }

    public void setIdAlat(int idAlat) {
        this.idAlat = idAlat;
    }

    public void setIdCust(int idCust) {
        this.idCust = idCust;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    public void setTtlSewa(double totalSewa) {
        this.totalSewa = totalSewa;
    }
}

