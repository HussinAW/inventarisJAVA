
package tbinventarisjava;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author nurmasari
 */
public class JKPS extends super_abstrack {
Scanner input = new Scanner (System.in);
public Jumlah_Kondisi_Posisisarana elektronik = new Jumlah_Kondisi_Posisisarana();
public double steker_sesuai=0.0;
public double lcd_sesuai = 0.0; 
public double lampu_sesuai = 0.0;
public double kipasangin_sesuai= 0.0;
public double AC_sesuai = 0.0;
public double internet_sesuai = 0.0;
public double cctv_sesuai = 0.0;


    


@Override
    public double Analisis(){
    elektronik.Analisis(4,elektronik.getJumlah_steker(), elektronik.getKondisi_steker(),0.0, elektronik.getPosisi_steker());    
    elektronik.Analisis(1,elektronik.getJumlah_lcd(), elektronik.getKondisi_lcd(), elektronik.getPosisi_lcd(),0.0);
    elektronik.Analisis(18,elektronik.getJumlah_lampu(), elektronik.getKondisi_lampu(), 0.0, elektronik.getPosisi_lampu());
    elektronik.Analisis(2,elektronik.getJumlah_kipasangin(),elektronik.getKondisi_kipasangin(), 0.0, elektronik.getPosisi_kipasangin());
    elektronik.Analisis(1,elektronik.getJumlah_ac(), elektronik.getKondisi_ac(), elektronik.getPosisi_ac(),0.0);
    elektronik.Analisis(2,elektronik.getJumlah_cctv(),elektronik.getKondisi_cctv(),0.0,elektronik.getPosisi_cctv());
    return 0;
    }
    public double AnalisisInternet() {
        if(elektronik.getSSID().equals("UMMHOTSPOT")){
            internet_sesuai++;
        }
        else{
            
        }
        if(elektronik.getBandwith()==1){
            internet_sesuai++;
        }
        else{
            
        }
        System.out.println("========================================================================/n");
        return internet_sesuai++;
    }
    public void simpan(){
        try{
            FileWriter  Writer = new FileWriter ("jumlah_kondisi_posisiprasarana.txt");
            Writer.write("jumlah steker = "+elektronik.getJumlah_steker()+"\t");
            Writer.write("kondisi steker = "+elektronik.getKondisi_steker()+"\t");
            Writer.write("posisi steker = "+elektronik.getPosisi_steker()+"\t");
            Writer.write("jumlah LCD = "+elektronik.getJumlah_lcd()+"\t");
            Writer.write("kondisi LCD = "+elektronik.getKondisi_lcd()+"\t");
            Writer.write("posisi LCD = "+elektronik.getPosisi_lcd()+"\t");
            Writer.write("jumlah lampu  = "+elektronik.getJumlah_lampu()+"\t");
             Writer.write("kondisi lampu = "+elektronik.getKondisi_lampu()+"\t");
              Writer.write("posisi lampu = "+elektronik.getPosisi_lampu()+"\t");
             Writer.write("jumlah kipas angin = "+elektronik.getJumlah_kipasangin()+"\t");
              Writer.write("kondisi kipas angin = "+elektronik.getKondisi_kipasangin()+"\t");
             Writer.write("posisi kipas angin = "+elektronik.getPosisi_kipasangin()+"\t");
              Writer.write("jumlah AC= "+elektronik.getJumlah_ac()+"\t");
               Writer.write("kondisi AC = "+elektronik.getKondisi_ac()+"\t");
                Writer.write("posisi AC = "+elektronik.getPosisi_ac()+"\t");
                 Writer.write(" SSID= "+elektronik.getSSID()+"\t");
                  Writer.write("bandwith = "+elektronik.getBandwith()+"\t");
                   Writer.write("jumlah CCTV = "+elektronik.getJumlah_cctv()+"\t");
                    Writer.write("kondisi CCTV = "+elektronik.getKondisi_cctv()+"\t");
                     Writer.write("posisi CCTV = "+elektronik.getPosisi_cctv()+"\t");
        }
        catch(IOException ex){
            ex.printStackTrace();

        }
    }
    @Override
    public double tampil() {
        System.out.println("Jumlah steker: "+ elektronik.getJumlah_steker());
        System.out.println("Jumlah kondisi baik Steker : "+ elektronik.getKondisi_steker());
        System.out.println("Posisi steker berada : "+ elektronik.getPosisi_steker());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah kabel LCD : "+ elektronik.getJumlah_lcd());
        System.out.println("Kondisi kabel LCD : "+ elektronik.getKondisi_lcd());
        System.out.println("Posisi kabel LCD berada : "+elektronik.getPosisi_lcd());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah lampu : "+elektronik.getJumlah_lampu());
        System.out.println("Jumlah kondisi baik lampu : "+elektronik.getKondisi_lampu());
        System.out.println("Posisi lampu berada :  "+ elektronik.getPosisi_lampu());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah kipas angin : "+elektronik.getJumlah_kipasangin());
        System.out.println("jumlah kipas angin yang masih berfungsi: "+ elektronik.getKondisi_kipasangin());
        System.out.println("Posisi kipas angin berada : "+ elektronik.getPosisi_kipasangin());
        System.out.println("========================================================================/n");
        System.out.println("Masukkan jumlah AC : "+elektronik.getJumlah_ac());
        System.out.println("kondisi AC : "+ elektronik.getKondisi_ac());
        System.out.println("Posisi Ac berada:"+elektronik.getPosisi_ac());
        System.out.println("========================================================================/n");
        System.out.println("Masukkan SSID:"+elektronik.getSSID());
        System.out.println("Masukkan bandwith: "+elektronik.getBandwith());
        System.out.println("========================================================================/n");
        System.out.println("Jumlah CCTV : "+ elektronik.getJumlah_cctv());
        System.out.println("Jumlah kondisi baik CCTV : "+ elektronik.getKondisi_cctv());
        System.out.println("Posisi CCTV berada: "+elektronik.getPosisi_cctv());
        System.out.println("========================================================================/n");

    return 0;
    }

    @Override
    public double input() {
           System.out.println("Masukkan jumlah steker: ");
    elektronik.setJumlah_steker(input.nextInt());
    System.out.println("Masukkan jumlah kondisi baik steker: ");
    elektronik.setKondisi_steker(input.nextInt());
    System.out.println("Masukkan posisi steker: ");
    elektronik.setPosisi_steker(input.next());
    System.out.println("========================================================================/n");
    
    System.out.println("Masukkan jumlah kabel LCD: ");
    elektronik.setJumlah_lcd(input.nextInt());
    System.out.println("Masukkan jumlah kondisi baik kabel LCD: ");
    elektronik.setKondisi_lcd(input.next());
    System.out.println("Masukkan posisi kabel LCD: ");
    elektronik.setPosisi_lcd(input.next());
    System.out.println("========================================================================/n");
    
    System.out.println("Masukkan jumlah lampu: ");
    elektronik.setJumlah_lampu(input.nextInt());
    System.out.println("Masukkan jumlah kondisi baik lampu: ");
    elektronik.setKondisi_lampu(input.nextInt());
    System.out.println("Masukkan posisi lampu: ");
    elektronik.setPosisi_lampu(input.next());
    System.out.println("========================================================================/n");
    
    System.out.println("Masukkan jumlah kipas angin: ");
    elektronik.setJumlah_kipasangin(input.nextInt());
    System.out.println("Masukkan jumlah kondisi kipas angin: ");
    elektronik.setKondisi_kipasangin(input.nextInt());
    System.out.println("Masukkan posisi kipas angin: ");
    elektronik.setPosisi_kipasangin(input.next());
    System.out.println("========================================================================/n");
    
    System.out.println("Masukkan jumlah AC: ");
    elektronik.setJumlah_ac(input.nextInt());
    System.out.println("Masukkan jumlah kondisi AC: ");
    elektronik.setKondisi_ac(input.next());
    System.out.println("Masukkan posisi AC: ");
    elektronik.setPosisi_ac(input.next());
    System.out.println("========================================================================/n");
    
    System.out.println("Masukkan SSID: ");
    elektronik.setSSID(input.next());
    System.out.println("Masukkan bandwith: ");
    elektronik.setBandwith(input.nextInt());
    System.out.println("========================================================================/n");
    
    System.out.println("Masukkan jumlah CCTV: ");
    elektronik.setJumlah_cctv(input.nextInt());
    System.out.println("Masukkan jumlah kondisi CCTV: ");
    elektronik.setKondisi_cctv(input.nextInt());
    System.out.println("Masukkan posisi CCTV: ");
    elektronik.setPosisi_cctv(input.next());
    System.out.println("========================================================================/n");
    return 0;
}
}
