
package coachingcentremanagement;

import javax.swing.*;
import java.awt.*;

public class loadingPage extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\LoadingBackground.png");
    JLabel label1 = new JLabel(icon);
    JLabel label2;
    JPanel panel1;
     JProgressBar pro;
    public loadingPage(){
        setSize(700,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1.setBounds(0,0,700,600);
        add(label1);
        panel1 = new JPanel();
        panel1.setBounds(270,260,150,32);
        pro = new JProgressBar();
        pro.setValue(0);
        pro.setStringPainted(true);
        panel1.add(pro);
        label1.add(panel1);
        setVisible(true);
        loading();
    }
    public void loading(){
        int i=0;
        try{
            while(i<=100){
                pro.setValue(i+10);
                Thread.sleep(1000);
                if(i==100)
                {
                    dispose();
                    new LoginPage();
                }
                i+=20;
            }
        }catch(Exception e){
            
        }
    }
}
