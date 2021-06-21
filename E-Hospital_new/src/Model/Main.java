/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Koneksi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
    List<User_Mod> myObj = new ArrayList<User_Mod>();
        
        myObj =  Koneksi.GetData();
        
        for(User_Mod Item : myObj){
            System.out.println("Id Pasien       : " + Item.getIdPasien());
            System.out.println("Nama Pasien     : " + Item.getNama());
            System.out.println("Jenis Kelamin   : " + Item.getJenisKelamin());
        }
        
    }
}
