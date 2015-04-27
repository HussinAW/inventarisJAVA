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
              public void Analisis_sirkulasiudara(){
              System.out.println("masukkan kondisi sirkuasi(lancar/tidak)=");
              jay.setKondisi_sirkulasi(input.next());
              
              if(jay.getKondisi_sirkulasi().equals("lancar")){
         System.out.println(" => " + jay.Kondisi_sirkulasi() + " Sesuai");   
            }
              else{
            System.out.println(" => " + jay.getKondisi_sirkulasi() + " Tidak sesuai\n");
          }
}
              public void Analisis_pencahayaan(){
              System.out.println("masukkan kondisi cahaya=");
              jay.setKondisi_pencahayaan(input.next());
              
              if(jay.getKondisi_pencahayaan()>=250 && jay.getKondisi_pencahayaan()<=350 ){
         System.out.println(" => " + jay.Kondisi_jendela() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_jendela() + " Tidak sesuai\n");
          }
              }
              public void Analisis_kelembapan(){
              System.out.println("masukkan kondisi kelembapan=");
              jay.setKondisi_kelembapan(input.nextInt());
             
              if(jay.getKondisi_kelembapan()>=70 && jay.getKondisi_kelembapan<=80){
         System.out.println(" => " + jay.Kondisi_kelembapan() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kelembapan() + " Tidak sesuai\n");
          }
}
              public void Analisis_suhu(){
              System.out.println("masukkan kondisi suhu=");
              jay.setKondisi_suhu(input.nextInt());
              
              if(jay.getKondisi_suhu().equals("bersih")){
         System.out.println(" => " + jay.Kondisi_suhu() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_suhu() + " Tidak sesuai\n");
          }
}
              public void Analisis_kebisingan(){
              System.out.println("masukkan kondisi kebisingan=");
              jay.setKondisi_kebisingan(input.next());
              
              if(jay.getKondisi_kebisingan().equals("tiak bising")){
         System.out.println(" => " + jay.Kondisi_kebisingan() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kebisingan() + " Tidak sesuai\n");
          }
}
              public void Analisis_bau(){
              System.out.println("masukkan kondisi bau=");
              jay.setKondisi_bau(input.next());
              
              if(jay.getKondisi_bau().equals("tidak bau")){
         System.out.println(" => " + jay.Kondisi_bau() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_bau() + " Tidak sesuai\n");
          }
}
              public void Analisis_kebocoran(){
              System.out.println("masukkan kondisi kebocoran=");
              jay.setKondisi_kebocoran(input.next());
              
              if(jay.getKondisi_kebocoran().equals("tidak bocor")){
         System.out.println(" => " + jay.Kondisi_kebocoran() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kebocoran() + " Tidak sesuai\n");
          }
}
              public void Analisis_kerusakan(){
              System.out.println("masukkan kondisi kerusakan=");
              jay.setKondisi_kerusakan(input.next());
              
              if(jay.getKondisi_kerusakan().equals("tidak rusak")){
         System.out.println(" => " + jay.Kondisi_kerusakan() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kerusakan() + " Tidak sesuai\n");
          }
}
              public void Analisis_aus(){
              System.out.println("masukkan kondisi keausan=");
              jay.setKondisi_keausan(input.next());
              
              if(jay.getKondisi_keausan().equals("aus")){
         System.out.println(" => " + jay.Kondisi_keausan() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_keausan() + " Tidak sesuai\n");
          }
}
              public void Analisis_kekokohan(){
              System.out.println("masukkan kondisi kekokohan=");
              jay.setKondisi_kekokohan(input.next());
              
              if(jay.getKondisi_kekokohan().equals("kokoh")){
         System.out.println(" => " + jay.Kondisi_kekokohan() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kekokohan() + " Tidak sesuai\n");
          }
}
              public void Analisis_kuncipintu(){
              System.out.println("masukkan kondisi kunci pintu(ada/tidak)=");
              jay.setKondisi_kuncipintu(input.next());
              
              if(jay.getKondisi_kuncipintu().equals("ada")){
         System.out.println(" => " + jay.Kondisi_kuncipintu() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kuncipintu() + " Tidak sesuai\n");
          }
}
              public void Analisis_kuncijendela(){
              System.out.println("masukkan kondisi jendela(ada/tidak)=");
              jay.setKondisi_kuncijendela(input.next());
              
              if(jay.getKondisi_kuncijendela().equals("ada")){
         System.out.println(" => " + jay.Kondisi_jendela() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_kuncijendela() + " Tidak sesuai\n");
          }
}
              public void Analisis_bahaya(){
              System.out.println("masukkan kondisi bahaya(aman/tidak)=");
              jay.setKondisi_bahaya(input.next());
              
              if(jay.getKondisi_bahaaya().equals("aman")){
         System.out.println(" => " + jay.Kondisi_bahaya() + " Sesuai");   
            }
            else{
            System.out.println(" => " + jay.getKondisi_bahaya() + " Tidak sesuai\n");
          }
}
}

