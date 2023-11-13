package aplikasi.penjualan.netbeans.k03;

import  javax.swing.table.DefaultTableModel;
import  java.sql.ResultSet;
import  java.sql.SQLException;
import  java.sql.Statement;
import  java.sql.PreparedStatement;
import  java.sql.Connection;
import  javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SMKI Utama10
 */
public class from_Petugas extends javax.swing.JFrame {

    private DefaultTableModel model;

    /**
     * Creates new form Petugas
     */
    public from_Petugas() {
        initComponents();
          loadData();
          kosong();
          setEnablefalse();
        
    }
    
     private void kosong(){
        txtpetugas.setText(null);
        txtnamapetugas.setText(null);
        txtareaalamat.setText(null);
        txtemail.setText(null);
        txttelpon.setText(null);
    }
     
       public void setEnablefalse(){
        txtpetugas.setEnabled(false);
        txtnamapetugas.setEnabled(false);
        txtareaalamat.setEnabled(false);
        txtemail.setEnabled(false);
        txttelpon.setEnabled(false);
    }
    public void setEnabletrue() {
        txtpetugas.setEnabled(true);
        txtnamapetugas.setEnabled(true);
        txtareaalamat.setEnabled(true);
        txtemail.setEnabled(true);
        txttelpon.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btncancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txttelpon = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepetugas = new javax.swing.JTable();
        txtpetugas = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        txtnamapetugas = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaalamat = new javax.swing.JTextArea();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Petugas");

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Petugas");

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("E-Mail");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("                              Entri Data Petugas");

        jLabel4.setText("Alamat Petugas");

        jLabel5.setText("Telpon");

        jLabel6.setText("Maksimal 15 Digit");

        tablepetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablepetugas);

        txtpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpetugasActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        txtareaalamat.setColumns(20);
        txtareaalamat.setRows(5);
        jScrollPane2.setViewportView(txtareaalamat);

        add.setText("Add New");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(add)
                        .addGap(23, 23, 23)
                        .addComponent(btnsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate)
                        .addGap(28, 28, 28)
                        .addComponent(btndelete)
                        .addGap(26, 26, 26)
                        .addComponent(btncancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnclose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamapetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttelpon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamapetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttelpon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(btnsave)
                    .addComponent(btnclose)
                    .addComponent(add))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void loadData(){
        //membuat model
        model = new DefaultTableModel();
        
        //menghapus seluruh data
        model.getDataVector().removeAllElements();
        //memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        tablepetugas.setModel(model);
        model.addColumn("ID_Petugas");
        model.addColumn("Nama_Petugas");
        model.addColumn("Alamat_Petugas");
        model.addColumn("Email");
        model.addColumn("Telpon");
        
        try{
            
            String sql = "SELECT * FROM tb_petugas";
            
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
            //lakukan penelusuran baris
                model.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getDate(3),
                    r.getString(4),
                    r.getString(5)
                });               
            }
            tablepetugas.setModel(model);
            }catch(SQLException e){
                System.out.println("Terjadi Error");               
            }
    }
    private void txtpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpetugasActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String Id =txtpetugas.getText(); 
        String Nama =txtnamapetugas.getText();
        String Alamat =txtareaalamat.getText(); 
        String Email =txtemail.getText();
        String telpon =txttelpon.getText();
        
        if("".equals(Id)|| "".equals(Nama)|| "".equals(Alamat)||"".equals(Email)||"".equals(telpon))
        { 
            JOptionPane.showMessageDialog(this, "harap lengkapi data","eror", JOptionPane.WARNING_MESSAGE);
         }else{
            try{ 
                Connection c = koneksi.getkoneksi();
                String sql ="INSERT INTO tb_petugas VALUES(?,?,?,?,?)"; 
                PreparedStatement p= c.prepareStatement(sql); 
                p.setString(1, Id);
                p.setString(2, Nama); 
                p.setString(3, Alamat);
                p.setString(4, Email);
                p.setString(5, telpon);
                p.executeUpdate();
                p.close();
                
                JOptionPane.showMessageDialog(null, "penyimpanan data berhasil"); 
            }catch(SQLException e){ 
                JOptionPane.showMessageDialog(this, e.getMessage()); 
            }finally{ 
                loadData(); 
                kosong();
                 setEnabletrue();
                 add.setEnabled(true);
            } 
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
      this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int i = tablepetugas.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi
            JOptionPane.showMessageDialog(this, 
                    "Harap Pilih Data Terlebih Dahulu",
                    "error", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         String petugas = (String) model.getValueAt(i, 0);
         String nama = txtnamapetugas.getText();
         String alamat = txtareaalamat.getText();
         String Email = txtemail.getText();
         String Telpon = txttelpon.getText();
         
         try{
             Connection c =  koneksi.getkoneksi();
             String sql = "UPDATE tb_siswa SET NAMA = ?, TANGGAL_LAHIR = ?, JURUSAN = ?, ALAMAT =? WHERE NIS";
             PreparedStatement p = c.prepareStatement(sql);
             
             p.setString(1, nama);
             p.setString(3, alamat);
             p.setString(4, Email);
             p.setString(5, Telpon);
             p.executeUpdate();
             p.close();
             JOptionPane.showMessageDialog(null, "Ubah Data Berhasil");
         } catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Terjadi Error" + e.getMessage());
         } finally {
             loadData();
             kosong ();
         }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
         int i = tablepetugas.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi
            JOptionPane.showMessageDialog(this, 
                    "Harap Pilih Data Terlebih Dahulu",
                    "error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         String petugas = (String) model.getValueAt(i, 0);
         
         try{
             Connection c =  koneksi.getkoneksi();
             
             String sql = "DELETE tb_petugas WHERE NIS";
             
             PreparedStatement p = c.prepareStatement(sql);            
             p.setString(1, petugas);
             p.executeUpdate();
             p.close();
             
             JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
         } catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Terjadi Error");
         } finally {
             loadData();
             kosong ();
         }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        setEnabletrue();
        add.setEnabled(true);
    }//GEN-LAST:event_addActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btncancelActionPerformed
  
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
            java.util.logging.Logger.getLogger(from_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(from_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(from_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(from_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new from_Petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablepetugas;
    private javax.swing.JTextArea txtareaalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnamapetugas;
    private javax.swing.JTextField txtpetugas;
    private javax.swing.JTextField txttelpon;
    // End of variables declaration//GEN-END:variables
}
