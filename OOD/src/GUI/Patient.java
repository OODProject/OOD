package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Patient extends JFrame {

	private JButton History;
	private JButton PhysicalAction;
	private JButton PersonalInformation;
	private JButton PhysicalCondition;
	private JButton RequestDoctor;
	private JButton Message;
	private ImageIcon Messag;
	private ImageIcon patientImage;
	private JButton patientImag;
	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JLabel name;

	public Patient() {
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

		PhysicalCondition = new JButton("Physical Condition");
		PhysicalCondition.setLocation(10, 170);
		PhysicalCondition.setSize(231, 30);
		PhysicalCondition.setBackground(Color.GRAY);
		panel.add(PhysicalCondition);

		PersonalInformation = new JButton("Personal Information");
		PersonalInformation.setLocation(10, 210);
		PersonalInformation.setSize(231, 30);
		PersonalInformation.setBackground(Color.GRAY);
		panel.add(PersonalInformation);

		History = new JButton("History");
		History.setLocation(10, 250);
		History.setSize(231, 30);
		History.setBackground(Color.GRAY);
		panel.add(History);

		PhysicalAction = new JButton("View/Record Physical Action");
		PhysicalAction.setLocation(10, 290);
		PhysicalAction.setSize(231, 30);
		PhysicalAction.setBackground(Color.GRAY);
		panel.add(PhysicalAction);

		RequestDoctor = new JButton("Request/Change Doctor");
		RequestDoctor.setLocation(10, 330);
		RequestDoctor.setSize(231, 30);
		RequestDoctor.setBackground(Color.GRAY);
		panel.add(RequestDoctor);

		Messag = new ImageIcon(getClass().getResource("message.jpg"));
		Message = new JButton();
		Message.setIcon(Messag);
		Message.setLocation(10, 10);
		Message.setSize(53, 50);
		Message.setBackground(Color.GRAY);
		panel.add(Message);

		Logout = new ImageIcon(getClass().getResource("L.jpg"));
		LogOut = new JButton(Logout);
		LogOut.setLocation(10, 450);
		LogOut.setSize(134, 40);
		panel.add(LogOut);

		patientImage = new ImageIcon(getClass().getResource("p.jpg"));
		patientImag = new JButton(patientImage);
		patientImag.setLocation(300, 100);
		patientImag.setSize(150, 150);
		patientImag.setBorderPainted(false);
		panel.add(patientImag);

		name = new JLabel("Patient's Name", SwingConstants.CENTER);
		name.setLocation(300, 230);
		name.setSize(150, 150);
		panel.add(name);

		theHandler handler = new theHandler();

		History.addActionListener(handler);
		LogOut.addActionListener(handler);
		PhysicalAction.addActionListener(handler);
		PersonalInformation.addActionListener(handler);
		RequestDoctor.addActionListener(handler);
		PhysicalCondition.addActionListener(handler);
	}

	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == History) {
				// getActionCommand() means get the text from the location
				dispose();
				PHistory ph = new PHistory(0);
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();
				// getActionCommand()
			} else if (event.getSource() == PersonalInformation) {
				dispose();
				PrivateInfo pi = new PrivateInfo(1);
				// getActionCommand()
			} else if (event.getSource() == PhysicalCondition) {
				dispose();
				PhysicalCondition pc = new PhysicalCondition(1);
				// getActionCommand()
			}else if (event.getSource() == RequestDoctor) {
				dispose();
				RequestingDoctor pc = new RequestingDoctor();
				// getActionCommand()
			}else if (event.getSource() == PhysicalAction) {
				dispose();
				PhysicalAct pc = new PhysicalAct(2);
				// getActionCommand()
			}
			
		}
	}

}
