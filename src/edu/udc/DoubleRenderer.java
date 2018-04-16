package edu.udc;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DoubleRenderer extends DefaultTableCellRenderer {
    private NumberFormat format = DecimalFormat.getInstance();

    public DoubleRenderer() {
        super();
        ((DecimalFormat)format).applyPattern("#,##0.000");
        setHorizontalAlignment(SwingConstants.RIGHT);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        setText(format.format(value));

        return this;
    }
}
