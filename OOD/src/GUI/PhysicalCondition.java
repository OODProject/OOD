package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PhysicalCondition extends JFrame {

	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JButton back;
	private ImageIcon BACK;
	private JTextField PhysicalCondition;
	private int NUM = 0;

	public PhysicalCondition(int N) {
		super("Physical Condition");
		NUM = N;
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

		PhysicalCondition = new JTextField(
				"        Patient's Physical Condition");
		PhysicalCondition.setLocation(10, 100);
		PhysicalCondition.setSize(400, 150);
		PhysicalCondition.setBackground(Color.GRAY);
		// PhysicalCondition.setEditable(false);
		panel.add(PhysicalCondition);

		theHandler handler = new theHandler();

		back.addActionListener(handler);
		LogOut.addActionListener(handler);

	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back & NUM == 0) {
				// getActionCommand() means get the text from the location
				dispose();
				PatientProfile pf = new PatientProfile();
			} else if (event.getSource() == back & NUM == 1) {
				dispose();
				Patient p = new Patient();
			}else if (event.getSource() == back & NUM == 2) {
				dispose();
				AdminPatient a = new AdminPatient();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();
			}

		}
	}
}
