package tbinventarisjava;
import java.util.Scanner;
public class tes_Ruang_kelas {
    Scanner input=new Scanner(System.in);
    Ruang_kelas ruang_kelas = new Ruang_kelas();
    public void input(){
        System.out.println("Inputkan Identitas Ruang Kelas!");
        System.out.print("Nama uang: ");
        ruang_kelas.setNama_ruang(input.next());
        System.out.print("Lokasi ruang: ");
        ruang_kelas.setLokasi_ruang(input.next());
        System.out.print("Program studi: ");
        ruang_kelas.setProgram_studi(input.next());
        System.out.print("Panjang ruang: ");
        ruang_kelas.setPanjang_ruang(input.nextInt());
        System.out.print("Lebar ruang: ");
        ruang_kelas.setLebar_ruang(input.nextInt());
        System.out.print("Jumlah kursi: ");
        ruang_kelas.setJumlah_kursi(input.nextInt());
        System.out.print("Jumlah pintu: ");
        ruang_kelas.setJumlah_pintu(input.nextInt());
        System.out.print("Jumlah jendela: ");
        ruang_kelas.setJumlah_jendela(input.nextInt());
    }
    
    public void show(){
        System.out.println("/n/n");
        System.out.println("*****************************************************");
        System.out.println("Nama ruang: "+ruang_kelas.getNama_ruang());
        System.out.println("Lokasi ruang: "+ruang_kelas.getLokasi_ruang());
        System.out.println("Program studi: "+ruang_kelas.getProgram_studi());
        System.out.println("Panjang ruang: "+ruang_kelas.getPanjang_ruang());
        System.out.println("Lebar ruang: "+ruang_kelas.getPLebar_ruang());
        System.out.println("Luas ruang: "+ruang_kelas.getLuas_ruang());
        System.out.println("Bentuk ruang: "+ruang_kelas.getBentuk_ruang());
        System.out.println("Analisis bentuk: "+ruang_kelas.getAnalisis_bentuk());
        System.out.println("Jumlah kursi: "+ruang_kelas.getJumlah_kursi());
        System.out.println("Rasio luas: "+ruang_kelas.getRasio_ruang());
        System.out.println("Analisis rasio: "+ruang_kelas.getAnalsiis_rasio());
        System.out.println("Jumlah pintu: "+ruang_kelas.getJumlah_pintu());
        System.out.println("Analisis pintu: "+ruang_kelas.getAnalisis_pintu());
        System.out.println("Jumlah jendela: "+ruang_kelas.getJumlah_jendela());
        System.out.println("Analisis jendela: "+ruang_kelas.getAnalisis_jendela());
    }
}
