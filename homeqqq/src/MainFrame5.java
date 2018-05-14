import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MainFrame5 extends JFrame {
    private JButton jbnrun = new JButton("run");
    private JButton jbnreset = new JButton("reset");
    private JButton exit = new JButton("Exit");
    private JButton jbtns[][] = new JButton[3][3];
    private Container cp;
    private JPanel jpnc = new JPanel(new GridLayout(3,3,3,3));
    private JPanel jpnc2 = new JPanel(new GridLayout(3,1,3,3));
    private  boolean flag = true;
 //   private Random rand = new Random();

    public  MainFrame5(){
        inint();
    }
    private void inint(){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);//設置布局為空
        this.setBounds(100,100,700,500);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpnc, BorderLayout.CENTER);
        cp.add(jpnc2, BorderLayout.EAST);

        for(int i = 0 ; i<3;i++){
            for(int j = 0;j<3;j++){
                jbtns[i][j] = new JButton();
                jbtns[i][j].setBackground(new Color(255, 148, 54));
                jbtns[i][j].setFont(new Font(null,Font.BOLD,100));
                jbtns[i][j].setEnabled(false);
                jbtns[i][j] .addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmpbtn =(JButton) e.getSource();
                        if(tmpbtn.getText().equals("")){
                            if(flag){
                                tmpbtn.setText("O");
                            }else {
                                tmpbtn.setText("X");
                            }
                            flag = !flag;
                        }
                        checkStat();
                        tmpbtn.setBackground(new Color(100,255,10));
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
                for(int i = 0 ; i<3;i++) {
                    for (int j = 0; j < 3; j++) {
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
    private void checkStat(){
        if(jbtns[0][0].getText().equals(jbtns[0][1].getText())&&jbtns[0][0].getText().equals(jbtns[0][2].getText()) &&!jbtns[0][0].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[0][0].getText()+"win");
        }
        if(jbtns[1][0].getText().equals(jbtns[1][1].getText())&&jbtns[1][0].getText().equals(jbtns[1][2].getText()) &&!jbtns[1][0].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[1][0].getText()+"win");
        }
        if(jbtns[2][0].getText().equals(jbtns[2][1].getText())&&jbtns[2][0].getText().equals(jbtns[2][2].getText()) &&!jbtns[2][0].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[2][0].getText()+"win");
        }
        if(jbtns[0][0].getText().equals(jbtns[1][0].getText())&&jbtns[0][0].getText().equals(jbtns[2][0].getText()) &&!jbtns[0][0].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[0][0].getText()+"win");
        }
        if(jbtns[0][1].getText().equals(jbtns[1][1].getText())&&jbtns[0][1].getText().equals(jbtns[2][1].getText()) &&!jbtns[0][1].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[0][1].getText()+"win");
        }
        if(jbtns[0][2].getText().equals(jbtns[1][2].getText())&&jbtns[0][2].getText().equals(jbtns[2][2].getText()) &&!jbtns[0][2].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[0][2].getText()+"win");
        }
        if(jbtns[0][0].getText().equals(jbtns[1][1].getText())&&jbtns[0][0].getText().equals(jbtns[2][2].getText()) &&!jbtns[0][0].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[0][0].getText()+"win");
        }
        if(jbtns[0][2].getText().equals(jbtns[1][1].getText())&&jbtns[0][2].getText().equals(jbtns[2][0].getText()) &&!jbtns[0][2].getText().equals("")){
            JOptionPane.showMessageDialog(MainFrame5.this,jbtns[0][2].getText()+"win");
        }
    }
}

