package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class RequestingDoctor extends JFrame {

	private JTextField DoctorName;
	private JTextField DOCTORNAME;
	private JButton SendRequest;
	private JPanel panel;
	private JButton go;
	private ImageIcon GO;
	private ImageIcon Logout;
	private JButton LogOut;
	private JButton Message;
	private ImageIcon Messag;
	private JButton back;
	private ImageIcon BACK;
	private JList listOfPatient;
	private static String[] patientNames = { "Ali", "Fateme", "Javad",
			"Mohamad" };

	// private static Patient[] patient={patient.ALI}
	// name of people ...
	public RequestingDoctor() {
		super("Doctor's Page");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new BorderLayout());
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);
		DoctorName = new JTextField("         Username");
		DoctorName.setSize(150, 46);
		DoctorName.setLocation(55, 10);
		panel.add(DoctorName);

		GO = new ImageIcon(getClass().getResource("go.jpg"));
		go = new JButton(GO);
		go.setLocation(10, 10);
		go.setSize(44, 46);
		panel.add(go);

		Logout = new ImageIcon(getClass().getResource("L.jpg"));
		LogOut = new JButton(Logout);
		LogOut.setLocation(10, 440);
		LogOut.setSize(134, 40);
		panel.add(LogOut);

		BACK = new ImageIcon(getClass().getResource("back.jpg"));
		back = new JButton(BACK);
		back.setLocation(400, 10);
		back.setSize(95, 46);
		panel.add(back);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Patient p = new Patient();

			}
		});

		Messag = new ImageIcon(getClass().getResource("message.jpg"));
		Message = new JButton();
		Message.setIcon(Messag);
		Message.setLocation(330, 10);
		Message.setSize(53, 50);
		panel.add(Message);

		DOCTORNAME = new JTextField("   doctor's name");
		DOCTORNAME.setLocation(330, 250);
		DOCTORNAME.setSize(150, 40);
		DOCTORNAME.setVisible(true);
		DOCTORNAME.setBackground(Color.LIGHT_GRAY);
		panel.add(DOCTORNAME);

		SendRequest = new JButton("Send Request");
		SendRequest.setLocation(330, 300);
		SendRequest.setSize(150, 40);
		SendRequest.setVisible(true);
		SendRequest.setBackground(Color.white);
		panel.add(SendRequest);

		listOfPatient = new JList(patientNames);
		listOfPatient.setVisibleRowCount(3);
		listOfPatient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// listOfPatient.setFixedCellHeight(20);
		// listOfPatient.setFixedCellWidth(140);
		panel.add(new JScrollPane(listOfPatient));
		listOfPatient.setLocation(350, 90);
		listOfPatient.setVisible(true);

		panel.add(listOfPatient, BorderLayout.CENTER);
		listOfPatient.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent event) {
				// class patient's profile
			}
		});

		LogOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MAIN main = new MAIN();

			}
		});
	}
}
