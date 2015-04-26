package tbinventarisjava;
import java.util.Scanner;
public class kondisi_kelastest {
    Kondisi_kelas jay = new Kondisi_kelas();
       Scanner input = new Scanner(System.in);
    
          public void Analisis_kebersihanlantai(){
              System.out.println("masukkan kondisi lantai=");
              jay.setKondisi_lantai(input.next());
              
              if(jay.getKondisi_lantai().equals("bersih")){
         System.out.println(" => " + jay.Kondisi_lantai() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_lantai() + " Tidak sesuai\n");  
              }    
              
              }
          public void Analisis_kebersihandinding(){
              System.out.println("masukkan kondisi dinding=");
              jay.setKondisi_dinding(input.next());
              
              if(jay.getKondisi_dinding().equals("bersih")){
         System.out.println(" => " + jay.Kondisi_dinding() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_dinding() + " Tidak sesuai\n");  
              }    
          }
          public void Analisis_kebersihanatap(){
              System.out.println("masukkan kondisi atap=");
              jay.setKondisi_atap(input.next());
              
              if(jay.getKondisi_atap().equals("bersih")){
         System.out.println(" => " + jay.Kondisi_atap() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_atap() + " Tidak sesuai\n");  
              }    
          }
          public void Analisis_kebersihanpintu(){
              System.out.println("masukkan kondisi pintu=");
              jay.setKondisi_pintu(input.next());
              
              if(jay.getKondisi_pintu().equals("bersih")){
         System.out.println(" => " + jay.Kondisi_pintu() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_pintu() + " Tidak sesuai\n");  
              }
          }
              public void Analisis_kebersihanjendela(){
              System.out.println("masukkan kondisi jendela=");
              jay.setKondisi_jendela(input.next());
              
              if(jay.getKondisi_jendela().equals("bersih")){
         System.out.println(" => " + jay.Kondisi_jendela() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_jendela() + " Tidak sesuai\n");
          }
}
}