
package journey.planner.system;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run()
    {
        try{
           for(int i=1;i<=101;i++)
           {
               int max=bar.getMaximum();//100
               int value=bar.getValue();
               if(value<max)
               {
                   bar.setValue(bar.getValue()+1);    
           }
               else{
                   setVisible(false);
                   new Dashboard(username);
               }
              Thread.sleep(50);
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    Loading(String username)
    {
        this.username=username;
        t=new Thread(this);
        setBounds(450,150,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("Journey Planner Application");
        text.setBounds(70,30,650,40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        text.setLayout(null);
        //text.setBackground(Color.RED);
        add(text);
        
        bar=new JProgressBar();
       bar.setBounds(150,100,300,35);
       bar.setStringPainted(true);
       add(bar);
       
        JLabel loading=new JLabel("Loading...Please wait...");
        loading.setBounds(220,130,200,30);
        loading.setForeground(new Color(136,193,233));
        loading.setFont(new Font("Raleway",Font.BOLD,16));
        add(loading);
        
        JLabel lblusername=new JLabel(" Welcome  "+username);
        lblusername.setBounds(30,310,400,40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblusername);
       
        setVisible(true);
        t.start();
    }
    
    public static void main(String args[])
    {
        new Loading("");
    }
    
}
