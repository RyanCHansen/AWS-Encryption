package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * the panel which will allow the use to login to their account.
 * 
 * @author Ryan Hansen
 */
public class LoginPanel extends JPanel {
	
	private static final long serialVersionUID = 5673445224369811603L;

	private JButton myLoginButton, myCreateAccountButton;
	private JTextField myUserTextField, myUserPasswordField;
	private JLabel myUserLabel, myPasswordLabel;

	public LoginPanel() {
		super();
		this.setLayout(null);
		
		//Creates the 'User' label and jTextField for logging in.
		//Hard-coded locations for placement on panel.
		myUserLabel = new JLabel("User");
		myUserTextField = new JTextField();
		myUserLabel.setBounds(95,59,30,22);		
		myUserTextField.setBounds(130,60,200,22);
		this.add(myUserLabel);
		this.add(myUserTextField);
		
		//Creates the 'Password' label and jTextField for logging in.
		//Hard-coded locations for placement on panel.
		myPasswordLabel = new JLabel("Password");
		myUserPasswordField = new JTextField();
		myPasswordLabel.setBounds(67,99,90,22);
		myUserPasswordField.setBounds(130,100,200,22);
		this.add(myPasswordLabel);
		this.add(myUserPasswordField);
		
		//Creates the 'Login' button and hard-codes its location
		myLoginButton = new JButton("login");
		myLoginButton.setBounds(175,140,100,30);
		this.add(myLoginButton);
		
		//Creates the 'Create Account' button and hard-codes its location
		myCreateAccountButton = new JButton("Create Account");
		myCreateAccountButton.setBounds(150,210,150,30);
		this.add(myCreateAccountButton);
	}
}
