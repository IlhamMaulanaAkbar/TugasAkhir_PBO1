package MenuUtama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Akun {
    private int idAkun;
    private String jenisAkun;
    private String namaAkun;
    private String saldoNormal;

    public Akun(int idAkun, String jenisAkun, String namaAkun, String saldoNormal) {
        this.idAkun = idAkun;
        this.jenisAkun = jenisAkun;
        this.namaAkun = namaAkun;
        this.saldoNormal = saldoNormal;
    }

    // Getter methods
    public int getIdAkun() {
        return idAkun;
    }

    public String getJenisAkun() {
        return jenisAkun;
    }

    public String getNamaAkun() {
        return namaAkun;
    }

    public String getSaldoNormal() {
        return saldoNormal;
    }

    // Setter methods
    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
    }

    public void setJenisAkun(String jenisAkun) {
        this.jenisAkun = jenisAkun;
    }

    public void setNamaAkun(String namaAkun) {
        this.namaAkun = namaAkun;
    }

    public void setSaldoNormal(String saldoNormal) {
        this.saldoNormal = saldoNormal;
    }
}

