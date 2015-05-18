package tbinventarisjava;


public class Kunci_pintu extends KenyamananKeamanan_ruang {
    @Override
    boolean getAnalisis_nilai(){
        if(getNilai().equalsIgnoreCase("ya")){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai=false;
        }
    }
    
    public void Kunci_pintu(){
        System.out.println("Kunci Pintu!");
        System.out.println("Ada?");
        input();
        show();
    }
    
}
