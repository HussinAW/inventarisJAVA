package tbinventarisjava;
import java.util.Scanner;
public class Kebersihan_ruang {
    Scanner input = new Scanner(System.in);
    private String Kebersihan;
    private boolean Analisis_kebersihan;
    
    String getKebersihan(){
        return Kebersihan;
    }
    public void setKebersihan(String kebersihan){
        Kebersihan=kebersihan;
    }
    
    boolean getAnalisis_kebersihan(){
        return Analisis_kebersihan;
    }
    public void setAnalisis_kebersihan(boolean analisis_kebersihan){
        Analisis_kebersihan=analisis_kebersihan;
    }
    
    boolean Analisis_kebersihan(){
        if(getKebersihan().equalsIgnoreCase("bersih")){
            return Analisis_kebersihan=true;
        }
        else{
            return Analisis_kebersihan=false;
        }
    }
    
    public void input(){
        System.out.println("Masukan kebersihan: ");
        setKebersihan(input.next());
    }
    
    public void show(){
        
        System.out.println("Kebersihan: "+getKebersihan());
        System.out.println("Analisis kebersihan: "+Analisis_kebersihan());
    }
}

