/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author M . FR
 */
public class Datadiri extends javax.swing.JFrame {
String a,b,c,d,e,f;
Object[] id,nb;
int baris,total;
BufferedWriter bw;
    /**
     * Creates new form Datadiri
     */
    public Datadiri() {
        initComponents();
    }

    Datadiri(int row, List list, List nama, String pinjam, String kembali, int tot) {
        initComponents();
        baris = row;
        id = list.toArray();
        nb = nama.toArray();
        d = pinjam;
        e = kembali;
        total = tot;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rb_laki = new javax.swing.JRadioButton();
        rb_perem = new javax.swing.JRadioButton();
        btn_lanjut = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        t_nohp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 540));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 14)); // NOI18N
        jLabel2.setText("No. Kartu ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 90, 40);

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 14)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 180, 90, 30);

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 230, 80, 30);

        jLabel5.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 14)); // NOI18N
        jLabel5.setText("No. HP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 390, 60, 20);

        jLabel6.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 340, 90, 20);
        getContentPane().add(t_nama);
        t_nama.setBounds(170, 180, 580, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 230, 580, 90);

        buttonGroup1.add(rb_laki);
        rb_laki.setText("LAKI - LAKI");
        rb_laki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_lakiMouseClicked(evt);
            }
        });
        getContentPane().add(rb_laki);
        rb_laki.setBounds(170, 340, 93, 23);

        buttonGroup1.add(rb_perem);
        rb_perem.setText("PEREMPUAN");
        rb_perem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_peremActionPerformed(evt);
            }
        });
        getContentPane().add(rb_perem);
        rb_perem.setBounds(550, 340, 110, 23);

        btn_lanjut.setText("Selanjutnya");
        btn_lanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lanjutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lanjut);
        btn_lanjut.setBounds(640, 440, 110, 40);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 130, 580, 40);

        t_nohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nohpKeyTyped(evt);
            }
        });
        getContentPane().add(t_nohp);
        t_nohp.setBounds(170, 380, 580, 40);

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 440, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/datadiri.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_peremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_peremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_peremActionPerformed

    private void btn_lanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lanjutActionPerformed
        a = t_nama.getText();
        //System.out.println(id[0].toString());
        //System.out.println(nb[0].toString());
        List list = new ArrayList<>();
        for(int i=0;i<baris;i++){
            b = id[i].toString();
            c = nb[i].toString();
            list.add(b+"/"+c+"/"+a+"/"+d+"/"+e);
            
            File file = new File("src/camera_rent/datasewa.txt");
            try {
                PrintWriter out = new PrintWriter(new BufferedWriter(
                        new FileWriter(file, true)));
                out.println(b+"/"+c+"/"+a+"/"+d+"/"+e);
                out.close();
            } catch (IOException e) {
                System.out.println("Gagal menulis ke file " + file);
                e.printStackTrace();
            }
        }

        f=t_nohp.getText();
        Pembayaran p = new Pembayaran(a, f, total, e);
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_lanjutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Penyewaan p = new Penyewaan();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if(!(Character.isDigit(character))){
            evt.consume();
        }
       
    }//GEN-LAST:event_jTextField4KeyTyped

    private void rb_lakiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_lakiMouseClicked
        // TODO add your handling code here:
        if(rb_laki.isSelected()){
            rb_laki.setVisible(true);
        }
        
    }//GEN-LAST:event_rb_lakiMouseClicked

    private void t_nohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nohpKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(Character.isDigit(karakter))){
            evt.consume();
        }
    }//GEN-LAST:event_t_nohpKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datadiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datadiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datadiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datadiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datadiri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lanjut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton rb_laki;
    private javax.swing.JRadioButton rb_perem;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_nohp;
    // End of variables declaration//GEN-END:variables
}
