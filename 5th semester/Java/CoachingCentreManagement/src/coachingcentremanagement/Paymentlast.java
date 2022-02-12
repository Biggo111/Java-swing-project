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

public class Paymentlast extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\paymentlast.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\backbtn2.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\logoutbtn.png");
    Color color = new Color(204, 225, 215);
    JLabel label1 = new JLabel(icon);
    JButton back,logoutbtn;
    JTextField uid,uidd;
    public Paymentlast(String id){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uidd = new JTextField("                 Your Unique ID");
        uidd.setBackground(color);
        uidd.setBounds(250, 135, 195, 28);
        uidd.setEditable(false);
        label1.add(uidd);
        uid = new JTextField();
        uid.setBackground(color);
        uid.setBounds(250, 180, 195, 28);
        uid.setText(id);
        uid.setEditable(false);
        label1.add(uid);
        back = new JButton(icon2);
        back.setBounds(560, 80, 49, 28);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Payment();
            }
        });
        logoutbtn = new JButton(icon3);
        logoutbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutbtn.setBounds(620,80,49,28);
        label1.add(logoutbtn);
        logoutbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new LoginPage();
            }
        });
        setVisible(true);
    }
}
