import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.*;
import java.awt.event.*;
public  class MainFrame7  extends JFrame {
    private  JFrame frm = new JFrame("小算盤");
    private  JPanel pn1 = new JPanel(new GridLayout(4, 3));
    private  JPanel pn2 = new JPanel(new GridLayout(4, 1));
    private  JLabel jlb = new JLabel("0", JLabel.RIGHT);
    //依序為清除、加、減、乘、除、等於
    private  Button cn, ad, sub, mul, div, amo,sqrt,pi;
    //0~9的數字
    private  Button digits[] = new Button[10];
//    private static long num;//存放結果
//    private static byte op;//代表運算子

    public  void main(String args[]) {
        frm.setLayout(null);
        frm.setBounds(450, 250, 160, 200);
        jlb.setBounds(20, 30, 120, 20);
        pn1.setBounds(20, 60, 90, 105);
        pn2.setBounds(110, 60, 30, 105);
        //0~9數字鈕
        for (int i = 9; i >= 0; i--) {
            digits[i] = new Button(Integer.toString(i));
            pn1.add(digits[i]);
            digits[i].addActionListener(new ActionListener() {
                @Override
                public  void actionPerformed(ActionEvent e) {
                    JButton tmpbtn = (JButton)e.getSource();
                    switch (tmpbtn.getText()){
                        case "cn":
                            jlb.setText("0");

                            break;
                        case "pi":
                    //        jlb.setText(Math.toString(Math.PI));
                            break;
                    }


                            }


        });
//        清除鈕
        cn = new Button("C");
        pn1.add(cn);
        cn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
 //       等於鈕
        amo = new Button("=");
        pn1.add(amo);
        amo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
  //      加鈕
        ad = new Button("+");
        pn2.add(ad);
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
  //      減鈕
        sub = new Button("-");
        pn2.add(sub);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
//        乘鈕
        mul = new Button("*");
        pn2.add(mul);
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
  //      除鈕
        div = new Button("/");
        pn2.add(div);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frm.addWindowListener(new WindowAdapter() {
            public void
            windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frm.add(jlb);
        frm.add(pn1);
        frm.add(pn2);
        frm.setVisible(true);
    }

//    private void output_digit(Button btn) {
//        lab.setText(Long.toString(Long.parseLong(lab.getText() + btn.getLabel())));
//    }
//
//    private void save_num(Button oper) {
//        num = Long.parseLong(lab.getText());
//        lab.setText(Long.toString(0));
//
//    }
    }
}





