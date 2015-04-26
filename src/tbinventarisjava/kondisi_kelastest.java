package tbinventarisjava;
import java.util.Scanner;
public class kondisi_kelastest {
    Kondisi_kelas jay = new Kondisi_kelas();
       Scanner input = new Scanner(System.in);
    
          public void Analisis_kebersihan(){
              System.out.print("masukkan kondisi lantai=");
              jay.setKondisi_lantai(input.next());
              
              if(jay.getKondisi_lantai().equals("bersih")){
         System.out.print(" => " + jay.Kondisi_lantai() + " Sesuai");   
            }
            else{
            System.out.print(" => " + jay.getKondisi_lantai() + " Tidak sesuai\n");  
              }         
          }
}