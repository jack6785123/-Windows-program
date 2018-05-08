
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class MainFrame4 extends JFrame {
    private JLabel jlb = new JLabel("華氏溫度");
    private JTextField jtf = new JTextField("0");
    private JButton jbn = new JButton("=");
    private JLabel jlb2 = new JLabel("攝氏溫度");
    private JButton Exit = new JButton("Exit");
    public int count = 0;
    public MainFrame4(){
        ininq();
    }
    private void ininq(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);

        jlb.setLocation(50,50);
        jlb.setSize(120,30);

        jtf.setLocation(170,50);
        jtf.setSize(120,30);

        jbn.setLocation(290,50);
        jbn.setSize(120,30);

        jlb2.setLocation(410,50);
        jlb2.setSize(120,30);

        Exit.setBounds(530,200,120,30);

        this.add(jlb);
        this.add(jtf);
        this.add(jbn);
        this.add(jlb2);
        this.add(Exit);
        jtf.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int   y  = Integer.parseInt(Integer.toString(count));
            }
        });
        jbn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = jtf.getText();
                double y = Integer.parseInt(num);
              MainFrame4.this.setTitle("攝氏溫度: " +(y - 32) * 5 / 9  + "(°C)");


            }
        });
        Exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

