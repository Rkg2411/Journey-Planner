
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener {
    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
   BookPackage(String username) 
   {
       this.username=username;
       setBounds(300,50,850,550);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);

       
       JLabel text=new JLabel("Book Package");
       text.setBounds(80,10,300,30);
       text.setFont(new Font("Tahoma",Font.BOLD,25));
       add(text);
       
       
        JLabel lblusername=new JLabel("Username:");
         lblusername.setBounds(30,60,150,30);
         lblusername.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblusername);
         
           labelusername=new JLabel();
         labelusername.setBounds(200,60,150,30);
      labelusername.setFont(new Font("Tahoma",Font.PLAIN,20));
         add( labelusername);
         
         JLabel lblpackage=new JLabel("Select Package:");
         lblpackage.setBounds(30,110,150,30);
     lblpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblpackage);
         
          cpackage=new Choice();
          cpackage.add("Gold Package");
          cpackage.add("Silver Package");
          cpackage.add("Bronze Package");
          cpackage.setBounds(200,120,200,30);
          add(cpackage);
          
         
         
         JLabel lblpersons=new JLabel("Total Persons:");
         lblpersons.setBounds(30,160,150,30);
    lblpersons.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblpersons);
         
           tfpersons=new JTextField("1");
           tfpersons.setBounds(200,170,200,23);
           add(tfpersons);
         
         
         JLabel lblid=new JLabel("ID:");
     lblid.setBounds(30,210,150,30);
     lblid.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblid);
         
             labelid=new JLabel();
       labelid.setBounds(200,210,150,30);
   labelid.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelid);
         
         JLabel lblnumber=new JLabel("Number:");
         lblnumber.setBounds(30,260,150,30);
  lblnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblnumber);
         
            labelnumber=new JLabel();
       labelnumber.setBounds(200,260,150,30);
   labelnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelnumber);
         
          JLabel lblphone=new JLabel("Phone:");
        lblphone.setBounds(30,310,150,30);
 lblphone.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblphone);
         
            labelphone=new JLabel();
       labelphone.setBounds(200,310,150,30);
   labelphone.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelphone);
       
         JLabel lbltotal=new JLabel("Total Price:");
        lbltotal.setBounds(30,360,150,30);
 lbltotal.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lbltotal);
         
            labelprice=new JLabel();
       labelprice.setBounds(200,360,150,30);
   labelprice.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelprice);
       
         try{
                    Conn c = new Conn();
                        String query = "select * from customer where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(query);
                       while(rs.next())
                       {
                           labelusername.setText(rs.getString("username"));
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             labelphone.setText(rs.getString("phone"));
                             
                       }
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
         
         checkprice=new JButton("Check Price");
         checkprice.setBackground(Color.BLACK);
         checkprice.setForeground(Color.WHITE);
         checkprice.setBounds(60,425,120,35);
         checkprice.addActionListener(this);
         add(checkprice);
                 
         
          bookpackage=new JButton("Book Package");
         bookpackage.setBackground(Color.BLACK);
         bookpackage.setForeground(Color.WHITE);
         bookpackage.setBounds(200,425,120,35);
          bookpackage.addActionListener(this);
         add(bookpackage);
         
          back=new JButton("Back");
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.setBounds(340,425,120,35);
         back.addActionListener(this);
         add(back);
                 
              ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
                Image i2 = i1.getImage().getScaledInstance(500,480,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel l12 = new JLabel(i3);
                 l12.setBounds(500,15,480,480);
                add(l12);
                
                 
                 
       setVisible(true);
   }
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==checkprice)
       {
          String pack=cpackage.getSelectedItem();
          int cost=0;
          if(pack.equals("Gold Package"))
          {
              cost+=12000;
          }else if(pack.equals("Silver Package"))
          {
              cost+=25000;
          }else 
          {
             cost+=32000; 
          }
          int persons=Integer.parseInt(tfpersons.getText());
          cost*=persons;
          labelprice.setText("Rs "+cost);
       }
       else if(ae.getSource()==bookpackage)
       {
           try{
               Conn c=new Conn();
               //executing sql query in next line
               c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
               JOptionPane.showMessageDialog(null,"Package Booked Successfully");
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
   public static void main(String args[])
   {
       new BookPackage("Shiv02");
   }
}
