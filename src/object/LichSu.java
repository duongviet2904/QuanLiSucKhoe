/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author ducth
 */
public class LichSu {
    private String stt;
    private String taiKhoan;
    private String noiDung;
    private String thơiGian;
    public LichSu(){
    
    }

    public LichSu(String stt, String noiDung, String thơiGian) {
        this.stt = stt;
        this.noiDung = noiDung;
        this.thơiGian = thơiGian;
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
}
