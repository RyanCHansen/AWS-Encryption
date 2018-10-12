package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import crypto.PWHashing;

/**
 * the panel which will allow the use to login to their account
 * and also create a new account.
 * 
 * @author Ryan Hansen
 */
public class LoginPanel extends JPanel {
	
	private static final long serialVersionUID = 5673445224369811603L;
	private static final int USERNAME_MINIMUM_LENGTH = 4;
	private static final int PASSWORD_MINIMUM_LENGTH = 6;

	private JButton myLoginButton, myCreateAccountButton;
	private JTextField myUserTextField;
	private JPasswordField myUserPasswordField;
	private JLabel myUserLabel, myPasswordLabel;
	private PWHashing myPWHash; 

	
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
		myUserPasswordField = new JPasswordField();
		myPasswordLabel.setBounds(67,99,90,22);
		myUserPasswordField.setBounds(130,100,200,22);
		this.add(myPasswordLabel);
		this.add(myUserPasswordField);
		
		//Creates the 'Login' button and hard-codes its location on panel.
		myLoginButton = new JButton("login");
		myLoginButton.setBounds(175,140,100,30);
		this.add(myLoginButton);
		
		//Creates the 'Create Account' button and hard-codes its location on panel.
		myCreateAccountButton = new JButton("Create Account");
		myCreateAccountButton.setBounds(150,210,150,30);
		this.add(myCreateAccountButton);
		
		
		//action listener for the 'Login' button.
		myLoginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				getLoginText();
			}
		});
		
		//action listener for the 'Create Account' button.
		myCreateAccountButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				createAccount();
			}
		});
	}
	
	
	/**
	 * method to get the login credentials from the user.
	 */
	private void getLoginText(){
		String enteredUsername = myUserTextField.getText();
		String enteredPassword = new String(myUserPasswordField.getPassword());
		Boolean correctAccountInfo = false;
		
		//checks to see if the username and password entered at least meet
		//the basic length requirements during account creation. If they 
		//don't pass no attempt of contacting the database is made.
		if (enteredUsername.length() < USERNAME_MINIMUM_LENGTH
				|| enteredPassword.length() < PASSWORD_MINIMUM_LENGTH) {
			JOptionPane.showMessageDialog(this, "Invalid username or password");
		}
		else {
			correctAccountInfo = true;
		}
		
		//if the account information passes the initial screening process pass
		//the information to the class which will try to login with these credentials.
		if (correctAccountInfo == true) {
			myPWHash = new PWHashing();
			myPWHash.hashThePW(enteredPassword);
		}	
	}
	
	
	/**
	 * Method to get new account information from the user.
	 */
	private void createAccount() {
		JTextField createAccountTextField1 = new JTextField();
		JPasswordField createAccountTextField2 = new JPasswordField();
		JPasswordField createAccountTextField3 = new JPasswordField();
		String chosenUsername = "";
		String chosenPW = "";
		String verifiedPW = "";
		Boolean correctAccountInfo = false;

		Object[] message = {
			    "Choose Username", createAccountTextField1,
			    "Choose Password", createAccountTextField2,
			    "Re-enter Password", createAccountTextField3,
		};
		
		//creates the pop-up form for entering new account username and password.
		int option = JOptionPane.showConfirmDialog(this, message, "Create Account",
				JOptionPane.OK_CANCEL_OPTION);
		
		if (option == JOptionPane.OK_OPTION) {
		    chosenUsername = createAccountTextField1.getText();
		    chosenPW = new String(createAccountTextField2.getPassword());
		    verifiedPW = new String(createAccountTextField3.getPassword());

		    //These statements check to see if the passwords and username are both at 
		    //least minimum length and if the passwords entered match. If they don't
			//pass no attempt of contacting the database is made.
		    if (chosenUsername.length() < USERNAME_MINIMUM_LENGTH) {
		    	JOptionPane.showMessageDialog(this, "Username must have a length of at least 4");
		    }
		    else if (chosenPW.length() < PASSWORD_MINIMUM_LENGTH) {
				JOptionPane.showMessageDialog(this, "Password must have a length of at least 6");
			}
			else if (!chosenPW.equals(verifiedPW)) {
				JOptionPane.showMessageDialog(this, "Passwords do not match");
			}
			else {
				//new account information passed initial screening process.
				correctAccountInfo = true;
			}
		}
		
		//if the new account information passes the initial screening process
		//pass the information to the class which will try to create the new account.
		if (correctAccountInfo == true) {
			System.out.println("call create account");
		}
	}
	
}
