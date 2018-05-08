import javax.swing. *;
import java.awt.event.ActionEvent;

public class MainFrame2 extends JFrame {
    private JButton jbtAdd = new JButton("Add");
    private  JButton jbt2Add = new JButton("sub");
    private  JButton ExitAdd = new JButton("Exit");
    public int count = 0;

    public MainFrame2(){
        inin();
    }

    private void inin(){
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setLocation(100,50);
    this.setSize(800,600);

    jbtAdd.setLocation(50,50);
    jbtAdd.setSize(120,40);

    jbt2Add.setLocation(180,50);
    jbt2Add.setSize(120,40);

    ExitAdd.setLocation(320,50);
    ExitAdd.setSize(120,40);

    this.add(jbtAdd);
    this.add(jbt2Add);
    this.add(ExitAdd);
    jbtAdd.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            MainFrame2.this.setTitle(Integer.toString(count));
        }
    });
    jbt2Add.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count--;
            MainFrame2.this.setTitle(Integer.toString(count));
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
