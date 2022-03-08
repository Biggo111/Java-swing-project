
package coachingcentremanagement;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Aboutus extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Birthday\\aboutus.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Birthday\\biggobtn.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    ImageIcon icon4 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Birthday\\sirbtn.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    Color color2 = new Color(3, 12 , 41);
    JButton name1,name2,back;
    public Aboutus(){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name1 = new JButton(icon2);
        name1.setBounds(80,310, 187, 32);
        label1.add(name1);
        name2 = new JButton(icon4);
        name2.setBounds(410,310, 187, 32);
        label1.add(name2);
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Dashboard();
            }
        });
        name1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                java.awt.Desktop.getDesktop().browse(URI.create("https://github.com/Biggo111?tab=repositories"));
            }
            catch(Exception ee)
            {
                ee.getStackTrace();
            }
            }
        });
        name2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.lus.ac.bd/author/mony/"));
            }
            catch(Exception ee)
            {
                ee.getStackTrace();
            }
            }
        });
        setVisible(true);
    }
}
