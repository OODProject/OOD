package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ReferenceToDoctor extends JFrame {

	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JButton back;
	private ImageIcon BACK;
	private JTextField ListOfDoctors;
	private JButton SendRequest;
	private JTextField DoctorName;

	public ReferenceToDoctor() {
		super("Reference To Doctor");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);

		Logout = new ImageIcon(getClass().getResource("L.jpg"));
		LogOut = new JButton(Logout);
		LogOut.setLocation(10, 450);
		LogOut.setSize(134, 40);
		panel.add(LogOut);

		BACK = new ImageIcon(getClass().getResource("back.jpg"));
		back = new JButton(BACK);
		back.setLocation(10, 10);
		back.setSize(95, 46);
		panel.add(back);

		ListOfDoctors = new JTextField("      List Of Doctors");
		ListOfDoctors.setLocation(10, 100);
		ListOfDoctors.setSize(200, 300);
		ListOfDoctors.setBackground(Color.GRAY);
		// PhysicalCondition.setEditable(false);
		panel.add(ListOfDoctors);

		DoctorName = new JTextField("  Enter Doctor's Name");
		DoctorName.setLocation(300, 250);
		DoctorName.setSize(160, 50);
		DoctorName.setBackground(Color.GRAY);
		// PhysicalCondition.setEditable(false);
		panel.add(DoctorName);

		SendRequest = new JButton("Send Request");
		SendRequest.setLocation(300, 310);
		SendRequest.setSize(160, 30);
		SendRequest.setBackground(Color.LIGHT_GRAY);
		// PhysicalCondition.setEditable(false);
		panel.add(SendRequest);

		theHandler handler = new theHandler();

		back.addActionListener(handler);
		LogOut.addActionListener(handler);

	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back) {
				// getActionCommand() means get the text from the location
				dispose();
				PatientProfile pf = new PatientProfile();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();
			}

		}
	}
}
