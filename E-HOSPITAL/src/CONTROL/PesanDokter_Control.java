/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import Database.KoneksiDatabaseDokter;
import MODEL.Dokter_Model;
import VIEW.PesanDokter_GUI;
import VIEW.MenuUtama_GUI;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PesanDokter_Control {
    PesanDokter_GUI pesan;
    MenuUtama_GUI home;
    public List <Dokter_Model> dokter;
    
    public PesanDokter_Control(PesanDokter_GUI pesanD){
        dokter = KoneksiDatabaseDokter.GetData();
        this.pesan = pesanD;
    }
    
    public void getDataDokter(PesanDokter_GUI dataDokter) {
        try{
           Object[] obj = new Object[5];
           for (int i = 0 ; i < dokter.size();i++){
                   obj[0] = dokter.get(i).getIdDokter();
                   obj[1] = dokter.get(i).getNamaDokter();
                   obj[2] = dokter.get(i).getSpesialis();
                   obj[3] = dokter.get(i).getJamPraktek();
                   obj[4] = dokter.get(i).getKeterangan();
                   dataDokter.modelTable.addRow(obj); //memasukkan dta data ke tabel gui
           }
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            JOptionPane.showMessageDialog(null, "Data Kosong",
                "warning",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
