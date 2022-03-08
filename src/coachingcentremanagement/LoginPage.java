package coachingcentremanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {

    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\LoginPage.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\loginbtn.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\regbtn.png");
    ImageIcon icon4 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\eyebtn.png");
    ImageIcon icon5 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\NotVisible.png");
    JLabel label1 = new JLabel(icon);
    JTextField tf1, tf2;
    JPasswordField pass1;
    JButton loginbtn, regbtn, showpassbtn,notshowpassbtn;
    Font f1 = new Font(Font.SERIF, Font.PLAIN, 10);

    public LoginPage() {
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf1 = new JTextField("Email");
        //tf1.setFont(f1);
        tf1.setBounds(160, 195, 160, 29);
        label1.add(tf1);
        pass1 = new JPasswordField("Password");
        //pass1.setFont(f1);
        pass1.setBounds(160, 302, 160, 29);
        //pass1.setEchoChar((char)0);
        label1.add(pass1);
        loginbtn = new JButton(icon2);
        loginbtn.setBounds(210, 425, 250, 30);
        loginbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(loginbtn);
        regbtn = new JButton(icon3);
        regbtn.setBounds(360, 510, 150, 30);
        regbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(regbtn);
        showpassbtn = new JButton(icon4);
        showpassbtn.setBounds(321, 306, 20, 20);
        showpassbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(showpassbtn);
        notshowpassbtn = new JButton(icon5);
        notshowpassbtn.setBounds(321, 306, 20, 20);
        notshowpassbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(notshowpassbtn);

        regbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == regbtn) {
                    dispose();
                    new regPage();
                }
            }
        });
        loginbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                String mail = tf1.getText();
                String pass = pass1.getText();
                
                String findQuery = "SELECT `Name`, `Email`, `Contact`, `Pass`, `Address` FROM `registration`";
                
                DBConnect db = new DBConnect();
                db.checklogin(findQuery,mail, pass);
            }
            
        });
        
        showpassbtn.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               pass1.setEchoChar((char)0);
               showpassbtn.setVisible(false);
               notshowpassbtn.setVisible(true);
           }
        });
        notshowpassbtn.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               pass1.setEchoChar('*');
               //notshowpassbtn.setVisible(false);
               showpassbtn.setVisible(true);
               //label1.add(showpassbtn);
           }
        });
        setVisible(true);
    }
    public void todispose(int f){
        if(f==1){
            dispose();
        }
    }
}
