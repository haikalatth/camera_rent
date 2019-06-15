/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Stok {
    DefaultTableModel model1;
    public void batal(JTable tb_keranjang, JTable tb_kamera, JTable tb_aksesoris, int b) {
        String cncl = JOptionPane.showInputDialog(null,"Berapa yang dibatalkan?");
        //belum ada defensive beh
        int cancel = Integer.parseInt(cncl);
        int banyak = Integer.parseInt(tb_keranjang.getValueAt(b,3).toString());
        if(banyak<cancel){
            JOptionPane.showMessageDialog(null,"Tadi pesan cuma "+banyak+" kok");
        }else{
            model1 = (DefaultTableModel)tb_keranjang.getModel();
            for(int i=0;i<tb_kamera.getRowCount();i++){
                if(tb_kamera.getValueAt(i, 0).equals(tb_keranjang.getValueAt(b, 0))){
                    String strstok = tb_kamera.getValueAt(i, 3).toString();
                    int stok = Integer.parseInt(strstok)+cancel;
                    int harga = Integer.parseInt(tb_keranjang.getValueAt(b,2).toString());
                    tb_kamera.setValueAt(Integer.toString(stok), i, 3);

                    if((banyak-cancel)<=0){
                        model1.removeRow(b);
                    }else{
                        tb_keranjang.setValueAt(banyak-cancel,b,3);
                        tb_keranjang.setValueAt((banyak-cancel)*harga,b,4);
                    }
                }
            }
            for(int i=0;i<tb_aksesoris.getRowCount();i++){
                if(tb_aksesoris.getValueAt(i, 0).equals(tb_keranjang.getValueAt(b, 0))){
                    String strstok = tb_aksesoris.getValueAt(i, 3).toString();
                    int stok = Integer.parseInt(strstok)+cancel;
                    int harga = Integer.parseInt(tb_keranjang.getValueAt(b,2).toString());
                    tb_aksesoris.setValueAt(Integer.toString(stok), i, 3);

                    if((banyak-cancel)<=0){
                        model1.removeRow(b);
                    }else{
                        tb_keranjang.setValueAt(banyak-cancel,b,3);
                        tb_keranjang.setValueAt((banyak-cancel)*harga,b,4);
                    }
                }
            }
        }
        
        
    }
    public void pengembalian(JTable tb_pengembalian, JTable tb_kamera, JTable tb_aksesoris, int b) {
        
            model1 = (DefaultTableModel)tb_pengembalian.getModel();
            for(int i=0;i<tb_kamera.getRowCount();i++){
                if(tb_kamera.getValueAt(i, 0).equals(tb_pengembalian.getValueAt(b, 0))){
                    String strstok = tb_kamera.getValueAt(i, 3).toString();
                    int stok = Integer.parseInt(strstok)+1;
                    tb_kamera.setValueAt(Integer.toString(stok), i, 3);
                    model1.removeRow(b);
                }
            }
            for(int i=0;i<tb_aksesoris.getRowCount();i++){
                if(tb_aksesoris.getValueAt(i, 0).equals(tb_pengembalian.getValueAt(b, 0))){
                    String strstok = tb_aksesoris.getValueAt(i, 3).toString();
                    int stok = Integer.parseInt(strstok)+1;
                    tb_aksesoris.setValueAt(Integer.toString(stok), i, 3);
                    model1.removeRow(b);

                }
            }        
        
    }
}
