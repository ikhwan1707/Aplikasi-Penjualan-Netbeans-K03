/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.penjualan.netbeans.k03;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SMKI Utama9
 */
public class koneksi {
    public static Connection koneksi;
    
    public static Connection getkoneksi(){
        if (koneksi ==null)
        {
            try{
                String url = "jdbc:mysql://localhost:3306/penjualank03";
                String user ="root";
                String password ="";
                DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.print("berhasil membuat koneksi");
            }catch (SQLException t){
                System.out.println("eror membuat koneksi");
            }
        }
        return koneksi;
    }
}

    

