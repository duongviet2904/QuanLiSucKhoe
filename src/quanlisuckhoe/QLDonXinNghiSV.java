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
import object.DonKBYTSinhVien;
import object.DonXinNghiSV;
import object.GiaoVien;
import object.Khoa;
import object.LichSu;
import object.LopHoc;
import object.ThongBao;
import table.TableKBYTSV;
import table.TableSVXN;

/**
 *
 * @author duongv
 */
public class QLDonXinNghiSV extends javax.swing.JFrame {

    /**
     * Creates new form QLSKSV
     */
    private GiaoVien gv;
    private Khoa khoa;
    
    
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    Date date = new Date();
    String ngayKB = df.format(date);
    
    private int x = -1;
    DocGhi rw = new DocGhi();
    
    private ArrayList<DonXinNghiSV> lst = new ArrayList<>();
    private ArrayList<DonXinNghiSV> chuaDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiSV> daDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiSV> lstDangNghi = new ArrayList<>();
    private ArrayList<DonXinNghiSV> lstHocTT = new ArrayList<>();
    
    public QLDonXinNghiSV() {
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLDonXinNghiSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public QLDonXinNghiSV(GiaoVien gv, Khoa khoa) {
        this.gv = gv;
        this.khoa = khoa;
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLDonXinNghiSV.class.getName()).log(Level.SEVERE, null, ex);
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
            
            lst = (ArrayList<DonXinNghiSV>) rw.ReadObject("./src/data/DonXNSV.txt");
            for(DonXinNghiSV sv : lst){
                if("Chờ".equals(sv.getTrangThai()) && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    chuaDuyet.add(sv);
                }else if(!"Chờ".equals(sv.getTrangThai()) &&  sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    daDuyet.add(sv);
                }
                //err
                if(dateNow.after(df.parse(sv.getNgayBatDau())) && dateNow.before(df.parse(sv.getNgayKetThuc()))  && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstDangNghi.add(sv);
                }
                if(sv.isHocOnl()== true && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstHocTT.add(sv);
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

        btnHocTT = new javax.swing.JButton();
        btnNghi = new javax.swing.JButton();
        btnDaDuyet = new javax.swing.JButton();
        btnChuaDuyet = new javax.swing.JButton();
        tblThongKe = new javax.swing.JScrollPane();
        tableThongKe = new javax.swing.JTable();
        btnDuyet = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHocTT.setText("Có học trực tuyến");
        btnHocTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocTTActionPerformed(evt);
            }
        });

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
        tblThongKe.setViewportView(tableThongKe);

        btnDuyet.setText("Duyệt");
        btnDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuyetActionPerformed(evt);
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
                    .addComponent(tblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNghi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHocTT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDaDuyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChuaDuyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDuyet)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHocTT)
                    .addComponent(btnNghi)
                    .addComponent(btnDaDuyet)
                    .addComponent(btnChuaDuyet)
                    .addComponent(btnDuyet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHocTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocTTActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSVXN(lstHocTT));
    }//GEN-LAST:event_btnHocTTActionPerformed

    private void btnNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNghiActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSVXN(lstDangNghi));
    }//GEN-LAST:event_btnNghiActionPerformed

    private void btnDaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaDuyetActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSVXN(daDuyet));
    }//GEN-LAST:event_btnDaDuyetActionPerformed

    private void btnChuaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuaDuyetActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSVXN(chuaDuyet));
    }//GEN-LAST:event_btnChuaDuyetActionPerformed

    private void btnDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuyetActionPerformed
        // TODO add your handling code here:
        x = tableThongKe.getSelectedRow();
        if(x != -1){
            DonXinNghiSV tg = chuaDuyet.get(x);
            DonXinNghiSV tg2 = tg;
            tg2.setTrangThai("Đã duyệt");
            daDuyet.add(tg2);
            chuaDuyet.remove(tg);
            tableThongKe.setModel(new TableSVXN(chuaDuyet));
            int j = lst.indexOf(tg);
            lst.remove(j);
            lst.add(j, tg2);
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            String ngayGui = df.format(date);
            LichSu s = new LichSu("Admin","Duyệt đơn xin nghỉ "+gv+" ngay "+tg2.getNgayGui(), ngayGui, (Object)tg2);
            addLichSu(s);
            ThongBao t = new ThongBao(gv.getTenGV(),tg2.getMaSV(),"Đã duyệt đơn xin nghỉ ngày "+tg2.getNgayGui(),ngayGui, tg2);
            addThongBao(t);
            try {
                rw.WriteObject("./src/data/DonXNSV.txt", lst);
            } catch (IOException ex) {
                Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDuyetActionPerformed
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
            java.util.logging.Logger.getLogger(QLDonXinNghiSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDonXinNghiSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDonXinNghiSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDonXinNghiSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QLDonXinNghiSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuaDuyet;
    private javax.swing.JButton btnDaDuyet;
    private javax.swing.JButton btnDuyet;
    private javax.swing.JButton btnHocTT;
    private javax.swing.JButton btnNghi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTable tableThongKe;
    private javax.swing.JScrollPane tblThongKe;
    // End of variables declaration//GEN-END:variables
}