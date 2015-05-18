package tbinventarisjava;
import java.util.Scanner;
public class KenyamananKeamanan_ruang {
    Scanner input = new Scanner(System.in);
    private String Nilai;
    boolean Analisis_nilai;
    
    public void setNilai(String nilai){
        Nilai=nilai;
    }
    String getNilai(){
        return Nilai;
    }
    
    public void setAnalisis_nilai(boolean analisis_nilai){
        Analisis_nilai=analisis_nilai;
    }
    boolean getAnalisis_nilai(){
        if(Nilai.equalsIgnoreCase("tidak")){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai=false;
        }
    }
    
    public void input(){
        System.out.print("ya/tidak: ");
        setNilai(input.next());
        System.out.println("\n");
    }
    
    public void show(){
        System.out.println("Kondisi: "+getNilai());
        System.out.println("Analisis kondisi: "+getAnalisis_nilai());
        System.out.println("----------------------------------------------------");
    }
}
