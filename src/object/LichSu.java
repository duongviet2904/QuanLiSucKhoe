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
public class LichSu implements Serializable{
    private String stt;
    private String taiKhoan;
    private String noiDung;
    private String thoiGian;
    private Object chiTiet;

    public Object getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(Object chiTiet) {
        this.chiTiet = chiTiet;
    }
    
    public LichSu(){
    
    }

    @Override
    public String toString() {
        return "LichSu{" + "stt=" + stt + ", taiKhoan=" + taiKhoan + ", noiDung=" + noiDung + ", thoiGian=" + thoiGian + '}';
    }

    public LichSu(String stt, String taiKhoan, String noiDung, String thơiGian) {
        this.stt = stt;
        this.taiKhoan = taiKhoan;
        this.noiDung = noiDung;
        this.thoiGian = thơiGian;
    }

    
    
    public LichSu(String taiKhoan ,String noiDung, String thơiGian, Object obj) {
        this.taiKhoan = taiKhoan;
        this.noiDung = noiDung;
        this.thoiGian = thơiGian;
        this.chiTiet = obj;
    }
    
    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
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
}
