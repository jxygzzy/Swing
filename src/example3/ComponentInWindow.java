package example3;

import javax.swing.*;
import java.awt.*;

public class ComponentInWindow extends JFrame {
    JTextField text;
    JButton button;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JRadioButton radio1;
    JRadioButton radio2;
    ButtonGroup group;
    JComboBox<String> comboBox;
    JTextArea area;

    public ComponentInWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        setLayout(new FlowLayout());
        JLabel textField = new JLabel("textField:");
        add(textField);
        text = new JTextField(10);
        add(text);
        checkBox1 = new JCheckBox("music");
        checkBox2 = new JCheckBox("travel");
        checkBox3 = new JCheckBox("basketball");
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        group = new ButtonGroup();
        radio1 = new JRadioButton("boy");
        radio2 = new JRadioButton("girl");
        group.add(radio1);
        group.add(radio2);
        add(radio1);
        add(radio2);
        comboBox=new JComboBox<String>();
        comboBox.addItem("music");
        comboBox.addItem("KongFu");
        comboBox.addItem("chess");
        add(comboBox);
        area= new JTextArea(6,12);
        add(new JScrollPane(area));

    }
}
