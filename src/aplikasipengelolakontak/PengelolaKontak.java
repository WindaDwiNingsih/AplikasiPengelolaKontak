/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipengelolakontak;

import aplikasipengelolakontak.KontakController;
import java.io.*;
import aplikasipengelolakontak.Kontak;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class PengelolaKontak extends javax.swing.JFrame {

    private DefaultTableModel model;
    private KontakController controller;
    public PengelolaKontak() {
        initComponents();
//        DatabaseSetup.createTable();
//        TampilData();
//        tblKontak.setModel(model);
//        bersih();
        controller = new KontakController();
        model = new DefaultTableModel(new String[]

        {"No", "Nama", "Nomor Telepon", "Kategori"}, 0);

        tblKontak.setModel(model);
        loadContacts();
    }
    //DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama", "Nomor", "Kategori"}, 0);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNomorTelepon = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtPencarian = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKontak = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi Pengelola kontak");

        jLabel2.setText("Nama ");

        jLabel3.setText("Nomor Telepon");

        jLabel4.setText("Cari Kontak");

        jLabel5.setText("Kategori");

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtNomorTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorTeleponActionPerformed(evt);
            }
        });

        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPencarianKeyTyped(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plih Kategori", "Keluarga", "Teman", "Rekan Kerja" }));

        tblKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKontakMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKontak);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(txtnama))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPencarian)
                                    .addComponent(txtNomorTelepon)
                                    .addComponent(cmbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2)
                    .addComponent(txtNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton3)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton5.setText("Impor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ekspor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editContact();
//        int selectedRow = tblKontak.getSelectedRow();
//        // Validasi field input
//        if (nama.getText().trim().isEmpty() || nomor.getText().trim().isEmpty() || cKategori.getSelectedIndex() == -1) {
//            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        int id = (int) model.getValueAt(selectedRow, 0);
//        String namaKontak = nama.getText();
//        String nomorTelp = nomor.getText();
//        String kategori = cKategori.getSelectedItem().toString();
//
//        String sql = "UPDATE kontak SET nama = ?, nomor_telepon = ?, kategori = ? WHERE id = ?";
//        try (Connection conn = DatabaseSetup.connect();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, namaKontak);
//            pstmt.setString(2, nomorTelp);
//            pstmt.setString(3, kategori);
//            pstmt.setInt(4, id);
//            pstmt.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Kontak berhasil diubah!");
//            TampilData();
//            bersih();
//            
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNomorTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorTeleponActionPerformed
        if (!txtNomorTelepon.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Nomor telepon hanya boleh berisi angka!");
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorTeleponActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addContact();
        // Validasi field input
//        if (nama.getText().trim().isEmpty() || nomor.getText().trim().isEmpty() || cKategori.getSelectedIndex() == -1) {
//            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        String sql = "INSERT INTO kontak(nama, nomor_telepon, kategori) VALUES(?, ?, ?)";
//        try (Connection conn = DatabaseSetup.connect();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, nama.getText());
//            pstmt.setString(2, nomor.getText());
//            pstmt.setString(3, cKategori.getSelectedItem().toString());
//            pstmt.executeUpdate();
//            //menampilkan data padatabel
//            TampilData();
//
//            // Kosongkan input form
//            bersih();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        deleteContact();
//        int selectedRow = tblKontak.getSelectedRow();
//        if (selectedRow == -1) {
//            JOptionPane.showMessageDialog(this, "Pilih kontak yang ingin dihapus!");
//            return;
//        }
//
//        int id = (int) model.getValueAt(selectedRow, 0);
//
//        String sql = "DELETE FROM kontak WHERE id = ?";
//        try (Connection conn = DatabaseSetup.connect();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setInt(1, id);
//            pstmt.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Kontak berhasil dihapus!");
//            TampilData();
//            bersih();
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKontakMouseClicked
        int selectedRow = tblKontak.getSelectedRow();
        if (selectedRow != -1) {
        populateInputFields(selectedRow);
        }

// Dapatkan indeks baris yang diklik
//    int selectedRow = tblKontak.getSelectedRow();
//
//    // Pastikan ada baris yang dipilih
//    if (selectedRow != -1) {
//        // Ambil data dari baris yang diklik
//        String namaKontak = model.getValueAt(selectedRow, 1).toString();
//        String nomorTelp = model.getValueAt(selectedRow, 2).toString();
//        String kategori = model.getValueAt(selectedRow, 3).toString();
//
//        // Set data ke TextField dan ComboBox
//        nama.setText(namaKontak);
//        txtNomorTelepon.setText(nomorTelp);
//        cmbKategori.setSelectedItem(kategori);
//    }
// TODO add your handling code here:
    }//GEN-LAST:event_tblKontakMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//    JFileChooser fileChooser = new JFileChooser();
//    fileChooser.setDialogTitle("Pilih File");
//    int userSelection = fileChooser.showOpenDialog(this);
//    if (userSelection == JFileChooser.APPROVE_OPTION) {
//        File fileToOpen = fileChooser.getSelectedFile();
//        try (BufferedReader br = new BufferedReader(new FileReader(fileToOpen))) {
//            String line;
//            model.setRowCount(0); // Hapus data tabel
//            br.readLine(); // Lewati header
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(",");
//                model.addRow(new Object[]{Integer.parseInt(data[0]), data[1], data[2], data[3]});
//                TampilData();
//            }
//            JOptionPane.showMessageDialog(this, "Data berhasil diimpor!");
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(this, "Error saat mengimpor data: " + e.getMessage());
//        }
//        
//    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        JFileChooser fileChooser = new JFileChooser();
//    fileChooser.setDialogTitle("Simpan File");
//    int userSelection = fileChooser.showSaveDialog(this);
//    if (userSelection == JFileChooser.APPROVE_OPTION) {
//        File fileToSave = fileChooser.getSelectedFile();
//        try (FileWriter writer = new FileWriter(fileToSave + ".csv")) {
//            // Tulis header
//            writer.write("ID,Nama,Nomor,Kategori\n");
//            // Tulis data tabel
//            for (int i = 0; i < model.getRowCount(); i++) {
//                for (int j = 0; j < model.getColumnCount(); j++) {
//                    writer.write(model.getValueAt(i, j).toString() + (j < model.getColumnCount() - 1 ? "," : ""));
//                }
//                writer.write("\n");
//            }
//            JOptionPane.showMessageDialog(this, "Data berhasil diekspor!");
//        } catch (IOException ex) {
//                Logger.getLogger(PengelolaKontak.class.getName()).log(Level.SEVERE, null, ex);
//            }}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
//        if(nama.getText().trim().isEmpty()) {
//            TampilData();
//        }// TODO add your handling code here:
       searchContact();
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void txtPencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyTyped
        //searchContact();        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianKeyTyped

   
    
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
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKontak;
    private javax.swing.JTextField txtNomorTelepon;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

//    private void cariKontak() {
//        String keyword = cari.getText();
//        model.setRowCount(0);
//        String sql = "SELECT * FROM kontak WHERE nama LIKE ?";
//        try (Connection conn = DatabaseSetup.connect();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, "%" + keyword + "%");
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                model.addRow(new Object[]{
//                    rs.getInt("id"),
//                    rs.getString("nama"),
//                    rs.getString("nomor_telepon"),
//                    rs.getString("kategori")
//                });
//            }
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//    private void TampilData() {
//        model.setRowCount(0);
//        String sql = "SELECT * FROM kontak";
//        try (Connection conn = DatabaseSetup.connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//            while (rs.next()) {
//                model.addRow(new Object[]{rs.getInt("id"), rs.getString("nama"),
//                                          rs.getString("nomor_telepon"), rs.getString("kategori")});
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private void bersih() {
//        nama.setText("");
//        nomor.setText("");
//        cKategori.setSelectedIndex(0);
//    }

    private void loadContacts() {
        try {
            model.setRowCount(0);
            List<Kontak> contacts = controller.getAllContacts();
            int rowNumber = 1;
            for (Kontak contact : contacts) {
                model.addRow(new Object[]{
                    rowNumber++,
                    contact.getNama(),
                    contact.getNomorTelepon(),
                    contact.getKategori()
                });
            }
        } catch (SQLException e) {
        showError(e.getMessage());
        
        }
    }
    private void addContact() {
        String nama = txtnama.getText().trim();
        String nomorTelepon = txtNomorTelepon.getText().trim();
        String kategori = (String) cmbKategori.getSelectedItem();
        if (!validatePhoneNumber(nomorTelepon)) {
        return; // Validasi nomor telepon gagal
        }
        try {
        if (controller.isDuplicatePhoneNumber(nomorTelepon, null)) {
        JOptionPane.showMessageDialog(this, "Kontak nomor telepon ini sudah ada.", "Kesalahan", JOptionPane.WARNING_MESSAGE);

        return;
        }
        controller.addContact(nama, nomorTelepon, kategori);
        loadContacts();
        JOptionPane.showMessageDialog(this, "Kontak berhasil ditambahkan!");
        clearInputFields();
        } catch (SQLException ex) {
        showError("Gagal menambahkan kontak: " + ex.getMessage());
        }
        }
        private boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nomor telepon tidak boleh kosong.");
        return false;
        }
        if (!phoneNumber.matches("\\d+")) { // Hanya angka
        JOptionPane.showMessageDialog(this, "Nomor telepon hanya boleh berisi angka.");
        return false;
        }
        if (phoneNumber.length() < 8 || phoneNumber.length() > 15) { //Panjang 8-15
        JOptionPane.showMessageDialog(this, "Nomor telepon harus memiliki panjang antara 8 hingga 15 karakter.");
        return false;
        }
        return true;
        }
        private void clearInputFields() {
        txtnama.setText("");
        txtNomorTelepon.setText("");
        cmbKategori.setSelectedIndex(0);
    }
    private void editContact() {
        int selectedRow = tblKontak.getSelectedRow();
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih kontak yang ingin diperbarui.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
        return;
        }
        int id = (int) model.getValueAt(selectedRow, 0);
        String nama = txtnama.getText().trim();
        String nomorTelepon = txtNomorTelepon.getText().trim();
        String kategori = (String) cmbKategori.getSelectedItem();
        if (!validatePhoneNumber(nomorTelepon)) {
        return;
        }
        try {
        if (controller.isDuplicatePhoneNumber(nomorTelepon, id)) {
        JOptionPane.showMessageDialog(this, "Kontak nomor telepon ini sudah ada.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
        return;
        }
        controller.updateContact(id, nama, nomorTelepon, kategori);
        loadContacts();
        JOptionPane.showMessageDialog(this, "Kontak berhasil diperbarui!");
        clearInputFields();
        } catch (SQLException ex) {
        showError("Gagal memperbarui kontak: " + ex.getMessage());
        }
        }
        private void populateInputFields(int selectedRow) {
        // Ambil data dari JTable
        String nama = model.getValueAt(selectedRow, 1).toString();
        String nomorTelepon = model.getValueAt(selectedRow, 2).toString();
        String kategori = model.getValueAt(selectedRow, 3).toString();
        // Set data ke komponen input
        txtnama.setText(nama);
        txtNomorTelepon.setText(nomorTelepon);
        cmbKategori.setSelectedItem(kategori);
    }
    private void deleteContact() {
        int selectedRow = tblKontak.getSelectedRow();
        if (selectedRow != -1) {
        int id = (int) model.getValueAt(selectedRow, 0);
        try {
        controller.deleteContact(id);
        loadContacts();
        JOptionPane.showMessageDialog(this, "Kontak berhasil dihapus!");
        clearInputFields();
        } catch (SQLException e) {

        showError(e.getMessage());
        }
        }
    }
    private void searchContact() {
        String keyword = txtPencarian.getText().trim();
        if (!keyword.isEmpty()) {
        try {
        List<Kontak> contacts = controller.searchContacts(keyword);
        model.setRowCount(0); // Bersihkan tabel
        for (Kontak contact : contacts) {
        model.addRow(new Object[]{
        contact.getId(),
        contact.getNama(),
        contact.getNomorTelepon(),
        contact.getKategori()
        });
        }
        if (contacts.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tidak ada kontak ditemukan.");
        }
        } catch (SQLException ex) {
        showError(ex.getMessage());
        }
        } else {
        loadContacts();
        }
    }
    private void exportToCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Simpan File CSV");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        // Tambahkan ekstensi .csv jika pengguna tidak menambahkannya
        if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
        fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
        }
        try (BufferedWriter writer = new BufferedWriter(new
        FileWriter(fileToSave))) {
        writer.write("ID,Nama,Nomor Telepon,Kategori\n"); // Header
        CSV
        for (int i = 0; i < model.getRowCount(); i++) {
        writer.write(
        model.getValueAt(i, 0) + "," +
        model.getValueAt(i, 1) + "," +
        model.getValueAt(i, 2) + "," +
        model.getValueAt(i, 3) + "\n"
        );
        }
        JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke " + fileToSave.getAbsolutePath());
        } catch (IOException ex) {
        showError("Gagal menulis file: " + ex.getMessage());
        }
        }
        }
        private void importFromCSV() {
        showCSVGuide();
        int confirm = JOptionPane.showConfirmDialog(
        this,
        "Apakah Anda yakin file CSV yang dipilih sudah sesuai dengan format?",
        "Konfirmasi Impor CSV",
        JOptionPane.YES_NO_OPTION
        );
        if (confirm == JOptionPane.YES_OPTION) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih File CSV");
        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToOpen = fileChooser.getSelectedFile();
        try (BufferedReader reader = new BufferedReader(new
        FileReader(fileToOpen))) {

        String line = reader.readLine(); // Baca header
        if (!validateCSVHeader(line)) {
        JOptionPane.showMessageDialog(this, "Format header CSV tidak valid. Pastikan header adalah: ID,Nama,Nomor Telepon,Kategori",
        "Kesalahan CSV", JOptionPane.ERROR_MESSAGE);
        return;
        }
        int rowCount = 0;
        int errorCount = 0;
        int duplicateCount = 0;
        StringBuilder errorLog = new StringBuilder("Baris dengan kesalahan:\n");
        while ((line = reader.readLine()) != null) {
        rowCount++;

        String[] data = line.split(",");

        if (data.length != 4) {
        errorCount++;

        errorLog.append("Baris ").append(rowCount +

        1).append(": Format kolom tidak sesuai.\n");
        continue;
        }
        String nama = data[1].trim();
        String nomorTelepon = data[2].trim();
        String kategori = data[3].trim();
        if (nama.isEmpty() || nomorTelepon.isEmpty()) {
        errorCount++;

        errorLog.append("Baris ").append(rowCount +

        1).append(": Nama atau Nomor Telepon kosong.\n");
        continue;
        }
        if (!validatePhoneNumber(nomorTelepon)) {
        errorCount++;

        errorLog.append("Baris ").append(rowCount +

        1).append(": Nomor Telepon tidak valid.\n");
        continue;
        }
        try {
        if
        (controller.isDuplicatePhoneNumber(nomorTelepon, null)) {
        duplicateCount++;

        errorLog.append("Baris ").append(rowCount +

        1).append(": Kontak sudah ada.\n");
        continue;
        }
        } catch (SQLException ex) {
        Logger.getLogger(PengelolaKontak.class.getName()).log(Level.SEVERE
        , null, ex);
        }
        try {
        controller.addContact(nama, nomorTelepon,
        kategori);
        } catch (SQLException ex) {

        errorCount++;
        errorLog.append("Baris ").append(rowCount +
        1).append(": Gagal menyimpan ke database -").append(ex.getMessage()).append("\n");
        }
        }
        loadContacts();
        if (errorCount > 0 || duplicateCount > 0) {
        errorLog.append("\nTotal baris dengan kesalahan: ").append(errorCount).append("\n");
        errorLog.append("Total baris duplikat: ").append(duplicateCount).append("\n");
        JOptionPane.showMessageDialog(this,
        errorLog.toString(), "Kesalahan Impor", JOptionPane.WARNING_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(this, "Semua data berhasil diimpor.");
        }
        } catch (IOException ex) {
        showError("Gagal membaca file: " + ex.getMessage());
        }
        }
        }
        }
        private void showCSVGuide() {
        String guideMessage = "Format CSV untuk impor data:\n" +
        "- Header wajib: ID, Nama, Nomor Telepon, Kategori\n" +
        "- ID dapat kosong (akan diisi otomatis)\n" +
        "- Nama dan Nomor Telepon wajib diisi\n" +
        "- Contoh isi file CSV:\n" +
        " 1, Andi, 08123456789, Teman\n" +
        " 2, Budi Doremi, 08567890123, Keluarga\n\n" +
        "Pastikan file CSV sesuai format sebelum melakukan impor.";
        JOptionPane.showMessageDialog(this, guideMessage, "Panduan Format CSV", JOptionPane.INFORMATION_MESSAGE);
        }
        private boolean validateCSVHeader(String header) {
        return header != null &&
        header.trim().equalsIgnoreCase("ID,Nama,Nomor Telepon,Kategori");
        }
        private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error",
        JOptionPane.ERROR_MESSAGE);
    }
}
