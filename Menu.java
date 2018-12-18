package ru.mirea.prac.klenina.prac4;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuDragMouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.lang.String;
import java.awt.*;

public class Menu extends JFrame{

    private static final Object MenuDragMouseListener = new Object();
    JMenuBar menuBar = new JMenuBar();

    JMenu menu = new JMenu("First Menu");
    JMenu menu2 = new JMenu("Second Menu");

    JMenuItem mi1 = new JMenuItem("Function 1");
    JMenuItem mi2 = new JMenuItem("Function 2");

    ButtonModel btnmod = new ButtonModel() {
        @Override
        public boolean isArmed() {
            return false;
        }

        @Override
        public boolean isSelected() {
            return false;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        @Override
        public boolean isPressed() {
            JOptionPane.showMessageDialog(null, "Hellow");
            return true;
        }

        @Override
        public boolean isRollover() {
            return false;
        }

        @Override
        public void setArmed(boolean b) {

        }

        @Override
        public void setSelected(boolean b) {

        }

        @Override
        public void setEnabled(boolean b) {

        }

        @Override
        public void setPressed(boolean b) {

        }

        @Override
        public void setRollover(boolean b) {

        }

        @Override
        public void setMnemonic(int key) {

        }

        @Override
        public int getMnemonic() {
            return 0;
        }

        @Override
        public void setActionCommand(String s) {

        }

        @Override
        public String getActionCommand() {
            return null;
        }

        @Override
        public void setGroup(ButtonGroup group) {

        }

        @Override
        public void addActionListener(ActionListener l) {

        }

        @Override
        public void removeActionListener(ActionListener l) {

        }

        @Override
        public void addItemListener(ItemListener l) {

        }

        @Override
        public void removeItemListener(ItemListener l) {

        }

        @Override
        public void addChangeListener(ChangeListener l) {

        }

        @Override
        public void removeChangeListener(ChangeListener l) {

        }

        @Override
        public Object[] getSelectedObjects() {
            return new Object[0];
        }
    };

public Menu(String title) throws HeadlessException {
        super("Menu");
        setSize(500,300);

        setJMenuBar(menuBar);
        menuBar.add(menu);
        menuBar.add(menu2);
        menu2.add(mi1);
        menu2.add(mi2);
        menu.add(mi1);
        menu.add(mi2);

        mi1.setModel(btnmod);
        mi2.setModel(btnmod);

        mi1.setEnabled(true);
        mi2.setEnabled(true);

  /*  mi1.addMenuDragMouseListener(mouseListener() {

    }
    );
    */

        setVisible(true);
    }

    @Override
    public void setJMenuBar(JMenuBar menubar) {
        super.setJMenuBar(menubar);
        JButton btn = new JButton("JMenuBar");
    }
}
