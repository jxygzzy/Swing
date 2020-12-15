package example6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliceListen implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int n=0;
        int m=0;
        String str= e.getActionCommand();
        try{
            n=Integer.parseInt(str);
            m=n*n;
            System.out.println(n+"的平方是："+m);
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
