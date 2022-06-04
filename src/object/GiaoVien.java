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
public class GiaoVien implements Serializable{
    private String maGV;
    private String tenGV;
    private String anhGV;
    private String maKhoa;
    
    public GiaoVien(String maGV, String tenGV, String maKhoa) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.maKhoa = maKhoa;
        this.anhGV = "haui.png";
    }

    public String getAnhGV() {
        return anhGV;
    }

    public void setAnhGV(String anhGV) {
        this.anhGV = anhGV;
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

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }
    
}
