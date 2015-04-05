package GUI;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Health extends JFrame {

	private JTextField Username;
	private JPasswordField Password;
	private JButton Enter;
	private Patient patient;
	private String USERNAME = "";
	private String PASSWORD = "";
	private int ID = 0;

	public Health(int id) {

		super("login");
		ID = id;
		this.setSize(350, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		Username = new JTextField("Username");
		add(Username);

		Password = new JPasswordField("password");
		add(Password);

		theHandler handler = new theHandler();

		Enter = new JButton("Enter");
		add(Enter);

		Username.addActionListener(handler);
		Password.addActionListener(handler);
		Enter.addActionListener(handler);
	}

	// this class inherit all the crap from the outer class
	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == Username) {
				// getActionCommand() means get the text from the location
				USERNAME = String.format("field 1: %s",
						event.getActionCommand());
			} else if (event.getSource() == Password) {

				PASSWORD = String.format("password is : %s",
						event.getActionCommand());
			}else if (event.getSource() == Enter & ID == 1) { // getActionCommand()
				dispose();
				Admin admin = new Admin();

			} else if (event.getSource() == Enter & ID == 2) { // getActionCommand()
				dispose();
				Doctor doctor = new Doctor();

			} else if (event.getSource() == Enter & ID == 3) { // getActionCommand()
				dispose();
				Patient patient = new Patient();

			}

		}
	}

}
