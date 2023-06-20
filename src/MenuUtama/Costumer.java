package MenuUtama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Costumer {
    
    private String alamat;
    private int idCust;
    private String nmCust;
    private String telp;

    public Costumer (String alamat, int idCust, String nmCust, String telp) {
        this.alamat = alamat;
        this.idCust = idCust;
        this.nmCust = nmCust;
        this.telp = telp;
    }

    // Getter methods
    public String getAlamat() {
        return alamat;
    }

    public int getIdCust() {
        return idCust;
    }

    public String getNmCust() {
        return nmCust;
    }

    public String getTelp() {
        return telp;
    }

    // Setter methods
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIdCust(int idCust) {
        this.idCust = idCust;
    }

    public void setNmCust(String nmCust) {
        this.nmCust = nmCust;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }


}
