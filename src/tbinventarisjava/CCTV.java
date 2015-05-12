package tbinventarisjava;
public class CCTV extends Elektronik{
public void CCTV(){
    setStandarJumlah(2);
    setStandar_baik(2);
    setStandarPosisi("depan");
    setStandarPosisi2("belakang");
    System.out.println("Nama Barang: CCTV");
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
