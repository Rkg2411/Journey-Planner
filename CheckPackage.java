
package journey.planner.system;
import javax.swing.*;
import java.awt.*;
public class CheckPackage extends JFrame {
    
    CheckPackage()
    {
        setBounds(150,40,1050,600);
     
      //  setLayout(null);
        
         String[] package1 = new String[]{"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only","package1.jpg"};
      String[] package2 = new String[]{"SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only","package2.jpg"};
      String[] package3 = new String[]{"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel","BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only","package3.jpg"};
      
        JTabbedPane tab=new JTabbedPane();
        JPanel p1=createPackage(package1);
        tab.addTab("Package 1",null,p1);
         JPanel p2=createPackage(package2);
         tab.addTab("Package 2",null,p2); 
        JPanel p3=createPackage(package3);
         tab.addTab("Package 1",null,p3);
   
        
        add(tab);
         setVisible(true);
    }
    public JPanel createPackage(String[] pack) 
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        
         
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(30,5,500,35);
        l1.setForeground(new Color(218,165,32));
        l1.setFont(new Font("Tahoma",Font.BOLD,40));
        p1.add(l1);
        
        JLabel l2=new JLabel(pack[1]);
        l2.setBounds(40,50,450,40);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l2);
        
        
         JLabel l3=new JLabel(pack[2]);
        l3.setBounds(40,100,450,40);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l3);
        
          JLabel l4=new JLabel(pack[3]);
        l4.setBounds(40,150,450,40);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l4);
          JLabel l5=new JLabel(pack[4]);
        l5.setBounds(40,200,450,40);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[5]);
        l6.setBounds(40,250,450,40);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l6);
        
        
        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(40,300,450,40);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l7);
        
         JLabel l8=new JLabel(pack[7]);
        l8.setBounds(40,350,450,40);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l8);
        
         JLabel l9=new JLabel(pack[8]);
        l9.setBounds(40,430,450,20);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l9);
        
        JLabel l10=new JLabel(pack[9]);
      l10.setBounds(100,460,450,40);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l10);
        
        JLabel l11=new JLabel(pack[10]);
     l11.setBounds(700,460,450,40);
      l11.setForeground(Color.darkGray);
      l11.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l11);
        
         ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
                Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel l12 = new JLabel(i3);
                 l12.setBounds(500,15,500,500);
                add(l12);
                
                return p1;
        
        
    }
    
    public static void main(String args[])
    {
      new CheckPackage();  
    }
}
