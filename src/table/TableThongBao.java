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
import object.ThongBao;

public class TableThongBao extends AbstractTableModel{
 
    private String Name[] = {"STT","Người Gửi","Nội Dung" ,"Thời Gian"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class};
    
    ArrayList<ThongBao> dsLS = new ArrayList<ThongBao>();

    public TableThongBao(ArrayList<ThongBao> dsLS) {
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
            
            case 1: return dsLS.get(rowIndex).getNguoiGui();
            
            case 2: return dsLS.get(rowIndex).getNoiDung();
             
            case 3: return dsLS.get(rowIndex).getThoiGian();
            
            
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
