package tbinventarisjava;


public class Ruang_kelas {
    private String Nama_ruang;
    private String Lokasi_ruang;
    private String Program_studi;
    private int Panjang_ruang;
    private int Lebar_ruang;
    private int Jumlah_kursi;
    private int Jumlah_pintu;
    private boolean Analisis_pintu;
    private int Jumlah_jendela;
    private boolean Analisis_jendela;
    private int Luas_ruang;
    private double Rasio_ruang;
    private boolean Analisis_rasio;
    private String Bentuk_ruang;
    private boolean Analisis_bentuk;
    
    
    public void setNama_ruang(String nama_ruang){
        Nama_ruang = nama_ruang;
    }
    String getNama_ruang(){
        return Nama_ruang;
    }
    public void setLokasi_ruang(String lokasi_ruang){
        Lokasi_ruang = lokasi_ruang;
    }
    String getLokasi_ruang(){
        return Lokasi_ruang;
    }
    public void setProgram_studi(String program_studi){
        Program_studi = program_studi;
    }
    String getProgram_studi(){
        return Program_studi;
    }
    public void setPanjang_ruang(int panjang_ruang){
        Panjang_ruang = panjang_ruang;
    }
    int getPanjang_ruang(){
        return Panjang_ruang;
    }
    public void setLebar_ruang(int lebar_ruang){
        Lebar_ruang=lebar_ruang;
    }
    int getPLebar_ruang(){
        return Lebar_ruang;
    }
    public void setJumlah_kursi(int jumlah_kursi){
        Jumlah_kursi=jumlah_kursi;
    }
    int getJumlah_kursi(){
        return Jumlah_kursi;
    }
    
    public void setJumlah_pintu(int jumlah_pintu){
        Jumlah_pintu=jumlah_pintu;
    }
    int getJumlah_pintu(){
        return Jumlah_pintu;
    }
    
    public void setAnalisis_pintu(boolean analisis_pintu){
        Analisis_pintu=analisis_pintu;
    }
    boolean getAnalisis_pintu(){
        if(Jumlah_pintu>=2){
            return Analisis_pintu=true;
        }
        else{
            return Analisis_pintu=false;
        }
    }
    
    public void setJumlah_jendela(int jumlah_jendela){
        Jumlah_jendela = jumlah_jendela;
    }
    int getJumlah_jendela(){
        return Jumlah_jendela;
    }
    
    public void setAnalisis_jendela(boolean analisis_jendela){
        Analisis_jendela=analisis_jendela;
    }
    boolean getAnalisis_jendela(){
        if(Jumlah_jendela>=1){
            return Analisis_jendela=true;
        }
        else{
            return Analisis_jendela=false;
        }
    }
    
    public void setLuas_ruang(int luas_ruang){
        Luas_ruang=luas_ruang;
    }
    int getLuas_ruang(){
        return Luas_ruang = Panjang_ruang*Lebar_ruang;
    }
    
    public void setBentuk_ruang(String bentuk_ruang){
        Bentuk_ruang=bentuk_ruang;
    }
    String getBentuk_ruang(){
        if (Luas_ruang!=Panjang_ruang){
            return Bentuk_ruang="PersegiPanjang";
            
        }
        else{
            return Bentuk_ruang="BukanPersegiPanjang";
        }
    }
    
    public void setAnalisis_bentuk(boolean analisis_bentuk){
        Analisis_bentuk=analisis_bentuk;
    }
    boolean getAnalisis_bentuk(){
        if(Bentuk_ruang.equalsIgnoreCase("PersegiPanjang")){
            return Analisis_bentuk=true;
        }
        else{
            return Analisis_bentuk=false;
        }
    }
    
    public void setRasio_ruang(double rasio_ruang){
        Rasio_ruang=rasio_ruang;
    }
    double getRasio_ruang(){
        return Rasio_ruang=Luas_ruang/Jumlah_kursi;
    }
    
    public void setAnalisis_rasio(boolean analisis_rasio){
        Analisis_rasio=analisis_rasio;
    }
    boolean getAnalsiis_rasio(){
        if(Rasio_ruang>=0.5){
            return Analisis_rasio=true;
        }
        else{
            return Analisis_rasio=false;
        }
    }
}