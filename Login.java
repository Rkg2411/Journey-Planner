package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton login,signup,password;
    JTextField tfusername,tfpassword;
    Login()
    {
//        setSize(800,400);
//        setLocation(300,200);
        setBounds(350,200,800,360);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
     //   p1.setForeground(Color.black);
        p1.setBounds(0,0,350,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,50,200,200);
        p1.add(image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(350,20,400, 280);
        add(p2);
        
        JLabel lblusername=new JLabel("Username:");
        lblusername.setBounds(60,35,120,20);
        p2.add(lblusername);
        lblusername.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        
          tfusername=new JTextField();
      tfusername.setBounds(60,65,250,30);
      tfusername.setBorder(BorderFactory.createEmptyBorder());
      p2.add(tfusername);
        
         JLabel lblpassword=new JLabel("Password:");
        lblpassword.setBounds(60,110,120,30);
        lblpassword.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(lblpassword);
        
         tfpassword=new JTextField();
      tfpassword.setBounds(60,140,250,30);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
      p2.add(tfpassword);
       
       login=new JButton("Login");
      login.setBounds(60,190,130,30);
      login.setBackground(new Color(133,193,233));
      login.setForeground(Color.WHITE);
      login.setBorder(BorderFactory.createEmptyBorder());
      login.addActionListener(this);
      p2.add(login);
      
       signup=new JButton("Signup");
      signup.setBounds(220,190,130,30);
      signup.setBackground(new Color(133,193,233));
      signup.setForeground(Color.WHITE);
      signup.setBorder(BorderFactory.createEmptyBorder());
      signup.addActionListener(this);
      p2.add(signup);
       
      password=new JButton("Forgot password");
     password.setBounds(130,240,130,30);
     password.setBackground(new Color(133,193,233));
      password.setForeground(Color.WHITE);
      password.setBorder(BorderFactory.createEmptyBorder());
      password.addActionListener(this);
      p2.add(password);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
            try{
                String username=tfusername.getText();
                String pass=tfpassword.getText();
                
                String query="select * from account where username='"+username+"'AND password='"+pass+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Loading(username);
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }
                
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new Signup();
        }
        else
        {
            setVisible(false);
            new ForgetPassword();
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
        