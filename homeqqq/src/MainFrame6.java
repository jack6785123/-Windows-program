

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame6 {
    public static void main(String[] args) {
        Frame2 frame2 = new Frame2();
    }
}

class Frame2 extends JFrame{
    private JLabel[] numbers = new JLabel[6];
    private JButton generate = new JButton("Generate");
    private JButton exit = new JButton("Exit");
    private JPanel panelcenter = new JPanel(new GridLayout(1, 6, 5, 5));
    private JPanel paneldown = new JPanel(new GridLayout(1, 2, 5, 5));
    private Random random = new Random();

    Frame2(){
        init();
    }

    private void init(){
        setBounds(100, 100 ,600, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        add(panelcenter, BorderLayout.CENTER);
        add(paneldown, BorderLayout.SOUTH);

        for (int i = 0; i < 6; i++){
            numbers[i] = new JLabel();
            numbers[i].setFont(new Font(null , Font.BOLD, 36));
            numbers[i].setOpaque(true);
            numbers[i].setHorizontalAlignment(SwingConstants.CENTER);
            numbers[i].setBackground(new Color(255));
            panelcenter.add(numbers[i]);
        }

        paneldown.add(generate);
        paneldown.add(exit);

        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num[] = new int[6];
                int i = 0;
                boolean same;
                while (i < 6){
                    same = true;
                    num[i] = random.nextInt(49) + 1;
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









