package tbinventarisjava;
public class Pemanggilan {
 
    
    public static void main(String[]Args){
        IR as= new IR();
        as.input();
        as.simpan();
        super_abstrack elektronik = new JKPS();
        elektronik.input();
        JKPS ag = new JKPS();
        ag.simpan();
        super_abstrack lingkungan = new  LRK();
        lingkungan.input();
        LRK ad = new LRK();
        ad.simpan();
        super_abstrack kenyamanan = new KRK();
        kenyamanan.input();
        KRK ah = new KRK();
        ah.simpan();
        super_abstrack keamanan= new Keamanan_R_K();
        keamanan.input();
        Keamanan_R_K aj = new Keamanan_R_K();
        aj.simpan();
        
        
        
        
        
        as.tampil();
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