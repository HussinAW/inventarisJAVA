package tbinventarisjava;
public class Kipasangin extends Elektronik {

    //public Kipasangin(int Jumlah_barang, int StandarJumlah, boolean Analisis_jumlah, int Kondisi_baik, int Standar_baik, boolean Analisis_Kondisi, String Posisi_barang, String StandarPosisi, String StandarPosisi2, boolean AnalisisPosisi) {
        //super(Jumlah_barang, StandarJumlah, Analisis_jumlah, Kondisi_baik, Standar_baik, Analisis_Kondisi, Posisi_barang, StandarPosisi, StandarPosisi2, AnalisisPosisi);
    
    public void Kipas_Angin(){
        setStandarJumlah(2);
        setStandar_baik(2);
        setStandarPosisi("atap");
        System.out.println("Nama Barang: Kipas angin");
        input();
        //Kipasangin();
        System.out.println("**********************************************");
        show();
        
    }

    
}
