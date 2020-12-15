package example2;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowMenu extends JFrame {
    JMenuBar menuBar;
    JMenu menu;
    JMenu subMenu;
    JMenuItem item1;
    JMenuItem item2;

    public WindowMenu() {
    }

    public WindowMenu(String title, int x, int y, int w, int h) {
        init(title);
        setLocation(x, y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void init(String title) {
        setTitle(title);
        menuBar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("子菜单");
        item1= new JMenuItem("No1");
        item2 = new JMenuItem("No2");
        item1.setIcon(new ImageIcon("icon.ico"));
        item2.setIcon(new ImageIcon("icon.ico"));
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("MenuInSubMenu",new ImageIcon("icon.ico")));
        menuBar.add(menu);
        setJMenuBar(menuBar);

    }

}
