/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcellrenderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

/**
 *
 * @author 91152
 */
//使用JLabel来做CellRenderer
public class BenCellRenderer extends JLabel implements ListCellRenderer{
    public BenCellRenderer() {
        super();
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String aa = (String)value;
        setText(aa);
        setHorizontalAlignment(SwingConstants.CENTER);
        
        //下面的代码一直到return this之前的作用就是让你的移动和点击会产生反馈，是从
        //官方API里抄出来的
        Color background;
        Color foreground;
  
        // check if this cell represents the current DnD drop location，这个是涉及到拖动的时候？
        JList.DropLocation dropLocation = list.getDropLocation();
        if (dropLocation != null
                && !dropLocation.isInsert()
                && dropLocation.getIndex() == index) {

            background = Color.BLUE;
            foreground = Color.WHITE;

        // check if this cell is selected，设置选中的时候
        } else if (isSelected) {
            background = Color.RED;
            foreground = Color.WHITE;

        // unselected, and not the DnD drop location，设置未选中的时候
        } else {
            background = Color.WHITE;
            foreground = Color.BLACK;
        };

        setOpaque(true);//这一句是必须要有的，否则，背景色是透明的
        setBackground(background);
        setForeground(foreground);
        return this;
    }
    
}
