package tbinventarisjava;
public class AC extends Elektronik{
public void AC(){
    setStandarJumlah(1);
    setStandar_baik(1);
    setStandarPosisi("belakang");
    setStandarPosisi2("samping");
    System.out.println("Nama Barang: AC");
        //input();
        System.out.println("**********************************************");
        //show();
}
@Override
 public void input(){
        System.out.print("Masukan jumlah barang: ");
        setJumlah_barang(input.nextInt());
        System.out.print("Masukan kondisi barang baik: ");
        setKondisi_baik(input.nextInt());
        System.out.print("Masukan posisi barang: ");
        setPosisi_barang(input.next());
    }
@Override
public void show(){
        System.out.println("Jumlah barang: "+getJumlah_barang()+" - "+Analisis_jumlah());
        System.out.println("Kondisi barang baik: "+getKondisi_baik()+" - "+Analisis_baik());
        System.out.println("Posisi barang: "+getPosisi_barang()+" - "+AnalisisPosisi());
    }
}
