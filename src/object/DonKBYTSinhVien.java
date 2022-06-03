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
public class DonKBYTSinhVien implements Serializable{
    private String maSV;
    private String tenSV;
    private String lop;
    private String khoa;
    private String ngayKhaiBao;
    
    private boolean coTrieuChung;
    private boolean tiepXucNguoiBenh;
    private boolean tiepXucNguoiTuNuocCoBenh;
    private boolean tiepXucNguoiBenhCoBieuHien;
    private boolean tiepXucNguoiBenhDauMua;

    public DonKBYTSinhVien() {
    }
    
    public DonKBYTSinhVien(String maSV, String tenSV, String lop, String khoa, String ngayKhaiBao, boolean coTrieuChung, boolean tiepXucNguoiBenh, boolean tiepXucNguoiTuNuocCoBenh, boolean tiepXucNguoiBenhCoBieuHien, boolean tiepXucNguoiBenhDauMua) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.khoa = khoa;
        this.ngayKhaiBao = ngayKhaiBao;
        this.coTrieuChung = coTrieuChung;
        this.tiepXucNguoiBenh = tiepXucNguoiBenh;
        this.tiepXucNguoiTuNuocCoBenh = tiepXucNguoiTuNuocCoBenh;
        this.tiepXucNguoiBenhCoBieuHien = tiepXucNguoiBenhCoBieuHien;
        this.tiepXucNguoiBenhDauMua = tiepXucNguoiBenhDauMua;
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

    public String getNgayKhaiBao() {
        return ngayKhaiBao;
    }

    public void setNgayKhaiBao(String ngayKhaiBao) {
        this.ngayKhaiBao = ngayKhaiBao;
    }

    public boolean isCoTrieuChung() {
        return coTrieuChung;
    }

    public void setCoTrieuChung(boolean coTrieuChung) {
        this.coTrieuChung = coTrieuChung;
    }

    public boolean isTiepXucNguoiBenh() {
        return tiepXucNguoiBenh;
    }

    public void setTiepXucNguoiBenh(boolean tiepXucNguoiBenh) {
        this.tiepXucNguoiBenh = tiepXucNguoiBenh;
    }

    public boolean isTiepXucNguoiTuNuocCoBenh() {
        return tiepXucNguoiTuNuocCoBenh;
    }

    public void setTiepXucNguoiTuNuocCoBenh(boolean tiepXucNguoiTuNuocCoBenh) {
        this.tiepXucNguoiTuNuocCoBenh = tiepXucNguoiTuNuocCoBenh;
    }

    public boolean isTiepXucNguoiBenhCoBieuHien() {
        return tiepXucNguoiBenhCoBieuHien;
    }

    public void setTiepXucNguoiBenhCoBieuHien(boolean tiepXucNguoiBenhCoBieuHien) {
        this.tiepXucNguoiBenhCoBieuHien = tiepXucNguoiBenhCoBieuHien;
    }

    public boolean isTiepXucNguoiBenhDauMua() {
        return tiepXucNguoiBenhDauMua;
    }

    public void setTiepXucNguoiBenhDauMua(boolean tiepXucNguoiBenhDauMua) {
        this.tiepXucNguoiBenhDauMua = tiepXucNguoiBenhDauMua;
    }

    @Override
    public String toString() {
        return "DonKBYTSinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", lop=" + lop + ", khoa=" + khoa + ", ngayKhaiBao=" + ngayKhaiBao + ", coTrieuChung=" + coTrieuChung + ", tiepXucNguoiBenh=" + tiepXucNguoiBenh + ", tiepXucNguoiTuNuocCoBenh=" + tiepXucNguoiTuNuocCoBenh + ", tiepXucNguoiBenhCoBieuHien=" + tiepXucNguoiBenhCoBieuHien + ", tiepXucNguoiBenhDauMua=" + tiepXucNguoiBenhDauMua + '}';
    }
    
    
}
