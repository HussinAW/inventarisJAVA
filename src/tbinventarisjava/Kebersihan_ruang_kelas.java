/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbinventarisjava;

/**
 *
 * @author nurmasari
 */
public class Kebersihan_ruang_kelas {
    private String sirkulasi_udara;
    private int pencahayaan;
    private int kelembapan;
    private int suhu;
    public double sesuai = 0.0;

    public String getSirkulasi_udara() {
        return sirkulasi_udara;
    }

    public void setSirkulasi_udara(String sirkulasi_udara) {
        this.sirkulasi_udara = sirkulasi_udara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
}