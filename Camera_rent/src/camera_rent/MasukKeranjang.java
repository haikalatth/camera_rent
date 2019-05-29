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

    public void tambahitem(JTable tb_kamera, JTable tb_keranjang, int a) {
        model = (DefaultTableModel) tb_kamera.getModel();
        String kb = model.getValueAt(a, 0).toString();
        String nb = model.getValueAt(a, 1).toString();
        String hb = model.getValueAt(a, 2).toString();
        //kurangi stok
        String strstok = model.getValueAt(a, 3).toString();
        int stok = Integer.parseInt(strstok) - 1;
        if (stok < 0) {
            JOptionPane.showMessageDialog(null, "Stok Habis");
        } else {
            model.setValueAt(Integer.toString(stok), a, 3);
            List data = new ArrayList<>();
            data.add(kb);
            data.add(nb);
            data.add(hb);

            //masuk keranjang
            DefaultTableModel mdl = (DefaultTableModel) tb_keranjang.getModel();
            mdl.addRow(data.toArray());
        }

        //kurangi stok        
        /*try{
            file = new File("src/camera_rent/kamera.txt");
            bw = new BufferedWriter(new FileWriter(file));
            
            for(int i=0;i<tb_kamera.getColumnCount();i++){
                if(i>0)
                    bw.write(",");
                bw.write(tb_kamera.getColumnName(i));
            }
            bw.newLine();
            
            for(int i=0;i<tb_kamera.getRowCount();i++){                
                String q,w,e,r;
                q = tb_kamera.getValueAt(i,0).toString();
                w = tb_kamera.getValueAt(i,1).toString();
                e = tb_kamera.getValueAt(i,2).toString();
                r = tb_kamera.getValueAt(i,3).toString();
                if(i==a){
                    int m = Integer.parseInt(r)-1;
                    if(m<0){
                        JOptionPane.showMessageDialog(null,"Stok HABIS");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"MASUK ELSE");
                        r = Integer.toString(m);   
                        bw.write(q+"/"+w+"/"+e+"/"+r);
                        bw.newLine();
                    }                    
                    
                    
                }
                
            }
            bw.close();
        } catch(Exception e){
        
        }
        //hapus isi tabel
        model.getDataVector().removeAllElements();
        //isi tabel dengan stok baru
        LoadData ld = new LoadData();
        ld.loadKamera(tb_kamera);
        //ld.loadAksesoris(tb_aksesoris);*/
    }

    public void tambahaksesoris(JTable tb_aksesoris, JTable tb_keranjang, int a) {
        model = (DefaultTableModel) tb_aksesoris.getModel();
        String kb = model.getValueAt(a, 0).toString();
        String nb = model.getValueAt(a, 1).toString();
        String hb = model.getValueAt(a, 2).toString();

        //kurangi stok
        String strstok = model.getValueAt(a, 3).toString();
        int stok = Integer.parseInt(strstok) - 1;
        if (stok < 0) {
            JOptionPane.showMessageDialog(null, "Stok Habis");
        } else {
            model.setValueAt(Integer.toString(stok), a, 3);
            List dat = new ArrayList<>();
            dat.add(kb);
            dat.add(nb);
            dat.add(hb);
            
            //masuk keranjang
            DefaultTableModel mdl2 = (DefaultTableModel) tb_keranjang.getModel();
            mdl2.addRow(dat.toArray());
        }
    }
}
