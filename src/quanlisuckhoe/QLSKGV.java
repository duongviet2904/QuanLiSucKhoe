/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import object.DocGhi;
import object.DonKBYTGiaoVien;
import object.DonKBYTSinhVien;
import object.DonXinNghiGV;
import object.DonXinNghiSV;
import object.GiaoVien;
import object.Khoa;
import object.LopHoc;
import table.TableGV;
import table.TableGVXN;
import table.TableKBYTGV;
import table.TableKBYTSV;
import table.TableSVXN;

/**
 *
 * @author duongv
 */
public class QLSKGV extends javax.swing.JFrame {

    /**
     * Creates new form QLSKSV
     */
    private GiaoVien gv;
    private Khoa khoa;
    
    
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    String ngayKB = df.format(date);
    
    private int x = -1;
    DocGhi rw = new DocGhi();
    
    private ArrayList<DonXinNghiGV> lst = new ArrayList<>();
    private ArrayList<DonXinNghiGV> chuaDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiGV> daDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiGV> lstDangNghi = new ArrayList<>();
    
    private ArrayList<DonKBYTGiaoVien> lstKBYT = new ArrayList<>();
    private ArrayList<DonKBYTGiaoVien> lstCovid = new ArrayList<>();
    private ArrayList<DonKBYTGiaoVien> lst1 = new ArrayList<>();
    private ArrayList<DonKBYTGiaoVien> lst2 = new ArrayList<>();
    private ArrayList<DonKBYTGiaoVien> lst3 = new ArrayList<>();
    private ArrayList<DonKBYTGiaoVien> lst4 = new ArrayList<>();
    public QLSKGV() {
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLSKGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public QLSKGV(GiaoVien gv, Khoa khoa) {
        this.gv = gv;
        this.khoa = khoa;
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLSKGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getAnh()
    {
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/images/logo.png");
        return icon;
    }

//    public String getMaKhoa_byMaSV(String maSV){
//        try {
//            lstKBYT = (ArrayList<DonKBYTSinhVien>) rw.ReadObject("./src/data/KBYTSV.txt");
//            ArrayList<LopHoc> lstLH = new ArrayList<>();
//            ArrayList<Khoa> lstKhoa = new ArrayList<>();
//            lstLH = (ArrayList<LopHoc>) rw.ReadObject("./src/data/Lop.txt");
//            lstKhoa = (ArrayList<Khoa>) rw.ReadObject("./src/data/Khoa.txt");
//            for(DonKBYTSinhVien item : lstKBYT){
//                if(maSV.equals(item.getMaSV())){
//                    for(LopHoc lh : lstLH){
//                        if(lh.getTenLop().equals(item.getLop())){
//                            for(Khoa k : lstKhoa){
//                                if(k.getTenKhoa().equals(item.getKhoa())){
//                                    return k.getMaKhoa();
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            return "";
//        } catch (IOException ex) {
//            Logger.getLogger(QLSKGV.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(QLSKGV.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return "";
//    }

    public void getDanhSach() throws ParseException
    {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dateNow1 = df.format(new Date());
        Date dateNow = df.parse(dateNow1);
        
        try {
            
            lst = (ArrayList<DonXinNghiGV>) rw.ReadObject("./src/data/DonXNGV.txt");
            for(DonXinNghiGV sv : lst){
                if("Chờ".equals(sv.getTrangThai()) && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    chuaDuyet.add(sv);
                }else if(!"Chờ".equals(sv.getTrangThai()) &&  sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    daDuyet.add(sv);
                }
                
                if(!"Chờ".equals(sv.getTrangThai()) && dateNow.compareTo(df.parse(sv.getNgayBatDau())) > 0 && dateNow.compareTo(df.parse(sv.getNgayKetThuc())) < 0 && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstDangNghi.add(sv);
                }
                
            }
            lstKBYT = (ArrayList<DonKBYTGiaoVien>) rw.ReadObject("./src/data/KBYTGV.txt");
            for(DonKBYTGiaoVien item : lstKBYT){
                if(item.isCoTrieuChung() == true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstCovid.add(item);
                }
                if(item.isTiepXucNguoiBenh() == true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lst1.add(item);
                }
                if(item.isTiepXucNguoiBenhCoBieuHien()== true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lst2.add(item);
                }
                if(item.isTiepXucNguoiBenhDauMua()== true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lst4.add(item);
                }
                if(item.isTiepXucNguoiTuNuocCoBenh()== true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lst3.add(item);
                }
            }
                 
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblThongKe = new javax.swing.JScrollPane();
        tableThongKe = new javax.swing.JTable();
        btnCovid = new javax.swing.JButton();
        btnKhac = new javax.swing.JButton();
        btnKhac1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKhac2 = new javax.swing.JButton();
        btnKhac3 = new javax.swing.JButton();
        btnKhac4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sức khỏe giáo viên");
        setBackground(new java.awt.Color(250, 250, 250));
        setIconImage(getAnh());

        tableThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblThongKe.setViewportView(tableThongKe);

        btnCovid.setText("Covid");
        btnCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCovidActionPerformed(evt);
            }
        });

        btnKhac.setText("Người bệnh có triệu chứng");
        btnKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhacActionPerformed(evt);
            }
        });

        btnKhac1.setText("Đóng");
        btnKhac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhac1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiếp xúc: ");

        btnKhac2.setText("Người bệnh");
        btnKhac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhac2ActionPerformed(evt);
            }
        });

        btnKhac3.setText("Người đến từ vùng dịch");
        btnKhac3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhac3ActionPerformed(evt);
            }
        });

        btnKhac4.setText("Người bị bệnh đậu mùa");
        btnKhac4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhac4ActionPerformed(evt);
            }
        });

        jButton1.setText("Tất cả");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKhac1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblThongKe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnKhac2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKhac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKhac3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKhac4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCovid)))
                                .addGap(0, 267, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCovid)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnKhac)
                    .addComponent(btnKhac2)
                    .addComponent(btnKhac3)
                    .addComponent(btnKhac4))
                .addGap(10, 10, 10)
                .addComponent(tblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKhac1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovidActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGV(lstCovid));
    }//GEN-LAST:event_btnCovidActionPerformed

    private void btnKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhacActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGV(lst2));
    }//GEN-LAST:event_btnKhacActionPerformed

    private void btnKhac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKhac1ActionPerformed

    private void btnKhac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac2ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGV(lst1));
    }//GEN-LAST:event_btnKhac2ActionPerformed

    private void btnKhac3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac3ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGV(lst3));
    }//GEN-LAST:event_btnKhac3ActionPerformed

    private void btnKhac4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac4ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGV(lst4));
    }//GEN-LAST:event_btnKhac4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableKBYTGV(lstKBYT));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void m_gvTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTrangChuMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_m_gvTrangChuMouseClicked

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
            java.util.logging.Logger.getLogger(QLSKGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSKGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSKGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSKGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new QLSKGV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCovid;
    private javax.swing.JButton btnKhac;
    private javax.swing.JButton btnKhac1;
    private javax.swing.JButton btnKhac2;
    private javax.swing.JButton btnKhac3;
    private javax.swing.JButton btnKhac4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JTable tableThongKe;
    private javax.swing.JScrollPane tblThongKe;
    // End of variables declaration//GEN-END:variables
}
