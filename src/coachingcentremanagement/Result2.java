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

public class Result2 extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Birthday\\result2.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\fetch.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    Color color2 = new Color(3, 12 , 41);
    JTextField id,name,result;
    JButton back;
    public Result2(String dname, String did, String dres){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name = new JTextField();
        name.setBackground(color);
        name.setBounds(250, 215, 180, 30);
        name.setText(dname);
        name.setEditable(false);
        label1.add(name);
        id = new JTextField();
        id.setBackground(color);
        id.setBounds(250, 290, 180, 30);
        id.setText(did);
        id.setEditable(false);
        label1.add(id);
        result = new JTextField();
        result.setBackground(color);
        result.setBounds(250, 370, 180, 30);
        result.setText(dres);
        result.setEditable(false);
        label1.add(result);
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Result1();
            }
        });
        setVisible(true);
    }
}
