/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class MasukKeranjang {
    DefaultTableModel model;
    public void pilih(JTable tb_kamera, JTable tb_keranjang, int a) {
        model = (DefaultTableModel)tb_kamera.getModel();
        String nb = model.getValueAt(a, 1).toString();
        String hb = model.getValueAt(a, 2).toString();
        List data = new ArrayList<>();
        data.add(nb);
        data.add(hb);
        
        //masuk keranjang
        DefaultTableModel mdl = (DefaultTableModel)tb_keranjang.getModel();
        mdl.addRow(data.toArray());
        
    }
}
