


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author asus
 */
package MenuUtama;
import java.util.Date;
import dataSet.dataSetAdmin;
import dataSet.dataSetAkun;
import dataSet.dataSetAlatBerat;
import dataSet.dataSetCostumer;
import dataSet.dataSetJurnal;
import dataSet.dataSetPembayaran;
import dataSet.dataSetPengiriman;
import dataSet.dataSetPenyewaan;

import Forms.frameUtama;

public class MenuUtama {
    public static void main(String[] args) {
        /*
        // Membuat objek-objek dari tabel-tabel sebelumnya
        Admin admin = new Admin("", 1, "", "");
        Costumer customer = new Costumer("", 1, "", "");
        AlatBerat alatBerat = new AlatBerat(5000, 100000, 1, "", 5);
        Pembayaran pembayaran = new Pembayaran(1, 1, 1, "Pembayaran Sewa", 1000000, new Date());

        // Membuat objek Penyewaan
        Penyewaan penyewaan = new Penyewaan(100000, 1, 1, 1, 3, 8, "", new Date(), 300000);

        // Menggunakan objek-objek yang telah dibuat
        System.out.println("Nama Admin: " + admin.getUserName());
        System.out.println("Alamat Customer: " + customer.getAlamat());
        System.out.println("Nama Alat Berat: " + alatBerat.getNamaAlat());
        System.out.println("Harga Sewa: " + penyewaan.getHrgSewa());
        System.out.println("Nominal Pembayaran: " + pembayaran.getNominal());
        System.out.println("Jumlah Penyewaan: " + penyewaan.getJumlah());
    }
    */
        frameUtama formsaya = new frameUtama();
        formsaya.setVisible(true);
    }
}
