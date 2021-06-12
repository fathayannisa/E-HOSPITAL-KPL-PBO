package CONTROL;

import MODEL.User_Model;
import VIEW.Register_GUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registrasi_Control {
    ArrayList<User_Model> user;
    Register_GUI regis;
    
    
    public Registrasi_Control (Register_GUI regis){
        user = new ArrayList<User_Model>();
        this.regis = regis;
    }
    
    public void isiData(String nama, String email, String password, String jenisKelamin, String noHp, Register_GUI regis){
        if (regis.getNamaTxtField().isEmpty()&& regis.getEmailTxtField().isEmpty()&&regis.getPassTxtField().isEmpty()&&regis.getNohpTxtField().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ada field yang belum terisi", "Warning",JOptionPane.WARNING_MESSAGE);
            
        }else if(regis.getNamaTxtField().isEmpty()|| regis.getEmailTxtField().isEmpty()||regis.getPassTxtField().isEmpty()||regis.getNohpTxtField().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ada field yang belum terisi", "Warning",JOptionPane.WARNING_MESSAGE);
        }else {
            user.add(new User_Model(regis.getNamaTxtField(), regis.getEmailTxtField(),regis.getPassTxtField(),regis.getJeniskelaminTxtField(),
                        regis.getNohpTxtField()));
                JOptionPane.showMessageDialog(null, "sukses memasukan " + user.get(user.size() - 1).getNama(),
                "Sukses",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
