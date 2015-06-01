/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbinventarisjava;
import java.util.Scanner;
/**
 *
 * @author nurmasari
 */
public class luas_ruang  implements interface_kondisi_ruang_kelas {
    private int panjang;
    private int lebar;
    private int jumlah_kursi;
    private int luas;
    public String getSesuai(){
        return Sesuai;
    }
public luas_ruang(double panjang, double lebar, double jumlah_kursi, double luas){
this.panjang = (int) panjang;
this.lebar = (int) lebar;
this.jumlah_kursi = (int) jumlah_kursi;
this.luas = (int) luas;
}
    @Override
    public double HitungLuas() {
        return panjang*lebar;
    }

    @Override
    public double HitungRasio() {
        return jumlah_kursi/luas;
    }

   
    
}
