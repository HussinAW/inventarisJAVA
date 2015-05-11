package tbinventarisjava;
public class Steker extends Elektronik {
public Steker(int Jumlah_barang, int StandarJumlah, boolean Analisis_jumlah){
super(Jumlah_barang, StandarJumlah, Analisis_jumlah);
}
    public void input(){
    setStandarJumlah(4);
    setStandar_baik(4);
    setStandarPosisi("pojok");
    setStandarPosisi2("dekatdosen");
    System.out.println("Nama Barang: Steker");
        super.input();
        System.out.println("**********************************************");
        super.show();
}   
}
