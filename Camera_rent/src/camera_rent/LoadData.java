/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author micin
 */
public class LoadData {
    File file;
    BufferedReader br;
    BufferedWriter bw;
    DefaultTableModel model;
    
    public void loadKamera(JTable tb_kamera) {
        file = new File("src/camera_rent/kamera.txt");
        try{
            br = new BufferedReader(new FileReader(file));
            String barispertama = br.readLine();
            String[] namaKolom = barispertama.split(",");
            model = (DefaultTableModel)tb_kamera.getModel();
            model.setColumnIdentifiers(namaKolom);
            
            Object[] dataBaris = br.lines().toArray();
            for(int i=0;i<dataBaris.length;i++){
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                
                model.addRow(data);
            }
            
        }catch(Exception e){
            
        }
    }
    public void loadAksesoris(JTable tb_aksesoris) {
        file = new File("src/camera_rent/aksesoris.txt");
        try{
            br = new BufferedReader(new FileReader(file));
            String barispertama = br.readLine();
            String[] namaKolom = barispertama.split(",");
            model = (DefaultTableModel)tb_aksesoris.getModel();
            model.setColumnIdentifiers(namaKolom);
            
            Object[] dataBaris = br.lines().toArray();
            for(int i=0;i<dataBaris.length;i++){
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                
                model.addRow(data);
            }
            
        }catch(Exception e){
            
        }
    }
}
