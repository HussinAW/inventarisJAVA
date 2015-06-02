/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbinventarisjava;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author nurmasari
 */
public class Kebersihan_RK extends super_abstrack {
    Scanner input = new Scanner (System.in);
    Kebersihan_ruang_kelas clean = new Kebersihan_ruang_kelas();
    public static double sesuai = 0.0;

    @Override
    public double input(){
        System.out.println("Inputkan Sirkulasi udara :");
        System.out.println("Lancar");
        System.out.println("Tidak lancar");
        clean.setSirkulasi_udara(input.next());
        System.out.println("Masukkan Kondisi Pencahayaan :");
        System.out.println("Pencahayaan (250-350)");
        clean.setPencahayaan(input.nextInt());
        System.out.println("Masukkan Kondisi Kelembapan :");
        clean.setKelembapan(input.nextInt());
        System.out.println("Masukkan Kondisi Suhu :");
        clean.setSuhu(input.nextInt());
    return 0;
    }

    @Override
    public double Analisis() {
        
        
      /* if(KebersihanKelas.getSirkulasiUdara() == 1){
            System.out.println("Sirkulasi Udara Di ruangan Lancar Sesuai");
            Kebersihan_Sesuai++;
        }else if(KebersihanKelas.getSirkulasiUdara() == 2){
            System.out.println("Sirkulasi Udara Di ruangan Tidak Lancar");
        }
        
        if(KebersihanKelas.getnilaiPencahayaan() >= 250 && KebersihanKelas.getnilaiPencahayaan() <=350){
            System.out.println("Nilai Pencahayaan Ruangan \t = "+KebersihanKelas.getnilaiPencahayaan()+" Sesuai");
            Kebersihan_Sesuai++;
        }else{
            System.out.println("Nilai Pencahayaan Ruangan \t = "+KebersihanKelas.getnilaiPencahayaan());
        }*/
    }

    @Override
    public double tampil() {
        
    }
    
}
