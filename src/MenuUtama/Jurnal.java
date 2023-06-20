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

public class Jurnal {
    private double debet;
    private int idAkun;
    private int idJurnal;
    private int idSewa;
    private String keterangan;
    private double kredit;
    private String namaAkun;
    private Date tanggal;
    private int Jumlah;

    public Jurnal(double debet, int idAkun, int idJurnal, int idSewa, String keterangan, double kredit, String namaAkun, Date tanggal, int Jumlah) {
        this.debet = debet;
        this.idAkun = idAkun;
        this.idJurnal = idJurnal;
        this.idSewa = idSewa;
        this.keterangan = keterangan;
        this.kredit = kredit;
        this.namaAkun = namaAkun;
        this.tanggal = tanggal;
        this.Jumlah = Jumlah;
    }

    // Getter methods
    public double getDebet() {
        return debet;
    }

    public int getIdAkun() {
        return idAkun;
    }

    public int getIdJurnal() {
        return idJurnal;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public double getKredit() {
        return kredit;
    }

    public String getNamaAkun() {
        return namaAkun;
    }

    public Date getTanggal() {
        return tanggal;
    }
    
    public int getJumlah(){
        return Jumlah;
    }

    // Setter methods
    public void setDebet(double debet) {
        this.debet = debet;
    }

    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
    }

    public void setIdJurnal(int idJurnal) {
        this.idJurnal = idJurnal;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setKredit(double kredit) {
        this.kredit = kredit;
    }

    public void setNamaAkun(String namaAkun) {
        this.namaAkun = namaAkun;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public void setJumlah(int Jumlah){
        this.Jumlah = Jumlah;
    }
}

