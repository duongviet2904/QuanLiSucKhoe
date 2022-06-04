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
import object.LichSu;

public class TableLichSu extends AbstractTableModel{
 
    private String Name[] = {"STT","Người thực hiện","Nội Dung" ,"Thời Gian","Chi Tiet"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<LichSu> dsLS = new ArrayList<LichSu>();

    public TableLichSu(ArrayList<LichSu> dsLS) {
        this.dsLS = dsLS;
    }

    @Override
    public int getRowCount() {
        return dsLS.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return (rowIndex+1);
            
            case 1: return dsLS.get(rowIndex).getTaiKhoan();
            
            case 2: return dsLS.get(rowIndex).getNoiDung();
             
            case 3: return dsLS.get(rowIndex).getThoiGian();
            
            case 4: 
            {
                if(dsLS.get(rowIndex).getChiTiet() == null)
                {
                    return "Không thể xem lại";
                }
                return "Có thể xem lại";
            }
            
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
