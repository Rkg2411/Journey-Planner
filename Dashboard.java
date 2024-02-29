
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener {
    String username;
     JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage,viewhotels,destinations,bookhotel,viewbookedhotel,payments,calculator,about,deletePersonalDetails ;
        
    Dashboard(String username)
    {
        this.username=username;
      //setBounds(0,0,1600,1000);
       // if u dont know your laptop size and u wnt a frame of your screen size;
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(0,0,1366,655);
        setLayout(null);
        
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
       Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel icon=new JLabel(i3);
       icon.setBounds(5,0,70,70);
       p1.add(icon);
       
       JLabel heading=new JLabel("Dashboard");
       heading.setBounds(80,10,300,40);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
       
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        
         addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,40);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
         addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,40,300,40);
        updatePersonalDetails.setBackground(new Color(0,0,102));
       updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
         updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        
         viewPersonalDetails=new JButton(" View Personal Details");
         viewPersonalDetails.setBounds(0,80,300,40);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
         viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
         viewPersonalDetails.setMargin(new Insets(0,0,0,55));
         viewPersonalDetails.addActionListener(this);
        p2.add( viewPersonalDetails);
        
         deletePersonalDetails=new JButton("Delete Personal Details");
         deletePersonalDetails.setBounds(0,120,300,40);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
         deletePersonalDetails.setMargin(new Insets(0,0,0,35));
         deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        
         checkpackages=new JButton("Check Packages");
         checkpackages.setBounds(0,160,300,40);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
       checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
         checkpackages.setMargin(new Insets(0,0,0,95));
          checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        
         bookpackage=new JButton("Book Package");
         bookpackage.setBounds(0,200,300,40);
        bookpackage.setBackground(new Color(0,0,102));
       bookpackage.setForeground(Color.WHITE);
      bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
     bookpackage.setMargin(new Insets(0,0,0,115));
     bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
           viewpackage=new JButton("View Package");
        viewpackage.setBounds(0,240,300,40);
     viewpackage.setBackground(new Color(0,0,102));
    viewpackage.setForeground(Color.WHITE);
     viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
     viewpackage.setMargin(new Insets(0,0,0,115));
      viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
         viewhotels=new JButton("View Hotels");
       viewhotels.setBounds(0,280,300,40);
 viewhotels.setBackground(new Color(0,0,102));
viewhotels.setForeground(Color.WHITE);
  viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
 viewhotels.setMargin(new Insets(0,0,0,130));
 viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
         bookhotel=new JButton("Book Hotel");
       bookhotel.setBounds(0,320,300,40);
  bookhotel.setBackground(new Color(0,0,102));
bookhotel.setForeground(Color.WHITE);
   bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
  bookhotel.setMargin(new Insets(0,0,0,135));
   bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        
          viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,360,300,40);
  viewbookedhotel.setBackground(new Color(0,0,102));
viewbookedhotel.setForeground(Color.WHITE);
 viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
  viewbookedhotel.setMargin(new Insets(0,0,0,75));
  viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destinations=new JButton("Destinations");
        destinations.setBounds(0,400,300,40);
 destinations.setBackground(new Color(0,0,102));
destinations.setForeground(Color.WHITE);
 destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
  destinations.setMargin(new Insets(0,0,0,122));
  destinations.addActionListener(this);
        p2.add(destinations);
        
         payments=new JButton("Payments");
        payments.setBounds(0,440,300,40);
payments.setBackground(new Color(0,0,102));
payments.setForeground(Color.WHITE);
 payments.setFont(new Font("Tahoma",Font.PLAIN,20));
  payments.setMargin(new Insets(0,0,0,150));
  payments.addActionListener(this);
        p2.add(payments);
        
        
         calculator=new JButton("Calculator");
        calculator.setBounds(0,480,300,40);
 calculator.setBackground(new Color(0,0,102));
calculator.setForeground(Color.WHITE);
 calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
  calculator.setMargin(new Insets(0,0,0,145));
  calculator.addActionListener(this);
        p2.add(calculator);
        
        
         about =new JButton("About");
        about.setBounds(0,520,300,40);
  about.setBackground(new Color(0,0,102));
about.setForeground(Color.WHITE);
 about.setFont(new Font("Tahoma",Font.PLAIN,20));
   about.setMargin(new Insets(0,0,0,160));
   about.addActionListener(this);
        p2.add(about);
        
        
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5=i4.getImage().getScaledInstance(1366,800,Image.SCALE_DEFAULT);
       ImageIcon i6=new ImageIcon(i5);
       JLabel image=new JLabel(i6);
       image.setBounds(0,0,1366,800);
       add(image);
       
       
       JLabel text=new JLabel("JOURNEY PLANNER SYSTEM");
       text.setBounds(450,70,1200,70);
       text.setForeground(new Color(0,0,139));
       text.setFont(new Font("Raleway",Font.ITALIC,50));
       image.add(text);
        
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==addPersonalDetails)
     {
         new AddCustomer(username);
     }
     else if(ae.getSource()==viewPersonalDetails)
     {
         new ViewCustomer(username);
     }
     else if(ae.getSource()==updatePersonalDetails)
     {
         new UpdateCustomer(username);  
     }
     else if(ae.getSource()==checkpackages)
     {
         new CheckPackage();
    }
     else if(ae.getSource()==bookpackage)
     {
      new BookPackage(username);   
     }
     else if(ae.getSource()==viewpackage)
     {
         new ViewPackage(username);
     }
     else if(ae.getSource()==viewhotels)
     {
       new CheckHotels();  
    } 
      else if(ae.getSource()==destinations)
     {
       new Destinations();  
    } 
     else if(ae.getSource()==bookhotel)
     {
       new BookHotel(username);  
    } 
      else if(ae.getSource()==viewbookedhotel)
     {
       new ViewBookedHotel(username);  
    } 
      else if(ae.getSource()==payments)
      {
          new Payment();
      }
      else if(ae.getSource()==calculator)
      {
         try{
           Runtime .getRuntime().exec("calc.exe");
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
      }
      else if(ae.getSource()==about)
      {
          new About();
      }
      else if(ae.getSource()==deletePersonalDetails)
      {
          new DeleteDetails(username);
      }
    }
    public static void main(String args[])
    {
        new Dashboard("");
    }
}
