package tbinventarisjava;
import java.util.Scanner;

public class Test_kelas {
    Scanner input = new Scanner (System.in);
    Kelas kelas = new Kelas();
    
    
    public void Input_kelas(){
        System.out.println("Masukan nama ruang : ");
        kelas.setNama_ruang(input.next());
        System.out.println("Masukan lokasi ruang : ");
        kelas.setLokasi_ruang(input.next());
        System.out.println("Masukan program studi : ");
        kelas.setProgram_studi(input.next());
        System.out.println("Masukan panjang ruang : ");
        kelas.setPanjang_ruang(input.nextInt());
        System.out.println("Masukan lebar ruang : ");
        kelas.setLebar_ruang(input.nextInt());
        System.out.println("Masukan jumlah kursi : ");
        kelas.setJumlah_kursi(input.nextInt());
        System.out.println("Masukan jumlah pintu : ");
        kelas.setJumlah_pintu(input.nextInt());
        System.out.println("Masukan jumlah jendela : ");
        kelas.setJumlah_jendela(input.nextInt());
        }
    
    public void Show_kelas(){
        System.out.println("\n\n===================================================");
        System.out.println("Nama ruang:"+kelas.getNama_ruang() );
        System.out.println("Lokasi ruang: "+kelas.getLokasi_ruang());
        System.out.println("Program studi: "+kelas.getProgram_studi());
        System.out.println("Panjang ruang: "+kelas.getPanjang_ruang());
        System.out.println("Lebar ruang: "+kelas.getPLebar_ruang());
        System.out.println("Jumlah kursi: "+kelas.getJumlah_kursi());
        System.out.println("Jumlah pintu: "+kelas.getJumlah_pintu());
        System.out.println("Jumlah jendela: "+kelas.getJumlah_jendela());
        System.out.println("Luas ruang: "+kelas.Luas_ruang());
        System.out.println("Rasio kelas: "+kelas.Rasio_ruang());
    }
    
    
}
