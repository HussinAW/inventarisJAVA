package tbinventarisjava;
public class Suhu extends Kebersihan_ruang {
    public void Suhu(){
        setBatas_bawah(25);
        setBatas_atas(35);
        System.out.println("Suhu!");
        input();
        show();
    }
    
}
