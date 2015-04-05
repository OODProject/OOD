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


public class PatientProfile extends JFrame {

	private JButton Prescribe;
	private JButton PrivateInfos;
	private JButton PhysicalCond;
	private JButton PhysicalAction;
	private JButton Reference;
	private ImageIcon patientImage;
	private JButton patientImag;
	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JLabel name;

	private JButton back;
	private ImageIcon BACK;

	public PatientProfile() {
		super("Doctor (Patient's Profile)");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);

		String twoLines1 = "View and Edit Patient's\nDisease History and Prescribe";
		Prescribe = new JButton("<html>" + twoLines1.replaceAll("\\n", "<br>")
				+ "</html>");
		Prescribe.setLocation(10, 70);
		Prescribe.setSize(260, 65);
		Prescribe.setBackground(Color.GRAY);
		panel.add(Prescribe);

		String twoLines2 = "View Patient's Private \nInformation";
		PrivateInfos = new JButton("<html>"
				+ twoLines2.replaceAll("\\n", "<br>") + "</html>");
		PrivateInfos.setLocation(10, 140);
		PrivateInfos.setSize(260, 65);
		PrivateInfos.setBackground(Color.GRAY);
		panel.add(PrivateInfos);

		String twoLines3 = "View And Edit Patient's \n Physical Condition";
		PhysicalCond = new JButton("<html>"
				+ twoLines3.replaceAll("\\n", "<br>") + "</html>");
		PhysicalCond.setLocation(10, 210);
		PhysicalCond.setSize(260,65);
		PhysicalCond.setBackground(Color.GRAY);
		panel.add(PhysicalCond);

		String twoLines4 = "Reference To a Professional \nDoctor";
		Reference = new JButton("<html>" + twoLines4.replaceAll("\\n", "<br>")
				+ "</html>");
		Reference.setLocation(10, 280);
		Reference.setSize(260, 65);
		Reference.setBackground(Color.GRAY);
		panel.add(Reference);
		
		PhysicalAction = new JButton("View Physical Actions");
		PhysicalAction.setLocation(10, 350);
		PhysicalAction.setSize(260,65);
		PhysicalAction.setBackground(Color.GRAY);
		panel.add(PhysicalAction);


		Logout = new ImageIcon(getClass().getResource("L.jpg"));
		LogOut = new JButton(Logout);
		LogOut.setLocation(10, 450);
		LogOut.setSize(134, 40);
		panel.add(LogOut);

		patientImage = new ImageIcon(getClass().getResource("p.jpg"));
		patientImag = new JButton(patientImage);
		patientImag.setLocation(300, 70);
		patientImag.setSize(150, 150);
		patientImag.setBorderPainted(false);
		panel.add(patientImag);

		name = new JLabel("Patient's Name", SwingConstants.CENTER);
		name.setLocation(300, 230);
		name.setSize(150, 150);
		panel.add(name);

		BACK = new ImageIcon(getClass().getResource("back.jpg"));
		back = new JButton(BACK);
		back.setLocation(10, 10);
		back.setSize(95, 46);
		panel.add(back);
		
		theHandler handler = new theHandler();

		back.addActionListener(handler);
		LogOut.addActionListener(handler);
		Reference.addActionListener(handler);
		Prescribe.addActionListener(handler);
		PrivateInfos.addActionListener(handler);
		PhysicalCond.addActionListener(handler);
		PhysicalAction.addActionListener(handler);
	}
	
	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back) {
				// getActionCommand() means get the text from the location
				dispose();
				Doctor d=new Doctor();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();

			}else if (event.getSource() == Prescribe) {
				dispose();
				DiseaseHistory h = new DiseaseHistory();
			}
			else if (event.getSource() == PrivateInfos) {
				dispose();
				PrivateInfo pr = new PrivateInfo(0);
				
			}else if (event.getSource() == PhysicalCond) {
				dispose();
				PhysicalCondition h = new PhysicalCondition(0);
			}else if (event.getSource() == Reference) {
				dispose();
				ReferenceToDoctor r = new ReferenceToDoctor();
			}else if (event.getSource() == PhysicalAction) {
				dispose();
				PhysicalAct r = new PhysicalAct(1);
			}

		}
	}

}
