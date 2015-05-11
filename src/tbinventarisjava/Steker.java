package tbinventarisjava;
public class Steker extends Elektronik {
public void Steker(){
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
