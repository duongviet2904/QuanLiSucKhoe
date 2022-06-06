/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

/**
 *
 * @author ducth
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import object.DocGhi;
import object.DonXinNghiGV;
import object.GiaoVien;
import object.LopHoc;

public class TableGVXN extends AbstractTableModel{
 
    private String Name[] = {"Ma gv","Ten gv","Lop phu trach", "khoa" ,"ly do","Chi Tiet", "Ngay bat dau", "Ngay ket thuc"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class, String.class, String.class};
    
    ArrayList<DonXinNghiGV> dsXinNghi = new ArrayList<DonXinNghiGV>();

    public TableGVXN(ArrayList<DonXinNghiGV> dsXinNghi) {
        this.dsXinNghi = dsXinNghi;
    }

    @Override
    public int getRowCount() {
        return dsXinNghi.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }
    
    public String getLopPhuTrach(String maGV){
        try {
            DocGhi rw = new DocGhi();
            
            ArrayList<GiaoVien> lst1 = (ArrayList<GiaoVien>) rw.ReadObject("./src/data/GiaoVien.txt");
            ArrayList<LopHoc> lst2 = (ArrayList<LopHoc>) rw.ReadObject("./src/data/Lop.txt");
            for(GiaoVien t : lst1){
                if(maGV.equals(t.getMaGV())){
                    for(LopHoc v : lst2){
                        if(v.getMaGV().equals(t.getMaGV())){
                            return v.getTenLop();
                        }
                    }
                }
            }
            return "";
        } catch (IOException ex) {
            Logger.getLogger(TableGVXN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TableGVXN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsXinNghi.get(rowIndex).getMaGV();
            
            case 1: return dsXinNghi.get(rowIndex).getTenGV();
            
            case 2: return getLopPhuTrach(dsXinNghi.get(rowIndex).getMaGV());
            case 3: return dsXinNghi.get(rowIndex).getKhoa();
             
            case 4: return dsXinNghi.get(rowIndex).getLyDo();
            
            case 5: return dsXinNghi.get(rowIndex).getChiTiet();
           
            case 6: return dsXinNghi.get(rowIndex).getNgayBatDau();
            
            case 7: return dsXinNghi.get(rowIndex).getNgayKetThuc();
            
            default : return null;
        }
    }
    
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    public String getColumnName(int column){
        return Name[column];
    }
    

}
