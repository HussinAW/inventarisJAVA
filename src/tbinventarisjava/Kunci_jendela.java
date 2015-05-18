package tbinventarisjava;


public class Kunci_jendela extends KenyamananKeamanan_ruang {
    @Override
    boolean getAnalisis_nilai(){
        if(getNilai().equalsIgnoreCase("ya")){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai=false;
        }
    }
    
    public void Kunci_jendela(){
        System.out.println("Kunci Jendela!");
        System.out.println("Ada?");
        input();
        show();
    }
    
}
