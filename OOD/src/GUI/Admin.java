package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Admin extends JFrame {

	private JButton DOCTOR;
	private JButton PATIENT;
	private JButton DRUGSTORE;
	private ImageIcon membership;
	private JButton MEMBERSHIP;
	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JLabel MemReq;

	public Admin() {
		super("Admin Page");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);

		DOCTOR = new JButton("doctors");
		DOCTOR.setLocation(10, 150);
		DOCTOR.setSize(260, 65);
		DOCTOR.setBackground(Color.GRAY);
		panel.add(DOCTOR);

		PATIENT = new JButton("patients");
		PATIENT.setLocation(10, 225);
		PATIENT.setSize(260, 65);
		PATIENT.setBackground(Color.GRAY);
		panel.add(PATIENT);

		DRUGSTORE = new JButton("drug stores");
		DRUGSTORE.setLocation(10, 300);
		DRUGSTORE.setSize(260, 65);
		DRUGSTORE.setBackground(Color.GRAY);
		panel.add(DRUGSTORE);

		Logout = new ImageIcon(getClass().getResource("L.jpg"));
		LogOut = new JButton(Logout);
		LogOut.setLocation(10, 450);
		LogOut.setSize(134, 40);
		panel.add(LogOut);

		membership = new ImageIcon(getClass().getResource("membership.jpg"));
		MEMBERSHIP = new JButton(membership);
		MEMBERSHIP.setLocation(10, 10);
		MEMBERSHIP.setSize(65, 62);
		MEMBERSHIP.setBorderPainted(false);
		panel.add(MEMBERSHIP);

		MemReq = new JLabel("Membership Request", SwingConstants.CENTER);
		MemReq.setLocation(110, 10);
		MemReq.setSize(150, 62);
		panel.add(MemReq);

		theHandler handler = new theHandler();

		LogOut.addActionListener(handler);
		DOCTOR.addActionListener(handler);
		PATIENT.addActionListener(handler);
		DRUGSTORE.addActionListener(handler);
	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();

			} else if (event.getSource() == DOCTOR) {
				dispose();
				AdminSearchDoctors ap = new AdminSearchDoctors();
			} else if (event.getSource() == PATIENT) {
				dispose();
				AdminSearchPatient ap = new AdminSearchPatient();
			} else if (event.getSource() == DRUGSTORE) {
				dispose();
				AdminSearchDrugStores ad = new AdminSearchDrugStores();
			}

		}
	}

}
