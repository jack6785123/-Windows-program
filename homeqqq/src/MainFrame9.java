import org.omg.CORBA.ACTIVITY_COMPLETED;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame9 extends JFrame {
    private Container cp;
    private JLabel jlb = new JLabel();
    private JPanel jpl1 = new JPanel();
    private JPanel jpl2 = new JPanel(new GridLayout(1, 6, 3, 3));
    private ImageIcon icon = new ImageIcon("11.png");
    private Timer t1,tim2;
    private JButton run = new JButton("run");
    private JButton high = new JButton("上");
    private JButton down = new JButton("下");
    private JButton left = new JButton("左");
    private JButton ght = new JButton("右");
    private JButton Exit = new JButton("exit");
    private int dirFlg = 1, objx = 0, objy = 0, objw = 285, objh = 285;
    private boolean jlbflag = false;
    private int tarX,tarY;
    private float m = 0.0f ;
    int newjlbX , newjlbY;

    public MainFrame9() {
        inint();
    }

    private void inint() {
        this.setBounds(0, 0, 800, 600);
        cp = this.getContentPane();
        cp.setLocation(3,3);

        jlb.setIcon(icon);

        jpl1.add(jpl2);


        jpl2.add(run);
        jpl2.add(high);
        jpl2.add(left);
        jpl2.add(down);
        jpl2.add(ght);
        jpl2.add(Exit);
        jpl1.add(jlb);




        cp.add(jpl1, BorderLayout.CENTER);
        cp.add(jpl2, BorderLayout.SOUTH);



        jlb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jlbflag = true;
            }
        });
        tim2 = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Math.abs(jlb.getX() - tarX)< 30 && Math.abs(jlb.getY()-tarY)<30){
                    tim2.stop();
                }else {
                    if(jlb.getX() - tarX <0){
                        newjlbX = jlb.getX()+1;
                    }else {
                        newjlbX = jlb.getY()-1;
                    }
                    newjlbY = Math.round(m * (float)(newjlbX - tarX)+ tarY);
                    jlb.setLocation(newjlbX,newjlbY);
                }
            }


        });
        jlb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if(jlbflag){
                    tarX = mouseEvent.getX();
                    tarY = mouseEvent.getY();
                    m = (float)(tarY - jlb.getY())/(float)(tarX -jlb.getX());
                    tim2.start();
                    jlbflag = false;
                }
            }
        });
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        high.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlg = 1;
            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlg =2;
            }
        });
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlg = 3;
            }
        });
        ght.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlg=4;
            }
        });
        t1= new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (dirFlg){
                    case 1 :
                        if(objy-2>0){
                            objy-=2;

                        }
                        break;
                    case 2:
                        if(objy+20<800-objh){
                            objy+=20;

                        }
                        break;
                    case 3:
                        if(objx-20>-50){
                            objx-=20;

                        }
                        break;
                    case 4:
                        if(objx+20<800-objw){
                            objx+=20;

                        }
                        break;
                }
                jlb.setLocation(objx,objy);
            }
        });


    }
}
