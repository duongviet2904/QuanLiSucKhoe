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
public class DonXinNghiSV implements Serializable{
    private String maDon;
    private String maSV;
    private String tenSV;
    private String lop;
    private String khoa;
    private String ngayGui;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String lyDo;
    private String chiTiet;
    private String taiLieuLienQuan;
    private boolean hocOnl;
    private boolean trangThai;

    public DonXinNghiSV() {
    }

    public DonXinNghiSV(String maDon, String maSV, String tenSV, String lop, String khoa, String ngayGui, String ngayBatDau, String ngayKetThuc, String lyDo, String chiTiet, String taiLieuLienQuan, boolean hocOnl,boolean trangThai) {
        this.maDon = maDon;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.khoa = khoa;
        this.ngayGui = ngayGui;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
        this.taiLieuLienQuan = taiLieuLienQuan;
        this.trangThai = trangThai;
        this.hocOnl = hocOnl;
    }

    public boolean isHocOnl() {
        return hocOnl;
    }

    public void setHocOnl(boolean hocOnl) {
        this.hocOnl = hocOnl;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }
    
    

    public String getMaDon() {
        return maDon;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    
    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public String getTaiLieuLienQuan() {
        return taiLieuLienQuan;
    }

    public void setTaiLieuLienQuan(String taiLieuLienQuan) {
        this.taiLieuLienQuan = taiLieuLienQuan;
    }

    @Override
    public String toString() {
        return "DonXinNghiSV{" + "maDon=" + maDon + ", maSV=" + maSV + ", tenSV=" + tenSV + ", lop=" + lop + ", khoa=" + khoa + ", ngayGui=" + ngayGui + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", lyDo=" + lyDo + ", chiTiet=" + chiTiet + ", taiLieuLienQuan=" + taiLieuLienQuan + ", hocOnl=" + hocOnl + ", trangThai=" + trangThai + '}';
    }

    
    
    
}
