/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

/**
 *
 * @author ducth
 */
public class GVKhaiBaoYTe extends javax.swing.JFrame {

    /**
     * Creates new form GVKhaiBaoYTe
     */
    public GVKhaiBaoYTe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tieude_magv = new javax.swing.JLabel();
        tieude_tengv = new javax.swing.JLabel();
        tieude_khoa = new javax.swing.JLabel();
        tieude = new javax.swing.JLabel();
        text_mgv = new javax.swing.JTextField();
        tieude_ngay = new javax.swing.JLabel();
        text_mgv1 = new javax.swing.JTextField();
        text_khoa = new javax.swing.JTextField();
        text_ngay = new javax.swing.JTextField();
        jTextArea1 = new javax.swing.JTextArea();
        rb_14Co = new javax.swing.JRadioButton();
        rb_14Khong = new javax.swing.JRadioButton();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea5 = new javax.swing.JTextArea();
        jTextArea6 = new javax.swing.JTextArea();
        rb_14Khong1 = new javax.swing.JRadioButton();
        rb_14Co1 = new javax.swing.JRadioButton();
        rb_14Co2 = new javax.swing.JRadioButton();
        rb_14Khong2 = new javax.swing.JRadioButton();
        rb_14Co3 = new javax.swing.JRadioButton();
        rb_14Khong3 = new javax.swing.JRadioButton();
        rb_14Co4 = new javax.swing.JRadioButton();
        rb_14Khong4 = new javax.swing.JRadioButton();
        bt_khaibao = new javax.swing.JButton();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();
        m_gvKhaiBao = new javax.swing.JMenu();
        m_gvXinNghi = new javax.swing.JMenu();
        m_gvThongKe = new javax.swing.JMenu();
        m_gvThongBao = new javax.swing.JMenu();
        m_gvTroGiup = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tieude_magv.setText("Mã giáo viên");

        tieude_tengv.setText("Tên giáo viên");

        tieude_khoa.setText("Khoa");

        tieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tieude.setText("Khai Báo Y Tế");

        text_mgv.setEditable(false);
        text_mgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_mgvActionPerformed(evt);
            }
        });

        tieude_ngay.setText("Ngày");

        text_mgv1.setEditable(false);
        text_mgv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_mgv1ActionPerformed(evt);
            }
        });

        text_khoa.setEditable(false);
        text_khoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_khoaActionPerformed(evt);
            }
        });

        text_ngay.setEditable(false);
        text_ngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ngayActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Trong vòng 14 ngày qua,Anh/Chị có thấy xuất hiện ít nhất 1 trong\n các dấu hiệu: sốt, ho, khó thở, viêm phổi, đau họng, mệt mỏi, thay \nđổi vị giác không?");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setVerifyInputWhenFocusTarget(false);

        rb_14Co.setText("Có");
        rb_14Co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14CoActionPerformed(evt);
            }
        });

        rb_14Khong.setText("Không");
        rb_14Khong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14KhongActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Người từ nước có bệnh Covid-19");
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setVerifyInputWhenFocusTarget(false);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Trong vòng 14 ngày qua Anh/Chị có tiếp xúc với:");
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setVerifyInputWhenFocusTarget(false);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Người bệnh có biểu hiện sốt, ho, khó thở, viêm phổi");
        jTextArea4.setAutoscrolls(false);
        jTextArea4.setVerifyInputWhenFocusTarget(false);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Người bệnh hoặc nghi ngờ mắc bệnh đậu mùa khỉ");
        jTextArea5.setAutoscrolls(false);
        jTextArea5.setVerifyInputWhenFocusTarget(false);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Người bệnh hoặc nghi ngờ mắc bệnh Covid-19");
        jTextArea6.setAutoscrolls(false);
        jTextArea6.setVerifyInputWhenFocusTarget(false);

        rb_14Khong1.setText("Không");
        rb_14Khong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Khong1ActionPerformed(evt);
            }
        });

        rb_14Co1.setText("Có");
        rb_14Co1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Co1ActionPerformed(evt);
            }
        });

        rb_14Co2.setText("Có");
        rb_14Co2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Co2ActionPerformed(evt);
            }
        });

        rb_14Khong2.setText("Không");
        rb_14Khong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Khong2ActionPerformed(evt);
            }
        });

        rb_14Co3.setText("Có");
        rb_14Co3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Co3ActionPerformed(evt);
            }
        });

        rb_14Khong3.setText("Không");
        rb_14Khong3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Khong3ActionPerformed(evt);
            }
        });

        rb_14Co4.setText("Có");
        rb_14Co4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Co4ActionPerformed(evt);
            }
        });

        rb_14Khong4.setText("Không");
        rb_14Khong4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14Khong4ActionPerformed(evt);
            }
        });

        bt_khaibao.setText("Khai Báo");
        bt_khaibao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khaibaoActionPerformed(evt);
            }
        });

        m_gvTrangChu.setText("Trang Chủ");
        menu_gv.add(m_gvTrangChu);

        m_gvKhaiBao.setText("Khai Báo Y Tế");
        menu_gv.add(m_gvKhaiBao);

        m_gvXinNghi.setText("Xin Nghỉ");
        menu_gv.add(m_gvXinNghi);

        m_gvThongKe.setText("Thống Kê");
        menu_gv.add(m_gvThongKe);

        m_gvThongBao.setText("Thông Báo");
        menu_gv.add(m_gvThongBao);

        m_gvTroGiup.setText("Trợ Giúp");
        menu_gv.add(m_gvTroGiup);

        setJMenuBar(menu_gv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb_14Co3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb_14Khong3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb_14Co4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb_14Khong4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextArea3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextArea2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextArea6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rb_14Co1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rb_14Khong1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rb_14Co2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rb_14Khong2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tieude_tengv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tieude_magv, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(text_mgv, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(text_mgv1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tieude_khoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tieude_ngay, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(text_ngay, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(text_khoa)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(tieude, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rb_14Khong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rb_14Co, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(bt_khaibao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tieude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieude_magv)
                            .addComponent(tieude_khoa)
                            .addComponent(text_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieude_tengv)
                            .addComponent(tieude_ngay)
                            .addComponent(text_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_14Co)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_14Khong)))
                        .addGap(27, 27, 27)
                        .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rb_14Co1)
                                .addComponent(rb_14Khong1))
                            .addComponent(jTextArea6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_mgv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(text_mgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_14Co2)
                        .addComponent(rb_14Khong2)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_14Co3)
                    .addComponent(rb_14Khong3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_14Co4)
                        .addComponent(rb_14Khong4)))
                .addGap(27, 27, 27)
                .addComponent(bt_khaibao)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_mgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_mgvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_mgvActionPerformed

    private void text_mgv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_mgv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_mgv1ActionPerformed

    private void text_khoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_khoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_khoaActionPerformed

    private void text_ngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ngayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ngayActionPerformed

    private void rb_14KhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14KhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14KhongActionPerformed

    private void rb_14CoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14CoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14CoActionPerformed

    private void rb_14Khong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Khong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Khong1ActionPerformed

    private void rb_14Co1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Co1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Co1ActionPerformed

    private void rb_14Co2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Co2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Co2ActionPerformed

    private void rb_14Khong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Khong2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Khong2ActionPerformed

    private void rb_14Co3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Co3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Co3ActionPerformed

    private void rb_14Khong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Khong3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Khong3ActionPerformed

    private void rb_14Co4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Co4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Co4ActionPerformed

    private void rb_14Khong4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14Khong4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14Khong4ActionPerformed

    private void bt_khaibaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_khaibaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_khaibaoActionPerformed

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
            java.util.logging.Logger.getLogger(GVKhaiBaoYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVKhaiBaoYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVKhaiBaoYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVKhaiBaoYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVKhaiBaoYTe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_khaibao;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JMenu m_gvKhaiBao;
    private javax.swing.JMenu m_gvThongBao;
    private javax.swing.JMenu m_gvThongKe;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenu m_gvTroGiup;
    private javax.swing.JMenu m_gvXinNghi;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JRadioButton rb_14Co;
    private javax.swing.JRadioButton rb_14Co1;
    private javax.swing.JRadioButton rb_14Co2;
    private javax.swing.JRadioButton rb_14Co3;
    private javax.swing.JRadioButton rb_14Co4;
    private javax.swing.JRadioButton rb_14Khong;
    private javax.swing.JRadioButton rb_14Khong1;
    private javax.swing.JRadioButton rb_14Khong2;
    private javax.swing.JRadioButton rb_14Khong3;
    private javax.swing.JRadioButton rb_14Khong4;
    private javax.swing.JTextField text_khoa;
    private javax.swing.JTextField text_mgv;
    private javax.swing.JTextField text_mgv1;
    private javax.swing.JTextField text_ngay;
    private javax.swing.JLabel tieude;
    private javax.swing.JLabel tieude_khoa;
    private javax.swing.JLabel tieude_magv;
    private javax.swing.JLabel tieude_ngay;
    private javax.swing.JLabel tieude_tengv;
    // End of variables declaration//GEN-END:variables
}
