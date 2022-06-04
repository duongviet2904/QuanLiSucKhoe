/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import object.DonKBYTSinhVien;

/**
 *
 * @author duongv
 */
public class TableSV extends AbstractTableModel{
    private String Name[] = {"Ma SV","Ten sv","Lop" ,"Khoa","Ngay gui"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<DonKBYTSinhVien> dsKBYT = new ArrayList<DonKBYTSinhVien>();

    public TableSV(ArrayList<DonKBYTSinhVien> dsKBYT) {
        this.dsKBYT = dsKBYT;
    }

    @Override
    public int getRowCount() {
        return dsKBYT.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsKBYT.get(rowIndex).getMaSV();
            
            case 1: return dsKBYT.get(rowIndex).getTenSV();
            
            case 2: return dsKBYT.get(rowIndex).getLop();
             
            case 3: return dsKBYT.get(rowIndex).getKhoa();
            
            case 4: return dsKBYT.get(rowIndex).getNgayKhaiBao();
            
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
