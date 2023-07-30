/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academic.task;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sawan
 */
public class Popup 
{
    public static void main(String[] args)
    {
       String Task = "SELECT * FROM tasks";
       showAlertMessage(Task);
       {
        while(true) 		   
		  {
		    LocalDate cdate = LocalDate.now();		        
                    String Date="SELECT * FROM tasks where cdate=Date";
                    
			if(Date == cdate.toString())
			{
		 	   System.out.println("Reminder for "+Task);
		        }
		        else 
		        {
                            try 
                               {
                                    Thread.sleep(86400*1000);   //pause program 
                               } 
                                catch (InterruptedException ex) 
                               {
                                    Logger.getLogger(Popup.class.getName()).log(Level.SEVERE, null, ex);
                               }
		            	   
		    	       }		    
		
		    }   
    
       }
    }

    private static void showAlertMessage(String Task) 
    {
            String msg = new String("Reminder for "+Task);
            showAlertMessage(Task);
            JFrame frame = new JFrame("While Loop");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            createUI(frame, Task);
            frame.setSize(560, 200);      
            frame.setLocationRelativeTo(null);  
            frame.setVisible(false);
    }

    private static void createUI(final JFrame frame, String Task)
    {        
	    JOptionPane.showMessageDialog(frame, Task);
    }  
}
    

