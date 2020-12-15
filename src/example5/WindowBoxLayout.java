package example5;

import javax.swing.*;
import java.awt.*;

public class WindowBoxLayout extends JFrame {
    Box baseBox;
    Box boxV1;
    Box boxV2;

    public WindowBoxLayout() {
        setLayout(new java.awt.FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        boxV1 = Box.createVerticalBox();
        boxV1.add(new JLabel("name"));
        boxV1.add(Box.createVerticalStrut(8));
        boxV1.add(new JLabel("email"));
        boxV1.add(Box.createVerticalStrut(8));
        boxV1.add(new JLabel("job"));
        boxV2 = Box.createVerticalBox();
        boxV2.add(new JTextField(10));
        boxV2.add(Box.createVerticalStrut(8));
        boxV2.add(new JTextField(10));
        boxV2.add(Box.createVerticalStrut(8));
        boxV2.add(new JTextField(10));
        boxV2.add(Box.createVerticalStrut(8));
        baseBox = Box.createHorizontalBox();
        baseBox.add(boxV1);
        baseBox.add(Box.createHorizontalStrut(10));
        baseBox.add(boxV2);
        add(baseBox);

    }
}
