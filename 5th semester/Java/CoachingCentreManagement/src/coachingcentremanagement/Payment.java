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
import java.util.regex.Pattern;

public class Payment extends JFrame{
    
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\paymentbackground.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\backbtn2.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\enrollbtn.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    JTextField total,amount;
    JButton enroll,back;
    JComboBox cost;
    String c[] = {"Bangla = BDT400","English = BDT600","Higher Mathematics = BDT1500","Physics = BDT1500","Chemistry = BDT1500","Biology = BDT1200","Business Studies = BDT900","Marketing = BDT900","Accounting = BDT1000","Economics = BDT1000","Civic = BDT600","History = BDT400","Sociology = BDT500","Logic = BDT400","ICT = BDT1000"}; 
    public Payment(){
        this("","","");
    }
    public Payment(String cnt,String cst,String uid){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cost = new JComboBox(c);
        cost.setBackground(color);
        cost.setBounds(340, 200, 180, 30);
        label1.add(cost);
        total = new JTextField();
        total.setBackground(color);
        total.setBounds(340, 275, 180, 30);
        total.setText(cnt);
        label1.add(total);
        amount = new JTextField();
        amount.setBackground(color);
        amount.setBounds(340, 350, 180, 30);
        amount.setText(cst);
        label1.add(amount);
        enroll = new JButton(icon3);
        enroll.setBounds(135, 460, 386, 30);
        enroll.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(enroll);
        back = new JButton(icon2);
        back.setBounds(560, 80, 49, 28);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(back);
        String id = uid;
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Course();
            }
        });
        enroll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DBConnect().enrolled(uid);
                dispose();
                new Paymentlast(id);
            }
        });
        setVisible(true);
    }
}
