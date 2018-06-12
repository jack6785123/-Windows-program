import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.text.NumberFormat;

public class MainFrame11 extends JFrame {
    private Container cp;
    private JLabel jlb = new JLabel();
    private JLabel jlb1 = new JLabel();
    private JLabel jlb2 = new JLabel();
    private JTextField jtf = new JTextField();
    private JButton jbtnrun = new JButton("RUN");
    private JButton jbtEXIT = new JButton("EXIT");

    public MainFrame11() {
        iinit();
    }

    public void iinit() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 800, 700);
        cp = this.getContentPane();
        cp.setLayout(null);
        jlb.setBounds(350, 580, 120, 60);
        cp.setLayout(new GridLayout(2, 3, 1, 1));
        cp.add(jtf);
        cp.add(jbtnrun);
        cp.add(jlb);
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jbtEXIT);
        jbtEXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtnrun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          //      int data[] = new int[5];
                try {
                    double v1 = Float.parseFloat((jtf.getText()));
                    double v2 = v1*0.6214;
                    jlb.setText(Double.toString(v2));
          //          for (int i = 0; i <5; i++) {
            //            data[i]  = (int)Math.round(Math.random()*100);
           //         }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame11.this,"ERROR");
                }catch (IndexOutOfBoundsException e2){
                    JOptionPane.showMessageDialog(MainFrame11.this,"xxx");
                }catch (Exception e3){
                    JOptionPane.showMessageDialog(MainFrame11.this,"030");
                }

            }
        });

    }

}