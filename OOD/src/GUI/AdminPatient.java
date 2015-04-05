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


public class AdminPatient extends JFrame {

	private JButton diseaseHistory;
	private JButton PrivateInfos;
	private JButton PhysicalCond;
	private JButton PhysicalAction;
	private ImageIcon patientImage;
	private JButton patientImag;
	private ImageIcon Logout;
	private JButton LogOut;
	private JPanel panel;
	private JLabel name;

	private JButton back;
	private ImageIcon BACK;

	public AdminPatient() {
		super("Admin");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);

		String twoLines1 = "View and Edit Patient's\nDisease History";
		diseaseHistory = new JButton("<html>" + twoLines1.replaceAll("\\n", "<br>")
				+ "</html>");
		diseaseHistory.setLocation(10, 70);
		diseaseHistory.setSize(260, 65);
		diseaseHistory.setBackground(Color.GRAY);
		panel.add(diseaseHistory);

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
		
		PhysicalAction = new JButton("View Physical Actions");
		PhysicalAction.setLocation(10, 280);
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
		diseaseHistory.addActionListener(handler);
		PrivateInfos.addActionListener(handler);
		PhysicalCond.addActionListener(handler);
	}
	
	private class theHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			// when they clicked on Username
			if (event.getSource() == back) {
				// getActionCommand() means get the text from the location
				dispose();
				Admin d=new Admin();
			} else if (event.getSource() == LogOut) {
				dispose();
				MAIN main = new MAIN();

			}else if (event.getSource() == diseaseHistory) {
				dispose();
				PHistory h = new PHistory(1);
			}
			else if (event.getSource() == PrivateInfos) {
				dispose();
				PrivateInfo pr = new PrivateInfo(2);
				
			}else if (event.getSource() == PhysicalCond) {
				dispose();
				PhysicalCondition h = new PhysicalCondition(2);
			}else if (event.getSource() == PhysicalAction) {
				dispose();
				PhysicalAct p = new PhysicalAct(3);
			}

		}
	}

}
