/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

import java.awt.Container;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import object.Khoa;
import object.LopHoc;
import object.SinhVien;

/**
 *
 * @author duongv
 */
public class TrangChuSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuSinhVien
     */
//    private SinhVien sv = new SinhVien("SV01", "Nguyễn Minh Anh", "Nữ", "012345678", "abc@gmail.com", "2001-01-16", "L01", "TK05", "SV01", "123", 0);
//    
//    private LopHoc lh = new LopHoc("L01", "IT01", 4, 14, "K01", "GV01");
//        
//    private Khoa k = new Khoa("K01", "CNTT", "GV01");
    
    private SinhVien sv;
    private LopHoc lh;
    private Khoa k;
    

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public LopHoc getLh() {
        return lh;
    }

    public void setLh(LopHoc lh) {
        this.lh = lh;
    }

    public Khoa getK() {
        return k;
    }

    public void setK(Khoa k) {
        this.k = k;
    }
    
    
    public TrangChuSinhVien() {
        initComponents();
    }
    public TrangChuSinhVien(SinhVien s, LopHoc lh, Khoa kh) {
        
        this.sv =s;
        this.lh = lh;
        this.k = kh;
        initComponents();
    }
    public void loadData()
    {
        text_masv.setText(sv.getMaSV());
        text_tensv.setText(sv.getTenSV());
        text_lop.setText(lh.getTenLop());
        text_khoa.setText(k.getTenKhoa());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_anh = new javax.swing.JLabel();
        text_masv = new javax.swing.JLabel();
        text_tensv = new javax.swing.JLabel();
        text_khoa = new javax.swing.JLabel();
        text_lop = new javax.swing.JLabel();
        bt_xinnghi = new javax.swing.JButton();
        bt_khaibao = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_svTrangChu = new javax.swing.JMenu();
        m_svKhaiBao = new javax.swing.JMenu();
        m_svXinNghi = new javax.swing.JMenu();
        m_svThongBao = new javax.swing.JMenu();
        m_svLichSu = new javax.swing.JMenu();
        m_svTroGiup = new javax.swing.JMenu();
        m_dangXuat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã sinh viên: ");

        jLabel2.setText("Khoa: ");

        jLabel3.setText("Tên sinh viên:");

        jLabel4.setText("Lớp:");

        text_anh.setText("jLabel5");

        text_masv.setText(sv.getMaSV());

        text_tensv.setText(sv.getTenSV());

        text_khoa.setText(k.getTenKhoa());

        text_lop.setText(k.getTenKhoa());

        bt_xinnghi.setText("Đăng kí nghỉ phép");
        bt_xinnghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xinnghiActionPerformed(evt);
            }
        });

        bt_khaibao.setText("Khai báo y tế");
        bt_khaibao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khaibaoActionPerformed(evt);
            }
        });

        jButton4.setText("Lịch sử");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Hỗ trợ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        m_svTrangChu.setText("Trang Chủ");
        m_svTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_svTrangChuMouseClicked(evt);
            }
        });
        menu_gv.add(m_svTrangChu);

        m_svKhaiBao.setText("Khai Báo Y Tế");
        m_svKhaiBao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_svKhaiBaoMouseClicked(evt);
            }
        });
        menu_gv.add(m_svKhaiBao);

        m_svXinNghi.setText("Xin Nghỉ");
        m_svXinNghi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_svXinNghiMouseClicked(evt);
            }
        });
        menu_gv.add(m_svXinNghi);

        m_svThongBao.setText("Thông Báo");
        menu_gv.add(m_svThongBao);

        m_svLichSu.setText("Lịch sử");
        m_svLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_svLichSuMouseClicked(evt);
            }
        });
        menu_gv.add(m_svLichSu);

        m_svTroGiup.setText("Trợ Giúp");
        m_svTroGiup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_svTroGiupMouseClicked(evt);
            }
        });
        menu_gv.add(m_svTroGiup);

        m_dangXuat.setText("Đăng Xuất");
        m_dangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_dangXuatMouseClicked(evt);
            }
        });
        m_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_dangXuatActionPerformed(evt);
            }
        });
        menu_gv.add(m_dangXuat);

        setJMenuBar(menu_gv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_khaibao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(text_masv))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_lop)
                                    .addComponent(text_khoa)
                                    .addComponent(text_tensv)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_xinnghi, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(text_masv))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_tensv))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_khoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(text_lop)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(text_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_xinnghi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_khaibao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void m_svTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_svTrangChuMouseClicked
        // TODO add your handling code here:
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_m_svTrangChuMouseClicked

    private void m_svKhaiBaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_svKhaiBaoMouseClicked
        // TODO add your handling code here:
        SVKhaiBao frame = new SVKhaiBao(sv,lh,k);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_svKhaiBaoMouseClicked

    private void m_svXinNghiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_svXinNghiMouseClicked
        // TODO add your handling code here:
        SVXinNghi frame = new SVXinNghi(sv,lh,k);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_svXinNghiMouseClicked

    private void m_svLichSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_svLichSuMouseClicked
        // TODO add your handling code here:
        XemLichSu frame = new XemLichSu(sv);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_svLichSuMouseClicked

    private void m_svTroGiupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_svTroGiupMouseClicked
        // TODO add your handling code here:
        HoTro frame = new HoTro();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_svTroGiupMouseClicked

    private void bt_khaibaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_khaibaoActionPerformed
        // TODO add your handling code here:
        SVKhaiBao frame = new SVKhaiBao(sv,lh,k);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_bt_khaibaoActionPerformed

    private void bt_xinnghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xinnghiActionPerformed
        // TODO add your handling code here:
        SVXinNghi frame = new SVXinNghi(sv,lh,k);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_bt_xinnghiActionPerformed

    private void m_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_dangXuatActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_m_dangXuatActionPerformed

    private void m_dangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_dangXuatMouseClicked
        // TODO add your handling code here:
        DangNhap frame;
        try {
            frame = new DangNhap();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Container contentPane = frame.getContentPane();
            frame.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_m_dangXuatMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        XemLichSu frame = new XemLichSu(sv);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_khaibao;
    private javax.swing.JButton bt_xinnghi;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu m_dangXuat;
    private javax.swing.JMenu m_svKhaiBao;
    private javax.swing.JMenu m_svLichSu;
    private javax.swing.JMenu m_svThongBao;
    private javax.swing.JMenu m_svTrangChu;
    private javax.swing.JMenu m_svTroGiup;
    private javax.swing.JMenu m_svXinNghi;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JLabel text_anh;
    private javax.swing.JLabel text_khoa;
    private javax.swing.JLabel text_lop;
    private javax.swing.JLabel text_masv;
    private javax.swing.JLabel text_tensv;
    // End of variables declaration//GEN-END:variables
}
