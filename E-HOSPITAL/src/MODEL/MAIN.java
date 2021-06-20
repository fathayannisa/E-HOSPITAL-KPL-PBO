/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import Database.KoneksiDatabase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class MAIN {
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<User_Model> myObj = new ArrayList<User_Model>();
        
        myObj =  KoneksiDatabase.GetData();
        
        for(User_Model Item : myObj){
            System.out.println("Id Pasien       : " + Item.getIdPasien());
            System.out.println("Nama Pasien     : " + Item.getNama());
            System.out.println("Jenis Kelmain   : " + Item.getJenisKelamin());
        }
        
    }
}
