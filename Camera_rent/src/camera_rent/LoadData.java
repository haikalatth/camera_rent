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
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
    DefaultTableModel model2;
    DefaultTableModel model3;

    public void loadKamera(JTable tb_kamera) {
        file = new File("src/camera_rent/kamera.txt");
        try {
            br = new BufferedReader(new FileReader(file));
            String barispertama = br.readLine();
            String[] namaKolom = barispertama.split(",");
            model = (DefaultTableModel) tb_kamera.getModel();
            model.setColumnIdentifiers(namaKolom);

            Object[] dataBaris = br.lines().toArray();
            for (int i = 0; i < dataBaris.length; i++) {
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "a");
        }
    }

    public void loadAksesoris(JTable tb_aksesoris) {
        file = new File("src/camera_rent/aksesoris.txt");
        try {
            br = new BufferedReader(new FileReader(file));
            String barispertama = br.readLine();
            String[] namaKolom = barispertama.split(",");
            model2 = (DefaultTableModel) tb_aksesoris.getModel();
            model2.setColumnIdentifiers(namaKolom);

            Object[] dataBaris = br.lines().toArray();
            for (int i = 0; i < dataBaris.length; i++) {
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model2.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "b");
        }
    }

    public void loadKeranjang(JTable tb_keranjang) {
        file = new File("src/camera_rent/keranjang.txt");
        try {
            br = new BufferedReader(new FileReader(file));
            String barispertama = br.readLine();
            String[] namaKolom = barispertama.split(",");
            model3 = (DefaultTableModel) tb_keranjang.getModel();
            model3.setColumnIdentifiers(namaKolom);

            Object[] dataBaris = br.lines().toArray();
            for (int i = 0; i < dataBaris.length; i++) {
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model3.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "b");
        }
    }
    
    public void loadDatasewa(JTable tb_pengembalian){
        
        file = new File("src/camera_rent/datasewa.txt");
        try {
            br  = new BufferedReader(new FileReader(file));
            String barispertama = br.readLine();
            String[] namaKolom = barispertama.split(",");
            model = (DefaultTableModel) tb_pengembalian.getModel();
            model.setColumnIdentifiers(namaKolom);
            
            Object[] dataBaris = br.lines().toArray();
            for (int i = 0; i < dataBaris.length; i++) {
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model.addRow(data);
            }
        } catch (Exception e) {
        }
        
    }
   

}
