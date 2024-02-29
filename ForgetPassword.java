
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ForgetPassword extends JFrame implements ActionListener {
    JTextField tfusername,tfname,tfquestion,tfanswer, tfpassword;
    JButton search,retrieve,back;
    ForgetPassword()
    {
       setBounds(350,200,800,360) ;// to create frame
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
        
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
       Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(550,60,200,200);
       add(image);
       
       JPanel p1=new JPanel();
       p1.setLayout(null);
       p1.setBounds(30,20,480,280);
        p1.setBackground(new Color(131,193,233));
       add(p1);
       
       JLabel lblusername=new JLabel("Username:");
       lblusername.setBounds(40,20,100,25);
       lblusername.setFont(new Font("Tahoma",Font.BOLD,12));
       p1.add(lblusername);
       
       tfusername=new JTextField("");
        tfusername.setBounds(152,20,200,25);
        p1.add(tfusername);
         tfusername.setBorder(BorderFactory.createEmptyBorder());
         
          JLabel lblname=new JLabel("Name:");
       lblname.setBounds(40,60,100,25);
       lblname.setFont(new Font("Tahoma",Font.BOLD,12));
       p1.add(lblname);
       
      tfname=new JTextField("");
      tfname.setBounds(152,60,200,25);
        p1.add( tfname);
          tfname.setBorder(BorderFactory.createEmptyBorder());
         
          JLabel lblquestion=new JLabel("Security Question:");
       lblquestion.setBounds(40,100,120,25);
       lblquestion.setFont(new Font("Tahoma",Font.BOLD,12));
       p1.add(lblquestion);
       
      tfquestion=new JTextField("");
      tfquestion.setBounds(152,100,200,25);
        p1.add( tfquestion);
         tfquestion.setBorder(BorderFactory.createEmptyBorder());
         
         
         JLabel lblanswer=new JLabel("Answer:");
       lblanswer.setBounds(40,140,120,25);
       lblanswer.setFont(new Font("Tahoma",Font.BOLD,12));
       p1.add(lblanswer);
       
      tfanswer=new JTextField("");
      tfanswer.setBounds(152,140,200,25);
        p1.add(tfanswer);
         tfanswer.setBorder(BorderFactory.createEmptyBorder());
          
           retrieve=new JButton("Retrieve");
        retrieve.setBackground(Color.GRAY);
         retrieve.setForeground(Color.WHITE);
         retrieve.setBounds(360,140,90,25);
          retrieve.addActionListener(this);
         p1.add(retrieve);
          
         search=new JButton("Search");
         search.setBackground(Color.GRAY);
         search.setForeground(Color.WHITE);
         search.setBounds(360,20,90,25);
         search.addActionListener(this);
         p1.add(search);
         
           JLabel lblpassword=new JLabel("Password:");
       lblpassword.setBounds(40,180,120,25);
       lblpassword.setFont(new Font("Tahoma",Font.BOLD,12));
       p1.add(lblpassword);
       
      tfpassword=new JTextField("");
       tfpassword.setBounds(152,180,200,25);
        p1.add( tfpassword);
          tfpassword.setBorder(BorderFactory.createEmptyBorder());
          
          back=new JButton("Back");
         back.setBackground(Color.GRAY);
         back.setForeground(Color.WHITE);
         back.setBounds(190,220,100,25);
          back.addActionListener(this);
         p1.add(back);
  
       setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==search)
        {
            try{
                String query="select * from account where username='"+tfusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next())
                {
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("security"));
                    
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==retrieve)
        {
            try{
                String query="select * from account where answer='"+tfanswer.getText()+"'AND username='"+tfusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next())
                {
                    tfpassword.setText(rs.getString("password"));
                  //  tfquestion.setText(rs.getString("security"));
                    
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }else 
        {
            setVisible(false);
            new Login();
            
        }
    }
    
    public static void main(String args[])
    {
        new ForgetPassword();
    }
    
}
