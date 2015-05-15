package tbinventarisjava;

public class bising extends Kenyamanan_ruang{
    public void bising(){
        System.out.println("Kebisingan");
    }
    @Override
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
        @Override
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
