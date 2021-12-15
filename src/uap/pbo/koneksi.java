/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap.pbo;

import com.mysql.jdbc.*;

import java.sql.DriverManager;
public class koneksi {
    public static Connection getKoneksi(){
        String URL = "jdbc:mysql://localhost/penjualan sepatu";
        String USER = "root";
        String PASS = "";
        try{
            Connection conn = (Connection) DriverManager.getConnection(URL, USER, PASS);
            
            System.out.println("Success");
            return conn;
        }catch(Exception ex) {
            System.out.println("Error : " + ex);
            
            return null;
        }
    }
}
