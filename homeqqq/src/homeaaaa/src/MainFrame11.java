import javax.swing.*;

public class MainFrame11 extends JFrame {
    private JLabel jlb = new JLabel("ID");
    private JLabel jlb1 = new JLabel("PW");
    private JButton jbt = new JButton("Login");
    private JButton jbt2 = new JButton("Exit");
    private JPasswordField jpss = new JPasswordField("****");
    private JTextField jtx = new JTextField();
    public MainFrame11(){
        init();
    }
    public void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);

//        .setLocation(50,50);
//        .setSize(120,30);

    }
}
