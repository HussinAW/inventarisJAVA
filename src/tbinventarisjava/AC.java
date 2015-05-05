package tbinventarisjava;
public class AC extends Elektronik{
public void AC(){
    setStandarJumlah(1);
    setStandar_baik(1);
    setStandarPosisi("belakang");
    setStandarPosisi2("samping");
    System.out.println("Nama Barang: AC");
        input();
        System.out.println("**********************************************");
        show();
}
}
