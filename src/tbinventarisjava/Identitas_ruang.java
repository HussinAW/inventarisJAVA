/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ana
 */
public class Identitas_ruang {
    private String Nama_ruang;
    private String Lokasi_ruang;
    private String Program_studi;

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
        public double simpan(){
        try{
            FileWriter Writer = new FileWriter("Identitas Kelas.txt");
            Writer.write("Nama ruang= "+getNama_ruang()+"\t");
            Writer.write("Lokasi ruang= "+getLokasi_ruang()+"\t");
            Writer.write("Program studi= "+getProgram_studi()+"\t"); 
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
            
        }
        return 0;
    }
    
    public double tampil(){
        System.out.println("Nama ruang:\t"+getNama_ruang());
        System.out.println("Lokasi ruang:\t"+getLokasi_ruang());
        System.out.println("Program studi:\t"+getProgram_studi());
        return 0;
    }
}
