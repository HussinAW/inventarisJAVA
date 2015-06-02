
package tbinventarisjava;
import java.util.Scanner;
/**
 *
 * @author andi
 */
public class Kelas {
    private String Nama_ruang;
    private String Lokasi_ruang;
    private String Program_studi;
    private int Panjang_ruang;
    private int Lebar_ruang;
    private int Jumlah_kursi;
    private int Jumlah_pintu;
    private int Jumlah_jendela;
    private int Luas_ruang;
    private double Rasio_ruang;
    private String Bentuk_ruang;
    
    private Scanner input = new Scanner(System.in);

    
    public String getNama_ruang() {
        return Nama_ruang;
    }

  
    public void setNama_ruang(String Nama_ruang) {
        this.Nama_ruang = Nama_ruang;
    }

   
    public String getLokasi_ruang() {
        return Lokasi_ruang;
    }

  
    public void setLokasi_ruang(String Lokasi_ruang) {
        this.Lokasi_ruang = Lokasi_ruang;
    }

 
    public String getProgram_studi() {
        return Program_studi;
    }

 
    public void setProgram_studi(String Program_studi) {
        this.Program_studi = Program_studi;
    }

   
    public int getPanjang_ruang() {
        return Panjang_ruang;
    }

    public void setPanjang_ruang(int Panjang_ruang) {
        this.Panjang_ruang = Panjang_ruang;
    }

 
    public int getLebar_ruang() {
        return Lebar_ruang;
    }

    public void setLebar_ruang(int Lebar_ruang) {
        this.Lebar_ruang = Lebar_ruang;
    }

   
    public int getJumlah_kursi() {
        return Jumlah_kursi;
    }

   
    public void setJumlah_kursi(int Jumlah_kursi) {
        this.Jumlah_kursi = Jumlah_kursi;
    }

    
    public int getJumlah_pintu() {
        return Jumlah_pintu;
    }


    public void setJumlah_pintu(int Jumlah_pintu) {
        this.Jumlah_pintu = Jumlah_pintu;
    }

   
    public int getJumlah_jendela() {
        return Jumlah_jendela;
    }

   
    public void setJumlah_jendela(int Jumlah_jendela) {
        this.Jumlah_jendela = Jumlah_jendela;
    }

   
    public int getLuas_ruang() {
        return Luas_ruang;
    }

  
    public void setLuas_ruang(int Luas_ruang) {
        this.Luas_ruang = Luas_ruang;
    }

   
    public double getRasio_ruang() {
        return Rasio_ruang;
    }

    
    public void setRasio_ruang(double Rasio_ruang) {
        this.Rasio_ruang = Rasio_ruang;
    }

  
    public String getBentuk_ruang() {
        return Bentuk_ruang;
    }

    
    public void setBentuk_ruang(String Bentuk_ruang) {
        this.Bentuk_ruang = Bentuk_ruang;
    }

    
    public Scanner getInput() {
        return input;
    }

   
    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
  
}