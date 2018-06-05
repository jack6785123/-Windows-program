import javafx.stage.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame10 extends JFrame {
    private Container cp;
    private JLabel jlb= new JLabel();
    private JLabel jlb2= new JLabel();
    private ImageIcon img1 = new ImageIcon("111.png");
    private ImageIcon img5 = new ImageIcon("1111.png");
    private ImageIcon imgRocket = new ImageIcon("11.png");
    private Timer t1;
    public  MainFrame10(){
        in();
    }
    public void in(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(50,50,800,700);
        cp = this.getContentPane();
        cp.setLayout(null);
        jlb.setBounds(350,580,120,60);
        cp.add(jlb);
        jlb.setIcon(img1);

        Image img = img1.getImage();
        Image img2 = img.getScaledInstance(120,80,Image.SCALE_SMOOTH);
        img1.setImage(img2);



         Image imga =imgRocket.getImage();
         Image imgb = imga.getScaledInstance(100,80,Image.SCALE_SMOOTH);
         imgRocket.setImage(imgb);

         Image imgC =img5.getImage();
         Image imgD = imgC.getScaledInstance(120,80,Image.SCALE_SMOOTH);
         img5.setImage(imgD);


        t1= new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               jlb2.setLocation(jlb2.getX(),jlb2.getY()+50);
                if(jlb2.getY()>550){
                    t1.stop();
                }
            }
        });
     this.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
             switch ((e.getKeyCode())){
                 case 37:
                     jlb.setIcon(img1);
                     jlb.setLocation(jlb.getX()-5,jlb.getY());
                     break;
                 case 39:
                     jlb.setIcon(img5);
                     jlb.setLocation(jlb.getX()+5,jlb.getY());
                     break;
                 case 40:
                     jlb.setLocation(jlb.getX(),jlb.getY()+5);
                     break;
                 case 38:
                     jlb.setLocation(jlb.getX(),jlb.getY()-5);


                     break;
                 case 32:
                     jlb2.setBounds(jlb.getX()+50,jlb.getY(),120,80);
                     cp.add(jlb2);
                     jlb2.setIcon(imgRocket);
                     t1.start();
                     break;
             }
         }
     });
    }


    }

