package tbinventarisjava;


public class Bahaya extends KenyamananKeamanan_ruang {
    @Override
    boolean getAnalisis_nilai(){
        if(getNilai().equalsIgnoreCase("ya")){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai=false;
        }
    }
    
    public void Bahaya(){
        System.out.println("Kondisi bahaya!");
        System.out.println("Bahaya?");
        input();
        show();
    }
}
