
package coachingcentremanagement;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public DBConnect(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coaching_centre_management_system","root","");
        st = con.createStatement();
    }catch(Exception e){
        System.out.println(e);
    }
}
    public void InsertRegister(String insertQuery){
    try{
        st.executeUpdate(insertQuery);
        JOptionPane.showMessageDialog(null,"Successfully Registered!");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Registration Failed");
    }
}
    public void checklogin(String findQuery, String mail, String pass) {
        try {
            rs = st.executeQuery(findQuery);
            boolean k = false;
            while(rs.next()){
                
                String Mail = rs.getString(2);
                String Pass = rs.getString(4);
                
                if(mail.equals(Mail) && pass.equals(Pass)){
                    k = true;
                    break;
                }
            }
            if(k){
                //JOptionPane.showMessageDialog(null, "You are LoggedIn");
                int f = 1;
                LoginPage lg = new LoginPage();
                lg.todispose(f);
                new Dashboard();
            }else{
                JOptionPane.showMessageDialog(null, "Login Failed Successfully (: ");
                new LoginPage();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    public boolean enroll(String fname,String lname,String address,String blood,String gender,String contact,String group,String date,String count,String cost,String file,String uid){
        
        file=file.replace("\\", "\\\\");
        String query = String.format("INSERT INTO registered_student_info VALUES('%s','%s','%s','%s','%s','%s','%s','%s','%s',%s,%s,'%s','not registered')",uid,fname,lname,gender,date,address,contact,blood,group,count,cost,file);
        try{
            rs=st.executeQuery("SELECT * FROM registered_student_info WHERE Contact_Number='"+contact+"';");
//            System.out.println(rs.toString());
            if(rs.next()){
//               System.out.println(rs.getString(uid));
//               System.out.println(rs.getString(contact));
//                System.out.println(rs.getString(fname));
                JOptionPane.showMessageDialog(null,"Already registered!");
                return false;
            }
            st.executeUpdate(query); 
        }catch(SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    public void enrolled(String uid){
        try{
            st.executeUpdate("UPDATE registered_student_info SET Status='registered' WHERE 'Unique_ID'='"+uid+"';");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void enrollC(String uid, ArrayList<String> courses){
        StringBuilder sb = new StringBuilder();
        for(String c:courses){
            sb.append(c+",");
        }
        sb.deleteCharAt(sb.length()-1);
        String course=sb.toString();
        try{
            String query2 = String.format("INSERT INTO Courses VALUES('%s','%s')",uid,course);
            st.executeUpdate(query2);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void stu_info(String unique){
        try{
            rs = st.executeQuery("SELECT * FROM registered_student_info WHERE Unique_ID='"+unique+"';");
            while(rs.next()){
                String duid = rs.getString("Unique_ID");
                String dfname = rs.getString("First_Name");
                String dlname = rs.getString("Last_Name");
                String dcon = rs.getString("Contact_Number");
                String dblood = rs.getString("Blood_Group");
                String dgroup = rs.getString("Subject_Group");
                String dcnt = rs.getString("Subject_Taken");
                String dpic = rs.getString("Picture");
                String dstatus = rs.getString("Status");
                String dname = dfname+" "+dlname; 
                new StudentInfo2(duid,dname,dcon,dblood,dgroup,dcnt,dpic,dstatus);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void tea_info(String id){
        try{
            rs = st.executeQuery("SELECT * FROM teachers_information WHERE ID='"+id+"';");
            while(rs.next()){
                String did = rs.getString("ID");
                String dname = rs.getString("Name");
                String dsub = rs.getString("Subject");
                String duni = rs.getString("University");
                String dpic = rs.getString("Picture");
                new Teachersinfo2(did,dname,dsub,duni,dpic);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void birthday(String id){
        try{
            rs = st.executeQuery("SELECT * FROM registered_student_info WHERE Unique_ID='"+id+"';");
            while(rs.next()){
                String dname = rs.getString("First_Name");
                String ddate = rs.getString("Date_of_Birth");
                new Birthday(dname,ddate);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void result(String id){
        try{
            rs = st.executeQuery("SELECT * FROM students_result WHERE Student_ID='"+id+"';");
            while(rs.next()){
                String dname = rs.getString("Name");
                String did = rs.getString("Student_ID");
                String dres = rs.getString("Result");
                new Result2(dname,did,dres);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void attendance(String id){
        try{
            st.executeUpdate("UPDATE students_result SET Attendance='Request pending' WHERE 'Student_ID'='"+id+"';");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
