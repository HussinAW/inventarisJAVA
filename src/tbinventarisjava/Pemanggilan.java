package tbinventarisjava;
public class Pemanggilan {
 
    
    public static void main(String[]Args){
        super_abstrack elektronik = new JKPS();
        elektronik.input();
        super_abstrack lingkungan = new  LRK();
        lingkungan.input();
        super_abstrack kenyamanan = new KRK();
        kenyamanan.input();
        super_abstrack keamanan= new Keamanan_R_K();
        keamanan.input();
        
        
        
        super_abstrack jay = new JKPS();
        jay.tampil();
        super_abstrack dwi = new LRK();
        dwi.tampil();
        super_abstrack ndi = new KRK();
        ndi.tampil();
        super_abstrack an = new Keamanan_R_K();
        an.tampil();
     
 }
}