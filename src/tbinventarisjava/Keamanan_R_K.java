/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
  public class Keamanan_R_K extends super_abstrack{
Scanner input = new Scanner (System.in);
public keamanan_ruang_kelas keamanan = new keamanan_ruang_kelas();
public double sesuai=0.0; 



    @Override
     public double Analisis() {
         if(keamanan.getKekokohan().equals("kokoh")){
         sesuai++;
     }
     else{
         
     }   
      
         if(keamanan.getKunci().equals("ada")){
         sesuai++;
     }
     else{
         
     }
             if(keamanan.getKeamanan().equals("aman")){
         sesuai++;
     }
     else{
         
     }
    return sesuai;
    }

    @Override
    public double tampil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double input() {
       
    System.out.println("Masukkan kondisi kekokohan: ");
    keamanan.setKekokohan(input.next());
    System.out.println("========================================================================/n");
    
     System.out.println("Masukkan kondisi kunci pintu dan jendela: ");
    keamanan.setKunci(input.next());
    System.out.println("========================================================================/n");
    
     System.out.println("Masukkan kondisi keamanan: ");
    keamanan.setKeamanan(input.next());
    System.out.println("========================================================================/n");
}
}
