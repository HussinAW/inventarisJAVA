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
  public class LRK extends induk_LRK {
Scanner input = new Scanner (System.in);
public Lingkungan_Ruang_Kelas kebersihan = new Lingkungan_Ruang_Kelas();
public double lantai_sesuai=0.0;
public double dinding_sesuai = 0.0; 
public double atap_sesuai = 0.0;
public double pintu_sesuai= 0.0;
public double jendela_sesuai = 0.0;

public void input(){
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
}

@Override
public double Analisiskebersihanlantai(){
     
     if(kebersihan.getKondisi_lantai().equals("bersih")){
         lantai_sesuai++;
     }
     else{
         
     }
     return lantai_sesuai;
}
@Override
public double Analisiskebersihandinding(){
     
     if(kebersihan.getKondisi_lantai().equals("bersih")){
         lantai_sesuai++;
     }
     else{
         
     }
     return dinding_sesuai;
}
@Override
public double Analisiskebersihanatap(){
     
     if(kebersihan.getKondisi_lantai().equals("bersih")){
         lantai_sesuai++;
     }
     else{
         
     }
     return atap_sesuai;
}
@Override
public double Analisiskebersihanpintu(){
     
     if(kebersihan.getKondisi_pintu().equals("bersih")){
         lantai_sesuai++;
     }
     else{
         
     }
     return pintu_sesuai;
}
public double Analisiskebersihanjendela(){
     
     if(kebersihan.getKondisi_jendela().equals("bersih")){
         lantai_sesuai++;
     }
     else{
         
     }
     return jendela_sesuai;
}
  }