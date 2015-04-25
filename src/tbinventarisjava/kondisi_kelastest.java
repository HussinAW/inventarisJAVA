package tbinventarisjava;

import java.util.Scanner;


public class kondisi_kelastest {


    static Scanner input;
    static Kondisi_kelas jay;
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        jay = new Kondisi_kelas();
     
    }
       
        public void analisis_lingkungan_ruang_kelas(){
            System.out.println("masukan kondisi lantai(bersih/kotor)=");
            jay.setKondisi_lantai(input.next());
            System.out.println("masukan kondisi dinding(bersih/kotor)=");
            jay.setKondisi_dinding(input.next());
            System.out.println("masukan kondisi atap(bersih/kotor)=");
            jay.setKondisi_lantai(input.next());
            System.out.println("masukan kondisi pintu(bersih/kotor)=");
            jay.setKondisi_pintu(input.next());
              System.out.println("masukan kondisi jendela(bersih/kotor)=");
            jay.setKondisi_jendela(input.next());
        
    }
        public void kebersihan_ruang_kelas(){
            System.out.println("masukan kondisi sirkulasi udara(baik/buruk)=");
            jay.setKondisi_pintu(input.next());
            System.out.println("masukan kondisi pencahayaan(1->350)=");
            jay.setKondisi_pencahayaan(input.nextInt());
            
           
        }
    }

    
