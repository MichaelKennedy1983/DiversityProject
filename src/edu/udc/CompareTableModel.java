package edu.udc;

import edu.udc.data.Country;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CompareTableModel extends AbstractTableModel {
    private ArrayList<Country> data = new ArrayList<>();
    private final String[] COLNAMES = {"Name", "Pop", "Ethnic", "Linguistic", "Religious"};

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLNAMES[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Double.class;
            case 2:
                return Double.class;
            case 3:
                return Double.class;
            case 4:
                return Double.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return data.get(rowIndex).getName();
            case 1:
                return data.get(rowIndex).getPopMil();
            case 2:
                return data.get(rowIndex).getEthnicFract();
            case 3:
                return data.get(rowIndex).getLinguisticFract();
            case 4:
                return data.get(rowIndex).getReligiousFract();
            default:
                return "Bad data";
        }
    }

    public ArrayList<Country> getData() {
        return data;
    }

    public void setData(ArrayList<Country> data) {
        this.data = data;
    }
}
