/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.tubes.jdbc.view;

/**
 *
 * @author MyBook Z Series
 */

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collector;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.itenas.tubes.jdbc.model.DataBuku;
import org.itenas.tubes.jdbc.repository.ControllerDataBuku;
import org.itenas.tubes.jdbc.view.MenuAdmin;

public class KelolaDataBuku extends javax.swing.JFrame {

    /**
     * Creates new form KelolaDataBuku coba 
     */
    
    boolean hasil;
    ControllerDataBuku conBuku = new ControllerDataBuku();
    private DefaultTableModel model;
    
    public KelolaDataBuku() {
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
    
    public void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tabelDataBuku.getModel();
        
        dtm.setRowCount(0);
        
        //yang diinputin, ditampilin ke tabel
        ControllerDataBuku controller = new ControllerDataBuku();
        List<DataBuku> listBuku = conBuku.showAll();
        
        for (DataBuku newData : listBuku) {
            dtm.addRow(new Object[] {
                newData.getIsbn(),
                newData.getJudulBuku(),
                newData.getGenre(),
                newData.getPengarang(),
                newData.getTahunTerbit(),
                newData.getHarga(),
                newData.getStok(),
                newData.getTanggalMasuk()
            });
        }
    }
    
    public void clearData() {
        txtNoISBN.setText("");
        txtNoISBN.setEditable(true); 
        txtNoISBN.setEnabled(true);
        txtJudulBuku.setText("");
        txtGenre.setText("");
        txtPengarang.setText("");
        txtTahunTerbit.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        dateChooserTanggalMasuk.setDate(null); 
        txtNoISBN.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        satu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_namaPegawai = new javax.swing.JLabel();
        txtNoISBN = new javax.swing.JTextField();
        txtJudulBuku = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGenre = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTahunTerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateChooserTanggalMasuk = new com.toedter.calendar.JDateChooser();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataBuku = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        satu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        satu.setText("Clear");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 832));

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1131, 70));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 40)); // NOI18N
        jLabel4.setText("Kelola Data Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(396, 396, 396))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jLabel_namaPegawai.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel_namaPegawai.setText("No ISBN");

        txtNoISBN.setPreferredSize(new java.awt.Dimension(342, 38));
        txtNoISBN.setRequestFocusEnabled(false);
        txtNoISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoISBNActionPerformed(evt);
            }
        });

        txtJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulBukuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel1.setText("Judul Buku");

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel2.setText("Genre");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel3.setText("Pengarang");

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel5.setText("Tahun Terbit");

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel6.setText("Harga");

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel7.setText("Stok");

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel8.setText("Tanggal Masuk");

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

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

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setText("rst");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_namaPegawai)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(txtJudulBuku)
                                .addComponent(txtGenre)
                                .addComponent(txtNoISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtTahunTerbit)
                                        .addComponent(txtPengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(186, 186, 186))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStok)
                                        .addComponent(dateChooserTanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(jLabel_namaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dateChooserTanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoISBNActionPerformed

    private void txtJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulBukuActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satuActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        getData();
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabelDataBuku.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih data buku yang ingin diubah!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //proses ngambil data dari tabel
        String isbn = tabelDataBuku.getValueAt(selectedRow, 0).toString();
        String judulBuku = tabelDataBuku.getValueAt(selectedRow, 1).toString();
        
        //Opsi yang nanti bakal pengguna pilih
        String[] opsi = {"Harga", "Stok"};
        int choice = JOptionPane.showOptionDialog(null, 
                "Pilih yang akan kamu update untuk buku \"" + judulBuku + "\":", 
                "Update Data Buku", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opsi, 
                opsi[0]
        );
        
        if (choice == -1) {
            return;
        }
        
        try {
            DataBuku buku = new DataBuku();
            buku.setIsbn(isbn);
            
            if (choice == 0) {
                String hargaBaru = JOptionPane.showInputDialog(null,
                        "Masukkan harga baru untuk buku \"" + judulBuku + "\":",
                        "Update Harga", JOptionPane.QUESTION_MESSAGE);
                
               if (hargaBaru == null || hargaBaru.isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong!", "ERROR", JOptionPane.ERROR_MESSAGE);
                  return;
               }
               
               int newHarga = Integer.parseInt(hargaBaru);
               buku.setHarga(newHarga);
               
               //mengupdate harga
               boolean succes = conBuku.updateHarga(buku);
               if (succes) {
                   JOptionPane.showMessageDialog(null, "Harga berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                   getData();
                   return;
               } else {
                   JOptionPane.showMessageDialog(null, "Gagal mengubah harga!", "Error", JOptionPane.ERROR_MESSAGE);
               }  
            } else if (choice == 1) {
                String stokBaru = JOptionPane.showInputDialog(null,
                        "Masukkan stok baru untuk buku \"" + judulBuku + "\":",
                        "Update stok", JOptionPane.QUESTION_MESSAGE);
                
                if (stokBaru == null || stokBaru.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Stok tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                int newStok = Integer.parseInt(stokBaru);
                buku.setStok(newStok);
                
                //Mengupdate hanya stok
                boolean success = conBuku.updateStok(buku);
                if (success) {
                    JOptionPane.showMessageDialog(null, "Stok berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    getData();
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal mengubah stok!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            getData();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan angka yang valid untuk harga atau stok!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNoISBN.getText().trim().isEmpty() || 
                txtJudulBuku.getText().trim().isEmpty() || 
                txtGenre.getText().trim().isEmpty() || 
                txtPengarang.getText().trim().isEmpty() || 
                txtTahunTerbit.getText().trim().isEmpty() || 
                txtHarga.getText().trim().isEmpty() || 
                txtStok.getText().trim().isEmpty() || 
                dateChooserTanggalMasuk.getDate() == null) {
                
                JOptionPane.showMessageDialog(this, "Semua Data wajib diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Mengambil inputan dari JTextField yang sudah diisi oleh user
            //untuk yang yeng angka
            int tahunTerbit, harga, stok;
            try {
                tahunTerbit = Integer.parseInt(txtTahunTerbit.getText().trim());
                harga = Integer.parseInt(txtHarga.getText().trim());
                stok = Integer.parseInt(txtStok.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Pastikan ISBN, Tahun Terbit, Harga, dan Stok berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //untuk string
            String isbn = txtNoISBN.getText().trim();
            String judulBuku = txtJudulBuku.getText().trim();
            String genre = txtGenre.getText().trim();
            String pengarang = txtPengarang.getText().trim();
            
            
            //Mengambil inputan dari JDateChooser
            java.util.Date tanggalMasukData = dateChooserTanggalMasuk.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalMasuk = sdf.format(tanggalMasukData);
            
            //Mmebuat objek DataBuku
            DataBuku buku = new DataBuku();
            buku.setIsbn(isbn);
            buku.setJudulBuku(judulBuku);
            buku.setGenre(genre);
            buku.setPengarang(pengarang);
            buku.setTahunTerbit(tahunTerbit);
            buku.setHarga(harga);
            buku.setStok(stok);
            buku.setTanggalMasuk(new java.sql.Date(tanggalMasukData.getTime()));
            
            //Menyimpan data
            boolean success = conBuku.create(buku);
            
            if (success) {
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                getData();
                clearData();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menambahkan data buku!", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Pastikan ISBN, Tahun Terbit, Harga, dan Stok berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabelDataBuku.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih data buku yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int noISBN = Integer.parseInt(tabelDataBuku.getValueAt(selectedRow, 0).toString());
        String judulBuku = tabelDataBuku.getValueAt(selectedRow, 1).toString();
        
        //Konfirmasi penghapusan
        int konfirmasi = JOptionPane.showConfirmDialog(null, 
                "Apakah anda yakin ingin menghapus buku \"" + judulBuku + "\" dengan NO ISBN" 
                        + "?", "Konfirmasi hapus", JOptionPane.YES_NO_OPTION);
        
        if (konfirmasi != JOptionPane.YES_OPTION) {
            return;
        }
        
        //Proses menghapus data pake controller
        boolean success = conBuku.delete(noISBN);
        
        if (success) {
            JOptionPane.showMessageDialog(null, "Data buku berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            getData();
        } else {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data buku!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearch.getText().trim();
        System.out.println("Keyword: " + keyword);
        
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Keyword tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //sudah mmebuat controller data buku di atas
        
        //memanggil metdho buat pencarian data
        List<DataBuku> hasilPencarian = conBuku.findBook(keyword);
        
        //
        if (hasilPencarian.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Buku tidak ditemukan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tabelDataBuku.getModel();
            model.setRowCount(0);
            
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
                model.addRow(data);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        getData();
        txtSearch.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateChooserTanggalMasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_namaPegawai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton satu;
    private javax.swing.JTable tabelDataBuku;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtNoISBN;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
