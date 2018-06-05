import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe530 extends JFrame {
    private JButton enter = new JButton("ENTER");
    private JButton exit = new JButton("exit");
    private JButton enc = new JButton("enc");
    private JTextField jtx = new JTextField("");
    private JTextField jtx1 = new JTextField("");
    private  JTextArea jar = new JTextArea("");
    private JPanel jpnc = new JPanel();
    private JPanel jpnc1 = new JPanel();
    private Container cp = new Container();

    public mainframe530() {
        init1();
    }
    private void init1() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
      this.setBounds(0,0,800,600);

        jpnc.add(jtx, BorderLayout.WEST);
        cp.add(jtx1, BorderLayout.EAST);

        enter.setLocation(50,50);//方位
        enter.setSize(120,30);//大小

        jtx.setLocation(170,50);
        jtx.setSize(120,30);

        enc.setLocation(290,50);
        enc.setSize(120,30);

        exit.setLocation(430,50);
        exit.setSize(120,30);

        jpnc.setPreferredSize(getSize(new Dimension(300,600)));
        jpnc1.setPreferredSize(getSize(new Dimension(300,600)));


        this.add(enter);
        this.add(exit);
        this.add(enc);
        this.add(jtx);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        enc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });





        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });




    }
}
