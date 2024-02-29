
package journey.planner.system;
import javax.swing.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener {
    Paytm()
    {
     setBounds(300,100,800,500);
     
     JEditorPane pane=new JEditorPane();
     pane.setEditable(false);
     try
     {
        pane.setPage("http://paytm.com/rent-payment");
     }catch(Exception e)
     {
       pane.setContentType("text/html");
       pane.setText("<html>Could not Load,Error 404</html>");
       
     }
        JScrollPane sp=new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back=new JButton("Back");
        back.setBounds(650,10,80,40);
        back.addActionListener(this);
        pane.add(back);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Payment();
    }
    
    public static void main(String args[])
    {
       new Paytm(); 
    }
}
