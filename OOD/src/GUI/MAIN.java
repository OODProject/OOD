package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Database.DB;


public class MAIN extends JFrame {

	private JButton Admin;
	private JButton Doctor;
	private JButton Patient;
	private JButton Register;
	private JPanel panel;

	public MAIN() {
		
		super(" Login As ");
		DB db=new DB();
		db.callDB();
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);
		Admin = new JButton("Admin");
		Doctor = new JButton("Doctor");
		Patient = new JButton("Patient");
		Register = new JButton("Resgister");
		Admin.setLocation(150, 150);
		Admin.setSize(200, 50);
		Admin.setBackground(Color.GRAY);
		panel.add(Admin);

		Doctor.setLocation(150, 210);
		Doctor.setSize(200, 50);
		Doctor.setBackground(Color.GRAY);
		panel.add(Doctor);

		Patient.setLocation(150, 270);
		Patient.setSize(200, 50);
		Patient.setBackground(Color.GRAY);
		panel.add(Patient);

		Register.setLocation(150, 330);
		Register.setSize(200, 50);
		Register.setBackground(Color.GRAY);
		panel.add(Register);

		theHandler handler = new theHandler();

		Admin.addActionListener(handler);
		Doctor.addActionListener(handler);
		Patient.addActionListener(handler);
		Register.addActionListener(handler);

	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == Admin) {
				// getActionCommand() means get the text from the location
				dispose();
				Health h2 = new Health(1);
			} else if (event.getSource() == Doctor) {
				dispose();
				Health h2 = new Health(2);
			} else if (event.getSource() == Patient) {
				dispose();
				Health h3 = new Health(3);
			} else if (event.getSource() == Register) {
				dispose();
				Register register = new Register();
			}

		}
	}

	public static void main(String[] args) {
		MAIN m = new MAIN();

	}
}
