/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbinventarisjava;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nurmasari
 */
public class Kebersihan_ruang_kelas extends super_abstrack {
    private String sirkulasi_udara;
    private int pencahayaan;
    private int kelembapan;
    private int suhu;
    public double sesuai = 0.0;

    public String getSirkulasi_udara() {
        return sirkulasi_udara;
    }

    public void setSirkulasi_udara(String sirkulasi_udara) {
        this.sirkulasi_udara = sirkulasi_udara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    @Override
    public double Analisis() {
        if(getSirkulasi_udara().equals("lancar")){
         sesuai++;
     }
     else{
         
     }   
            if(getPencahayaan()<= 350 &&getPencahayaan()>=250){
         sesuai++;
     }
     else{
         
     }   
            if(getKelembapan()<=80 && getKelembapan()>=70){
        return sesuai;
    }
            else{
                
            }
            if(getKelembapan()<=80 && getKelembapan()>=70){
        return sesuai;
    }
            else{
                
            }if(getSuhu()<=35 && getSuhu()>=25){
        return sesuai;
    }
            else{
                
            }
            
        return sesuai;
    }

    @Override
    public double tampil() {
     System.out.println("kondisi sirkulasi udara : "+getSirkulasi_udara());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi cahaya: "+ getPencahayaan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi kelembapan : "+getKelembapan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi suuhu : "+getSuhu());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi kelembapan : "+getKelembapan());
        

        
        return sesuai;     

    }

    @Override
    public double simpan() {
    try{
            FileWriter  Writer = new FileWriter ("jumlah_kondisi_posisiprasarana.txt");
            Writer.write("Sirkulasi udara = "+getSirkulasi_udara()+"\t");
            Writer.write("Pencahayaan = "+getPencahayaan()+"\t");
            Writer.write("Kelembapan  = "+getKelembapan()+"\t");
            Writer.write("Suhu = "+getSuhu()+"\t");
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();   
    }
        return 0;
}
}