package tbinventarisjava;
public class CCTV extends Elektronik{
public void CCTV(){
    setStandarJumlah(2);
    setStandar_baik(2);
    setStandarPosisi("depan");
    setStandarPosisi2("belakang");
    System.out.println("Nama Barang: CCTV");
        input();
        System.out.println("**********************************************");
        show();
}   
}
