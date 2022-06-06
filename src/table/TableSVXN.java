/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

/**
 *
 * @author ducth
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import object.DonXinNghiSV;

public class TableSVXN extends AbstractTableModel{
 
    private String Name[] = {"Ma SV","Ten sv","Lop" ,"ly do","Chi Tiet", "Ngay bat dau", "Ngay ket thuc"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class, String.class, String.class};
    
    ArrayList<DonXinNghiSV> dsXinNghi = new ArrayList<DonXinNghiSV>();

    public TableSVXN(ArrayList<DonXinNghiSV> dsXinNghi) {
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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsXinNghi.get(rowIndex).getMaSV();
            
            case 1: return dsXinNghi.get(rowIndex).getTenSV();
            
            case 2: return dsXinNghi.get(rowIndex).getLop();
             
            case 3: return dsXinNghi.get(rowIndex).getLyDo();
            
            case 4: return dsXinNghi.get(rowIndex).getChiTiet();
            
            case 5: return dsXinNghi.get(rowIndex).getNgayBatDau();
            
            case 6: return dsXinNghi.get(rowIndex).getNgayKetThuc();
            
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
