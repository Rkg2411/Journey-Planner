
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener{
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
  UpdateCustomer(String username)
   {
       
       setBounds(350,100,900,500);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);
       
       JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
       text.setBounds(250,0,500,50);
       text.setFont(new Font("Tahoma",Font.BOLD,25));
       text.setForeground(Color.PINK);
       add(text);
       
       JLabel lblusername=new JLabel("Username");
       lblusername.setBounds(30,50,150,25);
       lblusername.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(lblusername);
       
       labelusername=new JLabel();
      labelusername.setBounds(220,50,150,25);
      labelusername.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(labelusername);
       
        JLabel lblId = new JLabel("Identity Proof :");
      lblId.setBounds(30,90, 150, 25);
         lblId.setFont(new Font("Tahoma",Font.PLAIN,20));
	add(lblId);
        
         tfid=new JTextField();
                 tfid.setBounds(220,90,150,25);
                 add(tfid);
       
                JLabel lblnumber=new JLabel("Number:");
                lblnumber.setBounds(30,130,150,25);
                lblnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lblnumber);
                 
                 tfnumber=new JTextField();
                 tfnumber.setBounds(220,130,150,25);
                 add(tfnumber);
                 
                 JLabel lblname=new JLabel("Name:");
                 lblname.setBounds(30,170,150,25);
                 lblname.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lblname);
                 
                 labelname=new JLabel();
                 labelname.setBounds(220,170,150,20);
                 labelname.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(labelname);
                 
                  JLabel lblgender=new JLabel("Gender:");
                 lblgender.setBounds(30,210,150,25);
                 lblgender.setFont(new Font("Tahoma",Font.PLAIN,20));
                  lblgender.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lblgender);
                 
                  tfgender=new JTextField();
                 tfgender.setBounds(220,210,150,25);
                 add( tfgender);
                 
                 
                  JLabel lblcountry=new JLabel("Country:");
              lblcountry.setBounds(30,250,150,25);
                lblcountry.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lblcountry);
                 
                 tfcountry=new JTextField();
                 tfcountry.setBounds(220,250,150,25);
                 add( tfcountry);
                 
                 
                  JLabel lbladdress=new JLabel("Address:");
             lbladdress.setBounds(30,290,150,25);
                lbladdress.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lbladdress);
                 
                 tfaddress=new JTextField();
                tfaddress.setBounds(220,290,150,25);
                 add(tfaddress);
                 
                 
                  JLabel lblphone=new JLabel("Contact no:");
            lblphone.setBounds(30,330,150,25);
                lblphone.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lblphone);
                 
                 tfphone=new JTextField();
              tfphone.setBounds(220,330,150,25);
                 add(tfphone);
                 
                 
                  JLabel lblemail=new JLabel("Email:");
          lblemail.setBounds(30,370,150,25);
                lblemail.setFont(new Font("Tahoma",Font.PLAIN,20));
                 add(lblemail);
                 
                 tfemail=new JTextField();
                tfemail.setBounds(220,370,150,25);
                 add(tfemail);
                 
                 add=new JButton("Update");
                 add.setBounds(60, 410, 120, 30);
                add.setBackground(Color.BLACK);
              add.setForeground(Color.WHITE);
              add.addActionListener(this);
		add(add);
              
              
                 back=new JButton("Back");
                  back.setBounds(200, 410, 120, 30);
                 back.setBackground(Color.BLACK);
              back.setForeground(Color.WHITE);
              back.addActionListener(this);
		add(back);
                
                
                 ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
                Image i3 = i1.getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel image = new JLabel(i2);
                  image.setBounds(475,20,350,450);
                add(image);
                
                 try{
                    Conn c = new Conn();
                    ResultSet rs=c.s.executeQuery("select * from customer where username ='"+username+"'");
                    while(rs.next()){
                       labelusername.setText(rs.getString("username"));  
                       labelname.setText(rs.getString("name"));
                       tfid.setText(rs.getString("id"));
                       tfnumber.setText(rs.getString("number"));
                   tfgender.setText(rs.getString("gender"));
                   tfcountry.setText(rs.getString("country"));
                       tfaddress.setText(rs.getString("address"));
                       tfphone.setText(rs.getString("phone"));
                       tfemail.setText(rs.getString("email"));
                    }
                }catch(Exception e){ }
		
                 
                 
       setVisible(true);
   }
   public void actionPerformed(ActionEvent ae)
   {
    if(ae.getSource()==add)   
    {
        String username=labelusername.getText();
        String id=tfid.getText();
        String number=tfnumber.getText();
        String name=labelname.getText();
        String gender=tfgender.getText();
        String country=tfcountry.getText();
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        
        
        try{
            Conn c=new Conn();
            String query="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
          c.s.executeUpdate(query);
          
         JOptionPane.showMessageDialog(null, "Customer Details updated Successfully");
                  setVisible(false);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    else 
    {
       setVisible(false); 
    }
   }
	public static void main(String[] args) {
		new UpdateCustomer("Shiv02");
            
	}
}

