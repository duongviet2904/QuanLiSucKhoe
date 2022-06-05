/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import object.DocGhi;
import object.DonKBYTSinhVien;
import object.DonXinNghiGV;
import object.DonXinNghiSV;
import object.GiaoVien;
import object.Khoa;
import object.LichSu;
import object.LopHoc;
import object.ThongBao;
import table.TableGVXN;
import table.TableKBYTSV;
import table.TableSVXN;

/**
 *
 * @author duongv
 */
public class QLDonXinNghiGV extends javax.swing.JFrame {

    /**
     * Creates new form QLSKSV
     */
    private GiaoVien gv;
    private Khoa khoa;
    
    
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    String ngayKB = df.format(date);
    int check = -1;
    int dong = -1;
    private int x = -1;
    DocGhi rw = new DocGhi();
    
    private ArrayList<DonXinNghiGV> lst = new ArrayList<>();
    private ArrayList<DonXinNghiGV> chuaDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiGV> daDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiGV> lstDangNghi = new ArrayList<>();
    private ArrayList<DonXinNghiGV> lstHocTT = new ArrayList<>();
    
    public QLDonXinNghiGV() {
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLDonXinNghiGV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public QLDonXinNghiGV(GiaoVien gv, Khoa khoa) {
        this.gv = gv;
        this.khoa = khoa;
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLDonXinNghiGV.class.getName()).log(Level.SEVERE, null, ex);
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
//            Logger.getLogger(QLDonXinNghiSV.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(QLDonXinNghiSV.class.getName()).log(Level.SEVERE, null, ex);
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
                
                if(!"Chờ".equals(sv.getTrangThai()) && dateNow.after(df.parse(sv.getNgayBatDau())) && dateNow.before(df.parse(sv.getNgayKetThuc())) && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstDangNghi.add(sv);
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
        btnChuaDuyet1 = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý đơn xin nghỉ");
        setBackground(new java.awt.Color(250, 250, 250));
        setIconImage(getAnh());

        btnNghi.setText("Đang nghỉ");
        btnNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNghiActionPerformed(evt);
            }
        });

        btnDaDuyet.setText("Đã duyệt");
        btnDaDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaDuyetActionPerformed(evt);
            }
        });

        btnChuaDuyet.setText("Chưa duyệt");
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
        tableThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThongKeMouseClicked(evt);
            }
        });
        tblThongKe.setViewportView(tableThongKe);

        btnChuaDuyet1.setText("Duyệt");
        btnChuaDuyet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuaDuyet1ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNghi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDaDuyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChuaDuyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChuaDuyet1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNghi)
                    .addComponent(btnDaDuyet)
                    .addComponent(btnChuaDuyet)
                    .addComponent(btnChuaDuyet1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNghiActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableGVXN(lstDangNghi));
        check = 3;
    }//GEN-LAST:event_btnNghiActionPerformed

    private void btnDaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaDuyetActionPerformed
        // TODO add your handling code here:
        check = 1;
        tableThongKe.setModel(new TableGVXN(daDuyet));
    }//GEN-LAST:event_btnDaDuyetActionPerformed

    private void btnChuaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuaDuyetActionPerformed
        // TODO add your handling code here:
        check = 2;
        tableThongKe.setModel(new TableGVXN(chuaDuyet));
        
    }//GEN-LAST:event_btnChuaDuyetActionPerformed

    private void btnChuaDuyet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuaDuyet1ActionPerformed
        // TODO add your handling code here:
        x = tableThongKe.getSelectedRow();
        if(x != -1){
            DonXinNghiGV tg = chuaDuyet.get(x);
            DonXinNghiGV tg2 = tg;
            tg2.setTrangThai("Đã duyệt");
            daDuyet.add(tg2);
            chuaDuyet.remove(tg);
            tableThongKe.setModel(new TableGVXN(chuaDuyet));
            int j = lst.indexOf(tg);
            lst.remove(j);
            lst.add(j, tg2);
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            String ngayGui = df.format(date);
            LichSu s = new LichSu("Admin","Duyệt đơn xin nghỉ "+gv+" ngay "+tg2.getNgayGui(), ngayGui, (Object)tg2);
            addLichSu(s);
            ThongBao t = new ThongBao(gv.getTenGV(),tg2.getMaGV(),"Đã duyệt đơn xin nghỉ ngày "+tg2.getNgayGui(),ngayGui, tg2);
            addThongBao(t);
            try {
                rw.WriteObject("./src/data/DonXNGV.txt", lst);
            } catch (IOException ex) {
                Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnChuaDuyet1ActionPerformed

    private void tableThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThongKeMouseClicked
        // TODO add your handling code here:
        if(check == 1)
        {
            dong = tableThongKe.getSelectedRow();
                DonXinNghiGV l = daDuyet.get(dong);
                System.out.println(l.toString());
                GVNghiChiTiet frame = new GVNghiChiTiet(l);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
        }else if(check == 2)
        {
            dong = tableThongKe.getSelectedRow();
                DonXinNghiGV l = chuaDuyet.get(dong);
                System.out.println(l.toString());
                GVNghiChiTiet frame = new GVNghiChiTiet(l);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
        }else if(check == 3)
        {
            dong = tableThongKe.getSelectedRow();
                DonXinNghiGV l = lstDangNghi.get(dong);
                System.out.println(l.toString());
                GVNghiChiTiet frame = new GVNghiChiTiet(l);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Container contentPane = frame.getContentPane();
                frame.setVisible(true);
        }
    }//GEN-LAST:event_tableThongKeMouseClicked

    private void m_gvTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTrangChuMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_m_gvTrangChuMouseClicked
    public void addThongBao(ThongBao s)
    {
        DocGhi rw = new DocGhi();
        try {
            
            ArrayList<ThongBao> dstb = (ArrayList<ThongBao>) rw.ReadObject("./src/data/ThongBao.txt");
            s.setStt(Integer.toString(dstb.size()+1));
            dstb.add(s);
            rw.WriteObject("./src/data/ThongBao.txt", dstb);
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    public void addLichSu(LichSu s)
    {
        DocGhi rw = new DocGhi();
        try {
            
            ArrayList<LichSu> dsls = (ArrayList<LichSu>) rw.ReadObject("./src/data/LichSu.txt");
            s.setStt(Integer.toString(dsls.size()+1));
            dsls.add(s);
            rw.WriteObject("./src/data/LichSu.txt", dsls);
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
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
            java.util.logging.Logger.getLogger(QLDonXinNghiGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDonXinNghiGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDonXinNghiGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDonXinNghiGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QLDonXinNghiGV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuaDuyet;
    private javax.swing.JButton btnChuaDuyet1;
    private javax.swing.JButton btnDaDuyet;
    private javax.swing.JButton btnNghi;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JTable tableThongKe;
    private javax.swing.JScrollPane tblThongKe;
    // End of variables declaration//GEN-END:variables
}
