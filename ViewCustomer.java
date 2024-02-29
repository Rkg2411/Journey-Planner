
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewCustomer extends JFrame implements ActionListener{
    JButton back;
    ViewCustomer(String  username)
    {
         setBounds(350,80,925,530);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
         
         JLabel lblusername=new JLabel("Username:");
         lblusername.setBounds(30,40,150,25);
         lblusername.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblusername);
         
           JLabel labelusername=new JLabel();
         labelusername.setBounds(220,40,150,25);
      labelusername.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( labelusername);
         
         JLabel lblid=new JLabel("Identity Proof:");
         lblid.setBounds(30,100,150,25);
         lblid.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblid);
         
           JLabel labelid=new JLabel();
        labelid.setBounds(220,100,150,25);
    labelid.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelid);
         
         
         JLabel lblnumber=new JLabel("Number:");
         lblnumber.setBounds(30,160,150,25);
      lblnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( lblnumber);
         
           JLabel  labelnumber=new JLabel();
       labelnumber.setBounds(220,160,150,25);
   labelnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( labelnumber);
         
         
         JLabel lblname=new JLabel("Name:");
     lblname.setBounds(30,220,150,25);
      lblname.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( lblname);
         
           JLabel  labelname=new JLabel();
       labelname.setBounds(220,220,150,25);
   labelname.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( labelname);
         
         JLabel lblgender=new JLabel("Gender:");
         lblgender.setBounds(30,280,150,25);
      lblgender.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( lblgender);
         
           JLabel  labelgender=new JLabel();
       labelgender.setBounds(220,280,150,25);
   labelgender.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( labelgender);
         
         
         JLabel lblcountry=new JLabel("Country:");
         lblcountry.setBounds(500,40,150,25);
      lblcountry.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( lblcountry);
         
           JLabel  labelcountry=new JLabel();
        labelcountry.setBounds(670,40,150,25);
    labelcountry.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelcountry);
         
         JLabel lbladdress=new JLabel("Address:");
          lbladdress.setBounds(500,100,150,25);
       lbladdress.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lbladdress);
         
           JLabel  labeladdress=new JLabel();
         labeladdress.setBounds(670,100,150,25);
     labeladdress.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( labeladdress);
         
         JLabel lblphone=new JLabel("Contact No:");
         lblphone.setBounds(500,160,150,25);
      lblphone.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( lblphone);
         
           JLabel  labelphone=new JLabel();
        labelphone.setBounds(670,160,150,25);
    labelphone.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelphone);
         
         
         JLabel lblemail=new JLabel("Email ID:");
         lblemail.setBounds(500,220,150,25);
      lblemail.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( lblemail);
         
           JLabel  labelemail=new JLabel();
        labelemail.setBounds(670,220,250,25);
    labelemail.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelemail);
           back=new JButton("Back");
           back.setBackground(Color.BLACK);
           back.setForeground(Color.WHITE);
           back.setBounds(500,280,100,25);
           back.addActionListener(this);
           add(back);
           
           
          ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i2 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel image = new JLabel(i3);
                image.setBounds(0,315,560,200);
                add(image);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel image2 = new JLabel(i6);
               image2.setBounds(560,315,600,200);
                add(image2);
                
                 try{
                    Conn c = new Conn();
                        String query = "select * from customer where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(query);
                       while(rs.next())
                       {
                           labelusername.setText(rs.getString("username"));
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             labelname.setText(rs.getString("name"));
                             labelgender.setText(rs.getString("gender"));
                             labelcountry.setText(rs.getString("country"));
                             labeladdress.setText(rs.getString("address"));
                             labelphone.setText(rs.getString("phone"));
                             labelemail.setText(rs.getString("email"));
                       }
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
               
         
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
      setVisible(false);  
    }
    public static void main(String args[])
            {
              new ViewCustomer("Shiv02"); 
                
            }
            
}
