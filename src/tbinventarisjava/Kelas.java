/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;
import java.util.Scanner;
/**
 *
 * @author andi
 */
public class Kelas {
    private String Nama_ruang;
    private String Lokasi_ruang;
    private String Program_studi;
    private int Panjang_ruang;
    private int Lebar_ruang;
    private int Jumlah_kursi;
    private int Jumlah_pintu;
    private int Jumlah_jendela;
    private int Luas_ruang;
    private double Rasio_ruang;
    String Bentuk_ruang;
    
    Scanner input = new Scanner(System.in);
    
    
    public void setNama_ruang(String nama_ruang){
        Nama_ruang = nama_ruang;
    }
    public String getNama_ruang(){
        return Nama_ruang;
    }
    public void setLokasi_ruang(String lokasi_ruang){
        Lokasi_ruang = lokasi_ruang;
    }
    public String getLokasi_ruang(){
        return Lokasi_ruang;
    }
    public void setProgram_studi(String program_studi){
        Program_studi = program_studi;
    }
    public String getProgram_studi(){
        return Program_studi;
    }
    public void setPanjang_ruang(int panjang_ruang){
        Panjang_ruang = panjang_ruang;
    }
    public int getPanjang_ruang(){
        return Panjang_ruang;
    }
    public void setLebar_ruang(int lebar_ruang){
        Lebar_ruang=lebar_ruang;
    }
    public int getPLebar_ruang(){
        return Lebar_ruang;
    }
    public void setJumlah_kursi(int jumlah_kursi){
        Jumlah_kursi=jumlah_kursi;
    }
    public int getJumlah_kursi(){
        return Jumlah_kursi;
    }
    public void setJumlah_pintu(int jumlah_pintu){
        Jumlah_pintu=jumlah_pintu;
    }
    public String getJumlah_pintu(){
        if(Jumlah_pintu>=2){
            System.out.println("Jumlah pintu: "+Jumlah_pintu);
            return "Sesuai";
        }
        else{
            System.out.println("Jumlah pintu: "+Jumlah_pintu);
            return "Tidak sesuai";
        }
    }
    public void setJumlah_jendela(int jumlah_jendela){
        Jumlah_jendela = jumlah_jendela;
    }
    public String getJumlah_jendela(){
        if(Jumlah_jendela>=1){
            System.out.println("Jumlah jendela: "+Jumlah_jendela);
            return "Sesuai";
        }
        else{
            System.out.println("Jumlah jendela: "+Jumlah_jendela);
            return "Tidak sesuai";
        }
    }
    public int Luas_ruang(){
        Luas_ruang = Panjang_ruang*Lebar_ruang;
        return Luas_ruang;
    }   
    String Bentuk(){
        if(Luas_ruang!=Panjang_ruang){
            Bentuk_ruang="PersegiPanjang";
            return Bentuk_ruang;
        }
        else{
            return "Bukan persegi panjang";
        }
    }
    String Bentuk2(){
        if(Bentuk_ruang=="PersegiPanjang"){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
    }
    public String Rasio_ruang(){
        Rasio_ruang=Luas_ruang/Jumlah_kursi;
        if(Rasio_ruang>=0.5){
            System.out.println("Rasio kelas: "+Rasio_ruang);
            return "Sesuai";
        }
        else{
            System.out.println("Rasio kelas: "+Rasio_ruang);
            return "Tidak Sesuai";
        }           
    }
    void luas(){
        Kelas panjang = new Kelas();
        Kelas luas = new Kelas();
        luas.Luas_ruang();
        panjang.getPanjang_ruang();
        if(panjang!=luas){
            Bentuk_ruang="Persegi Panjang";
        }
        else{
            Bentuk_ruang="BukanPersegiPanjang";
        }
        if(Bentuk_ruang=="Persegi Panjang"){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
    }
}