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
public class Kenyamanan_Ruang_Kelas extends super_abstrack {
private String kebisingan;
private String bau;
private String kebocoran;
private String kerusakan;
private String keausan;
public double sesuai=0.0;
    public String getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }
    
public double tampil(){
    System.out.println("kondisi bising atau tidak : "+getKebisingan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi bau atau tidak: "+ getBau());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi bau atau tidak : "+getKebocoran());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi suuhu : "+getKerusakan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi kelembapan : "+getKeausan());
        return sesuai;
        
    
}

    @Override
    public double Analisis() {
     if(getKebisingan().equals("tidakbising")){
      sesuai++;  
    } 
    else{        
    }

    if(getBau().equals("tidakbau")){
     sesuai++;   
    }
    else{
    }

    if(getKebocoran().equals("tidakbocor")){
    sesuai++;    
    }
    else{
    }

    if(getKerusakan().equals("tidakrusak")){
    sesuai++;  
    }
    else{   
    }
    
    if(getKeausan().equals("tidakaus")){
        sesuai++;
    }
    else{    
    }
    
    
    return sesuai;   
    }

    @Override
    public double simpan() {
    try{
            FileWriter  Writer = new FileWriter ("Kenyamanan Ruang Kelas.txt");
            Writer.write("Kebisingan = "+getKebisingan()+"\t");
            Writer.write("Bau = "+getBau()+"\t");
            Writer.write("Kebocoran = "+getKebocoran()+"\t");
            Writer.write("Kerusakan = "+getKerusakan()+"\t");
            Writer.write("Keausan = "+getKeausan()+"\t");
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }   
    return 0;
    }

}
