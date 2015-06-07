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
 * @author Toshiba
 */
public class keamanan_ruang_kelas extends super_abstrack {
    private String kekokohan;
    private String kunci;
    private String keamanan;
    private double sesuai=0.0;

    /**
     * @return the kekokohan
     */
    public String getKekokohan() {
        return kekokohan;
    }

    /**
     * @param kekokohan the kekokohan to set
     */
    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
    }

    /**
     * @return the kunci
     */
    public String getKunci() {
        return kunci;
    }

    /**
     * @param kunci the kunci to set
     */
    public void setKunci(String kunci) {
        this.kunci = kunci;
    }

    /**
     * @return the keamanan
     */
    public String getKeamanan() {
        return keamanan;
    }

    /**
     * @param keamanan the keamanan to set
     */
    public void setKeamanan(String keamanan) {
        this.keamanan = keamanan;
    }

    /**
     * @return the sesuai
     */
    public double getSesuai() {
        return sesuai;
    }

    /**
     * @param sesuai the sesuai to set
     */
    public void setSesuai(double sesuai) {
        this.sesuai = sesuai;
    }

    @Override
    public double Analisis() {
        if(getKekokohan().equals("kokoh")){
         sesuai++;
     }
     else{
         
     }   
      
         if(getKunci().equals("ada")){
         sesuai++;
     }
     else{
         
     }
             if(getKeamanan().equals("aman")){
         sesuai++;
     }
     else{
         
     }
    return sesuai;
    }

    @Override
    public double tampil() {
    System.out.println("kondisi kekokohan : "+ getKekokohan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi keamanan: "+ getKeamanan());
        
        System.out.println("========================================================================/n");
        System.out.println("kondisi kunci : "+getKunci());
        
        System.out.println("========================================================================/n");
        return sesuai;   
    }

    @Override
    public void database() {
         try{
            FileWriter  Writer = new FileWriter ("Keamanan_ruang_kelas.txt");
            Writer.write("Kekokohan = "+getKekokohan()+"\t");
            Writer.write("Kunci = "+getKunci()+"\t");
            Writer.write("Keamanan = "+getKeamanan()+"\t");
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }
    }
    
    
}
