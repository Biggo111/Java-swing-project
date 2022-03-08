
package coachingcentremanagement;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Teachersinfo2 extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\teachersinfo2.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\piclabel.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    JTextField name,id,university,subject;
    JLabel piclabel;
    JButton back;
    public Teachersinfo2(String did,String dname,String dsub,String duni,String dpic){
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
        name.setBounds(220, 230, 195, 28);
        name.setText(dname);
        name.setEditable(false);
        label1.add(name);
        id = new JTextField();
        id.setBackground(color);
        id.setBounds(220, 310, 195, 28);
        id.setText(did);
        id.setEditable(false);
        label1.add(id);
        subject = new JTextField();
        subject.setBackground(color);
        subject.setBounds(220, 395, 195, 28);
        subject.setText(dsub);
        subject.setEditable(false);
        label1.add(subject);
        university = new JTextField();
        university.setBackground(color);
        university.setBounds(220, 480, 195, 28);
        university.setText(duni);
        university.setEditable(false);
        label1.add(university);
        piclabel = new JLabel(icon2);
        piclabel.setBounds(260,20,120,110);
        label1.add(piclabel);
        //Image getAbsolutePath = null;
        ImageIcon picture = new ImageIcon(dpic);
        Image image = picture.getImage().getScaledInstance(piclabel.getWidth(), piclabel.getHeight(), Image.SCALE_SMOOTH);
        piclabel.setIcon(new ImageIcon(image));
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TeachersInfo1();
            }
        });
        setVisible(true);
    }
}
