package tbinventarisjava;
import java.util.Scanner;
public class Tess_isikelas {
Isikelas baru = new Isikelas();
   Scanner input = new Scanner(System.in);
   public void analisis_kelistrikan(){
       System.out.print("Masukkan jumlah stopkontak = ");
       baru.setJumlah_stopkontak (input.nextInt());
       if(baru.getJumlah_stopkontak()>=4){
        System.out.print(" " +baru.getJumlah_stopkontak()+ " Sesuai ");
    }
    else
    {
        System.out.print(" " +baru.getJumlah_stopkontak()+ " Tidak sesuai\n ");
    }
       System.out.println(" Jumlah stopkontak dalam keadaan baik = ");
       baru.setKondisi_stopkontak(input.nextInt());
       if(baru.getKondisi_stopkontak()== 4){
    System.out.print(" " + baru.getKondisi_stopkontak()+ " sesuai");     
    }
    else{
        System.out.print(" " + baru.getKondisi_stopkontak()+ " Tidak sesuai\n"); 
    }
       
       System.out.println("+*UNTUK POSISI PILIH SALAH SATU ANTARA dekatdosen ATAU pojokruang ATAU lainnya+*");
       System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN DIATAS+*\n");
       System.out.println("Posisi stopkontak berada = ");
       baru.setPosisi_stopkontak(input.next());
    if(baru.getPosisi_stopkontak().equals("pojokruang")){
    System.out.print(" : " + baru.getPosisi_stopkontak() + " Sesuai\n");    
    }
    else if(baru.getPosisi_stopkontak().equals("dekatdosen")){
    System.out.print(" :  " + baru.getPosisi_stopkontak() + " Sesuai\n");     
    }
    else{
     System.out.print(" : " +baru.getPosisi_stopkontak() + " Tidak sesuai\n");    
    }
   
   System.out.println("=================================================================================================\n");
    
   }
  public void analisis_LCD(){
      System.out.println("Masukkan jumlah kabel LCD = ");
      baru.setJumlah_kabel_LCD(input.nextInt());
      if (baru.getJumlah_kabel_LCD()>=1){
     System.out.print(" => " + baru.getJumlah_kabel_LCD() + " Sesuai");   
    }
    else{
    System.out.print(" => " + baru.getJumlah_kabel_LCD() + " Tidak sesuai\n");    
    }
      System.out.println("+*KONDISI KABEL LCD PILIH berfungsi ATAU lainnya*+");
      System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n");
      System.out.println("Kondisi kabel LCD = ");
      baru.setKondisi_kabel_LCD(input.next());
    if(baru.getKondisi_kabel_LCD().equals("berfungsi")){
    System.out.print(" => " + baru.getKondisi_kabel_LCD()+ " Sesuai");    
    }
    else{
    System.out.print(" => " + baru.getKondisi_kabel_LCD()+ " Tidak sesuai\n\n");    
    }
     System.out.println("+*POSISI KABEL LCD PILIH dekatdosen ATAU lainnya*+");
      System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n");
      System.out.println("Masukkan posisi kabel LCD = ");
      baru.setPosisi_kabel_LCD(input.next());
      if(baru.getPosisi_kabel_LCD().equals("dekatdosen")){
    System.out.print(" => " + baru.getPosisi_kabel_LCD()+" Sesuai ");    
    }
    else{
        System.out.println(" => " + baru.getPosisi_kabel_LCD()+" Tidak sesuai ");
    }
   System.out.println("=================================================================================================\n");
  }     
  public void analisis_lampu(){
      System.out.println("Masukkan jumlah lampu = ");
      baru.setJumlah_lampu(input.nextInt());
      if(baru.getJumlah_lampu()>=18){
      System.out.print(" => " + baru.getJumlah_lampu() +" Sesuai ");   
    }
      //
    else{
     System.out.print(" => " + baru.getJumlah_lampu() +" Tidak sesuai ");     
    }
      System.out.println("Masukkan kondisi lampu = ");
      baru.setKondisi_lampu(input.nextInt());
    if(baru.getKondisi_lampu()==18){
     System.out.print(" => " + baru.getKondisi_lampu()+" Sesuai ");   
    } 
    else{
     System.out.print(" => " + baru.getKondisi_lampu()+" Tidak sesuai \n\n");    
    }
    System.out.println("+*TULIS POSISI LAMPU ANTARA DI atapruangan ATAU lainnya*+");
      System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n");
    System.out.println("Masukkan posisi lampu = ");
      baru.setPosisi_lampu(input.next());
      if(baru.getPosisi_lampu().equals("atapruangan")){
    System.out.print(" => " + baru.getPosisi_lampu()+ "Sesuai"); 
    }
    else{
    System.out.print(" => " + baru.getPosisi_lampu()+ "tidak sesuai");     
    }
   System.out.println("=================================================================================================\n");
  }
  public void analisis_kipas_angin(){
      System.out.println("Masukkan jumlah kipas angin = ");
      baru.setJumlah_kipasangin(input.nextInt());
      if(baru.getJumlah_kipasangin()>=2){
     System.out.print(" => " + baru.getJumlah_kipasangin()+"Sesuai");   
    }
    else{
     System.out.print(" => " + baru.getJumlah_kipasangin()+"Tidak sesuai");    
    }
       System.out.println("Masukkan kondisi kipas angin = ");
      baru.setKondisi_kipasangin(input.nextInt());
      if(baru.getKondisi_kipasangin()==2){
    System.out.print(" => " + baru.getKondisi_kipasangin()+"Sesuai");    
    }
    else{
    System.out.print(" => " + baru.getKondisi_kipasangin()+"Tidak sesuai\n\n");   
    }
     System.out.println("+*TULIS POSISI KIPAS ANGIN ANTARA DI atapruangan ATAU lainnya*+");
      System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n"); 
      System.out.println("Masukkan posisi kipas angin = ");
      baru.setPosisi_kipasangin(input.next());
      if(baru.getPosisi_kipasangin().equals("atapruangan")){
     System.out.print(" => " + baru.getPosisi_kipasangin()+"Sesuai");   
    }
    else{
        System.out.println(" => " + baru.getPosisi_kipasangin()+"Tidak sesuai");
    }
   System.out.println("=================================================================================================\n");  
  }
  public void analisis_AC(){
      System.out.println("Masukkan jumlah Ac = ");
      baru.setJumlah_Ac(input.nextInt());
      if(baru.getJumlah_Ac()>=1){
     System.out.print(" => " + baru.getJumlah_Ac()+"Sesuai");    
    }
    else{
    System.out.println(" => " + baru.getJumlah_Ac()+"Tidak sesuai\n");     
    }
      System.out.println("+*TULIS KONDISI AC ANTARA baik  ATAU buruk*+");
      System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n"); 
      System.out.println("Masukkan kondisi Ac = ");
      baru.setPosisi_Ac(input.next());
      if(baru.getKondisi_Ac().equals("baik")){
      System.out.print( " => " + baru.getKondisi_Ac()+"Sesuai");   
    }
    else{
        System.out.print(" => " + baru.getKondisi_Ac()+"Tidak sesuai");
    }
     System.out.println("+*TULIS POSISI ANTARA didepan  ATAU disamping ATAU lainnya *+");
      System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n");   
      System.out.println("Masukkan posisi Ac = ");
      baru.setPosisi_Ac(input.next());
      if(baru.getPosisi_Ac().equals("didepan")){
    System.out.print(" => " + baru.getPosisi_Ac()+"Sesuai");
    }
    else if(baru.getPosisi_Ac().equals("disamping")){
    System.out.print(" => " + baru.getPosisi_Ac()+"Sesuai");
    }
    else{
    System.out.print(" => " + baru.getPosisi_Ac()+"Tidak sesuai");
    }
  System.out.println("=================================================================================================\n");    
  }
 public void analisis_internet(){
     System.out.println("Masukkan SSID = ");
     baru.setSSID(input.next());
     if(baru.getSSID().equals("UMM HOTSPOT")){
    System.out.println("SSID = " +baru.getSSID() +"Sesuai"+baru.getBandwith());   
    }
    else{
    System.out.println("SSID = " + baru.getSSID() +"tidak sesuai"+baru.getBandwith());       
    }
    System.out.println("=================================================================================================\n");
 }
//public void analisis_Bandwith(){
    //System.out.println("Bandwith = ");
    //baru.setBandwith(input.nextInt());
//}
public void analisis_CCTV(){
System.out.println("Masukkan jumlah CCTV =  ");
baru.setJumlah_CCTV(input.nextInt());
if(baru.getJumlah_CCTV()==2){
    System.out.print(" => " + baru.getJumlah_CCTV()+"Sesuai");    
    }
    else{
        System.out.print(" => " + baru.getJumlah_CCTV()+"Tidak sesuai");
    }
System.out.println("Jumlah CCTV dalam keadaan baik = ");
baru.setKondisi_CCTV(input.nextInt());
if(baru.getKondisi_CCTV()==2){
     System.out.print(" => " + baru.getKondisi_CCTV()+"sesuai");   
    }
    else{
    System.out.print(" => " + baru.getKondisi_CCTV() + "Tidak sesuai");
    }
 System.out.println("+*TULIS POSISI CCTV ANTARA didepan  ATAU dibelakang ATAU lainnya *+");
 System.out.println("+*PENULISAN HARUS SESUAI DENGAN PILIHAN*+\n");   
System.out.println("Masukkan posisi CCTV = ");
baru.setPosisi_CCTV(input.next());
if(baru.getPosisi_CCTV().equals("didepan")){
    System.out.println("Posisi CCTV = " + baru.getPosisi_CCTV()+"Sesuai");   
    }
    else if(baru.getPosisi_CCTV().equals("dibelakang")){
    System.out.println("Posisi CCTV = " + baru.getPosisi_CCTV()+"Sesuai");    
    }
    else{
    System.out.println("Posisi CCTV = " + baru.getPosisi_CCTV()+"Tidak sesuai");
    }
}    
}
