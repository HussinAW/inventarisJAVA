package tbinventarisjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;


public class luas_ruang  implements interface_kondisi_ruang_kelas {
    double panjang;
    double lebar;
    double jumlah_kursi;
    private  double luas;
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
        setLuas(getPanjang() * getLebar());
        return getLuas();
    }

    @Override
    public double HitungRasio() {
        return getJumlah_kursi()/getLuas();
    }   

    @Override
    public double tampil() {
          System.out.println("luas="+getLuas());
       System.out.println("rasio="+HitungRasio());
        return 0;
    }
    public void database(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            final String username="root";
            final String password="";
            final Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem_inventaris", username, password);
            final PreparedStatement prepare = koneksi.prepareStatement(" INSERT INTO isi_kelas " + " (Panjang_ruang, Lebar_ruang, J_kursi)"+ " VALUES "+" (?, ?, ?);");
            prepare.setDouble(1, getPanjang());
            prepare.setDouble(2, getLebar());
            prepare.setDouble(3, getJumlah_kursi());
            prepare.executeUpdate();
        }
        catch (final SQLException ex){}
        catch(final InstantiationException ex){}
        catch(final IllegalAccessException ex){}
        catch(final ClassNotFoundException ex){}
        catch(InputMismatchException ex){}
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getJumlah_kursi() {
        return jumlah_kursi;
    }

    public void setJumlah_kursi(double jumlah_kursi) {
        this.jumlah_kursi = jumlah_kursi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
}
