/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Cancel {
    DefaultTableModel model1;
    DefaultTableModel model;
    public void batal(JTable tb_keranjang, JTable tb_kamera, JTable tb_aksesoris, int b) {
        model1 = (DefaultTableModel)tb_keranjang.getModel();
        String restok = tb_keranjang.getValueAt(b,3).toString();
        int stokbalik = Integer.parseInt(restok);
        for(int i=0;i<tb_kamera.getRowCount();i++){
            if(tb_kamera.getValueAt(i, 0).equals(tb_keranjang.getValueAt(b, 0))){
                String strstok = tb_kamera.getValueAt(i, 3).toString();                
                int stok = Integer.parseInt(strstok)+stokbalik;
                tb_kamera.setValueAt(Integer.toString(stok), i, 3);
            }
        }
        for(int i=0;i<tb_aksesoris.getRowCount();i++){
            if(tb_aksesoris.getValueAt(i, 0).equals(tb_keranjang.getValueAt(b, 0))){
                String strstok = tb_aksesoris.getValueAt(i, 3).toString();                
                int stok = Integer.parseInt(strstok)+stokbalik;
                tb_aksesoris.setValueAt(Integer.toString(stok), i, 3);
            }
        }
        model1.removeRow(b);
    }
    /*public void stok(JTable tb_kamera, int a){
        model = (DefaultTableModel)tb_kamera.getModel();
        String strstok = model.getValueAt(a,3).toString();
        int stok = Integer.parseInt(strstok)+1;
        model.setValueAt(Integer.toString(stok),a,3);
    }*/
}
