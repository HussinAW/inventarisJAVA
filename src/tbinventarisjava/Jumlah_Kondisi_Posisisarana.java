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
public class Jumlah_Kondisi_Posisisarana extends super_abstrack{
private int jumlah_steker;
private int kondisi_steker;
private String posisi_steker;
private int jumlah_lcd;
private int kondisi_lcd;
private String posisi_lcd;
private int jumlah_lampu;
private int kondisi_lampu;
private String posisi_lampu;
private int jumlah_kipasangin;
private int kondisi_kipasangin;
private String posisi_kipasangin;
private int jumlah_ac;
private int kondisi_ac;
private String posisi_ac;
private String SSID;
private int bandwith;
private int jumlah_cctv;
private int kondisi_cctv;
private String posisi_cctv;
public double sesuai=0.0;


    private Object input;

    public int getKondisi_ac() {
        return kondisi_ac;
    }

    public void setKondisi_ac(int kondisi_ac) {
        this.kondisi_ac = kondisi_ac;
    }

    
public int getKondisi_lcd() {
        return kondisi_lcd;
    }

    public void setKondisi_lcd(int kondisi_lcd) {
        this.kondisi_lcd = kondisi_lcd;
    }

    public String getPosisi_cctv() {
        return posisi_cctv;
    }

    public void setPosisi_cctv(String posisi_cctv) {
        this.posisi_cctv = posisi_cctv;
    }

    public int getJumlah_lcd() {
        return jumlah_lcd;
    }

    public void setJumlah_lcd(int jumlah_lcd) {
        this.jumlah_lcd = jumlah_lcd;
    }

    public int getJumlah_steker() {
        return jumlah_steker;
    }

    public void setJumlah_steker(int jumlah_steker) {
        this.jumlah_steker = jumlah_steker;
    }

    public int getKondisi_steker() {
        return kondisi_steker;
    }

    public void setKondisi_steker(int kondisi_steker) {
        this.kondisi_steker = kondisi_steker;
    }

    public String getPosisi_steker() {
        return posisi_steker;
    }

    public void setPosisi_steker(String posisi_steker) {
        this.posisi_steker = posisi_steker;
    }

    public String getPosisi_lcd() {
        return posisi_lcd;
    }

    public void setPosisi_lcd(String posisi_lcd) {
        this.posisi_lcd = posisi_lcd;
    }

    public int getJumlah_lampu() {
        return jumlah_lampu;
    }

    public void setJumlah_lampu(int jumlah_lampu) {
        this.jumlah_lampu = jumlah_lampu;
    }

    public int getKondisi_lampu() {
        return kondisi_lampu;
    }

    public void setKondisi_lampu(int kondisi_lampu) {
        this.kondisi_lampu = kondisi_lampu;
    }

    public String getPosisi_lampu() {
        return posisi_lampu;
    }

    public void setPosisi_lampu(String posisi_lampu) {
        this.posisi_lampu = posisi_lampu;
    }

    public int getJumlah_kipasangin() {
        return jumlah_kipasangin;
    }

    public void setJumlah_kipasangin(int jumlah_kipasangin) {
        this.jumlah_kipasangin = jumlah_kipasangin;
    }

    public int getKondisi_kipasangin() {
        return kondisi_kipasangin;
    }

    public void setKondisi_kipasangin(int kondisi_kipasangin) {
        this.kondisi_kipasangin = kondisi_kipasangin;
    }

    public String getPosisi_kipasangin() {
        return posisi_kipasangin;
    }

    public void setPosisi_kipasangin(String posisi_kipasangin) {
        this.posisi_kipasangin = posisi_kipasangin;
    }

    public int getJumlah_ac() {
        return jumlah_ac;
    }

    public void setJumlah_ac(int jumlah_ac) {
        this.jumlah_ac = jumlah_ac;
    }

    public String getPosisi_ac() {
        return posisi_ac;
    }

    public void setPosisi_ac(String posisi_ac) {
        this.posisi_ac = posisi_ac;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwith() {
        return bandwith;
    }

    public void setBandwith(int bandwith) {
        this.bandwith = bandwith;
    }

    public int getJumlah_cctv() {
        return jumlah_cctv;
    }

    public void setJumlah_cctv(int jumlah_cctv) {
        this.jumlah_cctv = jumlah_cctv;
    }

    public int getKondisi_cctv() {
        return kondisi_cctv;
    }

    public void setKondisi_cctv(int kondisi_cctv) {
        this.kondisi_cctv = kondisi_cctv;
    }

    public double Analisis(int jumlah_max,int jumlah, int kondisi,double sesuai, String posisi) {
        this.sesuai = sesuai;  
        if(jumlah>=jumlah_max){
            this.sesuai++; 
    }
        else{
            
        }
        if(kondisi>=4){
            this.sesuai++;
        }
        else{
            
        }
    if(posisi.equals("dekat_dosen")|| posisi.equals("pojok")){
        this.sesuai++;
    }
    else{
        
    }
     System.out.println("========================================================================/n");

    return this.sesuai;
    }

    
    public double Analisis(int jumlah_max,int jumlah, String kondisi, String posisi, double sesuai) {
      // averloading method sama parameter beda
        this.sesuai = sesuai;
     if(jumlah_max>=jumlah){
        this.sesuai++;
     }
     else{
         
     }
     if(kondisi.equals("berfungsi")){
         this.sesuai++;
     }
     else if(kondisi.equals("baik")){
        this.sesuai++;  
     }
    
     else{
         
     }
     if(posisi.equals("dekatdosen")){
         this.sesuai++;
     }
     else if(posisi.equals("atap")){
         this.sesuai++;    
     }
     else if(posisi.equals("belakang")){
         this.sesuai++;
     }
     else if(posisi.equals("samping")){
         this.sesuai++;
     }
     else if(posisi.equals("depan")){
         this.sesuai++;
     }
     else{
         
     }
     return this.sesuai;
    }  

    @Override
    public double Analisis() {
         Analisis(4,getJumlah_steker(),getKondisi_steker(),0.0,getPosisi_steker());    
        Analisis(1,getJumlah_lcd(),getKondisi_lcd(),0.0,getPosisi_lcd());
   Analisis(18,getJumlah_lampu(),getKondisi_lampu(), 0.0, getPosisi_lampu());
    Analisis(2,getJumlah_kipasangin(),getKondisi_kipasangin(), 0.0, getPosisi_kipasangin());
   Analisis(1,getJumlah_ac(),getKondisi_ac(),0.0, getPosisi_ac());
    Analisis(2,getJumlah_cctv(),getKondisi_cctv(),0.0,getPosisi_cctv());
    return 0;
    }

    @Override
    public double tampil() {
          System.out.println("Jumlah steker: "+ getJumlah_steker());
        System.out.println("Jumlah kondisi baik Steker : "+ getKondisi_steker());
        System.out.println("Posisi steker berada : "+ getPosisi_steker());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah kabel LCD : "+ getJumlah_lcd());
        System.out.println("Kondisi kabel LCD : "+getKondisi_lcd());
        System.out.println("Posisi kabel LCD berada : "+getPosisi_lcd());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah lampu : "+getJumlah_lampu());
        System.out.println("Jumlah kondisi baik lampu : "+getKondisi_lampu());
        System.out.println("Posisi lampu berada :  "+ getPosisi_lampu());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah kipas angin : "+getJumlah_kipasangin());
        System.out.println("jumlah kipas angin yang masih berfungsi: "+ getKondisi_kipasangin());
        System.out.println("Posisi kipas angin berada : "+ getPosisi_kipasangin());
        System.out.println("========================================================================/n");
        System.out.println("Masukkan jumlah AC : "+getJumlah_ac());
        System.out.println("kondisi AC : "+ getKondisi_ac());
        System.out.println("Posisi Ac berada:"+getPosisi_ac());
        System.out.println("========================================================================/n");
        System.out.println("Masukkan SSID:"+getSSID());
        System.out.println("Masukkan bandwith: "+getBandwith());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah CCTV : "+ getJumlah_cctv());
        System.out.println("Jumlah kondisi baik CCTV : "+ getKondisi_cctv());
        System.out.println("Posisi CCTV berada: "+getPosisi_cctv());
        System.out.println("========================================================================/n");

    return 0;
    }

    @Override
    public void database() {
               try{
            FileWriter  Writer = new FileWriter ("jumlah_kondisi_posisiprasarana.txt");
            Writer.write("jumlah steker = "+getJumlah_steker()+"\t");
            Writer.write("kondisi steker = "+getKondisi_steker()+"\t");
            Writer.write("posisi steker = "+getPosisi_steker()+"\t");
            Writer.write("jumlah LCD = "+getJumlah_lcd()+"\t");
            Writer.write("kondisi LCD = "+getKondisi_lcd()+"\t");
            Writer.write("posisi LCD = "+getPosisi_lcd()+"\t");
            Writer.write("jumlah lampu  = "+ getJumlah_lampu()+"\t");
             Writer.write("kondisi lampu = "+ getKondisi_lampu()+"\t");
              Writer.write("posisi lampu = "+ getPosisi_lampu()+"\t");
             Writer.write("jumlah kipas angin = "+ getJumlah_kipasangin()+"\t");
              Writer.write("kondisi kipas angin = "+ getKondisi_kipasangin()+"\t");
             Writer.write("posisi kipas angin = "+ getPosisi_kipasangin()+"\t");
              Writer.write("jumlah AC= "+ getJumlah_ac()+"\t");
               Writer.write("kondisi AC = "+ getKondisi_ac()+"\t");
                Writer.write("posisi AC = "+ getPosisi_ac()+"\t");
                 Writer.write(" SSID= "+ getSSID()+"\t");
                  Writer.write("bandwith = "+ getBandwith()+"\t");
                   Writer.write("jumlah CCTV = "+ getJumlah_cctv()+"\t");
                    Writer.write("kondisi CCTV = "+ getKondisi_cctv()+"\t");
                     Writer.write("posisi CCTV = "+ getPosisi_cctv()+"\t");
                     Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }
    
    }

   
    

    
}
