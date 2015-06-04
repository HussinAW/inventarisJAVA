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
        
        
         if(clean.getSirkulasi_udara().equals("lancar")){
         sesuai++;
     }
     else{
         
     }   
            if(clean.getPencahayaan()<= 350 && clean.getPencahayaan()>=250){
         sesuai++;
     }
     else{
         
     }   
            if(clean.getKelembapan()<=80 && clean.getKelembapan()>=70){
        return sesuai;
    }
            else{
                
            }
            if(clean.getKelembapan()<=80 && clean.getKelembapan()>=70){
        return sesuai;
    }
            else{
                
            }if(clean.getSuhu()<=35 && clean.getSuhu()>=25){
        return sesuai;
    }
            else{
                
            }
            
        return sesuai;

    }
    public void simpan(){
        try{
            FileWriter  Writer = new FileWriter ("jumlah_kondisi_posisiprasarana.txt");
            Writer.write("Sirkulasi udara = "+clean.getSirkulasi_udara()+"\t");
            Writer.write("Pencahayaan = "+clean.getPencahayaan()+"\t");
            Writer.write("Kelembapan  = "+clean.getKelembapan()+"\t");
            Writer.write("Suhu = "+clean.getSuhu()+"\t");
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }
    }
    @Override
    public double tampil() {
         System.out.println("kondisi sirkulasi udara : "+ clean.getSirkulasi_udara());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi cahaya: "+ clean.getPencahayaan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi kelembapan : "+clean.getKelembapan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi suuhu : "+clean.getSuhu());
        
        System.out.println("========================================================================/n");System.out.println("kondisi kelembapan : "+clean.getKelembapan());
        

        
        return sesuai;
        
    }
    
}
