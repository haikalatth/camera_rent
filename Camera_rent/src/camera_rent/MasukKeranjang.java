/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class MasukKeranjang {

    DefaultTableModel model;
    int banyak;
    List data = new ArrayList<>();
    public void tambahKamera(JTable tb_kamera, JTable tb_keranjang, int a) {
        String jml = JOptionPane.showInputDialog(null,"Masukkan jumlah");
        banyak = Integer.parseInt(jml);
        model = (DefaultTableModel) tb_kamera.getModel();
        String kb = model.getValueAt(a, 0).toString();
        String nb = model.getValueAt(a, 1).toString();
        String hb = model.getValueAt(a, 2).toString();
        //kurangi stok
        String strstok = model.getValueAt(a, 3).toString();
        int harga = Integer.parseInt(hb)*banyak;
        int stok = Integer.parseInt(strstok) - banyak;
        if (stok < 0) {
            JOptionPane.showMessageDialog(null, "Stok Habis");
        } else {
            model.setValueAt(Integer.toString(stok), a, 3);
            
            data.add(kb);
            data.add(nb);
            data.add(hb);
            data.add(jml);
            data.add(harga);
            

            //masuk keranjang
            DefaultTableModel mdl = (DefaultTableModel) tb_keranjang.getModel();
            mdl.addRow(data.toArray());
        }

    }

    public void tambahAksesoris(JTable tb_aksesoris, JTable tb_keranjang, int a) {
        String jml = JOptionPane.showInputDialog(null,"Masukkan jumlah");
        banyak = Integer.parseInt(jml);
        model = (DefaultTableModel) tb_aksesoris.getModel();
        String kb = model.getValueAt(a, 0).toString();
        String nb = model.getValueAt(a, 1).toString();
        String hb = model.getValueAt(a, 2).toString();

        //kurangi stok
        String strstok = model.getValueAt(a, 3).toString();
        int harga = Integer.parseInt(hb)*banyak;
        int stok = Integer.parseInt(strstok) - banyak;
        if (stok < 0) {
            JOptionPane.showMessageDialog(null, "Stok Habis");
        } else {
            model.setValueAt(Integer.toString(stok), a, 3);
            data.add(kb);
            data.add(nb);
            data.add(hb);            
            data.add(jml);
            data.add(harga);
            
            //masuk keranjang
            DefaultTableModel mdl2 = (DefaultTableModel) tb_keranjang.getModel();
            mdl2.addRow(data.toArray());
        }
    }
}
