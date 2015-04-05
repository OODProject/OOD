package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PrivateInfo extends JFrame {

	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JButton back;
	private ImageIcon BACK;
	private JTextField Info;
	private int num = 0;

	public PrivateInfo(int n) {
		super("Patient's Page");
		num = n;
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

		Info = new JTextField("        Patient's Private Information");
		Info.setLocation(10, 100);
		Info.setSize(250, 250);
		Info.setBackground(Color.GRAY);
		Info.setEditable(false);
		panel.add(Info);

		theHandler handler = new theHandler();

		back.addActionListener(handler);
		LogOut.addActionListener(handler);

	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back & num == 0) {
				// getActionCommand() means get the text from the location
				dispose();
				PatientProfile pf = new PatientProfile();
			} else if (event.getSource() == back & num == 1) {
				dispose();
				Patient p = new Patient();
			}else if (event.getSource() == back & num == 2) {
				dispose();
				AdminPatient a = new AdminPatient();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();
			}

		}
	}
}
