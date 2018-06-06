import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public  class MainFrame606 extends JFrame {
    private JPanel pn1 = new JPanel(new GridLayout(4, 3));
    private JPanel pn2 = new JPanel(new GridLayout(3, 3));
    private JLabel jlb = new JLabel(" ");
    private JButton jbt[][] = new JButton[4][3];
    private JButton Exit = new JButton("EXIT");
    private Container cp;
    private int op = -1;
    private double v1;
    private double v2;

    public  MainFrame606() {
         inintt();
    }

    public void inintt() {
        this.setBounds(100, 100, 450, 570);
        cp = this.getContentPane();
        cp.add(pn1, BorderLayout.NORTH);
        cp.add(pn2, BorderLayout.CENTER);

        jlb.setFont(new Font(null, Font.BOLD, 36));
        jbt[0][0] = new JButton("7");
        jbt[0][1] = new JButton("8");
        jbt[0][2] = new JButton("9");
        jbt[1][0] = new JButton("4");
        jbt[1][1] = new JButton("5");
        jbt[1][2] = new JButton("6");
        jbt[2][0] = new JButton("1");
        jbt[2][1] = new JButton("2");
        jbt[2][2] = new JButton("3");
        jbt[3][0] = new JButton("AC");
        jbt[3][1] = new JButton("0");
        jbt[3][2] = new JButton("Exit");
        pn1.add(jlb);

        }






            }


