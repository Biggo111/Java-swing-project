package coachingcentremanagement;
//import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.JTextFieldDateEditor;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Course extends JFrame {

    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\coursebackground.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\firstname.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\lastname.png");
    ImageIcon icon4 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\dateofbirth.png");
    ImageIcon icon5 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\gender.png");
    ImageIcon icon6 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\address.png");
    ImageIcon icon7 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\contact.png");
    ImageIcon icon8 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\blood.png");
    ImageIcon icon9 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\group.png");
    ImageIcon icon10 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\subjects.png");
    ImageIcon icon11 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\submitbtn.png");
    ImageIcon icon12 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\backbtn2.png");
    ImageIcon icon13 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\course enrollment\\piclabel.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204, 225, 215);
    JTextField fname, lname, dateofbirth1, dateofbirth2, dateofbirth3, add, con, bloodG, file;
    JButton fbtn, lbtn, address, contact, blood, submitbtn, backbtn2, open, cancel;
    JLabel datelabel, genderlabel, grouplabel, subjectlabel, piclabel;
    JComboBox day, month, year;
    JCheckBox male, female, science, commerce, arts, Bangla, English, math, Physics, Chemistry, Biology, ict, accounting, finance, business, marketing, economics, civic, history, sociology, logic;
    String d[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String m[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String y[] = {"2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"};
    Font font = new Font(Font.SERIF, Font.PLAIN, 12);
    JFileChooser pic;
//    JDateChooser jDateChooser1;
//    jDateChooser1 = new JDateChooser();
//    jDateChooser1.setDateFormatString("dd/MM/yyyy");

    public Course() {
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fbtn = new JButton(icon2);
        fbtn.setBounds(70, 60, 148, 20);
        label1.add(fbtn);
        fbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fbtn.setVisible(false);
                fname = new JTextField();
                fname.setBackground(color);
                fname.setBounds(70, 60, 148, 20);
                label1.add(fname);
            }
        });
        lbtn = new JButton(icon3);
        lbtn.setBounds(270, 60, 148, 20);
        label1.add(lbtn);
        lbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbtn.setVisible(false);
                lname = new JTextField();
                lname.setBackground(color);
                lname.setBounds(270, 60, 148, 20);
                label1.add(lname);
            }
        });
        datelabel = new JLabel(icon4);
        datelabel.setBounds(70, 100, 148, 20);
        label1.add(datelabel);
        genderlabel = new JLabel(icon5);
        genderlabel.setBounds(270, 100, 148, 20);
        label1.add(genderlabel);
        day = new JComboBox(d);
        day.setBackground(color);
        day.setBounds(70, 130, 41, 20);
        label1.add(day);
        month = new JComboBox(m);
        month.setBackground(color);
        month.setBounds(115, 130, 50, 20);
        label1.add(month);
        year = new JComboBox(y);
        year.setBackground(color);
        year.setBounds(168, 130, 50, 20);
        label1.add(year);
        
        String checkdate[] = {"29-February-1990","29-February-1991","29-February-1993","29-February-1994","29-February-1995","29-February-1997","29-February-1998","29-February-1999","29-February-2001","29-February-2002","29-February-2003","29-February-2005","29-February-2006","29-February-2007","30-February-1990","30-February-1991","30-February-1992","30-February-1993","30-February-1994","30-February-1995","30-February-1996","30-February-1997","30-February-1998","30-February-1999","30-February-2000","30-February-2001","30-February-2002","30-February-2003","30-February-2004","30-February-2005","30-February-2006","30-February-2007","30-February-2008","31-February-1991","31-February-1992","31-February-1993","31-February-1994","31-February-1995","31-February-1996","31-February-1997","31-February-1998","31-February-1999","31-February-2000","31-February-2001","31-February-2002","31-February-2003","31-February-2004","31-February-2005","31-February-2006","31-February-2007","31-February-2008","31-April-1990","31-April-1991","31-April-1992","31-April-1993","31-April-1994","31-April-1995","31-April-1996","31-April-1997","31-April-1998","31-April-1999","31-April-2000","31-April-2001","31-April-2002","31-April-2003","31-April-2004","31-April-2005","31-April-2006","31-April-2007","31-April-2008","31-June-1990","31-June-1991","31-June-1992","31-June-1993","31-June-1994","31-June-1995","31-June-1996","31-June-1997","31-June-1998","31-June-1999","31-June-2000","31-June-2001","31-June-2002","31-June-2003","31-June-2004","31-June-2005","31-June-2006","31-June-2007","31-June-2008","31-September-1990","31-September-1991","31-September-1992","31-September-1993","31-September-1994","31-September-1995","31-September-1996","31-September-1997","31-September-1998","31-September-1999","31-September-2000","31-September-2001","31-September-2002","31-September-2003","31-September-2004","31-September-2005","31-September-2006","31-September-2007","31-September-2008","31-November-1990","31-November-1991","31-November-1992","31-November-1993","31-November-1994","31-November-1995","31-November-1996","31-November-1997","31-November-1998","31-November-1999","31-November-2000","31-November-2001","31-November-2002","31-November-2003","31-November-2004","31-November-2005","31-November-2006","31-November-2007","31-November-2008"};
        
        male = new JCheckBox("Male");
        male.setBackground(color);
        male.setBounds(270, 130, 60, 20);
        label1.add(male);
        female = new JCheckBox("Female");
        female.setBackground(color);
        female.setBounds(348, 130, 70, 20);
        label1.add(female);
        male.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    female.setEnabled(false);
                } else {
                    female.setEnabled(true);
                }
            }
        });
        female.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (female.isSelected()) {
                    male.setEnabled(false);
                } else {
                    male.setEnabled(true);
                }
            }
        });
        address = new JButton(icon6);
        address.setBounds(70, 160, 321, 20);
        label1.add(address);
        address.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                address.setVisible(false);
                add = new JTextField();
                add.setBackground(color);
                add.setBounds(70, 160, 321, 20);
                label1.add(add);
            }
        });
        contact = new JButton(icon7);
        contact.setBounds(70, 185, 321, 20);
        label1.add(contact);
        contact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contact.setVisible(false);
                con = new JTextField();
                con.setBackground(color);
                con.setBounds(70, 185, 321, 20);
                label1.add(con);
            }
        });
        blood = new JButton(icon8);
        blood.setBounds(70, 210, 321, 20);
        label1.add(blood);
        blood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                blood.setVisible(false);
                bloodG = new JTextField();
                bloodG.setBackground(color);
                bloodG.setBounds(70, 210, 321, 20);
                label1.add(bloodG);
            }
        });
        grouplabel = new JLabel(icon9);
        grouplabel.setBounds(70, 235, 321, 20);
        label1.add(grouplabel);
        science = new JCheckBox("Science");
        science.setBackground(color);
        science.setBounds(70, 260, 100, 20);
        label1.add(science);
        commerce = new JCheckBox("Commerce");
        commerce.setBackground(color);
        commerce.setBounds(180, 260, 100, 20);
        label1.add(commerce);
        arts = new JCheckBox("Humanities");
        arts.setBackground(color);
        arts.setBounds(291, 260, 100, 20);
        label1.add(arts);
        science.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (science.isSelected()) {
                    commerce.setEnabled(false);
                    arts.setEnabled(false);
                    accounting.setEnabled(false);
                    finance.setEnabled(false);
                    business.setEnabled(false);
                    marketing.setEnabled(false);
                    economics.setEnabled(false);
                    civic.setEnabled(false);
                    history.setEnabled(false);
                    sociology.setEnabled(false);
                    logic.setEnabled(false);
                } else {
                    commerce.setEnabled(true);
                    arts.setEnabled(true);
                    accounting.setEnabled(true);
                    finance.setEnabled(true);
                    business.setEnabled(true);
                    marketing.setEnabled(true);
                    economics.setEnabled(true);
                    civic.setEnabled(true);
                    history.setEnabled(true);
                    sociology.setEnabled(true);
                    logic.setEnabled(true);
                }
            }
        });
        commerce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (commerce.isSelected()) {
                    science.setEnabled(false);
                    arts.setEnabled(false);
                    Physics.setEnabled(false);
                    Chemistry.setEnabled(false);
                    Biology.setEnabled(false);
                    math.setEnabled(false);
                    civic.setEnabled(false);
                    history.setEnabled(false);
                    sociology.setEnabled(false);
                    logic.setEnabled(false);
                } else {
                    science.setEnabled(true);
                    arts.setEnabled(true);
                    Physics.setEnabled(true);
                    Chemistry.setEnabled(true);
                    Biology.setEnabled(true);
                    math.setEnabled(true);
                    civic.setEnabled(true);
                    history.setEnabled(true);
                    sociology.setEnabled(true);
                    logic.setEnabled(true);
                }
            }
        });
        arts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (arts.isSelected()) {
                    science.setEnabled(false);
                    commerce.setEnabled(false);
                    Physics.setEnabled(false);
                    Chemistry.setEnabled(false);
                    Biology.setEnabled(false);
                    math.setEnabled(false);
                    business.setEnabled(false);
                    marketing.setEnabled(false);
                    finance.setEnabled(false);
                    accounting.setEnabled(false);
                } else {
                    science.setEnabled(true);
                    commerce.setEnabled(true);
                    Physics.setEnabled(true);
                    Chemistry.setEnabled(true);
                    Biology.setEnabled(true);
                    math.setEnabled(true);
                    business.setEnabled(true);
                    marketing.setEnabled(true);
                    finance.setEnabled(true);
                    accounting.setEnabled(true);
                }
            }
        });
        subjectlabel = new JLabel(icon10);
        subjectlabel.setBounds(70, 290, 321, 20);
        label1.add(subjectlabel);
        Bangla = new JCheckBox("Bangla");
        Bangla.setBackground(color);
        Bangla.setBounds(70, 320, 80, 20);
        label1.add(Bangla);
        English = new JCheckBox("English");
        English.setBackground(color);
        English.setBounds(160, 320, 80, 20);
        label1.add(English);
        math = new JCheckBox("Higher Mathematics");
        math.setBackground(color);
        math.setBounds(250, 320, 140, 20);
        label1.add(math);
        Physics = new JCheckBox("Physics");
        Physics.setBackground(color);
        Physics.setBounds(70, 350, 80, 20);
        label1.add(Physics);
        Chemistry = new JCheckBox("Chemistry");
        Chemistry.setBackground(color);
        Chemistry.setBounds(160, 350, 80, 20);
        Chemistry.setFont(font);
        label1.add(Chemistry);
        Biology = new JCheckBox("Biology");
        Biology.setBackground(color);
        Biology.setBounds(250, 350, 80, 20);
        label1.add(Biology);
        ict = new JCheckBox("ICT");
        ict.setBackground(color);
        ict.setBounds(335, 350, 55, 20);
        label1.add(ict);
        accounting = new JCheckBox("Accounting");
        accounting.setBackground(color);
        accounting.setFont(font);
        accounting.setBounds(70, 380, 80, 20);
        label1.add(accounting);
        finance = new JCheckBox("Finance");
        finance.setBackground(color);
        finance.setBounds(160, 380, 80, 20);
        //finance.setFont(font);
        label1.add(finance);
        marketing = new JCheckBox("        Marketing");
        marketing.setBackground(color);
        marketing.setBounds(250, 380, 140, 20);
        //marketing.setFont(font);
        label1.add(marketing);
        logic = new JCheckBox("   Logic");
        logic.setBackground(color);
        logic.setBounds(160, 410, 80, 20);
        //logic.setFont(font);
        label1.add(logic);

        history = new JCheckBox("History");
        history.setBackground(color);
        history.setBounds(70, 410, 80, 20);
        //marketing.setFont(font);
        label1.add(history);

        civic = new JCheckBox("Civic & Good Govern");
        civic.setBackground(color);
        civic.setBounds(250, 410, 140, 20);
        //marketing.setFont(font);
        label1.add(civic);
        economics = new JCheckBox("Economics");
        economics.setBackground(color);
        economics.setBounds(70, 440, 80, 20);
        economics.setFont(font);
        label1.add(economics);
        sociology = new JCheckBox("Sociology");
        sociology.setBackground(color);
        sociology.setBounds(160, 440, 80, 20);
        //logic.setFont(font);
        label1.add(sociology);
        business = new JCheckBox(" Business Studies");
        business.setBackground(color);
        business.setBounds(250, 440, 140, 20);
        //marketing.setFont(font);
        label1.add(business);
        submitbtn = new JButton(icon11);
        submitbtn.setBounds(130, 510, 386, 30);
        submitbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(submitbtn);
        backbtn2 = new JButton(icon12);
        backbtn2.setBounds(560, 10, 49, 28);
        backbtn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(backbtn2);
        backbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Dashboard();
            }
        });
        piclabel = new JLabel(icon13);
        piclabel.setBounds(500, 100, 101, 105);
        label1.add(piclabel);
        file = new JTextField();
        file.setBackground(color);
        file.setBounds(500, 220, 100, 20);
        label1.add(file);

        open = new JButton("Open");
        open.setBackground(color);
        open.setBounds(500, 250, 100, 20);
        label1.add(open);
        cancel = new JButton("cancel");
        cancel.setBackground(color);
        cancel.setBounds(500, 280, 100, 20);
        label1.add(cancel);
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pic = new JFileChooser();
                pic.showOpenDialog(null);
                File f = pic.getSelectedFile();
                String filename = f.getAbsolutePath();
                file.setText(filename);
                Image getAbsolutePath = null;
                ImageIcon icon14 = new ImageIcon(filename);
                Image image = icon14.getImage().getScaledInstance(piclabel.getWidth(), piclabel.getHeight(), Image.SCALE_SMOOTH);
                piclabel.setIcon(new ImageIcon(image));
            }
        });
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              piclabel.setIcon(icon13);
              file.setText(null);
            }
        });
        submitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(fname==null || lname==null || add==null || con==null || bloodG==null || fname.getText().isEmpty()|| lname.getText().isEmpty()|| add.getText().isEmpty()|| con.getText().isEmpty()|| bloodG.getText().isEmpty() || !(science.isSelected() || commerce.isSelected() || arts.isSelected()) || !(male.isSelected() || female.isSelected()) || file.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please fill up all the information blanks");
                }
                else{
                    String dfname = fname.getText();
                    String dlname = lname.getText();
                    String daddress = add.getText();
                    String dblood = bloodG.getText();
                    String dgender = male.isSelected()?"Male":"Female";
                    String dgroup = science.isSelected()?"Science":commerce.isSelected()?"Commerce":"Humanities";
                    String dcontact = con.getText();
                    String ddate  = day.getSelectedItem().toString()+"-"+month.getSelectedItem().toString()+"-"+year.getSelectedItem().toString();
                    int cnt=0,cost=0;
                    ArrayList<String> courses=new ArrayList<>();
                    if(Bangla.isSelected()){cnt++;cost+=400;courses.add("Bangla");}
                    if(English.isSelected()){cnt++;cost+=600;courses.add("English");}
                    if(math.isSelected()){cnt++;cost+=1500;courses.add("Mathematics");}
                    if(Physics.isSelected()){cnt++;cost+=1500;courses.add("Physics");}
                    if(Chemistry.isSelected()){cnt++;cost+=1500;courses.add("Chemistry");}
                    if(Biology.isSelected()){cnt++;cost+=1200;courses.add("Biology");}
                    if(ict.isSelected()){cnt++;cost+=1000;courses.add("ICT");}
                    if(accounting.isSelected()){cnt++;cost+=1000;courses.add("Accounting");}
                    if(marketing.isSelected()){cnt++;cost+=900;courses.add("Marketing");}
                    if(finance.isSelected()){cnt++;cost+=900;courses.add("Finance");}
                    if(business.isSelected()){cnt++;cost+=900;courses.add("Business");}
                    if(economics.isSelected()){cnt++;cost+=1000;courses.add("Economics");}
                    if(civic.isSelected()){cnt++;cost+=600;courses.add("Civic");}
                    if(history.isSelected()){cnt++;cost+=400;courses.add("History");}
                    if(sociology.isSelected()){cnt++;cost+=500;courses.add("Sociology");}
                    if(logic.isSelected()){cnt++;cost+=400;courses.add("Logic");}
                   
                    String dcount=String.valueOf(cnt);
                    String dcost=String.valueOf(cost);
                    String dfile = file.getText();
                    String uid=getRandomString();
                    if(new DBConnect().enroll(dfname,dlname,daddress,dblood,dgender,dcontact,dgroup,ddate,dcount,dcost,dfile,uid)){
                        dispose();
                        new Payment(dcount,dcost,uid);
                        new DBConnect().enrollC(uid,courses);
                    }
                
                }
            }
        });
        
        setVisible(true);
    }
    public static String getRandomString() {
		String str = "";
		for (int i = 0; i < 8; i++) {
			str += Integer.toHexString((int) (Math.random() * 16));
		}
		return str;
	}
}
