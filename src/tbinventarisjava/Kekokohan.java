package tbinventarisjava;
public class Kekokohan extends KenyamananKeamanan_ruang {
    @Override
    boolean getAnalisis_nilai(){
        if(getNilai().equalsIgnoreCase("ya")){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai=false;
        }
    }
    
    public void Kekokohan(){
        System.out.println("Kondisi Kekokohan");
        System.out.println("Kokoh?");
        input();
        show();
    }
    
}
