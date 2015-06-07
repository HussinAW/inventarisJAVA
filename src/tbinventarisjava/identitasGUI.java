/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

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
        TAMPIL.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
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
        jstopkontak = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kstopkontak = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pstopkontak = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jkabelLCD = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        kkabelLCD = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pkabelLCD = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jlampu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        klampu = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        pLampu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jKipasangin = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        kKipasangin = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pKipasangin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jAC = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        kAC = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        pAC = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jCCTV = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pCCTV = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        SSID = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        bandwith = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        kKebisingan = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        kKebisingan1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        kKebisingan2 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        kbau = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        kKebisingan4 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        kKebisingan5 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        kKebisingan6 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        kKebisingan7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        TAMPIL = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(680, 400));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGIN.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        LOGIN.setFocusCycleRoot(true);
        LOGIN.setNextFocusableComponent(identitas);
        LOGIN.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                LOGINHierarchyChanged(evt);
            }
        });
        LOGIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("OCR-A BT", 1, 24)); // NOI18N
        jLabel90.setText("UNIVERSITAS MUHAMMADIYAH MALANG");
        LOGIN.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel91.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel91.setText("ADMIN AREA");
        LOGIN.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("masuk");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        LOGIN.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel88.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 255, 255));
        jLabel88.setText("Username");
        LOGIN.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 110, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(51, 255, 255));
        jLabel89.setText("Password");
        LOGIN.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, -1));
        LOGIN.add(iusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 190, 40));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        LOGIN.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, 40));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/Logo_umm.png"))); // NOI18N
        LOGIN.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 170, 140));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/umm11.jpg"))); // NOI18N
        LOGIN.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        identitas.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        identitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("IDENTITAS KELAS");
        identitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 102, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama kelas");
        identitas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 140, 20));

        namakelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namakelasActionPerformed(evt);
            }
        });
        identitas.add(namakelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, 40));

        jButton1.setText("selanjutnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        identitas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Lokasi ruang kelas:");
        identitas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama jurusan:");
        identitas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 30));
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
        identitas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, 30));
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
        JKPS.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 87, -1, -1));

        jstopkontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstopkontakActionPerformed(evt);
            }
        });
        JKPS.add(jstopkontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 87, 46, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("kondisi:");
        JKPS.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 87, -1, -1));
        JKPS.add(kstopkontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 87, 44, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Posisi:");
        JKPS.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 87, -1, -1));
        JKPS.add(pstopkontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 87, 69, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("2.kabel LCD");
        JKPS.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 118, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Jumlah:");
        JKPS.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 146, -1, -1));
        JKPS.add(jkabelLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 146, 46, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("kondisi:");
        JKPS.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 146, -1, -1));
        JKPS.add(kkabelLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 146, 44, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Posisi:");
        JKPS.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 146, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("3.Lampu");
        JKPS.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 177, 72, -1));
        JKPS.add(pkabelLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 146, 69, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Jumlah:");
        JKPS.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, -1));
        JKPS.add(jlampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 46, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Kondisi:");
        JKPS.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 200, -1, -1));
        JKPS.add(klampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 200, 43, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Posisi:");
        JKPS.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 200, -1, -1));
        JKPS.add(pLampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 200, 69, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("4.Kipas Angin");
        JKPS.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 231, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Jumlah:");
        JKPS.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 259, -1, -1));
        JKPS.add(jKipasangin, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 259, 51, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Kondisi:");
        JKPS.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 259, -1, -1));
        JKPS.add(kKipasangin, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 259, 43, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Posisi:");
        JKPS.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 259, -1, -1));
        JKPS.add(pKipasangin, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 259, 69, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("5.AC");
        JKPS.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Jumlah:");
        JKPS.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 319, -1, -1));
        JKPS.add(jAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 319, 51, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Kondisi:");
        JKPS.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 319, -1, -1));
        JKPS.add(kAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 319, 43, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Posisi:");
        JKPS.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 319, -1, -1));
        JKPS.add(pAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 319, 69, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("6.CCTV");
        JKPS.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Jumlah:");
        JKPS.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 384, -1, -1));
        JKPS.add(jCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 384, 51, -1));
        JKPS.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 384, 43, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Kondisi:");
        JKPS.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 384, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Posisi:");
        JKPS.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 384, -1, -1));
        JKPS.add(pCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 384, 69, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("7.SSID");
        JKPS.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 415, -1, -1));

        SSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSIDActionPerformed(evt);
            }
        });
        JKPS.add(SSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 71, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("SSID:");
        JKPS.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("8.Bandwith");
        JKPS.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));
        JKPS.add(bandwith, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 70, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("bandwith");
        JKPS.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jButton2.setText("selanjutnya");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JKPS.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, -1));

        getContentPane().add(JKPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 590));

        LINGKUNGAN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("LINGKUNGAN KELAS");
        LINGKUNGAN.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 11, -1, -1));

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
        LINGKUNGAN.add(lpencahayaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 215, 104, 24));

        lsirkulasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lsirkulasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "input", "lancar", "tidak lancar" }));
        LINGKUNGAN.add(lsirkulasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 174, 115, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("kelembapan");
        LINGKUNGAN.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 215, 85, 24));

        lkelembapan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LINGKUNGAN.add(lkelembapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 216, 83, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("%");
        LINGKUNGAN.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 219, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Suhu:");
        LINGKUNGAN.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, 113, 22));

        lsuhu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LINGKUNGAN.add(lsuhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 252, 73, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("selanjutnya");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        LINGKUNGAN.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("C");
        LINGKUNGAN.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 255, 17, -1));

        getContentPane().add(LINGKUNGAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 520));

        KENYAMANAN.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        KENYAMANAN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("kenyamanan dan keamanan Kelas");
        KENYAMANAN.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Kebisingan:");
        KENYAMANAN.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        kKebisingan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kKebisinganActionPerformed(evt);
            }
        });
        KENYAMANAN.add(kKebisingan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Kebocoran:");
        KENYAMANAN.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        KENYAMANAN.add(kKebisingan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Keausan:");
        KENYAMANAN.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        kKebisingan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kKebisingan2ActionPerformed(evt);
            }
        });
        KENYAMANAN.add(kKebisingan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Bau:");
        KENYAMANAN.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        KENYAMANAN.add(kbau, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Kerusakan:");
        KENYAMANAN.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        kKebisingan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kKebisingan4ActionPerformed(evt);
            }
        });
        KENYAMANAN.add(kKebisingan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Kunci pintu dan Jendela:");
        KENYAMANAN.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        KENYAMANAN.add(kKebisingan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Kekokohan:");
        KENYAMANAN.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        KENYAMANAN.add(kKebisingan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Bahaya:");
        KENYAMANAN.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        KENYAMANAN.add(kKebisingan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("selanjutnya");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        KENYAMANAN.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        getContentPane().add(KENYAMANAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TAMPIL.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        TAMPIL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setText("YANG TELAH ANDA INPUTKAN");
        TAMPIL.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32569, -32757, 40, 14));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Nama Ruang");
        TAMPIL.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32758, -32717, 40, 14));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Lokasi Ruang");
        TAMPIL.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Program Studi");
        TAMPIL.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("Jumlah Steker");
        TAMPIL.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Jumlah LCD");
        TAMPIL.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Jumlah Lampu");
        TAMPIL.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Jumlah Kipas Angin");
        TAMPIL.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Jumlah AC");
        TAMPIL.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("SSID");
        TAMPIL.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Bandwith");
        TAMPIL.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        TAMPIL.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32159, -32717, -1, -1));

        jLabel69.setText(":");
        TAMPIL.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32622, -32714, 40, -1));

        jLabel70.setText(":");
        TAMPIL.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32622, -32691, 40, -1));

        jLabel71.setText(":");
        TAMPIL.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32622, -32668, 40, -1));

        jLabel72.setText(":");
        TAMPIL.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32622, -32645, 40, -1));

        jLabel73.setText(":");
        TAMPIL.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32622, -32622, 40, -1));

        jLabel74.setText(":");
        TAMPIL.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32622, -32599, 40, -1));

        jLabel75.setText(":");
        TAMPIL.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32624, -32576, 40, -1));

        jLabel76.setText(":");
        TAMPIL.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32624, -32553, 40, -1));

        jLabel77.setText(":");
        TAMPIL.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32624, -32530, 40, -1));

        jLabel78.setText(":");
        TAMPIL.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32624, -32507, 40, -1));

        jLabel68.setText("jLabel68");
        TAMPIL.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32612, -32714, -1, -1));

        jLabel79.setText("jLabel79");
        TAMPIL.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32612, -32691, -1, -1));

        jLabel80.setText("jLabel80");
        TAMPIL.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32612, -32668, -1, -1));

        jLabel81.setText("jLabel81");
        TAMPIL.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32612, -32645, -1, -1));

        jLabel82.setText("jLabel82");
        TAMPIL.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32612, -32622, -1, -1));

        jLabel83.setText("jLabel83");
        TAMPIL.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32612, -32599, -1, -1));

        jLabel84.setText("jLabel84");
        TAMPIL.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32614, -32576, -1, -1));

        jLabel85.setText("jLabel85");
        TAMPIL.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32614, -32553, -1, -1));

        jLabel86.setText("jLabel86");
        TAMPIL.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32614, -32530, -1, -1));

        jLabel87.setText("jLabel87");
        TAMPIL.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32614, -32507, -1, -1));

        getContentPane().add(TAMPIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       nama.setNama_ruang(namakelas.getText());
       nama.setLokasi_ruang(lokasiruang.getText());
       nama.setProgram_studi(namajurusan.getText());
       nama.simpan();
       nama.tampil();
       panjangnya=Integer.parseInt(panjang.getText());
       lebarnya=Integer.parseInt(lebar.getText());
       jumlahkursinya=Integer.parseInt(jumlahkursi.getText());
       isi.tampil();
       //identitas.simpan();
       //identitas.tampil();
       identitas.setVisible(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panjangActionPerformed

    private void lebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lebarActionPerformed

    private void SSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSIDActionPerformed

    private void namakelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namakelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namakelasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    JKPS.setVisible(rootPaneCheckingEnabled);
        
        kondisi.setJumlah_steker(Integer.parseInt(jstopkontak.getText()));
      kondisi.setKondisi_steker(Integer.parseInt(kstopkontak.getText()));
      kondisi.setPosisi_steker(pstopkontak.getText());
      kondisi.setJumlah_lcd(Integer.parseInt(jkabelLCD.getText()));
      kondisi.setKondisi_lcd(Integer.parseInt(kkabelLCD.getText()));
      kondisi.setPosisi_lcd(pkabelLCD.getText());
      kondisi.setJumlah_lampu(Integer.parseInt(jlampu.getText()));
      kondisi.setKondisi_lampu(Integer.parseInt(klampu.getText()));
      kondisi.setPosisi_lampu(pLampu.getText());
      kondisi.setJumlah_kipasangin(Integer.parseInt(jKipasangin.getText()));
      kondisi.setKondisi_kipasangin(Integer.parseInt(kKipasangin.getText()));
      kondisi.setPosisi_kipasangin(pKipasangin.getText());
      kondisi.setJumlah_ac(Integer.parseInt(jAC.getText()));
      kondisi.setKondisi_ac(Integer.parseInt(kAC.getText()));
      kondisi.setSSID(SSID.getText());
      kondisi.setBandwith(Integer.parseInt(bandwith.getText()));
      
      kondisi.tampil();
      
         JKPS.setVisible(false);
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jstopkontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstopkontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstopkontakActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       lingkungan.setKondisi_lantai(llantai.getSelectedItem().toString());
       lingkungan.setKondisi_dinding(ldinding.getSelectedItem().toString());
       lingkungan.setKondisi_atap(latap.getSelectedItem().toString());
       lingkungan.setKondisi_jendela(ljendela.getSelectedItem().toString());
       lingkungan.setKondisi_pintu(lpintu.getSelectedItem().toString());
       
       lingkungan.tampil();
       lingkungan.simpan();
       LINGKUNGAN.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void llantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llantaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_llantaiActionPerformed

    private void kKebisinganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kKebisinganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kKebisinganActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        kenyamanan.setBau(kbau.getText());
        kenyamanan.setKeausan(kKebisingan2.getText());
        kenyamanan.setKebisingan(kKebisingan.getText());
        kenyamanan.setKebocoran(kKebisingan1.getText());
        kenyamanan.setKerusakan(kKebisingan4.getText());
        keamaanan.setKekokohan(kKebisingan6.getText());
        keamaanan.setKunci(kKebisingan5.getText());
        keamaanan.setKeamanan(kKebisingan7.getText());
        
        KENYAMANAN.setVisible(false);
        

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void kKebisingan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kKebisingan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kKebisingan2ActionPerformed

    private void kKebisingan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kKebisingan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kKebisingan4ActionPerformed

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
    private javax.swing.JTextField SSID;
    private javax.swing.JPanel TAMPIL;
    private javax.swing.JTextField bandwith;
    private javax.swing.JPanel identitas;
    private javax.swing.JTextField iusername;
    private javax.swing.JTextField jAC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField jCCTV;
    private javax.swing.JTextField jKipasangin;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jkabelLCD;
    private javax.swing.JTextField jlampu;
    private javax.swing.JTextField jstopkontak;
    private javax.swing.JTextField jumlahkursi;
    private javax.swing.JTextField kAC;
    private javax.swing.JTextField kKebisingan;
    private javax.swing.JTextField kKebisingan1;
    private javax.swing.JTextField kKebisingan2;
    private javax.swing.JTextField kKebisingan4;
    private javax.swing.JTextField kKebisingan5;
    private javax.swing.JTextField kKebisingan6;
    private javax.swing.JTextField kKebisingan7;
    private javax.swing.JTextField kKipasangin;
    private javax.swing.JTextField kbau;
    private javax.swing.JTextField kkabelLCD;
    private javax.swing.JTextField klampu;
    private javax.swing.JTextField kstopkontak;
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
    private javax.swing.JTextField pAC;
    private javax.swing.JTextField pCCTV;
    private javax.swing.JTextField pKipasangin;
    private javax.swing.JTextField pLampu;
    private javax.swing.JTextField panjang;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField pkabelLCD;
    private javax.swing.JTextField pstopkontak;
    // End of variables declaration//GEN-END:variables
}
