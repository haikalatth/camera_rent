/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author micin
 */
public class Keranjang {
    File file;
    BufferedReader br;
    BufferedWriter bw;
    DefaultTableModel model;
    public void Keranjang(JTable tb_keranjang){
        try{
            file = new File("src/camera_rent/keranjang.txt");
            bw = new BufferedWriter(new FileWriter(file));
            
            for(int i=0;i<tb_keranjang.getColumnCount();i++){
                if(i>0)
                    bw.write(",");
                bw.write(tb_keranjang.getColumnName(i));
            }
            bw.newLine();
            for(int i=0;i<tb_keranjang.getRowCount();i++){
                for(int j=0;j<tb_keranjang.getColumnCount();j++){
                    if(j>0)
                        bw.write("/");
                    bw.write(tb_keranjang.getValueAt(i,j).toString());
                }
                bw.newLine();
            }
            bw.close();
        }catch(Exception e){
        
        }
    }
}
