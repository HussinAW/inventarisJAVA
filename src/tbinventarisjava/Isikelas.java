package tbinventarisjava;
import java.util.Scanner;
public class Isikelas {
private int Jumlah_stopkontak;
private int Kondisi_stopkontak;
private String Posisi_stopkontak;
private int Jumlah_kabel_LCD;
private String Kondisi_kabel_LCD;
private String Posisi_kabel_LCD;
private int Jumlah_lampu;
private int Kondisi_lampu;   
private String Posisi_lampu;
private int Jumlah_kipasangin;
private int Kondisi_kipasangin;
private String Posisi_kipasangin;
private int Jumlah_Ac;
private String Kondisi_Ac;
private String Posisi_Ac;
private String SSID;
private int Bandwith;
private int Jumlah_CCTV;
private int Kondisi_CCTV;
private String Posisi_CCTV; 


    public int getJumlah_stopkontak() {
        return Jumlah_stopkontak;
    }

    public void setJumlah_stopkontak(int Jumlah_stopkontak) {
        this.Jumlah_stopkontak = Jumlah_stopkontak;
    }
    
    boolean analisis_stopkontak(){
        if(Jumlah_stopkontak>=4){
            return true;
        }
        else{
            return false;
        }
    }

    public int getKondisi_stopkontak() {
        return Kondisi_stopkontak;
    }

    public void setKondisi_stopkontak(int Kondisi_stopkontak) {
        this.Kondisi_stopkontak = Kondisi_stopkontak;
    }
    boolean analisis_kondisi_stopkontak(){
        if(Kondisi_stopkontak==4){
            return true;
        }
        else{
            return false;
        }
    }

    public String getPosisi_stopkontak() {
        return Posisi_stopkontak;
    }

    public void setPosisi_stopkontak(String Posisi_stopkontak) {
        this.Posisi_stopkontak = Posisi_stopkontak;
    }
    boolean analisis_posisi_stopkontak(){
        if(Posisi_stopkontak=="pojok ruang"){
        return true;    
        }
        else if(Posisi_stopkontak=="dekat dosen")
        return true;
        else{
            return false;
        }
    }

    public int getJumlah_kabel_LCD() {
        return Jumlah_kabel_LCD;
    }

    public void setJumlah_kabel_LCD(int Jumlah_kabel_LCD) {
        this.Jumlah_kabel_LCD = Jumlah_kabel_LCD;
    }
    boolean analisis_kabel_LCD(){
        if(Jumlah_kabel_LCD>=1){
            return true;
        }
        else{
            return false;
        }
    }
    public String getKondisi_kabel_LCD() {
        return Kondisi_kabel_LCD;
    }

    public void setKondisi_kabel_LCD(String Kondisi_kabel_LCD) {
        this.Kondisi_kabel_LCD = Kondisi_kabel_LCD;
    }
    boolean analisis_Kondisii_kabel_LCD(){
     if(Kondisi_kabel_LCD=="berfungsi"){
     return true;
    }
     else{
         return false;
     }
    }
     

    public String getPosisi_kabel_LCD() {
        return Posisi_kabel_LCD;
    }

    public void setPosisi_kabel_LCD(String Posisi_kabel_LCD) {
        this.Posisi_kabel_LCD = Posisi_kabel_LCD;
    }
boolean analisis_Posisi_Kabel_LCD(){
    if(Posisi_kabel_LCD=="dekatdosen"){
        return true;
    }
    else{
        return false;
    }
}
    public int getJumlah_lampu() {
        return Jumlah_lampu;
    }

    public void setJumlah_lampu(int Jumlah_lampu) {
        this.Jumlah_lampu = Jumlah_lampu;
    }
    boolean analisis_lampu(){
        if(Jumlah_lampu>=18){
            return true;
    }
        else{
            return false;
        }
    }
    public int getKondisi_lampu() {
        return Kondisi_lampu;
    }

    public void setKondisi_lampu(int Kondisi_lampu) {
        this.Kondisi_lampu = Kondisi_lampu;
    }
    boolean analisis_Kondisi_Lampu(){
       if(Kondisi_lampu==18){
           return true;
       }
       else{
           return false;
       }
    }

    public String getPosisi_lampu() {
        return Posisi_lampu;
    }

    public void setPosisi_lampu(String Posisi_lampu) {
        this.Posisi_lampu = Posisi_lampu;
    }
    boolean analisis_Posisi_Lampu(){
        if(Posisi_lampu=="atapruangan"){
            return true;
        }
        else{
            return false;
        }
    }
    public int getJumlah_kipasangin() {
        return Jumlah_kipasangin;
    }

    public void setJumlah_kipasangin(int Jumlah_kipasangin) {
        this.Jumlah_kipasangin = Jumlah_kipasangin;
    }

    public int getKondisi_kipasangin() {
        return Kondisi_kipasangin;
    }

    public void setKondisi_kipasangin(int Kondisi_kipasangin) {
        this.Kondisi_kipasangin = Kondisi_kipasangin;
    }

    public String getPosisi_kipasangin() {
        return Posisi_kipasangin;
    }

    public void setPosisi_kipasangin(String Posisi_kipasangin) {
        this.Posisi_kipasangin = Posisi_kipasangin;
    }

    public int getJumlah_Ac() {
        return Jumlah_Ac;
    }

    public void setJumlah_Ac(int Jumlah_Ac) {
        this.Jumlah_Ac = Jumlah_Ac;
    }

    public String getKondisi_Ac() {
        return Kondisi_Ac;
    }

    public void setKondisi_Ac(String Kondisi_Ac) {
        this.Kondisi_Ac = Kondisi_Ac;
    }

    public String getPosisi_Ac() {
        return Posisi_Ac;
    }

    public void setPosisi_Ac(String Posisi_Ac) {
        this.Posisi_Ac = Posisi_Ac;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwith() {
        return Bandwith;
    }

    public void setBandwith(int Bandwith) {
        this.Bandwith = Bandwith;
    }

    public int getJumlah_CCTV() {
        return Jumlah_CCTV;
    }

    public void setJumlah_CCTV(int Jumlah_CCTV) {
        this.Jumlah_CCTV = Jumlah_CCTV;
    }

    public int getKondisi_CCTV() {
        return Kondisi_CCTV;
    }

    public void setKondisi_CCTV(int Kondisi_CCTV) {
        this.Kondisi_CCTV = Kondisi_CCTV;
    }

    public String getPosisi_CCTV() {
        return Posisi_CCTV;
    }

    public void setPosisi_CCTV(String Posisi_CCTV) {
        this.Posisi_CCTV = Posisi_CCTV;
    }

}

