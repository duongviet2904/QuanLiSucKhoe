/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ducth
 */
public class ThongBao implements Serializable{
    private String stt;
    private String nguoiGui;
    private String nguoiNhan;
    private String noiDung;
    private String thoiGian;
    private Object chiTiet;

    public ThongBao() {
    }

    public ThongBao(String stt, String nguoiGui, String nguoiNhan, String noiDung, String thoiGian) {
        this.stt = stt;
        this.nguoiGui = nguoiGui;
        this.nguoiNhan = nguoiNhan;
        this.noiDung = noiDung;
        this.thoiGian = thoiGian;
    }

    

    public ThongBao(String nguoiGui, String nguoiNhan, String noiDung, String thoiGian, Object chiTiet) {
        this.nguoiGui = nguoiGui;
        this.nguoiNhan = nguoiNhan;
        this.noiDung = noiDung;
        this.thoiGian = thoiGian;
        this.chiTiet = chiTiet;
    }


    

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getNguoiGui() {
        return nguoiGui;
    }

    public void setNguoiGui(String nguoiGui) {
        this.nguoiGui = nguoiGui;
    }

    public String getNguoiNhan() {
        return nguoiNhan;
    }

    public void setNguoiNhan(String nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Object getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(Object chiTiet) {
        this.chiTiet = chiTiet;
    }

    @Override
    public String toString() {
        return "ThongBao{" + "stt=" + stt + ", nguoiGui=" + nguoiGui + ", nguoiNhan=" + nguoiNhan + ", noiDung=" + noiDung + ", thoiGian=" + thoiGian + ", chiTiet=" + chiTiet +  '}';
    }

    


    
}
