/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera_rent;

import javax.swing.JFrame;

/**
 *
 * @author micin
 */
public class Dashboard extends javax.swing.JFrame {
int row;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        LoadData ld = new LoadData();
        ld.loadKamera(tb_kamera);
        ld.loadAksesoris(tb_aksesoris);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_kamera = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_aksesoris = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_keranjang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 238, 238));
        setMinimumSize(new java.awt.Dimension(657, 504));
        getContentPane().setLayout(null);

        tb_kamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_kamera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_kameraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_kamera);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kamera", jPanel1);

        tb_aksesoris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_aksesoris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_aksesorisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_aksesoris);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Aksesoris", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 180, 660, 220);

        tb_keranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama Barang", "Harga"
            }
        ));
        jScrollPane3.setViewportView(tb_keranjang);
        if (tb_keranjang.getColumnModel().getColumnCount() > 0) {
            tb_keranjang.getColumnModel().getColumn(0).setMinWidth(2);
            tb_keranjang.getColumnModel().getColumn(0).setPreferredWidth(2);
            tb_keranjang.getColumnModel().getColumn(0).setMaxWidth(2);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(120, 410, 570, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Keranjang :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 400, 110, 30);

        bt_cancel.setText("Cancel");
        bt_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cancelMouseClicked(evt);
            }
        });
        getContentPane().add(bt_cancel);
        bt_cancel.setBounds(720, 480, 120, 30);

        jButton4.setText("Selanjutnya");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(720, 420, 120, 40);

        setSize(new java.awt.Dimension(876, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_kameraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_kameraMouseClicked
        row = tb_kamera.getSelectedRow();
        MasukKeranjang mk = new MasukKeranjang();
        mk.tambahitem(tb_kamera,tb_keranjang,row);
    }//GEN-LAST:event_tb_kameraMouseClicked

    private void bt_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelMouseClicked
        int b = tb_keranjang.getSelectedRow();
        Cancel ca = new Cancel();
        ca.batal(tb_keranjang,tb_kamera,tb_aksesoris,b);
        //ca.stok(tb_kamera,row);
    }//GEN-LAST:event_bt_cancelMouseClicked

    private void tb_aksesorisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_aksesorisMouseClicked
        // TODO add your handling code here:
        row = tb_aksesoris.getSelectedRow();
        MasukKeranjang mk = new MasukKeranjang();
        mk.tambahaksesoris(tb_aksesoris,tb_keranjang,row);
    }//GEN-LAST:event_tb_aksesorisMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Penyewaan p = new Penyewaan();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tb_aksesoris;
    private javax.swing.JTable tb_kamera;
    private javax.swing.JTable tb_keranjang;
    // End of variables declaration//GEN-END:variables
}
