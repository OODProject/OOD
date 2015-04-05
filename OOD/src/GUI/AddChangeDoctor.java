package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddChangeDoctor extends JFrame {

	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JButton back;
	private ImageIcon BACK;
	private JTextField Info;
	private JButton accept;
	private JButton rejet;
	private JLabel NAME;

	public AddChangeDoctor() {
		super("Patient's Page");
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

		rejet = new JButton("Rejet");
		rejet.setLocation(190, 190);
		rejet.setSize(90, 30);
		rejet.setBackground(Color.LIGHT_GRAY);
		panel.add(rejet);

		accept = new JButton("Accept");
		accept.setLocation(290, 190);
		accept.setSize(90, 30);
		accept.setBackground(Color.LIGHT_GRAY);
		panel.add(accept);

		NAME = new JLabel("    Name");
		NAME.setLocation(80, 190);
		NAME.setSize(90, 30);
		NAME.setBackground(Color.LIGHT_GRAY);
		// NAME.setForeground(Color.LIGHT_GRAY);
		panel.add(NAME);

		Info = new JTextField("\tPatient's Information");
		Info.setLocation(80, 230);
		Info.setSize(300, 100);
		Info.setBackground(Color.LIGHT_GRAY);
		Info.setEditable(false);
		panel.add(Info);

		theHandler handler = new theHandler();

		back.addActionListener(handler);
		LogOut.addActionListener(handler);

	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back) {
				// getActionCommand() means get the text from the location
				PatientProfile pf = new PatientProfile();
			} else if (event.getSource() == LogOut) {

				MAIN main = new MAIN();
			}

		}
	}

	public static void main(String[] args) {
		AddChangeDoctor add = new AddChangeDoctor();
	}
}
