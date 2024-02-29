
package journey.planner.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class BookHotel extends JFrame implements ActionListener {
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
   BookHotel(String username) 
   {
       this.username=username;
       setBounds(300,50,900,575);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);

       
       JLabel text=new JLabel("Book Hotel");
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
         
         JLabel lblpackage=new JLabel("Select Hotel:");
         lblpackage.setBounds(30,100,150,30);
     lblpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblpackage);
         
          chotel=new Choice();
          chotel.setBounds(200,105,200,30);
          add(chotel);
          
          try{
              Conn c=new Conn();
              ResultSet rs=c.s.executeQuery("Select * from hotel");
              while(rs.next())
              {
                 chotel.add(rs.getString("name")); 
              }
              
          }catch(Exception e){
          e.printStackTrace();
          }
          
         
         
         JLabel lblpersons=new JLabel("Total Persons:");
         lblpersons.setBounds(30,140,150,30);
    lblpersons.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblpersons);
         
           tfpersons=new JTextField("1");
           tfpersons.setBounds(200,140,200,23);
           add(tfpersons);
           
            JLabel lbldays=new JLabel("No. of Days:");
         lbldays.setBounds(30,180,150,30);
    lbldays.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lbldays);
         
           tfdays=new JTextField("1");
           tfdays.setBounds(200,180,200,23);
           add(tfdays);
         
           
            JLabel lblac=new JLabel("AC/ Non-Ac:");
         lblac.setBounds(30,220,150,30);
    lblac.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblac);
         
          cac=new Choice();
          cac.add("AC");
           cac.add("Non-AC");
            cac.setBounds(200,220,200,30);
          add(cac);
          
          JLabel lblfood=new JLabel("Food Included:");
         lblfood.setBounds(30,260,150,30);
    lblfood.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblfood);
         
          cfood=new Choice();
          cfood.add("Yes");
           cfood.add("No");
            cfood.setBounds(200,260,200,30);
          add(cfood);
          
          
          
         JLabel lblid=new JLabel("ID:");
     lblid.setBounds(30,300,150,30);
     lblid.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblid);
         
             labelid=new JLabel();
       labelid.setBounds(200,300,150,30);
   labelid.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelid);
         
         JLabel lblnumber=new JLabel("Number:");
         lblnumber.setBounds(30,340,150,30);
  lblnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblnumber);
         
            labelnumber=new JLabel();
       labelnumber.setBounds(200,340,150,30);
   labelnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelnumber);
         
          JLabel lblphone=new JLabel("Phone:");
        lblphone.setBounds(30,380,150,30);
 lblphone.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lblphone);
         
            labelphone=new JLabel();
       labelphone.setBounds(200,380,150,30);
   labelphone.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(labelphone);
       
         JLabel lbltotal=new JLabel("Total Price:");
        lbltotal.setBounds(30,420,150,30);
 lbltotal.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(lbltotal);
         
            labelprice=new JLabel();
       labelprice.setBounds(200,420,150,30);
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
         checkprice.setBounds(60,480,120,35);
         checkprice.addActionListener(this);
         add(checkprice);
                 
         
          bookpackage=new JButton("Book Package");
         bookpackage.setBackground(Color.BLACK);
         bookpackage.setForeground(Color.WHITE);
         bookpackage.setBounds(200,480,120,35);
          bookpackage.addActionListener(this);
         add(bookpackage);
         
          back=new JButton("Back");
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.setBounds(340,480,120,35);
         back.addActionListener(this);
         add(back);
                 
              ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
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
           try{
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery("Select * from hotel where name='"+chotel.getSelectedItem()+"'");
           while(rs.next())
           {
            int cost=Integer.parseInt(rs.getString("costperperson")) ;
            int food=Integer.parseInt(rs.getString("foodincluded")) ;
            int ac=Integer.parseInt(rs.getString("acroom")) ;
            
            int persons=Integer.parseInt(tfpersons.getText());
            int days=Integer.parseInt(tfdays.getText());
            String acselected=cac.getSelectedItem();
            String foodselected=cfood.getSelectedItem();
            
           if(persons*days>0)
           {
              int total=0;
              total+=acselected.equals("AC")?ac:0;
              total+=foodselected.equals("Yes")?food:0;
              total+=cost;
              total=total*persons*days;
              labelprice.setText("Rs "+total);
           }
           else 
               
           {
               JOptionPane.showMessageDialog(null,"Please Enter a valid Number");
           }
           }
           }catch(Exception e)
           {
             e.printStackTrace();
           }
       }
       else if(ae.getSource()==bookpackage)
       {
           try{
               Conn c=new Conn();
               //executing sql query in next line
               c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
               JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
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
       new BookHotel("Shiv02");
   }
}