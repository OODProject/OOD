package GUI;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import java.awt
public class Doctor extends JFrame {

	private JTextField PatientName;
	private JPanel panel;
	private JButton go;
	private ImageIcon GO;
	private ImageIcon Logout;
	private JButton LogOut;
	private JButton Message;
	private ImageIcon Messag;
	private JButton request;
	private ImageIcon req;
	private JButton alaki;
    private JCheckBox period;
    private JTextField from;
    private JTextField To;
    private JLabel to;
	private JList listOfPatient;
	private static String[] patientNames = { "Ali", "Fateme", "Javad",
			"Mohamad" };

	// private static Patient[] patient={patient.ALI}
	// name of people ...

	public Doctor() {
		super("Doctor");
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

		Messag = new ImageIcon(getClass().getResource("message.jpg"));
		Message = new JButton();
		Message.setIcon(Messag);
		Message.setLocation(360, 10);
		Message.setSize(53, 50);
		panel.add(Message);

		req = new ImageIcon(getClass().getResource("r.jpg"));
		request = new JButton();
		request.setIcon(req);
		request.setLocation(430, 10);
		request.setSize(53, 50);
		panel.add(request);

		period = new JCheckBox("From Date");
		period.setLocation(10, 100);
		period.setSize(100, 40);
		panel.add(period);
		period.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				if(period.isSelected()){
					
				}
			}
		});

		from = new JTextField("   /   / ");
		from.setLocation(120, 100);
		from.setSize(50, 40);
		from.setBackground(Color.lightGray);
		panel.add(from);
		
		to = new JLabel("  To");
		to.setLocation(170, 100);
		to.setSize(30, 40);
		panel.add(to);
		
		To = new JTextField("   /   / ");
		To.setLocation(200, 100);
		To.setSize(50, 40);
		To.setVisible(true);
		To.setBackground(Color.LIGHT_GRAY);
		panel.add(To);
		
		
		
		listOfPatient = new JList(patientNames);
		listOfPatient.setVisibleRowCount(3);
		listOfPatient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//listOfPatient.setFixedCellHeight(20);
		//listOfPatient.setFixedCellWidth(140);	
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
		// /////////// alaki ////
		alaki = new JButton("list of patient");
		alaki.setLocation(10, 200);
		alaki.setSize(150, 46);
		panel.add(alaki);
		alaki.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				PatientProfile pf = new PatientProfile();

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
