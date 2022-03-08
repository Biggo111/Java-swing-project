
package coachingcentremanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.regex.Pattern;

public class Dashboard extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\dashboardbackground.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\studentinfobtn.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\courseenrollmentbtn.png");
    ImageIcon icon4 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\birthdaybtn.png");
    ImageIcon icon5 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\todaysclassbtn.png");
    ImageIcon icon6 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\resultbtn.png");
    ImageIcon icon7 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\teacherbtn.png");
    ImageIcon icon8 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\questionbtn.png");
    ImageIcon icon9 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\attbtn.png");
    ImageIcon icon10 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\nbbtn.png");
    ImageIcon icon11 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\aboutusbtn.png");
    ImageIcon icon12 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\dashboard\\logoutbtn.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204,225,215);
    JButton studentinfobtn,courseenrollmentbtn,birthdaybtn,todaysclassbtn,resultbtn,teacherbtn,questionbtn,attbtn,nbbtn,aboutusbtn,logoutbtn;
    public Dashboard(){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentinfobtn = new JButton(icon2);
        studentinfobtn.setBounds(68,110,195,28);
        studentinfobtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(studentinfobtn);
        courseenrollmentbtn = new JButton(icon3);
        courseenrollmentbtn.setBounds(68,220,195,28);
        courseenrollmentbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(courseenrollmentbtn);
        birthdaybtn = new JButton(icon4);
        birthdaybtn.setBounds(68,320,195,28);
        birthdaybtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(birthdaybtn);
        todaysclassbtn = new JButton(icon5);
        todaysclassbtn.setBounds(68,430,195,28);
        todaysclassbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(todaysclassbtn);
        resultbtn = new JButton(icon6);
        resultbtn.setBounds(68,530,195,28);
        resultbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(resultbtn);
        teacherbtn = new JButton(icon7);
        teacherbtn.setBounds(415,110,195,28);
        teacherbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(teacherbtn);
        questionbtn = new JButton(icon8);
        questionbtn.setBounds(415,220,195,28);
        questionbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(questionbtn);
        attbtn = new JButton(icon9);
        attbtn.setBounds(415,320,195,28);
        attbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(attbtn);
        nbbtn = new JButton(icon10);
        nbbtn.setBounds(415,430,195,28);
        nbbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(nbbtn);
        aboutusbtn = new JButton(icon11);
        aboutusbtn.setBounds(415,530,195,28);
        aboutusbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(aboutusbtn);
        logoutbtn = new JButton(icon12);
        logoutbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutbtn.setBounds(610,40,40,31);
        label1.add(logoutbtn);
        
        studentinfobtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new StudentInfo1();
            }
        });
        
        courseenrollmentbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Course();
            }
        });
        logoutbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new LoginPage();
            }
        });
        teacherbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new TeachersInfo1();
            }
        });
        birthdaybtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Birthday2();
            }
        });
        attbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Attendance();
            }
        });
        aboutusbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Aboutus();
            }
        });
        resultbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Result1();
            }
        });
        questionbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                java.awt.Desktop.getDesktop().browse(URI.create("https://hsc-ssc-jsc-psc.blogspot.com/2016/02/hsc-suggestion.html?m=1"));
            }
            catch(Exception ex)
            {
                ex.getStackTrace();
            }
            }
        });
        nbbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new NoticeBoard();
            }
        });
        todaysclassbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Todaysclass();
            }
        });
        setVisible(true);
    }
}
