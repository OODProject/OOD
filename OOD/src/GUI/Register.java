package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Register extends JFrame {

	private JLabel Name;
	private JLabel Phone;
	private JLabel Address;
	private JLabel Profession;
	private JLabel As;
	private JLabel UserName;
	private JLabel Password;
	private JTextField TName;
	private JTextField TPhone;
	private JTextField TAddress;
	private JTextField TProfession;
	private JTextField TAs;
	private JTextField TUserName;
	private JTextField TPassword;
	private JButton back;
	private ImageIcon BACK;
	private JButton OK;

	private JPanel panel;

	public Register() {
		super("Register Page");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.pink);
		add(panel);

		BACK = new ImageIcon(getClass().getResource("back.jpg"));
		back = new JButton(BACK);
		back.setLocation(10, 10);
		back.setSize(95, 46);
		panel.add(back);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == back) {
					// getActionCommand() means get the text from the location
					MAIN main = new MAIN();
				}

			}
		});

		Name = new JLabel("Name");
		Name.setLocation(150, 60);
		Name.setSize(100, 40);
		panel.add(Name);

		Phone = new JLabel("Phone Number");
		Phone.setLocation(150, 110);
		Phone.setSize(100, 40);
		panel.add(Phone);

		Address = new JLabel("Address");
		Address.setLocation(150, 160);
		Address.setSize(100, 40);
		panel.add(Address);

		Profession = new JLabel("Profession");
		Profession.setLocation(150, 210);
		Profession.setSize(100, 40);
		panel.add(Profession);

		As = new JLabel("As");
		As.setLocation(150, 260);
		As.setSize(100, 40);
		panel.add(As);

		UserName = new JLabel("Username");
		UserName.setLocation(150, 310);
		UserName.setSize(100, 40);
		panel.add(UserName);

		Password = new JLabel("Password");
		Password.setLocation(150, 360);
		Password.setSize(100, 40);
		panel.add(Password);

		TName = new JTextField();
		TName.setLocation(270, 60);
		TName.setSize(100, 40);
		panel.add(TName);
		String name = TName.getText();

		TPhone = new JTextField();
		TPhone.setLocation(270, 110);
		TPhone.setSize(100, 40);
		panel.add(TPhone);
		String phone = TPhone.getText();

		TAddress = new JTextField();
		TAddress.setLocation(270, 160);
		TAddress.setSize(100, 40);
		panel.add(TAddress);
		String address = TAddress.getText();

		TProfession = new JTextField();
		TProfession.setLocation(270, 210);
		TProfession.setSize(100, 40);
		panel.add(TProfession);
		String profession = TProfession.getText();

		TAs = new JTextField();
		TAs.setLocation(270, 260);
		TAs.setSize(100, 40);
		panel.add(TAs);
		String as = TAs.getText();

		TUserName = new JTextField();
		TUserName.setLocation(270, 310);
		TUserName.setSize(100, 40);
		panel.add(TUserName);
		String username = TUserName.getText();

		TPassword = new JTextField();
		TPassword.setLocation(270, 360);
		TPassword.setSize(100, 40);
		panel.add(TPassword);
		String password = TPassword.getText();

		OK = new JButton("OK");
		OK.setLocation(150, 410);
		OK.setSize(220, 40);
		OK.setBackground(Color.gray);
		panel.add(OK);
		OK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
