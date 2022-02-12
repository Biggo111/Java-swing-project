
package coachingcentremanagement;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class StudentInfo2 extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\studentinfo.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\Stu_info\\piclabel.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\stu_info\\back.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    Color color2 = new Color(3, 12 , 41);
    JTextField uid,email,name,contact,group,blood,status;
    JLabel piclabel;
    JButton back;
   JTextArea course;
    public StudentInfo2(String duid,String dname,String dcon,String dblood,String dgroup,String dcnt,String dpic,String dstatus){
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
        name.setBounds(225, 235, 195, 28);
        name.setText(dname);
        name.setEditable(false);
        label1.add(name);
        uid = new JTextField();
        uid.setBackground(color);
        uid.setBounds(225, 280, 195, 28);
        uid.setText(duid);
        uid.setEditable(false);
        label1.add(uid);
        contact = new JTextField();
        contact.setBackground(color);
        contact.setBounds(225, 320, 195, 28);
        contact.setText(dcon);
        contact.setEditable(false);
        label1.add(contact);
        blood = new JTextField();
        blood.setBackground(color);
        blood.setBounds(225, 360, 195, 28);
        blood.setText(dblood);
        blood.setEditable(false);
        label1.add(blood);
        group = new JTextField();
        group.setBackground(color);
        group.setBounds(225, 405, 195, 28);
        group.setText(dgroup);
        group.setEditable(false);
        label1.add(group);
        status = new JTextField();
        status.setBackground(color);
        status.setBounds(225, 445, 195, 28);
        status.setText(dstatus);
        status.setEditable(false);
        label1.add(status);
        piclabel = new JLabel(icon2);
        piclabel.setBounds(260,50,120,110);
        label1.add(piclabel);
        ImageIcon picture = new ImageIcon(dpic);
        Image image = picture.getImage().getScaledInstance(piclabel.getWidth(), piclabel.getHeight(), Image.SCALE_SMOOTH);
        piclabel.setIcon(new ImageIcon(image));
        back = new JButton(icon3);
        back.setBounds(560,30, 40, 31);
        label1.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new StudentInfo1();
            }
        });
        setVisible(true);
    }
}
