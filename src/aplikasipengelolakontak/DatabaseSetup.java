/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasipengelolakontak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class DatabaseSetup {
//    private static final String DB_URL = "jdbc:sqlite:kontak.db";
//
//    public static Connection connect() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(DB_URL);
//        } catch (SQLException e) {
//            System.out.println("Connection failed: " + e.getMessage());
//        }
//        return conn;
//    }
//
//    public static void createTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS kontak (" +
//                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                     "nama TEXT NOT NULL, " +
//                     "nomor_telepon TEXT NOT NULL, " +
//                     "kategori TEXT NOT NULL)";
//        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
//            stmt.execute(sql);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    public static void main(String[] args) {
        String sql = "CREATE TABLE IF NOT EXISTS contacts ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nama TEXT NOT NULL,"
                + "nomor_telepon TEXT NOT NULL,"
                + "kategori TEXT"
                + ");";
        try (Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabel 'contacts' berhasil dibuat atau sudah ada.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
