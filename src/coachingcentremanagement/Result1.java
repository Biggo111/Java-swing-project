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

public class Result1 extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Birthday\\result1.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\fetch.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    Color color2 = new Color(3, 12 , 41);
    JTextField id;
    JButton fetch,back;
    public Result1(){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        id = new JTextField();
        id.setBackground(color);
        id.setBounds(250, 275, 180, 30);
        label1.add(id);
        fetch = new JButton(icon2);
        fetch.setBounds(135, 460, 386, 30);
        fetch.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(fetch);
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Dashboard();
            }
        });
        fetch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tid = id.getText();
                
                if(tid.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Insert values");
                }
                else{
                dispose();
                new DBConnect().result(tid);
                }
            }
        });
        setVisible(true);
    }
}
