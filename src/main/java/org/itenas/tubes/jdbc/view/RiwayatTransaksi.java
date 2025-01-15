package org.itenas.tubes.jdbc.view;

import com.sun.jdi.connect.Connector;
import java.awt.HeadlessException;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.itenas.tubes.jdbc.repository.ControllerTransaksi;
import org.itenas.tubes.jdbc.utils.ConnectionManager;


/**
 *
 * @author MyBook Z Series
 */
public class RiwayatTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form RiwayatTransaksi
     */
    
    ControllerTransaksi conTransaksi = new ControllerTransaksi();
    private DefaultTableModel model;
    private String posisiUser;
    
    public RiwayatTransaksi(String posisiUser) {
        this.posisiUser = posisiUser;
        initComponents();
        setLocationRelativeTo(null);
        
        initTableModel();
        getData();
    }

    public RiwayatTransaksi() throws HeadlessException {
        this("admin");
    }
    
    
    private void initTableModel() {
        model = new DefaultTableModel();
        tabelRiwayatTransaksi.setModel(model);
        
        
        model.addColumn("Tanggal Transaksi");
        model.addColumn("ID Detail Transaksi");
        model.addColumn("ID Transaksi");
        model.addColumn("ID Pegawai");
        model.addColumn("Nama Pegawai");
        model.addColumn("No ISBN");
        model.addColumn("Harga Satuan");
        model.addColumn("Jumlah Yang Dibeli");
        model.addColumn("Subtotal");
    }
    
    public final void getData() {
        model.setRowCount(0);
        
        try {
            conTransaksi.riwayatTransaksi(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRiwayatTransaksi = new javax.swing.JTable();
        ctkRiwayat = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 232, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 832));

        jPanel2.setBackground(new java.awt.Color(44, 100, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(1130, 70));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 232, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Riwayat Transaksi");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        tabelRiwayatTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal Transaksi", "ID Detail Transaksi", "ID Transaksi", "ID Pegawai", "Nama Pegawai", "No ISBN ", "Harga Satuan", "Jumlah Yang Dibeli", "Subtotal"
            }
        ));
        tabelRiwayatTransaksi.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelRiwayatTransaksi.setPreferredSize(new java.awt.Dimension(580, 75));
        jScrollPane1.setViewportView(tabelRiwayatTransaksi);

        ctkRiwayat.setBackground(new java.awt.Color(44, 100, 133));
        ctkRiwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ctkRiwayat.setForeground(new java.awt.Color(231, 232, 231));
        ctkRiwayat.setText("Cetak Riwayat");
        ctkRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctkRiwayatActionPerformed(evt);
            }
        });

        txtSearch.setMinimumSize(new java.awt.Dimension(72, 22));

        btnSearch.setBackground(new java.awt.Color(44, 100, 133));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(231, 232, 231));
        btnSearch.setText("SEARCH");
        btnSearch.setPreferredSize(new java.awt.Dimension(76, 23));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(44, 100, 133));
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(231, 232, 231));
        btnKembali.setText("Kembali");
        btnKembali.setPreferredSize(new java.awt.Dimension(98, 35));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(44, 100, 133));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(231, 232, 231));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ctkRiwayat))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ctkRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctkRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctkRiwayatActionPerformed
        // TODO add your handling code here:
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("org/itenas/tubes/jdbc/laporan/RiwayatTransaksi.jrxml");
            
            System.out.println("Resource Path: " + getClass().getClassLoader().getResource("org/itenas/tubes/jdbc/laporan/RiwayatTransaksi.jrxml"));
            
            //Pengecekan File
            if (input == null) {
                JOptionPane.showMessageDialog(this, "File RiwayatTransaksi.jrxml tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Kompilasi laporan
            JasperReport jasperReport = JasperCompileManager.compileReport(input);
            
            //koneksi ke database
            Connection conn = ConnectionManager.getConnection();
            
            //
            Map<String, Object> parameters = new HashMap<>();
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
            
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Pilih Lokasi Penyimpanan Laporan");
            fileChooser.setSelectedFile(new File("RiwayatTransaksi.pdf"));
            
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                
                JasperExportManager.exportReportToPdfFile(jasperPrint, fileToSave.getAbsolutePath());
                
                JOptionPane.showMessageDialog(this, "Laporan transaksi berhasil disimpan di:  " + fileToSave.getAbsolutePath(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
                
                //Menampilkan laporan di jaspervieweer setelah file disimpan
                JasperViewer.viewReport(jasperPrint, false);
            } else {
                JOptionPane.showMessageDialog(this, "Penyimpanan laporan Riwayat Transaksi dibatalkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (JRException je) {
            JOptionPane.showMessageDialog(this, "Gagal mencetak : " + je.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException se) {
            Logger.getLogger(LaporanDataPegawai.class.getName()).log(Level.SEVERE, null, se);
        }
    }//GEN-LAST:event_ctkRiwayatActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearch.getText().trim();
        
        DefaultTableModel model = (DefaultTableModel) tabelRiwayatTransaksi.getModel();
        
        //Memanggil method search yang ada di controllerTransaksi
        ControllerTransaksi controller = new ControllerTransaksi();
        controller.searchRiwayatTransaksi(keyword, model);
    }//GEN-LAST:event_btnSearchActionPerformed

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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        getData();
        txtSearch.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(RiwayatTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        String posisiUser = "admin";
        
        //Melakukan validasi argumen, 
        if (args.length > 0 && (args[0].equalsIgnoreCase("admin") || args[0].equalsIgnoreCase("Owner") || args[0].equalsIgnoreCase("kasir"))) {
            posisiUser = args[0].toLowerCase();
        } else if (args.length > 0) {
            System.err.println("Posisi tidak valid. Gunakan 'admin', 'owner' atau 'Kasir'.");
            return;
        }
        
        String finalPosisiUser = posisiUser;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiwayatTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton ctkRiwayat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRiwayatTransaksi;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
