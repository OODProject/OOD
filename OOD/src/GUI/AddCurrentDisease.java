package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddCurrentDisease extends JFrame {

	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JButton back;
	private ImageIcon BACK;
	private JButton Disease;
	private JButton Prescription;
	private JButton OK;

	public AddCurrentDisease() {
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

		Disease = new JButton("Patient's new Disease");
		Disease.setLocation(10, 100);
		Disease.setSize(250, 250);
		Disease.setBackground(Color.GRAY);
		panel.add(Disease);

		Prescription = new JButton("Prescription");
		Prescription.setLocation(270, 100);
		Prescription.setSize(200, 250);
		Prescription.setBackground(Color.GRAY);
		panel.add(Prescription);

		OK = new JButton("OK");
		OK.setLocation(10, 370);
		OK.setSize(460, 50);
		OK.setBackground(Color.GRAY);
		panel.add(OK);
		
		theHandler handler = new theHandler();

		back.addActionListener(handler);
		LogOut.addActionListener(handler);
		OK.addActionListener(handler);
	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back) {
				// getActionCommand() means get the text from the location
				dispose();
				DiseaseHistory d = new DiseaseHistory();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();
			} else if (event.getSource() == OK) { // getActionCommand()
				dispose();
				DiseaseHistory d = new DiseaseHistory();

			}

		}
	}
}
