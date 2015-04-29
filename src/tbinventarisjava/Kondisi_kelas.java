package TBinventarisJAVA;


public class Kondisi_kelas {
  
    private String Kondisi_lantai;
    private String Kondisi_dinding;
    private String Kondisi_atap;
    private String Kondisi_pintu; 
    private String Kondisi_jendela;
    private String Kondisi_sirkulasi;
    private int Kondisi_pencahayaan;
    private int Kondisi_kelembapan;
    private int Kondisi_suhu;
    private String Kondisi_kebisingan;
    private String Kondisi_bau;
    private String Kondisi_kebocoran;
    private String Kondisi_kerusakan;
    private String Kondisi_keausan;
    private String Kondisi_kekokohan;
    private String Kondisi_kuncipintu;
    private String Kondisi_kuncijendela;
    private String Kondisi_bahaya;

    /**
     * @return the Kondisi_lantai
     */
    public String getKondisi_lantai() {
        return Kondisi_lantai;
    }
    /**
     * @param Kondisi_lantai the Kondisi_lantai to set
     */
    public void setKondisi_lantai(String Kondisi_lantai) {
        this.Kondisi_lantai = Kondisi_lantai;
    }
    boolean analisis_kondisilantai(){
        if(Kondisi_lantai=="bersih"){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_dinding
     */
    public String getKondisi_dinding() {
        return Kondisi_dinding;
    }
    /**
     * @param Kondisi_dinding the Kondisi_dinding to set
     */
    public void setKondisi_dinding(String Kondisi_dinding) {
        this.Kondisi_dinding = Kondisi_dinding;
    }
    boolean analisis_kondisidinding(){
        if(Kondisi_dinding=="bersih"){
            return true;
        }
        else{
        return false;
        }
    }

    /**
     * @return the Kondisi_atap
     */
    public String getKondisi_atap() {
        return Kondisi_atap;
    }
    /**
     * @param Kondisi_atap the Kondisi_atap to set
     */
    public void setKondisi_atap(String Kondisi_atap) {
        this.Kondisi_atap = Kondisi_atap;
    }
    boolean analisis_kondisiatap(){
        if(Kondisi_atap=="bersih"){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_pintu
     */
    public String getKondisi_pintu() {
        return Kondisi_pintu;
    }
    /**
     * @param Kondisi_pintu the Kondisi_pintu to set
     */
    public void setKondisi_pintu(String Kondisi_pintu) {
        this.Kondisi_pintu = Kondisi_pintu;
    }
    boolean analisis_kondisipintu(){
        if(Kondisi_pintu=="berih"){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_jendela
     */
    public String getKondisi_jendela() {
        return Kondisi_jendela;
    }
    /**
     * @param Kondisi_jendela the Kondisi_jendela to set
     */
    public void setKondisi_jendela(String Kondisi_jendela) {
        this.Kondisi_jendela = Kondisi_jendela;
    }
    boolean analisis_kondisijendela(){
        if(Kondisi_jendela=="bersih"){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_sirkulasi
     */
    public String getKondisi_sirkulasi() {
        return Kondisi_sirkulasi;
    }
    /**
     * @param Kondisi_sirkulasi the Kondisi_sirkulasi to set
     */
    public void setKondisi_sirkulasi(String Kondisi_sirkulasi) {
        this.Kondisi_sirkulasi = Kondisi_sirkulasi;
    }
    boolean analisis_kondisisirkulasi(){
        if(Kondisi_sirkulasi=="lancar"){
            return true;
        } 
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_pencahayaan
     */
    public int getKondisi_pencahayaan() {
        return Kondisi_pencahayaan;
    }
    /**
     * @param Kondisi_pencahayaan the Kondisi_pencahayaan to set
     */
    public void setKondisi_pencahayaan(int Kondisi_pencahayaan) {
        this.Kondisi_pencahayaan = Kondisi_pencahayaan;
    }
    boolean analisis_kondisipencahayaan(){
        if(Kondisi_pencahayaan>=250 && Kondisi_pencahayaan<=350){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_kelembapan
     */
    public int getKondisi_kelembapan() {
        return Kondisi_kelembapan;
    }
    /**
     * @param Kondisi_kelembapan the Kondisi_kelembapan to set
     */
    public void setKondisi_kelembapan(int Kondisi_kelembapan) {
        this.Kondisi_kelembapan = Kondisi_kelembapan;
    }
    boolean analaisis_kondisikelembapan(){
        if(Kondisi_kelembapan>=70 && Kondisi_kelembapan<=80){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_suhu
     */
    public int getKondisi_suhu() {
        return Kondisi_suhu;
    }
    /**
     * @param Kondisi_suhu the Kondisi_suhu to set
     */
    public void setKondisi_suhu(int Kondisi_suhu) {
        this.Kondisi_suhu = Kondisi_suhu;
    }
    boolean analisis_kondisisuhu(){
        if(Kondisi_suhu>=250 && Kondisi_suhu<=350){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the Kondisi_kebisingan
     */
    public String getKondisi_kebisingan() {
        return Kondisi_kebisingan;
    }

    /**
     * @param Kondisi_kebisingan the Kondisi_kebisingan to set
     */
    public void setKondisi_kebisingan(String Kondisi_kebisingan) {
        this.Kondisi_kebisingan = Kondisi_kebisingan;
    }
    boolean analisis_kondisikebisingan(){
        if(Kondisi_kebisingan == "bising"){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @return the Kondisi_bau
     */
    public String getKondisi_bau() {
        return Kondisi_bau;
    }

    /**
     * @param Kondisi_bau the Kondisi_bau to set
     */
    public void setKondisi_bau(String Kondisi_bau) {
        this.Kondisi_bau = Kondisi_bau;
    }
     boolean analisis_kondisibau(){
        if(Kondisi_bau == "tidak bau"){
            return true;
        }
        else{
            return false;
        }
     }

    /**
     * @return the Kondisi_kebocoran
     */
    public String getKondisi_kebocoran() {
        return Kondisi_kebocoran;
    }

    /**
     * @param Kondisi_kebocoran the Kondisi_kebocoran to set
     */
    public void setKondisi_kebocoran(String Kondisi_kebocoran) {
        this.Kondisi_kebocoran = Kondisi_kebocoran;
    }
    boolean analisis_kondisibocor(){
        if(Kondisi_kebocoran == "tidak bocor"){
            return true;
        }
        else{
            return false;
        }
     }

    /**
     * @return the Kondisi_kerusakan
     */
    public String getKondisi_kerusakan() {
        return Kondisi_kerusakan;
    }

    /**
     * @param Kondisi_kerusakan the Kondisi_kerusakan to set
     */
    public void setKondisi_kerusakan(String Kondisi_kerusakan) {
        this.Kondisi_kerusakan = Kondisi_kerusakan;
    }
    boolean analisis_kondisirusak(){
        if(Kondisi_bau == "tidak rusak"){
            return true;
        }
        else{
            return false;
        }
     }

    /**
     * @return the Kondisi_keausan
     */
    public String getKondisi_keausan() {
        return Kondisi_keausan;
    }

    /**
     * @param Kondisi_keausan the Kondisi_keausan to set
     */
    public void setKondisi_keausan(String Kondisi_keausan) {
        this.Kondisi_keausan = Kondisi_keausan;
    }
    boolean analisis_kondisiaus(){
        if(Kondisi_bau == "tidak aus"){
            return true;
        }
        else{
            return false;
        }
     }

    /**
     * @return the Kondisi_kekokohan
     */
    public String getKondisi_kekokohan() {
        return Kondisi_kekokohan;
    }

    /**
     * @param Kondisi_kekokohan the Kondisi_kekokohan to set
     */
    public void setKondisi_kekokohan(String Kondisi_kekokohan) {
        this.Kondisi_kekokohan = Kondisi_kekokohan;
    }
boolean analisis_koondisikokoh(){
        if(Kondisi_kekokohan== "kokoh"){
            return true;
        }
        else{
            return false;
        }
     }
    /**
     * @return the Kondisi_kuncipintu
     */
    public String getKondisi_kuncipintu() {
        return Kondisi_kuncipintu;
    }

    /**
     * @param Kondisi_kuncipintu the Kondisi_kuncipintu to set
     */
    public void setKondisi_kuncipintu(String Kondisi_kuncipintu) {
        this.Kondisi_kuncipintu = Kondisi_kuncipintu;
    }
    boolean analisis_kondisikuncipintu(){
        if(Kondisi_kuncipintu == "ada"){
            return true;
        }
        else{
            return false;
        }
     }

    /**
     * @return the Kondisi_kuncijendela
     */
    public String getKondisi_kuncijendela() {
        return Kondisi_kuncijendela;
    }

    /**
     * @param Kondisi_kuncijendela the Kondisi_kuncijendela to set
     */
    public void setKondisi_kuncijendela(String Kondisi_kuncijendela) {
        this.Kondisi_kuncijendela = Kondisi_kuncijendela;
    }
    boolean analisis_kondisikuncijendela(){
        if(Kondisi_kuncijendela== "ada"){
            return true;
        }
        else{
            return false;
        }
     }

    /**
     * @return the Kondisi_bahaya
     */
    public String getKondisi_bahaya() {
        return Kondisi_bahaya;
    }

    /**
     * @param Kondisi_bahaya the Kondisi_bahaya to set
     */
    public void setKondisi_bahaya(String Kondisi_bahaya) {
        this.Kondisi_bahaya = Kondisi_bahaya;
    }
    boolean analisis_kondisibahaya(){
        if(Kondisi_bahaya == "aman"){
            return true;
        }
        else{
            return false;
        }
     }
}