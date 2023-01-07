/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author lista
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
    Connection cn;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("Com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc.mysql//localhost/latihan_crud", "root", "");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                return null;
        }
        }     
    }

