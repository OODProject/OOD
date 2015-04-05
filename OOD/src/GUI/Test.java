package GUI;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;//jframe has the equipment of file such as minimize and maximize ....
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Test extends JFrame{

	private JLabel item1;
	private JList listOfPatient;
	private static String[] patientNames = { "Ali", "Fateme", "Javad",
			"Mohamad" };
	public Test(){
		super("First Page");// the title
		//setLayout(new FlowLayout());// default layout
		item1 = new JLabel("my label!");
		item1.setToolTipText("this is gonna whow up on hover");
		add(item1);//add item1 to the window Health
		listOfPatient = new JList(patientNames);
		//	listOfPatient.setLayout(null);
			listOfPatient.setVisibleRowCount(2);
			listOfPatient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listOfPatient.setLocation(30, 90);
			listOfPatient.setVisible(true);
		
			//add(new JScrollPane(listOfPatient));
			add(listOfPatient,BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Enter your username!");
		String password = JOptionPane.showInputDialog("Enter your password!");
		int PassWord = Integer.parseInt(password);
		if (!(username.equals("fateme")) || !(PassWord == 123)) {
			JOptionPane.showMessageDialog(null,
					"your username or password is wrong", "Error",
					JOptionPane.PLAIN_MESSAGE);// (position, the message,
												// message in
												// title bar)
		}
		
		Test myWindow=new Test();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(275, 180);
		myWindow.setVisible(true);
		

	}

}
