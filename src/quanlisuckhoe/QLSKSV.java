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
import object.LopHoc;
import table.TableKBYTSV;
import table.TableSV;
import table.TableSVXN;

/**
 *
 * @author duongv
 */
public class QLSKSV extends javax.swing.JFrame {

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
    
    private ArrayList<DonXinNghiSV> lst = new ArrayList<>();
    private ArrayList<DonXinNghiSV> chuaDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiSV> daDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiSV> lstDangNghi = new ArrayList<>();
    private ArrayList<DonXinNghiSV> lstHocTT = new ArrayList<>();
    
    private ArrayList<DonKBYTSinhVien> lstKBYT = new ArrayList<>();
    private ArrayList<DonKBYTSinhVien> lstCovid = new ArrayList<>();
    private ArrayList<DonKBYTSinhVien> lst1 = new ArrayList<>();
    private ArrayList<DonKBYTSinhVien> lst2 = new ArrayList<>();
    private ArrayList<DonKBYTSinhVien> lst3 = new ArrayList<>();
    private ArrayList<DonKBYTSinhVien> lst4 = new ArrayList<>();
    public QLSKSV() {
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLSKSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public QLSKSV(GiaoVien gv, Khoa khoa) {
        this.gv = gv;
        this.khoa = khoa;
        initComponents();
        try {
            getDanhSach();
        } catch (ParseException ex) {
            Logger.getLogger(QLSKSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getMaKhoa_byMaSV(String maSV){
        try {
            lstKBYT = (ArrayList<DonKBYTSinhVien>) rw.ReadObject("./src/data/KBYTSV.txt");
            ArrayList<LopHoc> lstLH = new ArrayList<>();
            ArrayList<Khoa> lstKhoa = new ArrayList<>();
            lstLH = (ArrayList<LopHoc>) rw.ReadObject("./src/data/Lop.txt");
            lstKhoa = (ArrayList<Khoa>) rw.ReadObject("./src/data/Khoa.txt");
            for(DonKBYTSinhVien item : lstKBYT){
                if(maSV.equals(item.getMaSV())){
                    for(LopHoc lh : lstLH){
                        if(lh.getTenLop().equals(item.getLop())){
                            for(Khoa k : lstKhoa){
                                if(k.getTenKhoa().equals(item.getKhoa())){
                                    return k.getMaKhoa();
                                }
                            }
                        }
                    }
                }
            }
            return "";
        } catch (IOException ex) {
            Logger.getLogger(QLSKSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLSKSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

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
                
                if(!"Chờ".equals(sv.getTrangThai()) && dateNow.compareTo(df.parse(sv.getNgayBatDau())) > 0 && dateNow.compareTo(df.parse(sv.getNgayKetThuc())) < 0 && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstDangNghi.add(sv);
                }
                if(!"Chờ".equals(sv.getTrangThai()) && sv.isHocOnl()== true && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    lstHocTT.add(sv);
                }
                
            }
            lstKBYT = (ArrayList<DonKBYTSinhVien>) rw.ReadObject("./src/data/KBYTSV.txt");
            for(DonKBYTSinhVien item : lstKBYT){
                if(item.isCoTrieuChung() == true && getMaKhoa_byMaSV(item.getMaSV()).equals(khoa.getMaKhoa())){
                    lstCovid.add(item);
                }
                if(item.isTiepXucNguoiBenh() == true && getMaKhoa_byMaSV(item.getMaSV()).equals(khoa.getMaKhoa())){
                    lst1.add(item);
                }
                if(item.isTiepXucNguoiBenhCoBieuHien()== true && getMaKhoa_byMaSV(item.getMaSV()).equals(khoa.getMaKhoa())){
                    lst2.add(item);
                }
                if(item.isTiepXucNguoiBenhDauMua()== true && getMaKhoa_byMaSV(item.getMaSV()).equals(khoa.getMaKhoa())){
                    lst3.add(item);
                }
                if(item.isTiepXucNguoiTuNuocCoBenh()== true && getMaKhoa_byMaSV(item.getMaSV()).equals(khoa.getMaKhoa())){
                    lst4.add(item);
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
        btnKhac1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKhac2 = new javax.swing.JButton();
        btnKhac = new javax.swing.JButton();
        btnKhac3 = new javax.swing.JButton();
        btnKhac4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnKhac.setText("Người bệnh có triệu chứng");
        btnKhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhacActionPerformed(evt);
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
                    .addComponent(tblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKhac1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKhac2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKhac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKhac3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKhac4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCovid)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
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
                .addGap(11, 11, 11)
                .addComponent(tblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhac1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovidActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSV(lstCovid));
    }//GEN-LAST:event_btnCovidActionPerformed

    private void btnKhac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKhac1ActionPerformed

    private void btnKhac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac2ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSV(lst1));
    }//GEN-LAST:event_btnKhac2ActionPerformed

    private void btnKhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhacActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSV(lst2));
    }//GEN-LAST:event_btnKhacActionPerformed

    private void btnKhac3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac3ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSV(lst3));
    }//GEN-LAST:event_btnKhac3ActionPerformed

    private void btnKhac4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhac4ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableSV(lst4));
    }//GEN-LAST:event_btnKhac4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tableThongKe.setModel(new TableKBYTSV(lstKBYT));
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
            java.util.logging.Logger.getLogger(QLSKSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSKSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSKSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSKSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QLSKSV().setVisible(true);
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTable tableThongKe;
    private javax.swing.JScrollPane tblThongKe;
    // End of variables declaration//GEN-END:variables
}
