/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import MODEL.Dokter_Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class KoneksiDatabaseDokter {
    static final String DB_URL = "jdbc:mysql://localhost/E-HOSPITAL";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static List<Dokter_Model> GetData(){
        try{
            ArrayList<Dokter_Model> dokterList = new ArrayList<Dokter_Model>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM dokter";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                dokterList.add(new Dokter_Model(rs.getString("Id_Dokter"), rs.getString("Nama_Dokter"), rs.getString("Spesialis")
                                ,rs.getString("Jam_Praktek"),rs.getString("Keterangan")));
            }

            stmt.close();
            conn.close();

            return dokterList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
