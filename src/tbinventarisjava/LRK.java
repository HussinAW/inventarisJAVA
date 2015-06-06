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
 * @author Toshiba
 */
  public class LRK extends super_abstrack{
Scanner input = new Scanner (System.in);
public Lingkungan_Ruang_Kelas kebersihan = new Lingkungan_Ruang_Kelas();
public double sesuai=0.0;






    public double input() {
           System.out.println("Masukkan kondisi lantai: ");
    kebersihan.setKondisi_lantai(input.next());
    System.out.println("========================================================================/n");
    
     System.out.println("Masukkan kondisi dinding: ");
    kebersihan.setKondisi_dinding(input.next());
    System.out.println("========================================================================/n");
    
     System.out.println("Masukkan kondisi atap: ");
    kebersihan.setKondisi_atap(input.next());
    System.out.println("========================================================================/n");
    
     System.out.println("Masukkan kondisi pintu: ");
    kebersihan.setKondisi_pintu(input.next());
    System.out.println("========================================================================/n");
    
     System.out.println("Masukkan kondisi jendela: ");
    kebersihan.setKondisi_jendela(input.next());
    System.out.println("========================================================================/n");
    return 0;


    }
    @Override
    public double Analisis() {
         if(kebersihan.getKondisi_lantai().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
         
    
     if(kebersihan.getKondisi_lantai().equals("bersih")){
        sesuai++;
     }
     else{
         
     }
     
     if(kebersihan.getKondisi_lantai().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
     
     if(kebersihan.getKondisi_pintu().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
    
     if(kebersihan.getKondisi_jendela().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
    return sesuai;
 

     }

    /**
     *
     */
    @Override
    public double simpan(){
        try{
            FileWriter  Writer = new FileWriter ("Lingkungan Ruang Kelas.txt");
            Writer.write("Kondisi lantai = "+kebersihan.getKondisi_lantai()+"\t");
            Writer.write("Kondisi dinding = "+kebersihan.getKondisi_dinding()+"\t");
            Writer.write("Kondisi atap = "+kebersihan.getKondisi_atap()+"\t");
            Writer.write("Kondisi pintu = "+kebersihan.getKondisi_pintu()+"\t");
            Writer.write("Kondisi jendela = "+kebersihan.getKondisi_jendela()+"\t");
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }
    return 0;
    }

    @Override
    public double tampil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

  }

     
     