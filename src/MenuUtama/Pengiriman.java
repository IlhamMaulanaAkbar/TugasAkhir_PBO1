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

public class Pengiriman {
    private int idCust;
    private int idKirim;
    private int idSewa;
    private String noPol;
    private String operator;
    private Date tanggal;

    public Pengiriman(int idCust, int idKirim, int idSewa, String noPol, String operator, Date tanggal) {
        this.idCust = idCust;
        this.idKirim = idKirim;
        this.idSewa = idSewa;
        this.noPol = noPol;
        this.operator = operator;
        this.tanggal = tanggal;
    }

    // Getter methods
    public int getIdCust() {
        return idCust;
    }

    public int getIdKirim() {
        return idKirim;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getOperator() {
        return operator;
    }

    public Date getTanggal() {
        return tanggal;
    }

    // Setter methods
    public void setIdCust(int idCust) {
        this.idCust = idCust;
    }

    public void setIdKirim(int idKirim) {
        this.idKirim = idKirim;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}

