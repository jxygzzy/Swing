package example4;

import javax.swing.*;
import java.awt.*;

public class WinGird extends JFrame {
    GridLayout grid;
    JPanel chessBoard;
    public WinGird(){
        chessBoard = new JPanel();
        grid = new GridLayout(12,12);
        Label[][] label = new Label[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                label[i][j]=new Label();
                if((i+j)%2==0){
                    label[i][j].setBackground(Color.black);
                }else {
                    label[i][j].setBackground(Color.white);
                }
                chessBoard.add(label[i][j]);
            }
        }
        add(chessBoard,BorderLayout.CENTER);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("East"),BorderLayout.EAST);
        setBounds(10,10,570,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
}
