package tbinventarisjava;

/**
 *
 * @author nurmasari
 */
import java.util.Scanner;
public abstract class Kenyamanan_ruang {
    Scanner input = new Scanner(System.in);
    private String Kebisingan;
    private boolean Analisis_kebisingan;
    private String bau;
    private boolean Analisis_bau;
    private String kebocoran;
    private boolean Analisis_kebocoran;
    private String kerusakan;
    private boolean Analisis_kerusakan;
    private String keausan;
    private boolean Analisis_keausan;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public boolean isAnalisis_kebisingan() {
        return Analisis_kebisingan;
    }

    public void setAnalisis_kebisingan(boolean Analisis_kebisingan) {
        this.Analisis_kebisingan = Analisis_kebisingan;
    }
    boolean Analisis_kebisingan(){
    if (getKebisingan().equalsIgnoreCase("Tidakbising")){
        return Analisis_kebisingan = true;
    }
    else{
    return Analisis_kebisingan = false;
}
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public boolean isAnalisis_bau() {
        return Analisis_bau;
    }

    public void setAnalisis_bau(boolean Analisis_bau) {
        this.Analisis_bau = Analisis_bau;
    }
   boolean Analisis_bau(){
       if(getBau().equalsIgnoreCase("tidakbau")){
           return Analisis_bau = true;
       }
       else{
           return Analisis_bau = false;
       }
   }

    public String getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    public boolean isAnalisis_kebocoran() {
        return Analisis_kebocoran;
    }

    public void setAnalisis_kebocoran(boolean Analisis_kebocoran) {
        this.Analisis_kebocoran = Analisis_kebocoran;
    }
   boolean Analisis_kebocoran(){
       if(getKebocoran().equalsIgnoreCase("tidakbocor")){
           return Analisis_kebocoran = true;
       }
       else{
           return Analisis_kebocoran = false;
       }
   }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public boolean isAnalisis_kerusakan() {
        return Analisis_kerusakan;
    }

    public void setAnalisis_kerusakan(boolean Analisis_kerusakan) {
        this.Analisis_kerusakan = Analisis_kerusakan;
    }
   boolean Analisis_kerusakan(){
       if(getKerusakan().equalsIgnoreCase("tidakrusak")){
           return Analisis_kerusakan = true;
       }
       else{
           return Analisis_kerusakan = false;
       }
   }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }

    public boolean isAnalisis_keausan() {
        return Analisis_keausan;
    }

    public void setAnalisis_keausan(boolean Analisis_keausan) {
        this.Analisis_keausan = Analisis_keausan;
    }
   boolean Analisis_keausan(){
       if(getKeausan().equalsIgnoreCase("tidakaus")){
           return Analisis_keausan = true;
       }
       else{
           return Analisis_keausan = false;
       }
   }
   public void input(){
       System.out.println("Masukkan kebisingan:");
       setKebisingan(input.next());
       System.out.println("Masukkan kebauan:");
       setBau(input.next());
       System.out.println("Masukkan kebocoran:");
       setKebocoran(input.next());
       System.out.println("Masukkan kerusakan:");
       setKerusakan(input.next());
       System.out.println("Masukkan keausan:");
       setKeausan(input.next());
   }
   public void show(){
       System.out.println("Kebisingan: "+getKebisingan());
       System.out.println("Analisis kebisingan: "+Analisis_kebisingan());
       System.out.println("Bau: "+getBau());
       System.out.println("Analisis bau: "+Analisis_bau());
       System.out.println("Kebocoran: "+getKebisingan());
       System.out.println("Analisis Kebocoran"+Analisis_kebocoran());
       System.out.println("Kerusakan: "+getKerusakan());
       System.out.println("Analisis Kerusakan: "+Analisis_kerusakan());
       System.out.println("Keausan: "+getKeausan());
       System.out.println("Analisis Keausan: "+Analisis_keausan());
   }
}
