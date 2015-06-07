
package tbinventarisjava;

import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public  class Lingkungan_Ruang_Kelas extends super_abstrack{
    private String kondisi_lantai;
    private String kondisi_dinding;
    private String kondisi_atap;
    private String kondisi_pintu;
    private String kondisi_jendela;
    public double sesuai=0.0;
    Scanner input = new Scanner (System.in);

    public String getKondisi_lantai() {
        return kondisi_lantai;
    }

    
    /**
     * @param kondisi_lantai the kondisi_lantai to set
     */
    public void setKondisi_lantai(String kondisi_lantai) {
        this.kondisi_lantai = kondisi_lantai;
    }

    /**
     * @return the kondisi_dinding
     */
    public String getKondisi_dinding() {
        return kondisi_dinding;
    }

    /**
     * @param kondisi_dinding the kondisi_dinding to set
     */
    public void setKondisi_dinding(String kondisi_dinding) {
        this.kondisi_dinding = kondisi_dinding;
    }

    /**
     * @return the kondisi_atap
     */
    public String getKondisi_atap() {
        return kondisi_atap;
    }

    /**
     * @param kondisi_atap the kondisi_atap to set
     */
    public void setKondisi_atap(String kondisi_atap) {
        this.kondisi_atap = kondisi_atap;
    }

    /**
     * @return the kondisi_pintu
     */
    public String getKondisi_pintu() {
        return kondisi_pintu;
    }

    /**
     * @param kondisi_pintu the kondisi_pintu to set
     */
    public void setKondisi_pintu(String kondisi_pintu) {
        this.kondisi_pintu = kondisi_pintu;
    }

    /**
     * @return the kondisi_jendela
     */
    public String getKondisi_jendela() {
        return kondisi_jendela;
    }

    /**
     * @param kondisi_jendela the kondisi_jendela to set
     */
    public void setKondisi_jendela(String kondisi_jendela) {
        this.kondisi_jendela = kondisi_jendela;
    }
    


    
    @Override
    public double Analisis() {
         if(getKondisi_lantai().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
         
    
     if(getKondisi_lantai().equals("bersih")){
        sesuai++;
     }
     else{
         
     }
     
     if(getKondisi_lantai().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
     
     if(getKondisi_pintu().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
    
     if(getKondisi_jendela().equals("bersih")){
         sesuai++;
     }
     else{
         
     }
    return sesuai;
 

     }
    @Override
    public void database(){
        try{
            FileWriter  Writer = new FileWriter ("Lingkungan Ruang Kelas.txt");
            Writer.write("Kondisi lantai = "+getKondisi_lantai()+"\t");
            Writer.write("Kondisi dinding = "+getKondisi_dinding()+"\t");
            Writer.write("Kondisi atap = "+getKondisi_atap()+"\t");
            Writer.write("Kondisi pintu = "+getKondisi_pintu()+"\t");
            Writer.write("Kondisi jendela = "+getKondisi_jendela()+"\t");
            Writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }

    }

    
    @Override
       public double tampil(){
        System.out.println("kondisi lantai:\t"+getKondisi_lantai());
        System.out.println("kondisi dinding:\t"+getKondisi_dinding());
        System.out.println("kondisi atap:\t"+getKondisi_atap());
        System.out.println("kondisi pintu:\t"+getKondisi_pintu());
        System.out.println("Kondisi Jendela:\t"+getKondisi_jendela());
        
        return 0;

   
}
}
