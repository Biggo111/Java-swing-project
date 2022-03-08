
package coachingcentremanagement;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class Birthday extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Birthday\\birthday2.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    Color color2 = new Color(3, 12 , 41);
    JTextField today,txtdate,name,birthofdate;
    JButton back;
    public Birthday(){
        this("","");
    }
    public Birthday(String dname,String ddate){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Date date = new Date();
        String dddate = date.toString();
        txtdate = new JTextField("                    Today's date");
        txtdate.setBackground(color);
        txtdate.setBounds(240,75, 195, 28);
        txtdate.setEditable(false);
        label1.add(txtdate);
        today = new JTextField();
        today.setBackground(color);
        today.setBounds(240,110, 195, 28);
        today.setText(dddate);
        today.setEditable(false);
        label1.add(today);
        name = new JTextField();
        name.setBackground(color);
        name.setBounds(280, 240, 195, 28);
        name.setText(dname);
        name.setEditable(false);
        label1.add(name);
        birthofdate = new JTextField();
        birthofdate.setBounds(280,320,195,28);
        birthofdate.setBackground(color);
        birthofdate.setText(ddate);
        birthofdate.setEditable(false);
        label1.add(birthofdate);
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Birthday2();
            }
        });
        setVisible(true);
    }
}
