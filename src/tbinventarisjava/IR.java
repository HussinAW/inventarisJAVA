/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author ana
 */
public class IR{
    
    Scanner input = new Scanner(System.in);
    Identitas_ruang IR = new Identitas_ruang();
    public double sesuai = 0.0;
    public double input(){
        System.out.println("Nama ruang:\t");
        IR.setNama_ruang(input.next());
        System.out.println("=============================================");
        System.out.println("Lokasi ruang:\t");
        IR.setLokasi_ruang(input.next());
        System.out.println("=============================================");
        System.out.println("Program studi:\t");
        IR.setProgram_studi(input.next());
        System.out.println("=============================================");
        return 0;
    }
    
    public void simpan(){
        try{
            FileWriter Writer = new FileWriter("Identitas Kelas.txt");
            Writer.write("Nama ruang= "+IR.getNama_ruang()+"\t");
            Writer.write("Lokasi ruang= "+IR.getLokasi_ruang()+"\t");
            Writer.write("Program studi= "+IR.getProgram_studi()+"\t"); 
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
            
        }
    }
    
    public double tampil(){
        System.out.println("Nama ruang:\t"+IR.getNama_ruang());
        System.out.println("Lokasi ruang:\t"+IR.getLokasi_ruang());
        System.out.println("Program studi:\t"+IR.getProgram_studi());
        return 0;
    }
    
}
