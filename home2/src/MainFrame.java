import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JButton jbm = new JButton("大");
    private JButton jbn1 = new JButton("小");
    private JButton Exit = new JButton("Exit");
    private JLabel jbl = new JLabel("s");
    public int x = 12;

public MainFrame(){
    init();
}
    private void init() {
  this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  this.setLayout(null);
  this.setBounds(100,100,800,600);
  jbm.setLocation(50,50);
  jbm.setSize(120,50);

        jbn1.setLocation(170,50);
        jbn1.setSize(120,50);

        Exit.setLocation(290,50);
        Exit.setSize(100,50);

        jbl.setLocation(150,100);
        jbl.setSize(100,50);

        this.add(jbm);
        this.add(jbn1);
        this.add(Exit);
        this.add(jbl);
        jbm.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbl.setFont(new Font(null,Font.BOLD,x));
                x++;
            }
        });
        jbn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbl.setFont(new Font(null,Font.BOLD,x));
                x--;

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

