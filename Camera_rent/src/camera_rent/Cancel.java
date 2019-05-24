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
    public void batal(JTable tb_keranjang, int b) {
        model1 = (DefaultTableModel)tb_keranjang.getModel();
        model1.removeRow(b);
    }
}
