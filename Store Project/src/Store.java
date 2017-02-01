import java.util.Scanner;
import java.util.*;
import java.awt.*;
//***********EXTREMELY IMPORTANT THEAT I HAVE THIS IF I DONT It WONT REFERENCE
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.LocalDate;
public class Store extends JFrame implements ActionListener {
	JLabel label = new JLabel("Hey " + "Enter Somethin");
	JLabel label1 = new JLabel("Enter another thing");
	JLabel label2 = new JLabel("Enter something Else");
	JLabel label3 = new JLabel("Enter Somethings");


	String month = "";
	int year = 2000;
	int day = 1;
	JTextField textfield = new JTextField();
	JTextField Daytextfield = new JTextField();

	JButton calc = new JButton("LEGGO");
	 String[] choices = { "Add Items","Search For Item", "Buy Item","Remove Item"};
	JComboBox<String> cb = new JComboBox<String>(choices);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Store();
	}
	public Store (){
		  cb.addActionListener(this); 
		  calc.addActionListener(this);
			Container c = getContentPane();
		     c.setLayout(new GridLayout(8,1));
		     calc.setForeground(Color.decode("#3399FF"));
		     label.setForeground(Color.decode("#0080FF"));
		     label.setVerticalAlignment((int) CENTER_ALIGNMENT);
		     c.add(label);
		     c.add(label1);
		     c.add(cb);
		     c.add(label2);
		     c.add(textfield);
		     c.add(label3);
		     c.add(Daytextfield);
		     c.add(calc);
		     c.setBackground(Color.decode("#FFFFFF"));
		     setTitle("HI");
		     setSize(400, 700);
		     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     setVisible(true);
		}
	public void actionPerformed(ActionEvent event)
    {
    	System.out.println("YASS");
        String command = event.getActionCommand();//returns the text on the button that was clicked 
       
    }


}
