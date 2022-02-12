
package coachingcentremanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
public class regPage extends JFrame{
    ImageIcon icon = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\regBackground.png");
    ImageIcon icon2 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\btnsubmit.png");
    ImageIcon icon3 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\backbtn.png");
    ImageIcon icon4 = new ImageIcon("G:\\5th semester\\Java\\CoachingCentreManagement\\src\\Coaching centre management pictures\\crossbtn.png");
    JLabel label1 = new JLabel(icon);
    Color color = new Color(204,225,215);
    JButton btnsubmit,backbtn,crossbtn;
    JTextField txtname,txtmail,txtcon,txtadd,txtpass,txtconpass;
    public regPage(){
        setSize(700, 600);
        setLayout(null);
        label1.setBounds(0, 0, 700, 600);
        add(label1);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Coaching Centre Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtname = new JTextField();
        txtname.setBackground(color);
        txtname.setBounds(170,60,382,27);
        label1.add(txtname);
        txtmail = new JTextField();
        txtmail.setBackground(color);
        txtmail.setBounds(170,140,382,27);
        label1.add(txtmail);
        txtcon = new JTextField();
        txtcon.setBackground(color);
        txtcon.setBounds(170,220,382,27);
        label1.add(txtcon);
        txtadd = new JTextField();
        txtadd.setBackground(color);
        txtadd.setBounds(170,300,382,27);
        label1.add(txtadd);
        txtpass = new JTextField();
        txtpass.setBackground(color);
        txtpass.setBounds(170,385,382,27);
        label1.add(txtpass);
        txtconpass = new JTextField();
        txtconpass.setBackground(color);
        txtconpass.setBounds(170,465,382,27);
        label1.add(txtconpass);
        btnsubmit = new JButton(icon2);
        btnsubmit.setBounds(170,510,382,27);
        btnsubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(btnsubmit);
        backbtn = new JButton(icon3);
        backbtn.setBounds(560,10,49,28);
        backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label1.add(backbtn);
//        crossbtn = new JButton(icon4);
//        crossbtn.setBounds(620,10,41,23);
//        crossbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        label1.add(crossbtn);
        btnsubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               String user_name = txtname.getText();
               String email = txtmail.getText();
               String mobile = txtcon.getText();
               String address = txtadd.getText();
               String password = txtpass.getText();
               String confirmPass = txtconpass.getText();
               
            String usernameRegEx = "[a-zA-Z_ ]+";
            String emailRegEx = "[a-z0-9_]+@(gmail|outlook|yahoo)\\.com";
            String mobileRegEx = "(\\+88)?-?01\\d{9}";
            String passRegEx = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{6,20}";
            
            if(!Pattern.matches(usernameRegEx,user_name)){
                JOptionPane.showMessageDialog(null, "Invalid User Name\n");
            }
            else if(!Pattern.matches(emailRegEx,email)){
                JOptionPane.showMessageDialog(null, "Invalid Email\n");
            }
            else if(!Pattern.matches(mobileRegEx,mobile)){
                JOptionPane.showMessageDialog(null, "Invalid Contact Number\n");
            }
            else if(!Pattern.matches(passRegEx,password)){
                JOptionPane.showMessageDialog(null, "Wants a strong password\n");
            }
            else if(!password.equals(confirmPass)){
                JOptionPane.showMessageDialog(null, "Check the password\n");
            }
            else
            {
                String insertQuery = "INSERT INTO `registration`(`Name`, `Email`, `Contact`, `Pass`, `Address`) VALUES ('"+user_name+"','"+email+"','"+mobile+"','"+password+"','"+address+"')";
                DBConnect db = new DBConnect();
                db.InsertRegister(insertQuery);
            }
            }
    });
        backbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new LoginPage();
            }
        });
        setVisible(true);
    }
}
