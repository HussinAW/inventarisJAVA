package tbinventarisjava;
public class Sirkulasi_udara extends Kebersihan_ruang {
    private String Nilai_sirkulasi;
    
    public void setNilai(String nilai){
        Nilai_sirkulasi=nilai;
    }
    String getNilai_sirkulasi(){
        return Nilai_sirkulasi;
    }
    
    @Override
    boolean getAnalisis_nilai(){
        if(Nilai_sirkulasi.equalsIgnoreCase("lancar")){
            return Analisis_nilai=true;
        }
        else{
            return Analisis_nilai=false;
        }
    }
    
    
    
    public void Sirkulasi_udara(){
        System.out.println("Sirkulasi Udara!");
        System.out.println("lancar/tidak?");
        setNilai(input.next());
        System.out.println("\n");
        System.out.println("Sirkulasi udara: "+getNilai_sirkulasi());
        System.out.println("Analisis sirkulasi: "+getAnalisis_nilai());
        System.out.println("----------------------------------------------------");
    }
}
