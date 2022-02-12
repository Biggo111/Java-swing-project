/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coachingcentremanagement;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class StudentInfo1 extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\stuinfobackground1.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\find.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    JTextField uid,email;
    JButton find,back;
    public StudentInfo1(){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uid = new JTextField();
        uid.setBackground(color);
        uid.setBounds(300, 205, 180, 30);
        label1.add(uid);
        email = new JTextField();
        email.setBackground(color);
        email.setBounds(300, 310, 180, 30);
        label1.add(email);
        find = new JButton(icon2);
        find.setBounds(450,450, 148, 28);
        label1.add(find);
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Dashboard();
            }
        });
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String unique = uid.getText();
                String mail   = email.getText();
                String emailRegEx = "[a-z0-9_]+@(gmail|outlook|yahoo)\\.com";
                if(unique.isEmpty() || mail.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Insert values");
                }
                if(!Pattern.matches(emailRegEx,mail)){
                    JOptionPane.showMessageDialog(null,"Insert a valid email!");
                }
                else{
                dispose();
                new DBConnect().stu_info(unique);
                }
            }
        });
        setVisible(true);
    }
//    public void check(boolean k){
//        if(k==true){
//            dispose();
//            new Dashboard();
//        }
//    }
}
