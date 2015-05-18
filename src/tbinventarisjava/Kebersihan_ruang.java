package tbinventarisjava;
import java.util.Scanner;
public class Kebersihan_ruang {
    Scanner input = new Scanner(System.in);
    private int Nilai;
    private int Batas_atas;
    private int Batas_bawah;
    boolean Analisis_nilai;
    
    public void setBatas_atas(int batas_atas){
        Batas_atas=batas_atas;
    }
    int getBatas_atas(){
        return Batas_atas;
    }
    public void setBatas_bawah(int batas_bawah){
        Batas_bawah=batas_bawah;
    }
    int getBatas_bawah(){
        return Batas_bawah;
    }
    
    public void setNilai(int nilai){
        Nilai=nilai;
    }
    int getNilai(){
        return Nilai;
    }
    
    public void setAnalisis_nilai(boolean analisis_nilai){
        Analisis_nilai=analisis_nilai;
    }
    boolean getAnalisis_nilai(){
        if(Nilai>=Batas_bawah&&Nilai<=Batas_atas){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai= false;
        }
    }
    
    public void input(){
        System.out.println("Nilai: ");
        setNilai(input.nextInt());
        System.out.println("\n");
    }
    public void show(){
        System.out.println("Nilai: "+getNilai());
        System.out.println("Analisis nilai: "+getAnalisis_nilai());
        System.out.println("----------------------------------------------------");
    }
    
}
