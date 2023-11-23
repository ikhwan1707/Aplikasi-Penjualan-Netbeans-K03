package aplikasi.penjualan.netbeans.k03;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SMKI Utama10
 */
public class from_distributor extends javax.swing.JFrame {

    private DefaultTableModel model;

    /**
     * Creates new form from_distributor
     */
    public from_distributor() {
        initComponents();
        loadData();
        kosong();
        setEnablefalse();
    }
    
     public void setEnablefalse(){
        txtiddistributor.setEnabled(false);
        txtnamadistributor.setEnabled(false);
        txtalamatdistributor.setEnabled(false);
        txtkotaasaldistributor.setEnabled(true);
        txtemaildistributor.setEnabled(false);
        txttelpondistributor.setEnabled(false);
    }
    public void setEnabletrue() {
        txtiddistributor.setEnabled(true);
        txtnamadistributor.setEnabled(true);
        txtalamatdistributor.setEnabled(true);
        txtkotaasaldistributor.setEnabled(true);
        txtemaildistributor.setEnabled(true);
        txttelpondistributor.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtiddistributor = new javax.swing.JTextField();
        txtnamadistributor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamatdistributor = new javax.swing.JTextArea();
        txtkotaasaldistributor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemaildistributor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelpondistributor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledistributor = new javax.swing.JTable();
        btnupdatedistributor = new javax.swing.JButton();
        btndeletedistributor = new javax.swing.JButton();
        btncanceldistributor = new javax.swing.JButton();
        btnclosedistributor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nama Distributor");

        jLabel3.setText("E-Mail");

        jLabel6.setText("Kota Asal");

        txtnamadistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamadistributorActionPerformed(evt);
            }
        });

        txtalamatdistributor.setColumns(20);
        txtalamatdistributor.setRows(5);
        jScrollPane1.setViewportView(txtalamatdistributor);

        jLabel4.setText("Alamat Distributor");

        jLabel5.setText("Telpon");

        jLabel1.setText("ID Distributor");

        jLabel8.setText("Maksimal 15 Digit");

        tabledistributor.setModel(new javax.swing.table.DefaultTableModel(
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
        tabledistributor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabledistributorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabledistributor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledistributorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabledistributor);

        btnupdatedistributor.setText("Update");
        btnupdatedistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatedistributorActionPerformed(evt);
            }
        });

        btndeletedistributor.setText("Delete");
        btndeletedistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletedistributorActionPerformed(evt);
            }
        });

        btncanceldistributor.setText("Cancel");
        btncanceldistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceldistributorActionPerformed(evt);
            }
        });

        btnclosedistributor.setText("Close");
        btnclosedistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclosedistributorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("                              Entri Data Distributor barang");

        add.setText("Add New");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnamadistributor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtiddistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtkotaasaldistributor)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(txttelpondistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtemaildistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndeletedistributor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdatedistributor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncanceldistributor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclosedistributor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtiddistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnamadistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkotaasaldistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemaildistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelpondistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncanceldistributor)
                    .addComponent(btnupdatedistributor)
                    .addComponent(btndeletedistributor)
                    .addComponent(btnclosedistributor)
                    .addComponent(add)
                    .addComponent(btnsave))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void txtnamadistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamadistributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamadistributorActionPerformed

    private void tabledistributorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabledistributorAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_tabledistributorAncestorAdded

    private void btnclosedistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclosedistributorActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnclosedistributorActionPerformed

    private void btncanceldistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceldistributorActionPerformed
        // TODO add your handling code here:
         kosong();
    }//GEN-LAST:event_btncanceldistributorActionPerformed

    private void btndeletedistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletedistributorActionPerformed
        // TODO add your handling code here:
         int i = tabledistributor.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this,
                    "Harap Pilih Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String ID_Distributor = (String) model.getValueAt(i, 0);
        
        try{
            Connection c = koneksi.getkoneksi();
            
            String sql = "DELETE FROM tbldistributor WHERE IDDistributor = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, ID_Distributor);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil diHapus");
        } catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, "Terjadi Error" + e.getMessage());
        } finally {
            loadData();
            kosong();
        }
    }//GEN-LAST:event_btndeletedistributorActionPerformed

    private void btnupdatedistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatedistributorActionPerformed
        // TODO add your handling code here:
         int i = tabledistributor.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this,
                    "Harap Pilih Data Terlebih Dahulu",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String IDDistributor = (String) model.getValueAt(i, 0);
        String NamaDistributor = txtnamadistributor.getText();
        String Alamat = txtalamatdistributor.getText();
        String KotaAsal = txtkotaasaldistributor.getText();
        String Email = txtemaildistributor.getText();
        String Telpon = txttelpondistributor.getText();
        
        try{
            Connection c = koneksi.getkoneksi();
            
            String sql = "UPDATE tbldistributor SET Nama_Distributor = ?, Alamat = ?, KotaAsal = ?, Email = ?, Telpon = ? WHERE ID_Distributor = ?";
                    
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, NamaDistributor);
            p.setString(2, Alamat);
            p.setString(3, KotaAsal);
            p.setString(4, Email);
            p.setString(5, Telpon);
            p.setString(6, IDDistributor);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil diUbah");
        } catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, "Terjadi Error" + e.getMessage());
        } finally {
            loadData();
            kosong();
        }
    }//GEN-LAST:event_btnupdatedistributorActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        setEnabletrue();
        add.setEnabled(true);
    }//GEN-LAST:event_addActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String IDDistributor =txtiddistributor.getText();
        String NamaDistributor =txtnamadistributor.getText();
        String Alamat =txtalamatdistributor.getText();
        String KotaAsal =txtkotaasaldistributor.getText();
        String Email =txtemaildistributor.getText();
        String Telpon =txttelpondistributor.getText();

        if("".equals(IDDistributor)|| "".equals(NamaDistributor)|| "".equals(Alamat)||"".equals(KotaAsal)||"".equals(Email)||"".equals(Telpon))
        {
            JOptionPane.showMessageDialog(this, "harap lengkapi data","eror", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Connection c = koneksi.getkoneksi();
                String sql ="INSERT INTO tbldistributor VALUES(?,?,?,?,?,?)";
                PreparedStatement p= c.prepareStatement(sql);
                p.setString(1, IDDistributor);
                p.setString(2, NamaDistributor);
                p.setString(3, KotaAsal);
                p.setString(4, Alamat);
                p.setString(5, Email);
                p.setString(6, Telpon);
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

    private void tabledistributorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledistributorMouseClicked
        // TODO add your handling code here:
                 int baris = tabledistributor.getSelectedRow();
        
        if(baris == -1){
            
            return;
        }
        
        String IDDistributor = tabledistributor.getValueAt(baris, 0).toString();
        txtiddistributor.setText(IDDistributor);
        String NamaDistributor = tabledistributor.getValueAt(baris, 1).toString();
        txtnamadistributor.setText(NamaDistributor);
        String alamat = tabledistributor.getValueAt(baris, 2).toString();
        txtalamatdistributor.setText(alamat);
        String kotaasal = tabledistributor.getValueAt(baris, 3).toString();
        txtkotaasaldistributor.setText(kotaasal);
        String email = tabledistributor.getValueAt(baris, 4).toString();
        txtemaildistributor.setText(email);
        String telpon = tabledistributor.getValueAt(baris, 5).toString();
        txttelpondistributor.setText(telpon);
    }//GEN-LAST:event_tabledistributorMouseClicked
private void loadData(){
        //Membuat Model
        model = new DefaultTableModel();
        
        //Menghapus Seluruh Data
        model.getDataVector().removeAllElements();
        
        //Memberi Tahu Bahwa Data Telah Kosong
        model.fireTableDataChanged();
        
        tabledistributor.setModel(model);
        model.addColumn("IDDistributor");
        model.addColumn("NamaDistributor");
        model.addColumn("Alamat");
        model.addColumn("Kota Asal");
        model.addColumn("Email");
        model.addColumn("Telpon");
        
        try{
            
        String sql = "SELECT * FROM tbldistributor";
        
        Connection c = koneksi.getkoneksi();
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(sql);
        
        while(r.next()){
        //Lakukan Penelusuran Baris
        model.addRow(new Object[]{
            r.getString(1),
            r.getString(2),
            r.getString(3),
            r.getString(4),
            r.getString(5),
            r.getString(6)
        });
    }
    tabledistributor.setModel(model);
    }catch(SQLException e){
        System.out.println("Terjadi Error");
    }
}
    private void kosong(){
        txtiddistributor.setText(null);
        txtnamadistributor.setText(null);
        txtalamatdistributor.setText(null);
        txtkotaasaldistributor.setText(null);
        txtemaildistributor.setText(null);
        txttelpondistributor.setText(null);
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
            java.util.logging.Logger.getLogger(from_distributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(from_distributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(from_distributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(from_distributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new from_distributor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btncanceldistributor;
    private javax.swing.JButton btnclosedistributor;
    private javax.swing.JButton btndeletedistributor;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdatedistributor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabledistributor;
    private javax.swing.JTextArea txtalamatdistributor;
    private javax.swing.JTextField txtemaildistributor;
    private javax.swing.JTextField txtiddistributor;
    private javax.swing.JTextField txtkotaasaldistributor;
    private javax.swing.JTextField txtnamadistributor;
    private javax.swing.JTextField txttelpondistributor;
    // End of variables declaration//GEN-END:variables
}