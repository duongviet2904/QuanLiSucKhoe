/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.Serializable;

/**
 *
 * @author duongv
 */
public class SinhVien implements Serializable{
    private String maSV;
    private String tenSV;
    private String gioiTinh;
    private String soDT;
    private String email;
    private String ngaySinh;
    private String anhSV;
    
    
    private String maLop;

    public SinhVien() {
    }
    
    public SinhVien(String maSV, String tenSV, String gioiTinh, String soDT, String email, String ngaySinh, String maLop) {
        
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.maLop = maLop;
        this.anhSV = "haui.png";
    }

    public String getAnhSV() {
        return anhSV;
    }

    public void setAnhSV(String anhSV) {
        this.anhSV = anhSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    
    
}
