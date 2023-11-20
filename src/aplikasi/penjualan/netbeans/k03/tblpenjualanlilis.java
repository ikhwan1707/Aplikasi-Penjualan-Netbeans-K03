/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.penjualan.netbeans.k03;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ActionEvent; 
import java.util.Date;

/**
 *
 * @author RnD03
 */
public class tblpenjualanlilis extends javax.swing.JFrame {
private DefaultTableModel model;
    String data[] = new String[6];
    /**
     * Creates new form tblpenjualanlilis
     */
    public tblpenjualanlilis() {
        initComponents();
        model = (DefaultTableModel) tbpenjualan.getModel();
        loadData();
        
        tampilcombo();
        petugas();
        Tampil_Tanggal();
        nofaktur();
        Date date = new Date();
    }
   
    
    public void Tampil_Tanggal() {
        Date date = new Date();
        
        java.util.Date tglsekarang = new java.util.Date();
        SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
        String tanggal = smpdtfmt.format(tglsekarang);
        txttgl.setText(tanggal);
    }
        
    public void nofaktur() {
       Date sk = new Date();

        SimpleDateFormat format1=new SimpleDateFormat("yyMMdd");
        String time = format1.format(sk);
        
        
        try{
            String sql = "select right(NoFaktur ,1) as kd from tblpenjualan_barang order by kd desc";
            Connection c = koneksi.getkoneksi(); 
            Statement s = c.createStatement();       
            ResultSet rs = s.executeQuery(sql);
                if (rs.next()){

                    int kode = Integer.parseInt(rs.getString("kd"))+1;

                    txtNo.setText(time+Integer.toString(kode));

                }else{

                    int kode = 1;

                    txtNo.setText(time+Integer.toString(kode));

                }
            

        }catch (SQLException | NumberFormatException e){

            JOptionPane.showMessageDialog(null, e);

        }
    }
    
    public void tampilcombo(){
        try{
            String sql = "SELECT * FROM tblbarang";
            
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                cmbkd.addItem(r.getString("Kode barang"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void petugas(){
        try{
            String sql = "SELECT * FROM tblpetugas";
            
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                cmbid.addItem(r.getString("IDPetugas"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
    private void totalbayar(){
        int a;
        int b = 0;
        double c;
        
        a = Integer.parseInt(txtharga.getText().toString());
        b = Integer.parseInt(txtjumlah.getText().toString());
        c = a * b;
        txttotal.setText(String.valueOf(c));
    }
    private void loadData() {
    model = new DefaultTableModel();
    model.getDataVector().removeAllElements();
    model.fireTableDataChanged();
    tbpenjualan.setModel(model);

    model.addColumn("Kode Barang");
    model.addColumn("Nama Barang");
    model.addColumn("Harga Jual");
    model.addColumn("Stok");
    model.addColumn("Jumlah");
    model.addColumn("Sub Total");

    try {
        String sql = "SELECT tbldetailpenjualan.NoFaktur, tbldetailpenjualan.KodeBarang, tbldetailpenjualan.Jumlah, tbldetailpenjualan.SubTotal, " +
            "tblbarang.NamaBarang, tblbarang.HargaJual, tblbarang.Stok " +
            "FROM tbldetailpenjualan " +
            "INNER JOIN tblbarang ON tbldetailpenjualan.KodeBarang = tblbarang.KodeBarang " +
            "WHERE tbldetailpenjualan.NoFaktur = '" + txtNo.getText() + "'";

        Connection kon = koneksi.getkoneksi();
        Statement s = kon.createStatement();
       // preparedStatement.setString(1, txtnofak.getText());

        ResultSet rs = s.executeQuery(sql);

        while (rs.next()) {
            String nofak = rs.getString("NoFaktur");
            String kodeBarang = rs.getString("KodeBarang");
            String namaBarang = rs.getString("NamaBarang");
            String hargaJual = rs.getString("HargaJual");
            String stok = rs.getString("Stok");
            String jumlah = rs.getString("Jumlah");
            String subtotal = rs.getString("SubTotal");

            model.addRow(new Object[]{nofak, kodeBarang, namaBarang, hargaJual, stok, jumlah, subtotal});
        }

        rs.close();
        s.close();
       // kon.close();
    } catch (SQLException ex) {
        System.out.println("Terjadi Error: " + ex.getMessage());
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
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        cmbid = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttgl = new javax.swing.JTextField();
        txtnamapetugas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbkd = new javax.swing.JComboBox<>();
        txtnamabarang = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        btnadditem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpenjualan = new javax.swing.JTable();
        btnaddnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncencel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtsisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel14.setText("PENJUALAN LILIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("NoFaktur");

        jLabel2.setText("ID Petugas");

        txtNo.setEnabled(false);
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        cmbid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--petugas--", " " }));
        cmbid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbidItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tanggal Penjualan");

        jLabel4.setText("Nama Petugas");

        txttgl.setEnabled(false);

        txtnamapetugas.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Barang"));

        jLabel5.setText("kode barang");

        jLabel6.setText("Nama Barang");

        jLabel7.setText("Harga Jual");

        jLabel8.setText("Stok");

        jLabel9.setText("Jumlah");

        cmbkd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Kode Barang--", " " }));
        cmbkd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbkdItemStateChanged(evt);
            }
        });
        cmbkd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkdActionPerformed(evt);
            }
        });

        txtnamabarang.setEnabled(false);

        txtharga.setEnabled(false);

        txtstok.setEnabled(false);

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        jLabel10.setText("Sub Total");

        txtsub.setEnabled(false);

        btnadditem.setText("Add item");
        btnadditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadditemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cmbkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnhitung)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadditem)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnhitung)
                        .addComponent(jLabel10)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadditem))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasil"));

        tbpenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbpenjualan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );

        btnaddnew.setText("Add New");

        btnsave.setText("Save Transaction");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncencel.setText("Cancel");
        btncencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncencelActionPerformed(evt);
            }
        });

        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        jLabel11.setText("Sisa");

        jLabel12.setText("Bayar");

        jLabel13.setText("Total");

        txttotal.setEnabled(false);

        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });

        txtsisa.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttgl, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtnamapetugas))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnaddnew)
                        .addGap(18, 18, 18)
                        .addComponent(btnsave)
                        .addGap(18, 18, 18)
                        .addComponent(btncencel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnclose)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbayar)
                            .addComponent(txtsisa)
                            .addComponent(txttotal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtnamapetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnaddnew)
                        .addComponent(btnsave)
                        .addComponent(btncencel)
                        .addComponent(btnclose)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
         java.util.Date tglsekarang = new java.util.Date();
        String nota = txtNo.getText();
        //String namapetugas = cmbptgs.getSelectedItem().toString();
        String bayar = txtbayar.getText();
        String sisa = txtbayar.getText();
        String Total = txttotal.getText();

        String KP = cmbid.getSelectedItem().toString();
        //String KD = cmbkd.getSelectedItem().toString();
        // ...
        if (tglsekarang == null || nota.isEmpty() || bayar.isEmpty() || sisa.isEmpty() || Total.isEmpty() || KP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection c = koneksi.getkoneksi();
                String sql = "INSERT INTO tblpenjualan ( NoFaktur, TglPenjualan, IDPetugas, Bayar, Sisa, Total) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);

                p.setString(1, nota);
                p.setDate(2, new java.sql.Date(tglsekarang.getTime()));
                p.setString(3, KP);
                p.setString(4, bayar);
                p.setString(5, sisa);
                p.setString(6, Total);

                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil ditambah");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            } finally {
                 loadData(); // Anda perlu menentukan method ini
                 kosong(); // Anda perlu menentukan method ini
                 //setEnabletrue();
                 //addnew.setEnabled(true);
            }
        }   
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnadditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadditemActionPerformed
        // TODO add your handling code here:
        String NM=txtNo.getText();
        String KB=cmbkd.getSelectedItem().toString();
        String JM=txtjumlah.getText();
        
        totalbayar();
        if ((NM.isEmpty()) | (KB.isEmpty()) |(JM.isEmpty())) {
            JOptionPane.showMessageDialog(null,"data tidak boleh kosong, silahkan dilengkapi");
        }else {
            try{
                
                Connection kon = koneksi.getkoneksi();
                Statement stt = kon.createStatement();
                String SQL = "insert into tbldetailpenjualan values('"+txtNo.getText()+"',"+
                "'"+cmbkd.getSelectedItem()+"',"+
                "'"+txtjumlah.getText()+"',"+
                "'"+txttotal.getText()+"')";
                stt.executeUpdate(SQL);
               
                Connection kon1 = koneksi.getkoneksi();
                Statement stt1 = kon.createStatement();
                String SQL1 = "Update tblbarang Set stok=stok - '"+txtjumlah.getText()+"'" +
                "Where kodebarang='"+cmbkd.getSelectedItem().toString()+"'";
                stt1.executeUpdate(SQL1);
               
                data[0] = cmbkd.getSelectedItem().toString();
                data[1] = txtnamabarang.getText();
                data[2] = txtharga.getText();
                data[3] = txtstok.getText();
                data[4] = txtjumlah.getText();
                data[5] = txttotal.getText();
                model.insertRow(0, data);
                
                totalbayar();
        
                cmbkd.requestFocus();
        
                stt.close();
                cmbkd.requestFocus();
                btnadditem.setEnabled(false);
                btnsave.setEnabled(true);
                bersih();
                cmbkd.requestFocus();
                
            } catch(Exception ex){
                 System.out.println("Terjadi Error"+ex.getMessage());
            }
        }
                                       

    }//GEN-LAST:event_btnadditemActionPerformed

    private void cmbkdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbkdItemStateChanged
        // TODO add your handling code here:
        try{
            String sql ="SELECT * FROM tblbarang WHERE KodeBarang='" + cmbkd.getSelectedItem().toString()+"'";
            
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            r.absolute(1);
            txtnamabarang.setText(r.getString("NamaBarang"));
            txtharga.setText(r.getString("HargaJual"));
            txtstok.setText(r.getString("stok"));
        }catch(SQLException ex){
     
        }
    }//GEN-LAST:event_cmbkdItemStateChanged

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
         int a, b, c;
        
        a = Integer.parseInt(txtharga.getText());
        b = Integer.parseInt(txtjumlah.getText());
        c = a*b;

        txtsub.setText(Integer.toString(c));
    }//GEN-LAST:event_btnhitungActionPerformed

    private void cmbidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbidItemStateChanged
        // TODO add your handling code here:
        try{
        String sql ="SELECT * FROM tblpetugas WHERE IDPetugas='" + cmbid.getSelectedItem().toString()+"'";
            
        Connection c = koneksi.getkoneksi();
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(sql);
            
        r.absolute(1);
        txtnamapetugas.setText(r.getString("NamaPetugas"));
        }catch(SQLException ex){
     
        }
    }//GEN-LAST:event_cmbidItemStateChanged

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
         try {
        double totalAmount = Double.parseDouble(txttotal.getText());
        double paymentAmount = Double.parseDouble(txtbayar.getText());

        if (paymentAmount < totalAmount) {
            // Handle insufficient payment
            JOptionPane.showMessageDialog(this, "Payment is less than the total amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double change = paymentAmount - totalAmount;

        // Display the change in a formatted way
        txtsisa.setText(String.format("%.2f", change));
    } catch (NumberFormatException e) {
        // Handle non-numeric input
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtbayarActionPerformed

    private void btncencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncencelActionPerformed
        // TODO add your handling code here:
        kosong();

    }//GEN-LAST:event_btncencelActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNoActionPerformed

    private void cmbkdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbkdActionPerformed

      private void kosong(){
        txtNo.setText(null);
        txttgl.setText(null);
        txtnamapetugas.setText(null);
        txtnamabarang.setText(null);
        txtharga.setText(null);
        txtstok.setText(null);
        txtjumlah.setText(null);
        txttotal.setText(null);
        cmbid.setSelectedIndex(0);
        cmbkd.setSelectedIndex(0);
    }
    
    private void bersih(){
        
        txtnamabarang.setText(null);
        txtharga.setText(null);
        txtstok.setText(null);
        txtjumlah.setText(null);
        txttotal.setText(null);
        cmbkd.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(tblpenjualanlilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tblpenjualanlilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tblpenjualanlilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tblpenjualanlilis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tblpenjualanlilis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadditem;
    private javax.swing.JButton btnaddnew;
    private javax.swing.JButton btncencel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbid;
    private javax.swing.JComboBox<String> cmbkd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable tbpenjualan;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnamabarang;
    private javax.swing.JTextField txtnamapetugas;
    private javax.swing.JTextField txtsisa;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txttgl;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}