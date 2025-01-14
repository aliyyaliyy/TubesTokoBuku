package org.itenas.tubes.jdbc.view;

/**
 *
 * @author MyBook Z Series
 */

import org.itenas.tubes.jdbc.model.DataPegawai;
import org.itenas.tubes.jdbc.view.LoginPage;
import org.itenas.tubes.jdbc.view.KelolaDataPegawai;
import org.itenas.tubes.jdbc.view.MenuAdmin;
import org.itenas.tubes.jdbc.view.LaporanDataPegawai;
import org.itenas.tubes.jdbc.view.LaporanDaftarBuku;


public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuPegawai
     */
    public MenuAdmin() {
        initComponents();
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
        btnKelolaDataPegawai = new javax.swing.JButton();
        btnKelolaDataBuku = new javax.swing.JButton();
        btnLaporanDataPegawai = new javax.swing.JButton();
        btnLaporanDaftarBuku = new javax.swing.JButton();
        btnRiwayat = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 232, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 832));

        jPanel2.setBackground(new java.awt.Color(44, 100, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(1131, 70));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 232, 231));
        jLabel4.setText("Menu Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel4)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        btnKelolaDataPegawai.setBackground(new java.awt.Color(44, 100, 133));
        btnKelolaDataPegawai.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnKelolaDataPegawai.setForeground(new java.awt.Color(231, 232, 231));
        btnKelolaDataPegawai.setText("Kelola Data Pegawai");
        btnKelolaDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelolaDataPegawaiActionPerformed(evt);
            }
        });

        btnKelolaDataBuku.setBackground(new java.awt.Color(44, 100, 133));
        btnKelolaDataBuku.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnKelolaDataBuku.setForeground(new java.awt.Color(231, 232, 231));
        btnKelolaDataBuku.setText("Kelola Data Buku");
        btnKelolaDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelolaDataBukuActionPerformed(evt);
            }
        });

        btnLaporanDataPegawai.setBackground(new java.awt.Color(44, 100, 133));
        btnLaporanDataPegawai.setForeground(new java.awt.Color(231, 232, 231));
        btnLaporanDataPegawai.setText("Laporan Data Pegawai");
        btnLaporanDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanDataPegawaiActionPerformed(evt);
            }
        });

        btnLaporanDaftarBuku.setBackground(new java.awt.Color(44, 100, 133));
        btnLaporanDaftarBuku.setForeground(new java.awt.Color(231, 232, 231));
        btnLaporanDaftarBuku.setText("Laporan Data Buku");
        btnLaporanDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanDaftarBukuActionPerformed(evt);
            }
        });

        btnRiwayat.setBackground(new java.awt.Color(44, 100, 133));
        btnRiwayat.setForeground(new java.awt.Color(231, 232, 231));
        btnRiwayat.setText("Riwayat");
        btnRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(44, 100, 133));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(231, 232, 231));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKelolaDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLaporanDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKelolaDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLaporanDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btnRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKelolaDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKelolaDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaporanDataPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaporanDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKelolaDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelolaDataPegawaiActionPerformed
        // TODO add your handling code here:
        new KelolaDataPegawai().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKelolaDataPegawaiActionPerformed

    private void btnKelolaDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelolaDataBukuActionPerformed
        // TODO add your handling code here:
        new KelolaDataBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKelolaDataBukuActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLaporanDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanDataPegawaiActionPerformed
        // TODO add your handling code here:
        LaporanDataPegawai halaman = new LaporanDataPegawai("admin"); // Kirim posisi sebagai parameter
        halaman.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLaporanDataPegawaiActionPerformed

    private void btnLaporanDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanDaftarBukuActionPerformed
        // TODO add your handling code here:
        LaporanDaftarBuku halaman = new LaporanDaftarBuku("admin"); // Kirim posisi sebagai parameter
        halaman.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLaporanDaftarBukuActionPerformed

    private void btnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatActionPerformed
        // TODO add your handling code here:
        RiwayatTransaksi halaman = new RiwayatTransaksi("admin");
        halaman.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRiwayatActionPerformed

    /*public void bukaHalamanDataPegawai() {
        KelolaDataPegawai halaman = new KelolaDataPegawai("admin"); // Kirim posisi sebagai parameter
        halaman.setVisible(true);
        this.dispose(); // Tutup halaman MenuAdmin
    }*/
    

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKelolaDataBuku;
    private javax.swing.JButton btnKelolaDataPegawai;
    private javax.swing.JButton btnLaporanDaftarBuku;
    private javax.swing.JButton btnLaporanDataPegawai;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
