package edu.udc;

import edu.udc.data.Country;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountriesTableModel extends AbstractTableModel {
    private ArrayList<Country> data;
    private final String[] COLNAMES = {"#", "Flag", "Name"};
    
    public CountriesTableModel(ArrayList<Country> data) {
        this.data = data;
    }
    
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
                return Integer.class;
            case 1:
                return ImageIcon.class;
            default:
                return String.class;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                ImageIcon flag = null;
                try {
                    flag = new ImageIcon(ImageIO.read(ClassLoader.getSystemResource(data.get(rowIndex).getFlagURL())));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return flag;
            case 2:
                return data.get(rowIndex).getName();
            default:
                return "Bad data";
        }
    }
    
    // Accessors
    public List<Country> getData() { return data; }
    public void setData(ArrayList<Country> data) { this.data = data; }
}