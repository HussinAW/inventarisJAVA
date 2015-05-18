package tbinventarisjava;
public class Kelembapan extends Kebersihan_ruang {
    public void Kelembapan(){
        setBatas_bawah(70);
        setBatas_atas(80);
        System.out.println("Kelembapan!");
        input();
        show();
    }
    
}
