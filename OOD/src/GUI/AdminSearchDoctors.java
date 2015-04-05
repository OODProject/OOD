package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class AdminSearchDoctors extends JFrame {

	private JTextField PatientName;
	private JPanel panel;
	private JButton go;
	private ImageIcon GO;
	private ImageIcon Logout;
	private JButton LogOut;
	private JButton alaki;
	private JList listOfPatient;
	private JButton back;
	private ImageIcon BACK;
	private static String[] patientNames = { "Ali", "Fateme", "Javad",
			"Mohamad" };

	// private static Patient[] patient={patient.ALI}
	// name of people ...

	public AdminSearchDoctors() {
		super("Admin");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new BorderLayout());
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);
		PatientName = new JTextField("         Username");
		PatientName.setSize(150, 46);
		PatientName.setLocation(55, 10);
		panel.add(PatientName);

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

		listOfPatient = new JList(patientNames);
		listOfPatient.setVisibleRowCount(3);
		listOfPatient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
		BACK = new ImageIcon(getClass().getResource("back.jpg"));
		back = new JButton(BACK);
		back.setLocation(400, 10);
		back.setSize(95, 46);
		panel.add(back);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
					Admin d = new Admin();
			}
		});
		// /////////// alaki ////
		alaki = new JButton("list of patient");
		alaki.setLocation(10, 200);
		alaki.setSize(150, 46);
		panel.add(alaki);
		alaki.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AdminDoctor ad=new AdminDoctor();

			}
		});
		// ////////////////////////

		LogOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			MAIN main=new MAIN();

			}
		});
	}

}
