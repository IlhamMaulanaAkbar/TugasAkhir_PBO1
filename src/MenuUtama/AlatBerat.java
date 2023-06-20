package MenuUtama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class AlatBerat {
    private int beratAlat;
    private int hargaSatuan;
    private int idAlat;
    private String namaAlat;
    private int stok;

    public AlatBerat(int beratAlat, int hargaSatuan, int idAlat, String namaAlat, int stok) {
        this.beratAlat = beratAlat;
        this.hargaSatuan = hargaSatuan;
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.stok = stok;
    }

    // Getter methods
    public int getBeratAlat() {
        return beratAlat;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getIdAlat() {
        return idAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public int getStok() {
        return stok;
    }

    // Setter methods
    public void setBeratAlat(int beratAlat) {
        this.beratAlat = beratAlat;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public void setIdAlat(int idAlat) {
        this.idAlat = idAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
}

