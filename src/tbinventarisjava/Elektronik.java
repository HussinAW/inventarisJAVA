package tbinventarisjava;

import java.util.Scanner;
public class Elektronik {
    Scanner input = new Scanner(System.in);
    private int Jumlah_barang;
    private int StandarJumlah;
    private boolean Analisis_jumlah;
    private int Kondisi_baik;
    private int Standar_baik;
    private boolean Analisis_kondisi;
    String Posisi_barang;
    String StandarPosisi;
    private String StandarPosisi2;

    
    boolean AnalisisPosisi;

    int getJumlah_barang() {
        return Jumlah_barang;
    }
    public void setJumlah_barang(int jumlah_barang) {
        Jumlah_barang = jumlah_barang;
    }
    public int getStandarJumlah(){
        return StandarJumlah;
    }
    public void setStandarJumlah(int standarJumlah){
        StandarJumlah=standarJumlah;
    }
    boolean getAnalisis_jumlah(){
        return Analisis_jumlah;
    }
    public void setAnalisis_jumlah(boolean analisis_jumlah){
        Analisis_jumlah=analisis_jumlah;
    }
    boolean Analisis_jumlah(){
        if(getJumlah_barang()>=StandarJumlah){
            return Analisis_jumlah=true;
        }
        else{
            return Analisis_jumlah=false;
        }
    }
    /*=============================================================*/
    int getKondisi_baik(){
        return Kondisi_baik;
    }    
    public void setKondisi_baik(int kondisi_baik){
        Kondisi_baik=kondisi_baik;
    }
    int getStandar_baik(){
        return Standar_baik;
    }
    public void setStandar_baik(int standar_baik){
        Standar_baik=standar_baik;
    }
    boolean Analisis_baik(){
        if(Jumlah_barang>=Standar_baik && Standar_baik<=Kondisi_baik && Kondisi_baik<=Jumlah_barang){
            return Analisis_kondisi=true;
        }
        else{
            return Analisis_kondisi=false;
        }
    }
    /*========================================================================*/   
    public String getPosisi_barang() {
        return Posisi_barang;
    }

    public void setPosisi_barang(String posisi_barang) {
        Posisi_barang = posisi_barang;
    }
    
    String getStandarPosisi(){
        return StandarPosisi;
    }
    public void setStandarPosisi(String standarPosisi){
        StandarPosisi=standarPosisi;
    }
    String getStandarPosisi2(){
        return StandarPosisi2;
    }
    public void setStandarPosisi2(String standarPosisi2){
        StandarPosisi2=standarPosisi2;
    }
    boolean AnalisisPosisi(){
        if(Posisi_barang.equalsIgnoreCase(StandarPosisi)){
            return AnalisisPosisi=true;
        }
        else{
            return AnalisisPosisi=false;
        }
    }
    boolean getAnalisisPosisi(){
        return AnalisisPosisi;
    }
    
    public void setAnalisisPosisi(boolean analisisPosisi){
        AnalisisPosisi=analisisPosisi;
    }
    
    public void input(){
        System.out.print("Masukan jumlah barang: ");
        setJumlah_barang(input.nextInt());
        System.out.print("Masukan kondisi barang baik: ");
        setKondisi_baik(input.nextInt());
        System.out.print("Masukan posisi barang: ");
        setPosisi_barang(input.next());
        
    }   
    
    public void show(){
        System.out.println("Jumlah barang: "+getJumlah_barang()+" - "+Analisis_jumlah());
        System.out.println("Kondisi barang baik: "+getKondisi_baik()+" - "+Analisis_baik());
        System.out.println("Posisi barang: "+getPosisi_barang()+" - "+AnalisisPosisi());
    }
}
