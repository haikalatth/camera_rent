/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author micin
 */
public class SubTotal {
    int subtotal;
    public void tambah(JTable tb_keranjang, JLabel t_subtotal){
        int row = tb_keranjang.getRowCount();
        for(int a=0;a<row;a++){
            int price = Integer.parseInt(tb_keranjang.getValueAt(a, 4).toString());
            subtotal = subtotal+price;
        }
        t_subtotal.setText(Integer.toString(subtotal));
        //return subtotal;
    }
    /*public void kurang(JTable tb_keranjang, JLabel t_subtotal){
        int row = tb_keranjang.getRowCount();
        for(int a=0;a<row;a++){
            int price = Integer.parseInt(tb_keranjang.getValueAt(a, 4).toString());
            subtotal = subtotal-price;
        }
        t_subtotal.setText(Integer.toString(subtotal));
        //return subtotal;
    }*/
}
