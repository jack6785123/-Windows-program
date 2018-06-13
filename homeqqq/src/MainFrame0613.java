

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame0613 extends JFrame {
    private JButton jbnrun = new JButton("<--");
    private JButton jbnreset = new JButton("-->");
    private JButton exit = new JButton("Exit");
    private JButton jbtns[][] = new JButton[5][5];
    private Container cp;
    private JPanel jpnc = new JPanel(new GridLayout(5, 5, 1, 1));
    private JPanel jpnc2 = new JPanel(new GridLayout(1, 3, 1, 1));
    private boolean flag = true;
    private Timer t1;
    private int dir=0;
    private int a=0;
    private int b=0;

    //   private Random rand = new Random();

    public MainFrame0613() {
        inint();
    }

    private void inint() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);//設置布局為空
        this.setBounds(100, 100, 700, 500);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        cp.add(jpnc, BorderLayout.CENTER);
        cp.add(jpnc2, BorderLayout.NORTH);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                jbtns[i][j] = new JButton();
                jbtns[i][j].setBackground(new Color(255, 148, 54));
                jbtns[i][j].setFont(new Font(null, Font.BOLD, 100));
                jbtns[i][j].setEnabled(false);
                t1 = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        switch (dir){
                            case 0:
                                a++;
                                break;
                        }


                    }
                });
                jpnc.add(jbtns[i][j]);
            }
        }


        jpnc2.add(jbnrun);
        jpnc2.add(jbnreset);
        jpnc2.add(exit);

        jbnrun.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        jbtns[i][j].setEnabled(true);

                    }
                }
            }
        });
        jbnreset.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        jbtns[i][j].setText("");
                        jbtns[i][j].setEnabled(false);
                        jbtns[i][j].setBackground(new Color(255, 148, 54));

                    }
                }
            }
        });
        exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
