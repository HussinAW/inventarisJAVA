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
public double kebisingan_tidakbising = 0.0;
public double bau_tidakbau= 0.0;
public double bocor_tidakbocor = 0.0;
public double rusak_tidakrusak = 0.0;
public double aus_tidakaus = 0.0;
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
        public double Analisiskebisingan() {
    if(nyaman.getKebisingan().equals("tidakbising")){
      kebisingan_tidakbising++;  
    } 
    else{
        
    }
    return kebisingan_tidakbising;
    }
@Override
public double Analisisbau(){
    if(nyaman.getBau().equals("tidakbau")){
     bau_tidakbau++;   
    }
    else{
        
    }
    return bau_tidakbau;
}
@Override
public double Analisiskebocoran(){
    if(nyaman.getKebocoran().equals("tidakbocor")){
    bocor_tidakbocor++;    
    }
    else{
        
    }
    return bocor_tidakbocor;
    
}
@Override
public double Analisiskerusakan(){
    if(nyaman.getKerusakan().equals("tidakrusak")){
    rusak_tidakrusak++;  
    }
    else{
        
    }
    return rusak_tidakrusak;
}
@Override
public double Analisiskeausan(){
    if(nyaman.getKeausan().equals("tidakaus")){
        aus_tidakaus++;
    }
    else{
        
    }
    return aus_tidakaus;
}
    @Override
    public void tampil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
   