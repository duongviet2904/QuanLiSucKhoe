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
public class DonXinNghiGV implements Serializable{
    private String maDon;
    private String maGV;
    private String tenGV;
    private String khoa;
    private String ngayGui;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String lyDo;
    private String chiTiet;
    private String taiLieuLienQuan;
    private String trangThai;

    

    public DonXinNghiGV() {
    }

    @Override
    public String toString() {
        return "DonXinNghiGV{" + "maDon=" + maDon + ", maGV=" + maGV + ", tenGV=" + tenGV + ", khoa=" + khoa + ", ngayGui=" + ngayGui + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", lyDo=" + lyDo + ", chiTiet=" + chiTiet + ", taiLieuLienQuan=" + taiLieuLienQuan + ", trangThai=" + trangThai + '}';
    }

    public DonXinNghiGV(String maDon, String maGV, String tenGV, String khoa, String ngayGui, String ngayBatDau, String ngayKetThuc, String lyDo, String chiTiet, String taiLieuLienQuan) {
        this.maDon = maDon;
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.khoa = khoa;
        this.ngayGui = ngayGui;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
        this.taiLieuLienQuan = taiLieuLienQuan;
        this.trangThai = "Chờ";
    }

    

    public String getMaDon() {
        return maDon;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    

    
}
