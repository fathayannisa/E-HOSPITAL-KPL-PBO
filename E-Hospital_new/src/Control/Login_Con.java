/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database.Koneksi;
import Model.User_Mod;
import View.Login_gui;
import View.MenuUtama_gui;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Login_Con {
    Login_gui login;
    MenuUtama_gui home;
    public List <User_Mod> user;
    
    public Login_Con(Login_gui loginForm){
        user = Koneksi.GetData();
        this.login = loginForm;
    }
    
    public void findDataUser (String email, String password, Login_gui login){
        if (login.getTextEmail().intern() == " " && login.getTextPassword().intern() == " ") {
           JOptionPane.showMessageDialog(null, "Email dan Password tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if (login.getTextEmail().intern() == " ") {
           JOptionPane.showMessageDialog(null, "Email tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if (login.getTextPassword().intern() == " ") {
           JOptionPane.showMessageDialog(null, "Password tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        } else {
           boolean ketemu = false;
            int index = 0;
            while (ketemu == false & index < user.size()){
                if (email.intern() == user.get(index).getEmail().intern() && password.intern() == user.get(index).getPassword().intern()){
                    ketemu = true;
                }
                index = index + 1;
            }
            if (ketemu == true ) {
                JOptionPane.showMessageDialog(null, "sukses Login",
                        "Suskses",JOptionPane.INFORMATION_MESSAGE);
                login.dispose();
                MenuUtama_gui menuHome = new MenuUtama_gui();
                menuHome.show();
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan",
                "Warning",JOptionPane.WARNING_MESSAGE);
                /*for(int i=0; i<user.size(); i++) {
                    System.out.println(user.get(i).getEmail());
                }*/
            }
       }
        
       /*/ if (login.getTxtEmail().isEmpty()){
            JOptionPane.showMessageDialog(null, "Email tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        
        }else if (login.getTxtPassword().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        
        }else if (login.getTxtEmail().isEmpty() && login.getTxtPassword().isEmpty()){
            JOptionPane.showMessageDialog(null, "Email dan Password tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        
        }else{
            int index = 0;
            boolean kebenaran = false;
            while(user.size()>index && user.get(index).getEmail().intern()!= email.intern() && user.get(index).getPassword().intern()!= password.intern()){
                if( user.get(index).getEmail().intern()== email.intern() && user.get(index).getPassword().intern() == password.intern()){
                    kebenaran = true;
                }
                index++;
            }
            
            if (kebenaran== true ) {
                JOptionPane.showMessageDialog(null, "sukses Login ","Suskses",JOptionPane.INFORMATION_MESSAGE);
                login.dispose();
                MenuUtama_GUI home = new MenuUtama_GUI();
                home.show();
                
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan","Warning",JOptionPane.WARNING_MESSAGE);
                
            }/*/
        }
}


