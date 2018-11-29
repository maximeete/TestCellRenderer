/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcellrenderer;

import javax.swing.*;

/**
 *
 * @author 91152
 */
public class TestCellRenderer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestCellRenderer tc = new TestCellRenderer();
        tc.init();
    }

    private void init() {
        JFrame jf = new JFrame("测试CellRenderer");
        JList jlist = new JList();
        DefaultListModel dlm = new DefaultListModel();
        
        //添加一些list项
        for(int a = 0; a<10; a++){
            String list = "list" + a;
            dlm.addElement(list);
        }
        jlist.setModel(dlm);
        jlist.setCellRenderer(new BenCellRenderer());
        jf.add(new JScrollPane(jlist));
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    
}
