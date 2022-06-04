/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

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
import table.TableGVXN;
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
    
    
    SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
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
    private ArrayList<DonKBYTGiaoVien> lstOther = new ArrayList<>();
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
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
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
                
//                if(dateNow.compareTo(df.parse(sv.getNgayBatDau())) > 0 && dateNow.compareTo(df.parse(sv.getNgayKetThuc())) < 0 && sv.getLop().equalsIgnoreCase(lh.getTenLop()) && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
//                    lstDangNghi.add(sv);
//                }
                
            }
            lstKBYT = (ArrayList<DonKBYTGiaoVien>) rw.ReadObject("./src/data/KBYTGV.txt");
            for(DonKBYTGiaoVien item : lstKBYT){
                if(item.isCoTrieuChung() == true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstCovid.add(item);
                }
                if(item.isTiepXucNguoiBenh() == true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstOther.add(item);
                }
                if(item.isTiepXucNguoiBenhCoBieuHien()== true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstOther.add(item);
                }
                if(item.isTiepXucNguoiBenhDauMua()== true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstOther.add(item);
                }
                if(item.isTiepXucNguoiTuNuocCoBenh()== true && item.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstOther.add(item);
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

        btnNghi = new javax.swing.JButton();
        btnDaDuyet = new javax.swing.JButton();
        btnChuaDuyet = new javax.swing.JButton();
        tblThongKe = new javax.swing.JScrollPane();
        tableThongKe = new javax.swing.JTable();
        btnCovid = new javax.swing.JButton();
        btnKhac = new javax.swing.JButton();
        btnDaDuyet1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNghi.setText("Đang nghỉ");
        btnNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNghiActionPerformed(evt);
            }
        });

        btnDaDuyet.setText("Đơn đã duyệt");
        btnDaDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaDuyetActionPerformed(evt);
            }
        });

        btnChuaDuyet.setText("Đơn chưa duyệt");
        btnChuaDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuaDuyetActionPerformed(evt);
            }
        });

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

        btnKhac.setText("Khác");
        btnKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhacActionPerformed(evt);
            }
        });

        btnDaDuyet1.setText("Duyệt Đơn xin nghỉ");
        btnDaDuyet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaDuyet1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNghi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDaDuyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChuaDuyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCovid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKhac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDaDuyet1)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNghi)
                    .addComponent(btnDaDuyet)
                    .addComponent(btnChuaDuyet)
                    .addComponent(btnCovid)
                    .addComponent(btnKhac)
                    .addComponent(btnDaDuyet1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNghiActionPerformed
        // TODO add your handling code here:
//        tableThongKe.setModel(new TableSVXN(lstDangNghi));
    }//GEN-LAST:event_btnNghiActionPerformed

    private void btnDaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaDuyetActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGVXN(daDuyet));
    }//GEN-LAST:event_btnDaDuyetActionPerformed

    private void btnChuaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuaDuyetActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGVXN(chuaDuyet));
    }//GEN-LAST:event_btnChuaDuyetActionPerformed

    private void btnCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovidActionPerformed
        // TODO add your handling code here:
//        tableThongKe.setModel(new TableKBYTSV(lstCovid));
    }//GEN-LAST:event_btnCovidActionPerformed

    private void btnKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhacActionPerformed
        // TODO add your handling code here:
//        tableThongKe.setModel(new TableKBYTSV(lstOther));
    }//GEN-LAST:event_btnKhacActionPerformed

    private void btnDaDuyet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaDuyet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDaDuyet1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSKGV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuaDuyet;
    private javax.swing.JButton btnCovid;
    private javax.swing.JButton btnDaDuyet;
    private javax.swing.JButton btnDaDuyet1;
    private javax.swing.JButton btnKhac;
    private javax.swing.JButton btnNghi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTable tableThongKe;
    private javax.swing.JScrollPane tblThongKe;
    // End of variables declaration//GEN-END:variables
}
