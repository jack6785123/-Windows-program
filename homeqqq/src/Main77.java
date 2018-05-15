import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.*;
import java.awt.event.*;
public  class Main77  extends JFrame{
    private static JFrame frm=new JFrame("小算盤");
    private static JPanel pn1=new JPanel(new GridLayout(4,3));
    private static JPanel pn2=new JPanel(new GridLayout(4,1));
    private static JLabel lab=new JLabel("0",JLabel.RIGHT);
    //依序為清除、加、減、乘、除、等於
    private static Button cn,ad,sub,mul,div,amo;
    //0~9的數字
    private static Button digits[]=new Button[10];
    private static long num;//存放結果
    private static byte op;//代表運算子

    public static void main(String args[])
    {
        frm.setLayout(null);
        frm.setBounds(450,250,160,200);

         frm.setResizable(false);
        lab.setBounds(20,30,120,20);
        pn1.setBounds(20,60,90,105);
        pn2.setBounds(110,60,30,105);
        //0~9數字鈕
        for(int i=9;i>=0;i--){
            digits[i]=new Button(Integer.toString(i));
            pn1.add(digits[i]);
            digits[i].addActionListener(new ActLis());
        }
        //清除鈕
        cn=new Button("C");
        pn1.add(cn);
        cn.addActionListener(new ActLis());
        //等於鈕
        amo=new Button("=");
        pn1.add(amo);
        amo.addActionListener(new ActLis());
        //加鈕
        ad=new Button("+");
        pn2.add(ad);
        ad.addActionListener(new ActLis());
        //減鈕
        sub=new Button("-");
        pn2.add(sub);
        sub.addActionListener(new ActLis());
        //乘鈕
        mul=new Button("*");
        pn2.add(mul);
        mul.addActionListener(new ActLis());
        //除鈕
        div=new Button("/");
        pn2.add(div);
        div.addActionListener(new ActLis());

        frm.addWindowListener(new WindowAdapter(){public void
        windowClosing(WindowEvent e){System.exit(0);}});
        frm.add(lab);
        frm.add(pn1);
        frm.add(pn2);
        frm.setVisible(true);
    }

    public static class ActLis implements ActionListener
    {
        public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException{
            long result;//存放由字串轉成的數值

            Button btn=(Button) e.getSource();
            try{
                //處理數值1-9
                for(int i=0;i<=9;i++){
                    if(btn==digits[i]){
                        output_digit(digits[i]);
                        break;
                    }
                }

            }catch(NumberFormatException ne){
            }catch(ArithmeticException ae){
            }
        }
        private void output_digit(Button btn){
            lab.setText(Long.toString(Long.parseLong(lab.getText()+btn.getLabel())));
        }
        private void save_num(Button oper){
            num=Long.parseLong(lab.getText());
            lab.setText(Long.toString(0));

        }
    }
}
