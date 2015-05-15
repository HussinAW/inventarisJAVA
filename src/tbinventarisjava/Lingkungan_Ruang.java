package tbinventarisjava;
import java.util.Scanner;
public class Lingkungan_Ruang {
    Scanner input = new Scanner(System.in);
    private String Sirkulasi_udara;
    private boolean Analisis_sirkulasi;
    private int Pencahayaan;
    private boolean Analisis_pencahayaan;
    private int Kelembapan;
    private int Suhu;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getSirkulasi_udara() {
        return Sirkulasi_udara;
    }

    public void setSirkulasi_udara(String Sirkulasi_udara) {
        this.Sirkulasi_udara = Sirkulasi_udara;
    }

    public boolean isAnalisis_sirkulasi() {
        return Analisis_sirkulasi;
    }

    public void setAnalisis_sirkulasi(boolean Analisis_sirkulasi) {
        this.Analisis_sirkulasi = Analisis_sirkulasi;
    }

    public int getPencahayaan() {
        return Pencahayaan;
    }

    public void setPencahayaan(int Pencahayaan) {
        this.Pencahayaan = Pencahayaan;
    }

    public boolean isAnalisis_pencahayaan() {
        return Analisis_pencahayaan;
    }

    public void setAnalisis_pencahayaan(boolean Analisis_pencahayaan) {
        this.Analisis_pencahayaan = Analisis_pencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }
    
    
}
