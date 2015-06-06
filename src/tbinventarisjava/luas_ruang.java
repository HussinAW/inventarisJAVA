package tbinventarisjava;


public class luas_ruang  implements interface_kondisi_ruang_kelas {
    public  double panjang;
    public  double lebar;
    public  double jumlah_kursi;
    public  double luas;
    public String getSesuai(){
        return Sesuai;
    }
    public luas_ruang(double panjang, double lebar, double jumlah_kursi, double luas){
    this.panjang =  panjang;
    this.lebar = lebar;
    this.jumlah_kursi = jumlah_kursi;
    this.luas = luas;
    }
    @Override
    public double HitungLuas() {
        luas =panjang*lebar;
        return luas;
    }

    @Override
    public double HitungRasio() {
        return jumlah_kursi/luas;
    }   

    @Override
    public double tampil() {
          System.out.println("luas="+luas);
       System.out.println("rasio="+HitungRasio());
        return 0;
    }
}
