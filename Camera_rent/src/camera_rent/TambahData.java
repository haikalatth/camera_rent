/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class TambahData {

    File file;
    BufferedWriter bw;
    DefaultTableModel model;
    DefaultTableModel model2;

    public void updateKamera(JTable tb_kamera) {
        try {
            file = new File("src/camera_rent/kamera.txt");
            bw = new BufferedWriter(new FileWriter(file));

            for (int i = 0; i < tb_kamera.getColumnCount(); i++) {
                if (i > 0) {
                    bw.write(",");
                }
                bw.write(tb_kamera.getColumnName(i));
            }
            bw.newLine();
            for (int i = 0; i < tb_kamera.getRowCount(); i++) {
                for (int j = 0; j < tb_kamera.getColumnCount(); j++) {
                    if (j > 0) {
                        bw.write("/");
                    }
                    bw.write(tb_kamera.getValueAt(i, j).toString());
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        LoadData ld = new LoadData();
        ld.loadKamera(tb_kamera);
    }

    public void tambahKamera(JTable tb_kamera, JTextField kamera_no, JTextField kamera_nb, JTextField kamera_hrg,
            JTextField kamera_jb) {
        Object[] tambah = new Object[4];
        tambah[0] = kamera_no.getText();
        tambah[1] = kamera_nb.getText();
        tambah[2] = kamera_hrg.getText();
        tambah[3] = kamera_jb.getText();
        if (kamera_no.getText().isEmpty() || kamera_nb.getText().isEmpty() || kamera_jb.getText().isEmpty()
                || kamera_hrg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harus diisi");
        } else {
            model = (DefaultTableModel) tb_kamera.getModel();
            model.addRow(tambah);
            TambahData td = new TambahData();
            td.updateKamera(tb_kamera);
            kamera_no.setText("");
            kamera_nb.setText("");
            kamera_hrg.setText("");
            kamera_jb.setText("");
        }
    }

    public void updateAksesoris(JTable tb_aksesoris) {
        try {
            file = new File("src/camera_rent/aksesoris.txt");
            bw = new BufferedWriter(new FileWriter(file));

            for (int i = 0; i < tb_aksesoris.getColumnCount(); i++) {
                if (i > 0) {
                    bw.write(",");
                }
                bw.write(tb_aksesoris.getColumnName(i));
            }
            bw.newLine();
            for (int i = 0; i < tb_aksesoris.getRowCount(); i++) {
                for (int j = 0; j < tb_aksesoris.getColumnCount(); j++) {
                    if (j > 0) {
                        bw.write("/");
                    }
                    bw.write(tb_aksesoris.getValueAt(i, j).toString());
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        LoadData ld = new LoadData();
        ld.loadKamera(tb_aksesoris);
    }

    public void tambahAksesoris(JTable tb_aksesoris, JTextField aksesoris_no, JTextField aksesoris_nb,
            JTextField aksesoris_hrg, JTextField aksesoris_jb) {
        Object[] tambah = new Object[4];
        tambah[0] = aksesoris_no.getText();
        tambah[1] = aksesoris_nb.getText();
        tambah[2] = aksesoris_hrg.getText();
        tambah[3] = aksesoris_jb.getText();
        if (aksesoris_no.getText().isEmpty() || aksesoris_nb.getText().isEmpty() || aksesoris_jb.getText().isEmpty()
                || aksesoris_hrg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harus diisi");
        } else {
            model2 = (DefaultTableModel) tb_aksesoris.getModel();
            model2.addRow(tambah);
            TambahData td = new TambahData();
            td.updateAksesoris(tb_aksesoris);
            aksesoris_no.setText("");
            aksesoris_nb.setText("");
            aksesoris_hrg.setText("");
            aksesoris_jb.setText("");
        }
    }
}
