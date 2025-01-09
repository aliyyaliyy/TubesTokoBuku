/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.tubes.jdbc.view;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.itenas.tubes.jdbc.model.DataBuku;
import org.itenas.tubes.jdbc.repository.ControllerDataBuku;
import org.itenas.tubes.jdbc.view.MenuAdmin;
import org.itenas.tubes.jdbc.view.MenuOwner;
import org.itenas.tubes.jdbc.view.MenuKasir;
import org.itenas.tubes.jdbc.utils.ConnectionManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MyBook Z Series
 */
public class LaporanDaftarBuku extends javax.swing.JFrame {

    /**
     * Creates new form LaporanDaftarBuku
     */
    
    ControllerDataBuku conDataBuku = new ControllerDataBuku();
    private DefaultTableModel model;
    private String posisiUser;
    
    public LaporanDaftarBuku(String posisiUser) {
        this.posisiUser = posisiUser;
        initComponents();
        setLocationRelativeTo(null);
        model = new DefaultTableModel();
        
        tabelDataBuku.setModel(model);
        
        model.addColumn("No ISBN");
        model.addColumn("Judul Buku");
        model.addColumn("Genre");
        model.addColumn("Pengarang");
        model.addColumn("Tahun Terbit");
        model.addColumn("Harga");
        model.addColumn("Stok");
        model.addColumn("Tanggal Masuk");
        
        getData();
    }
    
    public LaporanDaftarBuku() {
        this("admin");
    }
    
    private void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tabelDataBuku.getModel();
        
        dtm.setRowCount(0);
        
        ControllerDataBuku controller = new ControllerDataBuku();
        List<DataBuku> listDataBuku = conDataBuku.showAll();
        
        for (DataBuku newData : listDataBuku) {
            dtm.addRow(new Object[] {
                newData.getIsbn(),
                newData.getJudulBuku(),
                newData.getGenre(),
                newData.getPengarang(),
                newData.getTahunTerbit(),
                newData.getHarga(),
                newData.getStok(),
                newData.getTanggalMasuk()
            }) ;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataBuku = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCetakDaftarBuku = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 832));

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1131, 70));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 40)); // NOI18N
        jLabel4.setText("Daftar Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel4)
                .addContainerGap(477, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        tabelDataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No ISBN", "Judul Buku", "Genre", "Pengarang", "Tahun Terbit", "Harga", "Stok", "Tanggal Masuk"
            }
        ));
        jScrollPane1.setViewportView(tabelDataBuku);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReset.setText("rst");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCetakDaftarBuku.setText("Cetak Daftar Buku");
        btnCetakDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakDaftarBukuActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCetakDaftarBuku))
                    .addComponent(jScrollPane1))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCetakDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearch.getText().trim();
        
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                    "Masukkan kata kunci untuk mencari!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            List<DataBuku> hasilPencarian = conDataBuku.findBook(keyword);
            
            DefaultTableModel dtm = (DefaultTableModel) tabelDataBuku.getModel();
            dtm.setRowCount(0);
            
            for (DataBuku buku : hasilPencarian) {
                Object[] data = {
                    buku.getIsbn(),
                    buku.getJudulBuku(),
                    buku.getGenre(),
                    buku.getPengarang(),
                    buku.getTahunTerbit(),
                    buku.getHarga(),
                    buku.getStok(),
                    buku.getTanggalMasuk()
                };
                dtm.addRow(data);
            }
            
            if (hasilPencarian.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tidak ditemukan data dengan kata kunci : " + keyword,
                        "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                "Terjadi kesalahan saat mencari data pegawai: " + ex.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        getData();
        txtSearch.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        if (posisiUser.equalsIgnoreCase("admin")) {
            new MenuAdmin().setVisible(true);
        } else if (posisiUser.equalsIgnoreCase("owner")) {
            new MenuOwner().setVisible(true);
        } else if (posisiUser.equalsIgnoreCase("kasir")) {
            new MenuKasir().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnCetakDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakDaftarBukuActionPerformed
        // TODO add your handling code here:
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("org/itenas/tubes/jdbc/laporan/LaporanDaftarBuku.jrxml");
            
            System.out.println("Resource Path : " + getClass().getClassLoader().getResource("org/itenas/tubes/jdbc/laporan/LaporanDaftarBuku.jrxml"));
            
            //Melakukan pengecekan
            if (input == null) {
                JOptionPane.showMessageDialog(this, "File LaporanDaftarBuku.jrxml tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Kompilasi jrxml menjadi jasper
            JasperReport jasperReport = JasperCompileManager.compileReport(input);
            
            //Menghubungkan ke database
            Connection conn = ConnectionManager.getConnection();
            
            //Membuat parameter kosong
            Map<String, Object> parameters = new HashMap<>();
            
            //mengisi report dengan dataa
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
            
            //Menampilkan laporan dengan menggunakan JasperViewer
            JasperViewer.viewReport(jasperPrint, false);
            
            //Menyimpan laporan sebagai pdf
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Pilih Lokasi Penyimpanan Laporan");
            fileChooser.setSelectedFile(new File("LaporanDaftarBuku.pdf"));
            
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                
                //Mengekspor laporan ke file PDF
                JasperExportManager.exportReportToPdfFile(jasperPrint, fileToSave.getAbsolutePath());
                JOptionPane.showMessageDialog(this, "Laporan berhasil disimpan di : " + fileToSave.getAbsolutePath(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mencetak laporan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(LaporanDaftarBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCetakDaftarBukuActionPerformed

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
            java.util.logging.Logger.getLogger(LaporanDaftarBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanDaftarBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanDaftarBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanDaftarBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        String posisiUser = "admin"; // Nilai default

    // Validasi argumen, hanya "admin" atau "owner" yang diperbolehkan
        if (args.length > 0 && (args[0].equalsIgnoreCase("admin") || args[0].equalsIgnoreCase("owner") || args[0].equalsIgnoreCase("kasir"))) {
            posisiUser = args[0].toLowerCase(); // Atur posisiUser berdasarkan argumen
        } else if (args.length > 0) {
            System.err.println("Posisi tidak valid. Gunakan 'admin' atau 'owner'.");
            return; // Keluar dari program jika argumen tidak valid
        }

        String finalPosisiUser = posisiUser; // Variabel untuk lambda
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaporanDataPegawai(finalPosisiUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetakDaftarBuku;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataBuku;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}