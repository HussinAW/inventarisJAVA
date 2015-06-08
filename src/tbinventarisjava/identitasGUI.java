
package tbinventarisjava;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.InputMismatchException;


/**
 *
 * @author Toshiba
 */
public class identitasGUI extends javax.swing.JFrame {

        Identitas_ruang nama = new Identitas_ruang();
        double panjangnya,lebarnya,jumlahkursinya,luasnya;
        luas_ruang isi = new luas_ruang( panjangnya, lebarnya, jumlahkursinya, luasnya);
        Jumlah_Kondisi_Posisisarana kondisi = new Jumlah_Kondisi_Posisisarana();
        Lingkungan_Ruang_Kelas lingkungan = new Lingkungan_Ruang_Kelas();
        Kebersihan_ruang_kelas bersih = new Kebersihan_ruang_kelas();
        Kenyamanan_Ruang_Kelas kenyamanan = new Kenyamanan_Ruang_Kelas();
        keamanan_ruang_kelas keamaanan = new keamanan_ruang_kelas();
       
    private Object ipassword;
        
        //IR identitas = new IR();
    public identitasGUI() {
        initComponents();
       
        identitas.setVisible(false);
        JKPS.setVisible(false);
        LINGKUNGAN.setVisible(false);
        KENYAMANAN.setVisible(false);
        TAMPILAN.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        iusername = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel94 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        identitas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namakelas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lokasiruang = new javax.swing.JTextField();
        namajurusan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        panjang = new javax.swing.JTextField();
        lebar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jumlahkursi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        JKPS = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        bandwith = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jkipas = new javax.swing.JComboBox();
        kstopkontak = new javax.swing.JComboBox();
        jlampu = new javax.swing.JComboBox();
        jLabel57 = new javax.swing.JLabel();
        kLCD = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jstopkontak1 = new javax.swing.JComboBox();
        jLCD = new javax.swing.JComboBox();
        jCCTV = new javax.swing.JComboBox();
        jAC = new javax.swing.JComboBox();
        kkipas = new javax.swing.JComboBox();
        kklampu = new javax.swing.JComboBox();
        kCCTV = new javax.swing.JComboBox();
        kAC = new javax.swing.JComboBox();
        PSTOP = new javax.swing.JComboBox();
        PLCD = new javax.swing.JComboBox();
        pkipas = new javax.swing.JComboBox();
        Plampu = new javax.swing.JComboBox();
        pcctv = new javax.swing.JComboBox();
        pAC = new javax.swing.JComboBox();
        SSID = new javax.swing.JComboBox();
        LINGKUNGAN = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        llantai = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        ldinding = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        latap = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        lpintu = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        ljendela = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lpencahayaan = new javax.swing.JTextField();
        lsirkulasi = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        lkelembapan = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lsuhu = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        KENYAMANAN = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        kunci = new javax.swing.JComboBox();
        bocor = new javax.swing.JComboBox();
        bahaya = new javax.swing.JComboBox();
        bau = new javax.swing.JComboBox();
        kekokohan = new javax.swing.JComboBox();
        aus = new javax.swing.JComboBox();
        kerusakan = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        bising = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        TAMPILAN = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("kenyamanan dan keamanan Kelas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(680, 400));
        setMinimumSize(new java.awt.Dimension(680, 400));
        setPreferredSize(new java.awt.Dimension(680, 400));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGIN.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        LOGIN.setFocusCycleRoot(true);
        LOGIN.setMaximumSize(new java.awt.Dimension(240, 240));
        LOGIN.setMinimumSize(new java.awt.Dimension(240, 240));
        LOGIN.setNextFocusableComponent(identitas);
        LOGIN.setPreferredSize(new java.awt.Dimension(680, 400));
        LOGIN.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                LOGINHierarchyChanged(evt);
            }
        });
        LOGIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("OCR-A BT", 1, 24)); // NOI18N
        jLabel90.setText("UNIVERSITAS MUHAMMADIYAH MALANG");
        LOGIN.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel91.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel91.setText("INVENTARIS KELAS");
        LOGIN.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("masuk");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        LOGIN.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel88.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 255, 255));
        jLabel88.setText("Username");
        LOGIN.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(51, 255, 255));
        jLabel89.setText("Password");
        LOGIN.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, -1));

        iusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iusernameActionPerformed(evt);
            }
        });
        LOGIN.add(iusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, 40));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        LOGIN.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 190, 40));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/Logo_umm.png"))); // NOI18N
        LOGIN.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 170, 140));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/umm11.jpg"))); // NOI18N
        LOGIN.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        jLabel27.setText("jLabel27");
        LOGIN.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        identitas.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        identitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("IDENTITAS KELAS");
        identitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 170, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama kelas");
        identitas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 140, 20));

        namakelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namakelasActionPerformed(evt);
            }
        });
        identitas.add(namakelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("selanjutnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        identitas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Lokasi ruang kelas:");
        identitas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama jurusan:");
        identitas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 30));

        lokasiruang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasiruangActionPerformed(evt);
            }
        });
        identitas.add(lokasiruang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 40));
        identitas.add(namajurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Panjang:");
        identitas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 30));

        panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panjangActionPerformed(evt);
            }
        });
        identitas.add(panjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, 40));

        lebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lebarActionPerformed(evt);
            }
        });
        identitas.add(lebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 180, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lebar");
        identitas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Jumlah Kursi");
        identitas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, 30));
        identitas.add(jumlahkursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 180, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        identitas.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(identitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 590));

        JKPS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JKPS.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        JKPS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Jumlah Kondisi Sarana dan Prasarana");
        JKPS.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 411, 42));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("1.stop kontak");
        JKPS.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 59, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Jumlah:");
        JKPS.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("kondisi baik:");
        JKPS.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Posisi:");
        JKPS.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("2.kabel LCD");
        JKPS.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 118, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Jumlah:");
        JKPS.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Posisi:");
        JKPS.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("3.Lampu");
        JKPS.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 177, 72, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Jumlah:");
        JKPS.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Posisi:");
        JKPS.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("4.Kipas Angin");
        JKPS.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 231, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Jumlah:");
        JKPS.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 259, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Posisi:");
        JKPS.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("6.CCTV");
        JKPS.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Jumlah:");
        JKPS.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 319, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Posisi:");
        JKPS.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Jumlah:");
        JKPS.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 384, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Posisi:");
        JKPS.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("7.SSID");
        JKPS.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 415, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("SSID:");
        JKPS.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("8.Bandwith");
        JKPS.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));
        JKPS.add(bandwith, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 70, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Bandwith");
        JKPS.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("selanjutnya");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JKPS.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("5.AC");
        JKPS.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, -1, -1));

        jkipas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jkipas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(jkipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        kstopkontak.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kstopkontak.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3", "4" }));
        JKPS.add(kstopkontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jlampu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlampu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        jlampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlampuActionPerformed(evt);
            }
        });
        JKPS.add(jlampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("kondisi baik:");
        JKPS.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        kLCD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3", " " }));
        JKPS.add(kLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("kondisi baik:");
        JKPS.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("kondisi baik:");
        JKPS.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("kondisi baik:");
        JKPS.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("kondisi baik:");
        JKPS.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jstopkontak1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jstopkontak1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        jstopkontak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstopkontak1ActionPerformed(evt);
            }
        });
        JKPS.add(jstopkontak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLCD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(jLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jCCTV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCCTV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(jCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 20));

        jAC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(jAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 60, 20));

        kkipas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kkipas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(kkipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        kklampu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kklampu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(kklampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        kCCTV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kCCTV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(kCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 60, 20));

        kAC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kAC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "1", "2", "3" }));
        JKPS.add(kAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, 30));

        PSTOP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PSTOP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "Dekat dosen", "Pojok", "Lainnya" }));
        JKPS.add(PSTOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 90, -1));

        PLCD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "Dekat dosen", "lainnya" }));
        JKPS.add(PLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, -1));

        pkipas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pkipas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "Atap", "Lainnya" }));
        JKPS.add(pkipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 90, -1));

        Plampu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Plampu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "Atap", "Lainnya", " " }));
        JKPS.add(Plampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 90, -1));

        pcctv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pcctv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "Depan", "Belakang", "Lainnya" }));
        JKPS.add(pcctv, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 90, 30));

        pAC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pAC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "Belakang", "Samping", " Lainnya" }));
        JKPS.add(pAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 30));

        SSID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SSID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UMMhotspot", "lainnya" }));
        JKPS.add(SSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        getContentPane().add(JKPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 590));

        LINGKUNGAN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("LINGKUNGAN KELAS");
        LINGKUNGAN.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("lantai:");
        LINGKUNGAN.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        llantai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        llantai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "bersih", "kotor", " " }));
        llantai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llantaiActionPerformed(evt);
            }
        });
        LINGKUNGAN.add(llantai, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 85, 104, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("kondisi dinding:");
        LINGKUNGAN.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 88, -1, -1));

        ldinding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ldinding.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "bersih", "kotor", " " }));
        LINGKUNGAN.add(ldinding, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 85, 115, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("kondisi atap:");
        LINGKUNGAN.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, -1, -1));

        latap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        latap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "bersih", "kotor", " " }));
        LINGKUNGAN.add(latap, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 133, 104, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("kondisi pintu:");
        LINGKUNGAN.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 133, 94, -1));

        lpintu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lpintu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "bersih", "kotor", " " }));
        LINGKUNGAN.add(lpintu, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 133, 115, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("kondisi jendela:");
        LINGKUNGAN.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, -1, -1));

        ljendela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ljendela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "bersih", "kotor", " " }));
        LINGKUNGAN.add(ljendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 174, 104, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("sirkulasi udara");
        LINGKUNGAN.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 177, 93, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Nilai pencahayaan");
        LINGKUNGAN.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 113, 24));

        lpencahayaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpencahayaanActionPerformed(evt);
            }
        });
        LINGKUNGAN.add(lpencahayaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 215, 104, 24));

        lsirkulasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lsirkulasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "lancar", "tidak lancar" }));
        lsirkulasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsirkulasiActionPerformed(evt);
            }
        });
        LINGKUNGAN.add(lsirkulasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 174, 115, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("kelembapan");
        LINGKUNGAN.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 215, 85, 24));

        lkelembapan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LINGKUNGAN.add(lkelembapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 216, 90, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("%");
        LINGKUNGAN.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 219, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Suhu:");
        LINGKUNGAN.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, 113, 22));

        lsuhu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LINGKUNGAN.add(lsuhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 252, 73, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("selanjutnya");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        LINGKUNGAN.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("C");
        LINGKUNGAN.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 255, 17, -1));

        getContentPane().add(LINGKUNGAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 520));

        KENYAMANAN.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        KENYAMANAN.setMinimumSize(new java.awt.Dimension(125, 125));
        KENYAMANAN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Kebocoran:");
        KENYAMANAN.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 60));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Keausan:");
        KENYAMANAN.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Bau:");
        KENYAMANAN.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Kerusakan:");
        KENYAMANAN.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 70, 40));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Kunci pintu dan Jendela:");
        KENYAMANAN.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 70));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Kekokohan:");
        KENYAMANAN.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 100, 50));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Bahaya:");
        KENYAMANAN.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 60));

        kunci.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADA", "TIDAK ADA" }));
        KENYAMANAN.add(kunci, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 100, -1));

        bocor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BOCOR", "TIDAK BOCOR" }));
        bocor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bocorActionPerformed(evt);
            }
        });
        KENYAMANAN.add(bocor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, -1));

        bahaya.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMAN", "TIDAK AMAN" }));
        KENYAMANAN.add(bahaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 100, 20));

        bau.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BAU", "TIDK BAU" }));
        KENYAMANAN.add(bau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, -1));

        kekokohan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KOKOH", "TIDAK KOKOH" }));
        KENYAMANAN.add(kekokohan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 20));

        aus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AUS", "TIDAK AUS" }));
        KENYAMANAN.add(aus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 90, 20));

        kerusakan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RUSAK", "TIDAK RUSAK" }));
        kerusakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kerusakanActionPerformed(evt);
            }
        });
        KENYAMANAN.add(kerusakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 90, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel19.setText("Kenyamanan dan Keamanan Kelas");
        KENYAMANAN.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 330, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("kebisingan");
        KENYAMANAN.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        bising.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BISING", "TIDAK BISING" }));
        KENYAMANAN.add(bising, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 20));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("SUBMIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        KENYAMANAN.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        getContentPane().add(KENYAMANAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        TAMPILAN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel93.setText("TAMPILAN");
        TAMPILAN.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 30));

        getContentPane().add(TAMPILAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       nama.setNama_ruang(namakelas.getText());
       nama.setLokasi_ruang(lokasiruang.getText());
       nama.setProgram_studi(namajurusan.getText());
       nama.database();
       nama.tampil();
       isi.setPanjang(Integer.parseInt(panjang.getText().toString()));
       isi.setLebar(Integer.parseInt(lebar.getText().toString()));
       isi.setJumlah_kursi(Integer.parseInt(jumlahkursi.getText().toString()));
      isi.HitungLuas();
      isi.HitungRasio();
       lebarnya=Integer.parseInt(lebar.getText());
       jumlahkursinya=Integer.parseInt(jumlahkursi.getText());
       isi.tampil();
       
       identitas.setVisible(false);
       JKPS.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panjangActionPerformed

    private void lebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lebarActionPerformed

    private void namakelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namakelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namakelasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       lingkungan.setKondisi_lantai(llantai.getSelectedItem().toString());
       lingkungan.setKondisi_dinding(ldinding.getSelectedItem().toString());
       lingkungan.setKondisi_atap(latap.getSelectedItem().toString());
       lingkungan.setKondisi_jendela(ljendela.getSelectedItem().toString());
       lingkungan.setKondisi_pintu(lpintu.getSelectedItem().toString());
       bersih.setSirkulasi_udara(lsirkulasi.getSelectedItem().toString());
       bersih.setSuhu(Integer.parseInt(lsuhu.getText()));
       bersih.setPencahayaan(Integer.parseInt(lpencahayaan.getText()));
       bersih.setKelembapan(Integer.parseInt(lkelembapan.getText()));
       
       lingkungan.tampil();
       lingkungan.database();
       bersih.tampil();
       LINGKUNGAN.setVisible(false);
       KENYAMANAN.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void llantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llantaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llantaiActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void LOGINHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_LOGINHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINHierarchyChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(  "saya".equals(iusername.getText())&&"kamu".equals(password.getText())){ 
           JOptionPane.showMessageDialog(null, "terimakasih anda telah berhasil LOG in");  
       }
       else{
           JOptionPane.showMessageDialog(null,"Username dan Pasword anda salah");
       
           
       }
       LOGIN.setVisible(false);
       identitas.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void iusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iusernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JKPS.setVisible(rootPaneCheckingEnabled);

        kondisi.setJumlah_steker(Integer.parseInt(jkipas.getSelectedItem().toString()));
        kondisi.setKondisi_steker(Integer.parseInt(kstopkontak.getSelectedItem().toString()));
        kondisi.setPosisi_steker(PSTOP.getSelectedItem().toString());
        kondisi.setJumlah_lcd(Integer.parseInt(jLCD.getSelectedItem().toString()));
        kondisi.setKondisi_lcd(Integer.parseInt(kLCD.getSelectedItem().toString()));
        kondisi.setPosisi_lcd(PLCD.getSelectedItem().toString());
        kondisi.setJumlah_lampu(Integer.parseInt(jlampu.getSelectedItem(). toString()));
        kondisi.setKondisi_lampu(Integer.parseInt(kklampu.getSelectedItem().toString()));
        kondisi.setPosisi_lampu(Plampu.getSelectedItem().toString());
        kondisi.setJumlah_kipasangin(Integer.parseInt(jkipas.getSelectedItem().toString()));
        kondisi.setKondisi_kipasangin(Integer.parseInt(kkipas.getSelectedItem().toString()));
        kondisi.setPosisi_kipasangin(pkipas.getSelectedItem().toString());
        kondisi.setJumlah_ac(Integer.parseInt(jAC.getSelectedItem().toString()));
        kondisi.setKondisi_ac(Integer.parseInt(kAC.getSelectedItem().toString()));
        kondisi.setPosisi_ac(pAC.getSelectedItem().toString());
        kondisi.setJumlah_cctv(Integer.parseInt(jCCTV.getSelectedItem().toString()));
        kondisi.setKondisi_cctv(Integer.parseInt(kCCTV.getSelectedItem().toString()));
        kondisi.setPosisi_cctv(pcctv.getSelectedItem().toString());
        kondisi.setSSID(SSID.getSelectedItem().toString());
        kondisi.setBandwith(Integer.parseInt(bandwith.getText()));

        kondisi.tampil();

        JKPS.setVisible(false);
        LINGKUNGAN.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jstopkontak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstopkontak1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstopkontak1ActionPerformed

    private void jlampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlampuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlampuActionPerformed

    private void kerusakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kerusakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kerusakanActionPerformed

    private void bocorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bocorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bocorActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        kenyamanan.setBau(bau.getSelectedItem().toString());
        kenyamanan.setKeausan( aus.getSelectedItem().toString());
        kenyamanan.setKebisingan(bising.getSelectedItem().toString());
        kenyamanan.setKebocoran(bocor.getSelectedItem().toString());
        kenyamanan.setKerusakan(kerusakan.getSelectedItem().toString());
        keamaanan.setKekokohan(kekokohan.getSelectedItem().toString());
        keamaanan.setKunci(kunci.getSelectedItem().toString());
        keamaanan.setKeamanan(bahaya.getSelectedItem().toString());
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                final String username="root";
                final String password="";
                final Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem_inventaris", username, password);
                
                final PreparedStatement prepare = koneksi.prepareStatement(" INSERT INTO inventaris " + " (Nama_ruang, Lokasi_ruang, Program_studi, Panjang_ruang, Lebar_ruang, Jumlah_kursi, Jumlah_steker, Jumlah_kabelLCD, Jumlah_lampu, Jumlah_kipasangin, Jumlah_AC, Jumlah_CCTV, SSID, Bandwidth, Kondisi_lantai, Kondisi_dinding, Kondisi_atap, Kondisi_pintu, Kondisi_jendela, Sirkulasi_udara, Pencahayaan, Kelembapan, Suhu, Kebocoran, Bau, Aus, Rusak, Bising, Kekokohan, Kunci, Keamanan)"+" VALUES "+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
                
                        //+ "Panjang_ruang, Lebar_ruang, J_kursi, J_stopkontak, J_kabel_LCD, J_lampu, J_kipas_angin, J_AC, J_CCTV, SSID, Bandwidth, K_lantai, K_dinding, K_atap, K_pintu, K_jendela, Sirkulasi_uadara, N_pencahayaan, N_kelembapan, Suhu )"+ " VALUES "+" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
                prepare.setString(1,nama.getNama_ruang());
                prepare.setString(2,nama.getLokasi_ruang());
                prepare.setString(3,nama.getProgram_studi());
                prepare.setDouble(4,panjangnya);
                prepare.setDouble(5,lebarnya);
                prepare.setDouble(6,jumlahkursinya);
                prepare.setInt(7,kondisi.getJumlah_steker());
                prepare.setInt(8,kondisi.getJumlah_lcd());
                prepare.setInt(9,kondisi.getJumlah_lampu());
                prepare.setInt(10,kondisi.getJumlah_kipasangin());
                prepare.setInt(11,kondisi.getJumlah_ac());
                prepare.setInt(12,kondisi.getJumlah_cctv());
                prepare.setString(13,kondisi.getSSID());
                prepare.setInt(14,kondisi.getBandwith());
                prepare.setString(15,lingkungan.getKondisi_lantai());
                prepare.setString(16,lingkungan.getKondisi_dinding());
                prepare.setString(17,lingkungan.getKondisi_atap());
                prepare.setString(18,lingkungan.getKondisi_pintu());
                prepare.setString(19,lingkungan.getKondisi_jendela());
                prepare.setString(20,bersih.getSirkulasi_udara());
                prepare.setInt(21,bersih.getPencahayaan());
                prepare.setInt(22,bersih.getKelembapan());
                prepare.setInt(23,bersih.getSuhu());
                prepare.setString(24,kenyamanan.getKebocoran());
                prepare.setString(25,kenyamanan.getBau());
                prepare.setString(26,kenyamanan.getKeausan());
                prepare.setString(27,kenyamanan.getKerusakan());
                prepare.setString(28,kenyamanan.getKebisingan());
                prepare.setString(29, keamaanan.getKekokohan());///////
                prepare.setString(30,keamaanan.getKunci());
                prepare.setString(31,keamaanan.getKeamanan());               
                prepare.executeUpdate();
                
        }
        catch (final SQLException ex){}
        catch(final InstantiationException ex){}
        catch(final IllegalAccessException ex){}
        catch(final ClassNotFoundException ex){}
        catch(InputMismatchException ex){}
        
        KENYAMANAN.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lsirkulasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsirkulasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lsirkulasiActionPerformed

    private void lpencahayaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpencahayaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lpencahayaanActionPerformed

    private void lokasiruangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasiruangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lokasiruangActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(identitasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(identitasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(identitasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(identitasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new identitasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JKPS;
    private javax.swing.JPanel KENYAMANAN;
    private javax.swing.JPanel LINGKUNGAN;
    private javax.swing.JPanel LOGIN;
    private javax.swing.JComboBox PLCD;
    private javax.swing.JComboBox PSTOP;
    private javax.swing.JComboBox Plampu;
    private javax.swing.JComboBox SSID;
    private javax.swing.JPanel TAMPILAN;
    private javax.swing.JComboBox aus;
    private javax.swing.JComboBox bahaya;
    private javax.swing.JTextField bandwith;
    private javax.swing.JComboBox bau;
    private javax.swing.JComboBox bising;
    private javax.swing.JComboBox bocor;
    private javax.swing.JPanel identitas;
    private javax.swing.JTextField iusername;
    private javax.swing.JComboBox jAC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jCCTV;
    private javax.swing.JComboBox jLCD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox jkipas;
    private javax.swing.JComboBox jlampu;
    private javax.swing.JComboBox jstopkontak1;
    private javax.swing.JTextField jumlahkursi;
    private javax.swing.JComboBox kAC;
    private javax.swing.JComboBox kCCTV;
    private javax.swing.JComboBox kLCD;
    private javax.swing.JComboBox kekokohan;
    private javax.swing.JComboBox kerusakan;
    private javax.swing.JComboBox kkipas;
    private javax.swing.JComboBox kklampu;
    private javax.swing.JComboBox kstopkontak;
    private javax.swing.JComboBox kunci;
    private javax.swing.JComboBox latap;
    private javax.swing.JComboBox ldinding;
    private javax.swing.JTextField lebar;
    private javax.swing.JComboBox ljendela;
    private javax.swing.JTextField lkelembapan;
    private javax.swing.JComboBox llantai;
    private javax.swing.JTextField lokasiruang;
    private javax.swing.JTextField lpencahayaan;
    private javax.swing.JComboBox lpintu;
    private javax.swing.JComboBox lsirkulasi;
    private javax.swing.JTextField lsuhu;
    private javax.swing.JTextField namajurusan;
    private javax.swing.JTextField namakelas;
    private javax.swing.JComboBox pAC;
    private javax.swing.JTextField panjang;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox pcctv;
    private javax.swing.JComboBox pkipas;
    // End of variables declaration//GEN-END:variables
}
