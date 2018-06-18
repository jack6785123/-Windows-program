import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class MainFrame0515 extends JFrame{
    private JLabel label = new JLabel("0");
    private JPanel btnpanel = new JPanel(new GridLayout(4, 5, 3, 3));
    private JButton buttons[] = new JButton[20];
    private ImageIcon images[] = new ImageIcon[10];
    private double v1 = 0;
    private double v2 = 0;
    private int op = -1;
    private boolean bool = true;

    MainFrame0515(){
        init();
    }

    private void init(){
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new Font(null, Font.BOLD, 48));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        add(label, BorderLayout.NORTH);
        add(btnpanel, BorderLayout.CENTER);
        for (int i = 0; i < 10; i ++){
            images[i] = new ImageIcon(i + ".png");
            Image image = images[i].getImage();
            image = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            images[i] = new ImageIcon(image);
        }

        for (int i = 0; i < 20; i++){
            switch (i){
                case 0:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[7]);
                    btnpanel.add(buttons[i]);
                    break;
                case 1:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[8]);
                    btnpanel.add(buttons[i]);
                    break;
                case 2:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[9]);
                    btnpanel.add(buttons[i]);
                    break;
                case 3:
                    buttons[i] = new JButton("/");
                    btnpanel.add(buttons[i]);
                    break;
                case 4:
                    buttons[i] = new JButton("C");
                    btnpanel.add(buttons[i]);
                    break;
                case 5:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[4]);
                    btnpanel.add(buttons[i]);
                    break;
                case 6:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[5]);
                    btnpanel.add(buttons[i]);
                    break;
                case 7:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[6]);
                    btnpanel.add(buttons[i]);
                    break;
                case 8:
                    buttons[i] = new JButton("*");
                    btnpanel.add(buttons[i]);
                    break;
                case 9:
                    buttons[i] = new JButton("sqrt");
                    btnpanel.add(buttons[i]);
                    break;
                case 10:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[1]);
                    btnpanel.add(buttons[i]);
                    break;
                case 11:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[2]);
                    btnpanel.add(buttons[i]);
                    break;
                case 12:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[3]);
                    btnpanel.add(buttons[i]);
                    break;
                case 13:
                    buttons[i] = new JButton("-");
                    btnpanel.add(buttons[i]);
                    break;
                case 14:
                    buttons[i] = new JButton("PI");
                    btnpanel.add(buttons[i]);
                    break;
                case 15:
                    buttons[i] = new JButton();
                    buttons[i].setIcon(images[0]);
                    btnpanel.add(buttons[i]);
                    break;
                case 16:
                    buttons[i] = new JButton(".");
                    btnpanel.add(buttons[i]);
                    break;
                case 17:
                    buttons[i] = new JButton("=");
                    btnpanel.add(buttons[i]);
                    break;
                case 18:
                    buttons[i] = new JButton("+");
                    btnpanel.add(buttons[i]);
                    break;
                case 19:
                    buttons[i] = new JButton("EXIT");
                    btnpanel.add(buttons[i]);
                    break;
            }

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tembtn = (JButton)e.getSource();
                    switch (tembtn.getText()){
                        case "C":
                            v1 = 0;
                            v2 = 0;
                            op = -1;
                            label.setText("0");
                            break;
                        case "sqrt":
                            label.setText(Double.toString(Math.sqrt(Double.parseDouble(label.getText()))));
                            break;
                        case "PI":
                            label.setText(Double.toString(Math.PI));
                            break;
                        case "EXIT":
                            System.exit(0);
                            break;
                        case "+":
                            v1 = Double.parseDouble(label.getText());
                            op = 0;
                            bool = false;
                            break;
                        case "-":
                            v1 = Double.parseDouble(label.getText());
                            op = 1;
                            bool = false;
                            break;
                        case "*":
                            v1 = Double.parseDouble(label.getText());
                            op = 2;
                            bool = false;
                            break;
                        case "/":
                            v1 = Double.parseDouble(label.getText());
                            op = 3;
                            bool = false;
                            break;
                        case "=":
                            v2 = Double.parseDouble(label.getText());
                            double v3 = 0;
                            switch (op){
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
                            if (op > -1){
                                label.setText(Double.toString(v3));
                            }
                            op = -1;
                            label.setText(Double.toString(v3));
                            break;
                        case ".":
                            if (!label.getText().matches("-*\\d+\\.\\d*")){
                                label.setText(label.getText() + ".");
                            }
                            break;
                        default:
                            if (label.getText().equals("0") || (op > -1 && !bool)){
                                for (int i = 0; i < 10; i++){
                                    if (tembtn.getIcon().equals(images[i])){
                                        label.setText(Integer.toString(i));
                                    }
                                }
                                bool = true;
                            }else {
                                for (int i = 0; i < 10; i++){
                                    if (tembtn.getIcon().equals(images[i])){
                                        label.setText(label.getText() + i);
                                    }
                                }
                            }
                    }
                }
            });
        }
    }
}