/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import javax.swing.JOptionPane;

/**
 *
 * @author M . FR
 */
public class Pembayaran extends javax.swing.JFrame {
int tglkembali,total;
    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();
    }
    
    public Pembayaran(String a, String f, int total, String e){
        initComponents();
        l_nama.setText(a);
        l_nohp.setText(f);
        t_total.setText(Integer.toString(total));
        t_kembali.setText(e);
        LoadData ld = new LoadData();
        ld.loadKeranjang(tb_keranjang);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_kembali = new javax.swing.JLabel();
        l_nama = new javax.swing.JLabel();
        t_total = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l_nohp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_keranjang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 540));
        setSize(new java.awt.Dimension(860, 540));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel3.setText("DIKEMBALIKAN PADA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 430, 210, 20);

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel4.setText("DAFTAR BARANG");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 210, 200, 20);

        jLabel5.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel5.setText("NO. HP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 170, 70, 20);

        jLabel6.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel6.setText("NAMA ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 130, 70, 20);
        getContentPane().add(t_kembali);
        t_kembali.setBounds(300, 430, 430, 20);
        getContentPane().add(l_nama);
        l_nama.setBounds(300, 130, 430, 20);
        getContentPane().add(t_total);
        t_total.setBounds(300, 320, 430, 20);

        jLabel10.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel10.setText("TOTAL");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 320, 100, 20);
        getContentPane().add(l_nohp);
        l_nohp.setBounds(300, 170, 430, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 470, 100, 40);

        tb_keranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_keranjang);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 210, 453, 100);

        jLabel1.setText("Tunai");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 350, 220, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 350, 460, 30);

        jLabel2.setText("Kembalian");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 390, 220, 30);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(300, 400, 460, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Terima Kasih telah berlangganan di toko kami");
        Home ho = new Home();
        ho.setVisible(true);
        ho.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l_nama;
    private javax.swing.JLabel l_nohp;
    private javax.swing.JLabel t_kembali;
    private javax.swing.JLabel t_total;
    private javax.swing.JTable tb_keranjang;
    // End of variables declaration//GEN-END:variables
}
