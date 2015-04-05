package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminDoctor extends JFrame {

	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JButton back;
	private ImageIcon BACK;
	private JTextField DoctorInfo;

	public AdminDoctor() {
		super("Admin");
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

		DoctorInfo = new JTextField("Doctor's Information");
		DoctorInfo.setLocation(100, 100);
		DoctorInfo.setSize(300, 300);
		DoctorInfo.setBackground(Color.GRAY);
		panel.add(DoctorInfo);

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
				AdminSearchDoctors asd = new AdminSearchDoctors();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();
				// getActionCommand()
			}
		}
	}
}