import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public  class HOMEW extends JFrame {
    private JPanel pn1 = new JPanel(new GridLayout(4, 5));
    private JPanel pn2 = new JPanel(new GridLayout(4, 4));
    private JLabel jlb = new JLabel(" ");
    private JButton jbt[][] = new JButton[4][5];
    private JButton Exit = new JButton("EXIT");
    private Container cp;
    private int op = -1;
    private double v1;
    private double v2;

    public  HOMEW() {
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
        jbt[0][3] = new JButton("/");
        jbt[0][4] = new JButton("AC");
        jbt[1][0] = new JButton("4");
        jbt[1][1] = new JButton("5");
        jbt[1][2] = new JButton("6");
        jbt[1][3] = new JButton("*");
        jbt[1][4] = new JButton("sqrt");
        jbt[2][0] = new JButton("1");
        jbt[2][1] = new JButton("2");
        jbt[2][2] = new JButton("3");
        jbt[2][3] = new JButton("-");
        jbt[2][4] = new JButton("PI");
        jbt[3][0] = new JButton("0");
        jbt[3][1] = new JButton(".");
        jbt[3][2] = new JButton("=");
        jbt[3][3] = new JButton("+");
        jbt[3][4] = new JButton("Exit");
        pn1.add(jlb);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                pn2.add(jbt[i][j]);
                jbt[i][j].setFont(new Font(null, Font.BOLD, 25));
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                jbt[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmpbtn = (JButton) e.getSource();
                        switch (tmpbtn.getText()) {
                            case "AC":
                                jlb.setText("0");
                                op = -1;
                                break;
                            case "PI":
                                jlb.setText(Double.toString(Math.PI));
                                break;
                            case "sqrt":
                                jlb.setText(Double.toString(Math.sqrt(Double.parseDouble(jlb.getText()))));
                                break;
                            case "Exit":
                                System.exit(0);
                                break;
                            case "+":
                                op = 0;
                                v1 = Double.parseDouble(jlb.getText());
                                break;
                            case "-":
                                op = 1;
                                v1 = Double.parseDouble(jlb.getText());
                                break;
                            case "*":
                                op = 2;
                                v1 = Double.parseDouble(jlb.getText());
                                break;
                            case "/":
                                op = 3;
                                v1 = Double.parseDouble(jlb.getText());
                                break;
                            case "=":
                                v2 = Double.parseDouble(jlb.getText());
                                double v3 = 0;
                                switch (op) {
                                    case 0:
                                        v3 = v1 + v2;
                                        break;
                                    case 1:
                                        v3 = v1 - v2;
                                        break;
                                    case 2:
                                        v3 = v1 * v2;
                                        break;
                                    case 3:
                                        v3 = v1 / v2;
                                        break;
                                }
                                jlb.setText(Double.toString(v3));
                                op = -1;
                                break;
                            default:
                                if (jlb.getText().equals("0") || op > -1) {
                                    jlb.setText(tmpbtn.getText());
                                } else {
                                    jlb.setText(jlb.getText() + tmpbtn.getText());
                                    break;
                                }

                        }
                    }
                });





            }
        }
    }
}







