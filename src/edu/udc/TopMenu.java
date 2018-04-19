package edu.udc;

import javax.swing.*;

public class TopMenu extends JMenu {
    public TopMenu(String text) {
        super(text);
    }
    @Override
    public void setPopupMenuVisible(boolean b) {
        boolean isVisible = isPopupMenuVisible();
        if (b != isVisible) {
            if ((b==true) && isShowing()) {

                int x = 0;
                int y = -getPopupMenu().getPreferredSize().height;

                getPopupMenu().show(this, x, y);
            } else {
                getPopupMenu().setVisible(false);
            }
        }    }
}
