package tbinventarisjava;


public class luas_ruang  implements interface_kondisi_ruang_kelas {
    private final int panjang;
    private final int lebar;
    private final int jumlah_kursi;
    private final int luas;
    public String getSesuai(){
        return Sesuai;
    }
public luas_ruang(double panjang, double lebar, double jumlah_kursi, double luas){
this.panjang = (int) panjang;
this.lebar = (int) lebar;
this.jumlah_kursi = (int) jumlah_kursi;
this.luas = (int) luas;
}
    @Override
    public double HitungLuas() {
        return panjang*lebar;
    }

    @Override
    public double HitungRasio() {
        return jumlah_kursi/luas;
    }   
}
