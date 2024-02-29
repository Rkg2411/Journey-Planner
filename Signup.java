
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField tfusername,tfname,tfpassword,tfanswer;
    Choice security;
   Signup()
   {
       setBounds(350,200,800,360);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JPanel p1=new JPanel();
       p1.setBackground(new Color(133,193,233));
       p1.setBounds(0,0,450,400);
       p1.setLayout(null);
       add(p1);
       
       JLabel lblusername=new JLabel("Username:");
       lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
       lblusername.setBounds(40,40,125,25);
       p1.add(lblusername);
       
       tfusername=new JTextField();
      tfusername.setBounds(150,40,200,20);
      tfusername.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfusername);
      
       JLabel lblname=new JLabel("Name:");
       lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        lblname.setBounds(40,75,200,25);
       p1.add( lblname);
       
        tfname=new JTextField();
      tfname.setBounds(150,75,200,20);
      tfname.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfname);
      
        JLabel lblpassword=new JLabel("Password:");
       lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        lblpassword.setBounds(40,110,200,25);
       p1.add(lblpassword);
       
       tfpassword=new JTextField();
      tfpassword.setBounds(150,110,200,20);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfpassword);
      
       JLabel lblsecurity=new JLabel("Security\nQuestion:");
       lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        lblsecurity.setBounds(20,145,120,25);
       p1.add(lblsecurity);
       
       //for drop down menu
        security =new Choice();
       security.add("Fav Marvel superhero");
       security.add("Fav Teacher");
       security.add("Your Lucky number");
       security.add("your childhood superhero");
       security.setBounds(150,145,200,20);
       p1.add(security);
        
         JLabel lblanswer=new JLabel("Answer:");
       lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        lblanswer.setBounds(40,180,200,25);
       p1.add(lblanswer);
       
       tfanswer=new JTextField();
     tfanswer.setBounds(150,180,200,20);
      tfanswer.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfanswer);
       
       create =new JButton("Create");
      create.setBackground(Color.WHITE);
      create.setForeground(new Color(136,193,233));
      create.setFont(new Font("Tahoma",Font.BOLD,14));
      create.setBounds(60,230,100,30);
      create.getCursor();
      create.getBorder();
      create.addActionListener(this); //addActionListener ek method h jo click krne pe btayega ki ish button pe kuchh action perform krna h 
      p1.add(create);
      
        back =new JButton("Back");
      back.setBackground(Color.WHITE);
      back.setForeground(new Color(136,193,233));
      back.setFont(new Font("Tahoma",Font.BOLD,14));
      back.setBounds(230,230,100,30);
      back.getCursor();
      back.getBorder();
      back.addActionListener(this);
      p1.add(back);
       
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(525,50,200,200);
        add(image);
        setVisible(true);
        
   }
   public void actionPerformed(ActionEvent ae)
   {
      // kya event krna h yha likhenge
       if(ae.getSource()==create)
       {
        String username=tfusername.getText();
         String name=tfname.getText();
          String password=tfpassword.getText();
          String question =security.getSelectedItem();
           String answer=tfanswer.getText();
           String query="insert into account value('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
           try{
               Conn c=new Conn();
               c.s.executeUpdate(query);
               //to show pop up
               JOptionPane.showMessageDialog(null,"Account Created Successfully)");
                setVisible(false);
                new Login();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       else if(ae.getSource()==back)
       {
           setVisible(false);
           new Login();
       }
   }
    public static void main(String args[])
    {
        new Signup();
    }
    
}
