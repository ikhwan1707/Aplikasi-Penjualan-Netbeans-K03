package aplikasi.penjualan.netbeans.k03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author RnD01
 */
public class databarangsila2 extends javax.swing.JFrame {
private DefaultTableModel model;
    /**
     * Creates new form databarangsila2
     */
    public databarangsila2() {
        initComponents();
        loadData();
        kosong();
        
        setEnnabledfalse();
    }
    public void setEnnabledfalse(){
        txtkdbarang.setEnabled(false);
        txtnmbarang.setEnabled(false);
        txtkdjenis.setEnabled(false);
        txtjenis.setEnabled(false);
        txtharganet.setEnabled(false);
        txthargajual.setEnabled(false);
        txtstok.setEnabled(false);
        btnsave.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        btncancel.setEnabled(false);
        btnclose.setEnabled(false);
       
    }
    
    public void setEnnabledtrue(){
        txtkdbarang.setEnabled(true);
        txtnmbarang.setEnabled(true);
        txtkdjenis.setEnabled(true);
        txtjenis.setEnabled(true);
        txtharganet.setEnabled(true);
        txthargajual.setEnabled(true);
        txtstok.setEnabled(true);
        btnsave.setEnabled(true);
        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
        btncancel.setEnabled(true);
        btnclose.setEnabled(true);
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtkdbarang = new javax.swing.JTextField();
        txtnmbarang = new javax.swing.JTextField();
        txtkdjenis = new javax.swing.JTextField();
        txtjenis = new javax.swing.JTextField();
        txtharganet = new javax.swing.JTextField();
        txthargajual = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatabarang = new javax.swing.JTable();
        btnaddnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTRI DATA BARANG");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setText("Kode Barang ");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Kode Jenis Barang");

        jLabel6.setText("Jenis Barang");

        jLabel7.setText("Harga Net");

        jLabel8.setText("Harga Jual");

        jLabel9.setText("Stok");

        tbldatabarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbldatabarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldatabarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldatabarang);

        btnaddnew.setText("add new");
        btnaddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewActionPerformed(evt);
            }
        });

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncancel.setText("cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnclose.setText("close");

        jLabel10.setText("Rp");

        jLabel11.setText("Rp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkdbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txthargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtharganet, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkdjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnmbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnaddnew)
                                .addGap(35, 35, 35)
                                .addComponent(btnsave)
                                .addGap(33, 33, 33)
                                .addComponent(btnupdate)
                                .addGap(31, 31, 31)
                                .addComponent(btndelete)
                                .addGap(32, 32, 32)
                                .addComponent(btncancel)
                                .addGap(28, 28, 28)
                                .addComponent(btnclose))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkdbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnmbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtkdjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtharganet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txthargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddnew)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btncancel)
                    .addComponent(btnclose))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VERSION 0.1");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String kodebarang = txtkdbarang.getText();
        String namabarang = txtnmbarang.getText();
        String kodejenis = txtkdjenis.getText();
        String jenisbarang = txtjenis.getText();
        String harganet = txtharganet.getText();
        String hargajual = txthargajual.getText();
        String stok = txtstok.getText();
        
        if ("".equals(kodebarang) || "".equals(namabarang)|| "".equals(kodejenis) || "".equals(jenisbarang) || "".equals(harganet ) || "".equals(hargajual ) || "".equals(stok ))
        {
        JOptionPane.showMessageDialog(this, "harap lengkapi data", "error", JOptionPane.WARNING_MESSAGE);
        }else{
        try{
            Connection c = koneksi.getkoneksi();
            String sql = "INSERT INTO tblbarang VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement P = c.prepareStatement(sql);
            
            P.setString(1, kodebarang);
            P.setString(2, namabarang);
            P.setString(3, kodejenis);
            P.setString(4, jenisbarang);
            P.setString(5, harganet);
            P.setString(6, hargajual);
            P.setString(7, stok);
            
            P.executeUpdate();
            P.close();
            
            JOptionPane.showMessageDialog(null, "penyimpanan data berhasil");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
        loadData();
        kosong();
        setEnnabledfalse();
        btnaddnew.setEnabled(true);
        }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        kosong();
    }//GEN-LAST:event_btncancelActionPerformed

    private void tbldatabarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldatabarangMouseClicked
        int baris = tbldatabarang.getSelectedRow();
        
        if(baris == -1){
        return;
        }
        String kodebarang = tbldatabarang.getValueAt(baris, 0).toString();
        txtkdbarang.setText(kodebarang);
        String namabarang = tbldatabarang.getValueAt(baris, 1).toString();
        txtnmbarang.setText(namabarang);
        String kodejenis = tbldatabarang.getValueAt(baris, 2).toString();
        txtkdjenis.setText(kodejenis);
        String jenisbarang = tbldatabarang.getValueAt(baris, 3).toString();
        txtjenis.setText(jenisbarang);
        String harganet = tbldatabarang.getValueAt(baris, 4).toString();
        txtharganet.setText(harganet);
        String hargajual = tbldatabarang.getValueAt(baris, 5).toString();
        txthargajual.setText(hargajual);
        String stok = tbldatabarang.getValueAt(baris, 6).toString();
        txtstok.setText(stok);
    }//GEN-LAST:event_tbldatabarangMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int i =tbldatabarang.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this, "harap pilih data terlebih dahulu", "eror", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       String kodebarang =(String)model.getValueAt(i, 0);
       String namabarang =txtnmbarang.getText();
       String kodejenis =txtkdjenis.getText();
       String jenis =txtjenis.getText();
       String harganet =txtharganet.getText();
       String hargajual =txthargajual.getText();
       String stok =txtstok.getText();
       
       try{
           Connection c= koneksi.getkoneksi();
           
           String sql ="UPDATE tblbarang SET NamaBarang =?, KodeJenis=?,HargaNet=?, HargaJual=?, Stok=? WHERE KodeBarang=?";
           
           PreparedStatement p =c.prepareStatement(sql);
           
           p.setString(1, namabarang);
           p.setString(2, kodejenis);
           p.setString(3, jenis);
           p.setString(4, harganet);
           p.setString(5, hargajual);
           p.setString(6, stok);
           p.setString(7, kodebarang);
           
           p.executeUpdate();
           p.close();
           JOptionPane.showMessageDialog(null, "ubah data berhsil");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "terjadi eror"+ e.getMessage());
       }finally{
           loadData();
           kosong();
       }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int i = tbldatabarang.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this, "harap pilih data terlebih dahulu", "error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String kodebarang = (String)model.getValueAt(i, 0);
        
        try{
            Connection c = koneksi.getkoneksi();
            String sql ="DELETE FROM tblbarang WHERE KodeBarang =?";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, kodebarang);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Error" +e.getMessage());
        } finally {
        loadData();
        kosong();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnaddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewActionPerformed
       setEnnabledtrue();
        btnaddnew.setEnabled(false);
    }//GEN-LAST:event_btnaddnewActionPerformed

     private void loadData(){
        model = new DefaultTableModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        tbldatabarang.setModel(model);
        model.addColumn("kode barang");
        model.addColumn("nama barang");
        model.addColumn("kode jenis barang");
        model.addColumn("jenis barang");
        model.addColumn("harga net");
        model.addColumn("harga jual");
        model.addColumn("stok");
        
        try{
        
            String sql = "SELECT * FROM tblbarang";
            
            Connection c = koneksi.getkoneksi();
            Statement s = c .createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
            model.addRow(new Object[]{
            r.getString(1),
            r.getString(2),
            r.getDate(3),
            r.getString(4),
            r.getString(5),
            r.getString(6),
            r.getString(7)
            });
            }
            tbldatabarang.setModel(model);
        }catch(SQLException e){
        System.out.println("terjadi error");
        }
    }
    
    private void kosong(){
        txtkdbarang.setText(null);
        txtnmbarang.setText(null);
        txtkdjenis.setText(null);
        txtjenis.setText(null);
        txtharganet.setText(null);
        txthargajual.setText(null);
        txtstok.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(databarangsila2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(databarangsila2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(databarangsila2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(databarangsila2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new databarangsila2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnew;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldatabarang;
    private javax.swing.JTextField txthargajual;
    private javax.swing.JTextField txtharganet;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtkdbarang;
    private javax.swing.JTextField txtkdjenis;
    private javax.swing.JTextField txtnmbarang;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
