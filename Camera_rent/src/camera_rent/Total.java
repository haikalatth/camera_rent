/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Total {

    int jmlhari;

    public int akhir(JDateChooser tgl_pinjam, JDateChooser tgl_kembali, JLabel t_akhir, JLabel t_subtotal) {
        Date tglkembali = tgl_kembali.getDate();
        Date tglpinjam = tgl_pinjam.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        int pinjam = Integer.parseInt(sdf.format(tglpinjam));
        int kembali = Integer.parseInt(sdf.format(tglkembali));
        jmlhari = kembali - pinjam;
        int sutot = Integer.parseInt(t_subtotal.getText());
        int hir = jmlhari * sutot;
        String akhir = String.valueOf(hir);
        //JOptionPane.showMessageDialog(null, "SEWA " + jmlhari + " hari");
        t_akhir.setText(akhir);
        return hir;
    }
}
