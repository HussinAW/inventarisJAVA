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
public class KRK extends super_abstrack{
Scanner input = new Scanner(System.in);
public Kenyamanan_Ruang_Kelas nyaman = new Kenyamanan_Ruang_Kelas();
public double sesuai=0.0;
public void input(){
    System.out.println("Masukkan bising atau tidak Ruang kelas : ");
    nyaman.setKebisingan(input.next());
    System.out.println("Masukkan bau atau tidak Ruang kelas :");
    nyaman.setBau(input.next());
    System.out.println("Masukkan bocor atau tidak Ruang kelas :");
    nyaman.setKebocoran(input.next());
    System.out.println("Masukkan rusak atau tidak Ruang kelas : ");
    nyaman.setKerusakan(input.next());
    System.out.println("Masukkan aus atau tidak Ruang kelas : ");
    nyaman.setKeausan(input.next());
}

   

    @Override
    public double Analisis() {
    if(nyaman.getKebisingan().equals("tidakbising")){
      sesuai++;  
    } 
    else{
        
    }



    if(nyaman.getBau().equals("tidakbau")){
     sesuai++;   
    }
    else{
        
    }
 

    if(nyaman.getKebocoran().equals("tidakbocor")){
    sesuai++;    
    }
    else{
        
    }

    

    if(nyaman.getKerusakan().equals("tidakrusak")){
    sesuai++;  
    }
    else{
        
    }


    if(nyaman.getKeausan().equals("tidakaus")){
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

}
   