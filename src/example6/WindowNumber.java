package example6;

import javax.swing.*;
import java.awt.*;

public class WindowNumber extends JFrame {
    JTextField text;
    PoliceListen listener;

    public WindowNumber() {
        init();
        setBounds(100,100,150,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        setLayout(new FlowLayout());
        text=new JTextField(10);
        listener= new PoliceListen();
        text.addActionListener(listener);
        add(text);
    }
}
