import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame{

        private JLabel[] numbers = new JLabel[9];
//        private JButton generate = new JButton("Generate");
        private JButton exit = new JButton("Exit");
        private JButton jbt = new JButton();
        private JPanel panelcenter = new JPanel(new GridLayout(4, 3, 5, 5));
        private JPanel paneldown = new JPanel(new GridLayout(4, 3, 5, 5));
        private Random random = new Random();

       public  Main(){
            init();
        }

    private void init(){
        setBounds(100, 100 ,800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        add(panelcenter, BorderLayout.CENTER);
        add(paneldown, BorderLayout.SOUTH);

        for (int i = 0; i < 6; i++){
            numbers[i] = new JLabel();
            numbers[i].setFont(new Font(null , Font.BOLD, 36));
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


            numbers[i].setOpaque(true);
            numbers[i].setHorizontalAlignment(SwingConstants.CENTER);
            panelcenter.add(numbers[i]);
        }

        paneldown.add(jbt);


        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num[] = new int[9];
                int i = 0;
                boolean same;
                while (i < 6){
                    same = true;
                    num[i] = random.nextInt(9) ;
                    for (int j = 0; j < i; j++){
                        if (num[i] == num[j]){
                            same = false;
                        }
                    }
                    if (same){
                        i++;
                    }
                }

                for (int j = 0; j < 6; j ++){
                    numbers[j].setText(Integer.toString(num[j]));
                }
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


