import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JButton jbtnAdd = new JButton("<---");
    private JButton  LessAdd = new JButton("--->");
    private JButton ExitAdd = new JButton("Exit");
    private JLabel jlbAdd = new JLabel(">_<");
    public int count = 0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//可讀性高
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbtnAdd.setLocation(50,50);//方位
        jbtnAdd.setSize(120,30);//大小

        LessAdd.setLocation(170,50);
        LessAdd.setSize(120,30);

        ExitAdd.setLocation(290,50);
        ExitAdd.setSize(120,30);

        jlbAdd.setBounds(count,200,120,30);
        this.add(jlbAdd);




        this.add(ExitAdd);
        this.add(jbtnAdd);
        this.add(LessAdd);
        jbtnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count+=10;
                jlbAdd.setLocation(count,120);


            }
        });
        LessAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count-=10;
                jlbAdd.setLocation(count,120);

            }
        });
        ExitAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
