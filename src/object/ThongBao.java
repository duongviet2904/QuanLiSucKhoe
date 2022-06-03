/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author ducth
 */
public class ThongBao {
    private String stt;
    private String taiKhoan;
    private String noiDung;
    private String thơiGian;
    private String nguoiGui;
    private String maDon;

    public ThongBao() {
    }

    public ThongBao(String stt, String taiKhoan, String noiDung, String thơiGian, String nguoiGui, String maDon) {
        this.stt = stt;
        this.taiKhoan = taiKhoan;
        this.noiDung = noiDung;
        this.thơiGian = thơiGian;
        this.nguoiGui = nguoiGui;
        this.maDon = maDon;
    }

    public ThongBao(String stt, String taiKhoan, String noiDung, String thơiGian, String nguoiGui) {
        this.stt = stt;
        this.taiKhoan = taiKhoan;
        this.noiDung = noiDung;
        this.thơiGian = thơiGian;
        this.nguoiGui = nguoiGui;
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

    public String getThơiGian() {
        return thơiGian;
    }

    public void setThơiGian(String thơiGian) {
        this.thơiGian = thơiGian;
    }

    public String getNguoiGui() {
        return nguoiGui;
    }

    public void setNguoiGui(String nguoiGui) {
        this.nguoiGui = nguoiGui;
    }

    public String getMaDon() {
        return maDon;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }
    
}
