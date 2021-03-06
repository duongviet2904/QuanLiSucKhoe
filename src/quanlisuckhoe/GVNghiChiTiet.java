/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import object.DonXinNghiGV;



/**
 *
 * @author ducth
 */
public class GVNghiChiTiet extends javax.swing.JFrame {
    
    DonXinNghiGV d = new DonXinNghiGV();
    /**
     * Creates new form GVNghi
     */
    public GVNghiChiTiet() {
        initComponents();
    }

    public GVNghiChiTiet(DonXinNghiGV d) {
        this.d = d;
        initComponents();
    }

    public int getIndex()
    {
        if(d.getLyDo().equals("Ốm nhập viện"))
        {
            return 0;
        }
        if(d.getLyDo().equals("Việc cá nhân"))
        {
            return 1;
        }
        if(d.getLyDo().equals("Mắc Covid-19"))
        {
            return 2;
        }
        if(d.getLyDo().equals("Khác"))
        {
            return 3;
        }
        return -1;
    }
    public Image getAnh()
    {
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/images/logo.png");
        return icon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tieude_ngay6 = new javax.swing.JLabel();
        bt_gui = new javax.swing.JButton();
        tieude_ngay2 = new javax.swing.JLabel();
        file_name = new javax.swing.JLabel();
        tieude_magv = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        tieude_tengv = new javax.swing.JLabel();
        tieude_ngay3 = new javax.swing.JLabel();
        tieude_khoa = new javax.swing.JLabel();
        txtNgayKT = new javax.swing.JTextField();
        tieude = new javax.swing.JLabel();
        tieude_ngay4 = new javax.swing.JLabel();
        txtTenGV = new javax.swing.JTextField();
        cb_lydo = new javax.swing.JComboBox<>();
        tieude_ngay = new javax.swing.JLabel();
        tieude_ngay5 = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChiTiet = new javax.swing.JTextArea();
        txtKhoa = new javax.swing.JTextField();
        txtNgayGui = new javax.swing.JTextField();
        bt_xem = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chi tiết đơn");
        setBackground(new java.awt.Color(250, 250, 250));
        setIconImage(getAnh());

        tieude_ngay6.setText("Các tài liệu/hình ảnh liên quan:");

        bt_gui.setText("Đóng");
        bt_gui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guiActionPerformed(evt);
            }
        });

        tieude_ngay2.setText("Ngày bắt đầu");

        file_name.setText(d.getTaiLieuLienQuan());
        file_name.setFocusable(false);

        tieude_magv.setText("Mã giáo viên");

        txtNgayBD.setEditable(false);
        txtNgayBD.setText(d.getNgayBatDau());
        txtNgayBD.setAutoscrolls(false);
        txtNgayBD.setFocusable(false);

        tieude_tengv.setText("Tên giáo viên");

        tieude_ngay3.setText("Ngày kết thúc");

        tieude_khoa.setText("Khoa");

        txtNgayKT.setEditable(false);
        txtNgayKT.setText(d.getNgayKetThuc());
        txtNgayKT.setAutoscrolls(false);
        txtNgayKT.setFocusable(false);

        tieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tieude.setText("Đơn Xin Nghỉ Phép");
        tieude.setAutoscrolls(true);
        tieude.setFocusable(false);
        tieude.setInheritsPopupMenu(false);
        tieude.setOpaque(true);

        tieude_ngay4.setText("Lý do xin nghỉ");

        txtTenGV.setEditable(false);
        txtTenGV.setText(d.getTenGV());
        txtTenGV.setFocusable(false);

        cb_lydo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ốm nhập viện", "Việc cá nhân", "Mắc Covid-19", "Khác" }));
        cb_lydo.setFocusable(false);

        tieude_ngay.setText("Ngày gửi");

        tieude_ngay5.setText("Mô tả chi tiết:");

        txtMaGV.setEditable(false);
        txtMaGV.setText(d.getMaGV());
        txtMaGV.setFocusable(false);

        txtChiTiet.setColumns(20);
        txtChiTiet.setRows(5);
        txtChiTiet.setText(d.getChiTiet());
        txtChiTiet.setFocusable(false);
        jScrollPane1.setViewportView(txtChiTiet);

        txtKhoa.setEditable(false);
        txtKhoa.setText(d.getKhoa());
        txtKhoa.setAutoscrolls(false);
        txtKhoa.setFocusable(false);

        txtNgayGui.setEditable(false);
        txtNgayGui.setText(d.getNgayGui());
        txtNgayGui.setFocusable(false);

        bt_xem.setText("Mở file");
        bt_xem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_xemMouseClicked(evt);
            }
        });

        m_gvTrangChu.setText("Trang Chủ");
        m_gvTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvTrangChuMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvTrangChu);

        setJMenuBar(menu_gv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tieude_ngay4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tieude_ngay5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cb_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tieude_ngay2)
                                .addGap(17, 17, 17))
                            .addComponent(tieude_ngay3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tieude_ngay6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_gui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_xem, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tieude_tengv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tieude_magv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenGV, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tieude_khoa)
                            .addComponent(tieude_ngay))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayGui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhoa))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(tieude)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tieude)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgayGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tieude_magv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieude_tengv)
                            .addComponent(txtTenGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tieude_ngay)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tieude_khoa)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tieude_ngay2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tieude_ngay3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieude_ngay4)
                            .addComponent(cb_lydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tieude_ngay5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tieude_ngay6)
                    .addComponent(file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_xem))
                .addGap(18, 18, 18)
                .addComponent(bt_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_guiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guiActionPerformed
        dispose();
    }//GEN-LAST:event_bt_guiActionPerformed

    private void m_gvTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTrangChuMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_m_gvTrangChuMouseClicked

    private void bt_xemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_xemMouseClicked
        // TODO add your handling code here:

        if (Desktop.isDesktopSupported()) {

            // TODO add your handling code here:
            File file = new File("./src/images/"+d.getTaiLieuLienQuan());//đường dẫn file
            Desktop dt = Desktop.getDesktop();
            try {
                dt.open(file);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(SVXinNghiChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
        else {
            throw new UnsupportedOperationException("Browser not supported.");

        }
    }//GEN-LAST:event_bt_xemMouseClicked

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
            java.util.logging.Logger.getLogger(GVNghiChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVNghiChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVNghiChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVNghiChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVNghiChiTiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_gui;
    private javax.swing.JButton bt_xem;
    private javax.swing.JComboBox<String> cb_lydo;
    private javax.swing.JLabel file_name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JLabel tieude;
    private javax.swing.JLabel tieude_khoa;
    private javax.swing.JLabel tieude_magv;
    private javax.swing.JLabel tieude_ngay;
    private javax.swing.JLabel tieude_ngay2;
    private javax.swing.JLabel tieude_ngay3;
    private javax.swing.JLabel tieude_ngay4;
    private javax.swing.JLabel tieude_ngay5;
    private javax.swing.JLabel tieude_ngay6;
    private javax.swing.JLabel tieude_tengv;
    private javax.swing.JTextArea txtChiTiet;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayGui;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtTenGV;
    // End of variables declaration//GEN-END:variables
}
