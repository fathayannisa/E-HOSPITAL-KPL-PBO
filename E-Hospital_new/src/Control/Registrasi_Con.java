package CONTROL;

import Database.Koneksi;
import Model.User_Mod;
import View.Registrasi_gui;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registrasi_Con {
    List<User_Mod> user;
    Registrasi_gui regis;
    
    
    public Registrasi_Con (Registrasi_gui regis){
        user = Koneksi.GetData();
        this.regis = regis;
    }
    
    public void isiData(String idPasien, String nama, String email, String password, String jenisKelamin, String noHp, Registrasi_gui regis){
        if (regis.getNamaTextField().isEmpty()&& regis.getEmailTextField().isEmpty()&&regis.getPassTextField().isEmpty()&&regis.getNomorHPTextField().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ada field yang belum terisi", "Warning",JOptionPane.WARNING_MESSAGE);
            
        }else if(regis.getNamaTextField().isEmpty()|| regis.getEmailTextField().isEmpty()||regis.getPassTextField().isEmpty()||regis.getNomorHPTextField().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ada field yang belum terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        }else {
            Koneksi.InsertDataPasien(regis.getIdPasien(), regis.getNamaTextField(),regis.getEmailTextField(),regis.getPassTextField(),regis.getJenisKelaminTextField(),
                        regis.getNomorHPTextField());
            
                JOptionPane.showMessageDialog(null, "sukses memasukan " + nama,
                "Sukses",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

