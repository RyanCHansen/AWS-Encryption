package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import crypto.FileEncrypt;

/**
 * Button panel which contains an assortment of JButtons for selecting the
 * files for encryption and decryption.
 * 
 * @author Ryan Hansen
 */
public class CryptoButtonPanel extends JPanel {

	private static final long serialVersionUID = -2721771454588322224L;
	private JFileChooser myJFC;
	private CryptoTextArea myTextArea;
	private FileEncrypt myEncryptClass;
	private JButton myFileChooserButton, myEncryptionButton, myDecryptionButton;
	private File mySelectedFile, mySaveFileLocation;

	public CryptoButtonPanel(CryptoTextArea theTextArea) {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		myTextArea = theTextArea;

		//Creates button and adds a spacer right after.
		myFileChooserButton = new JButton("Select File");
		this.add(myFileChooserButton);
		this.add(Box.createRigidArea(new Dimension(10, 0)));
		
		//Creates button and adds a spacer right after.
		myEncryptionButton = new JButton("Encrypt");
		this.add(myEncryptionButton);
		this.add(Box.createRigidArea(new Dimension(10, 0)));
		
		myDecryptionButton = new JButton("Decrypt");
		this.add(myDecryptionButton);
		
		
		//action listener for the file chooser button.
		myFileChooserButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				myJFC = new JFileChooser(System.getProperty("user.home") + "\\Desktop");
				myJFC.setDialogTitle("File Selection");
				final int returnVal = myJFC.showOpenDialog(myFileChooserButton);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					
					mySelectedFile = myJFC.getSelectedFile();
					myTextArea.writeToTextArea("File Selected : " + mySelectedFile.toString());
				}
			}
		});
		
		//action listener for the encrypt button.
		myEncryptionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				myJFC = new JFileChooser(System.getProperty("user.home") + "\\Desktop");
				myJFC.setDialogTitle("Save Encrypted File as...");
				final int returnVal = myJFC.showSaveDialog(myEncryptionButton);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					
					mySaveFileLocation = myJFC.getSelectedFile();						
					String pw = (String)JOptionPane.showInputDialog("Pick a Password for the file");
			
					myEncryptClass = new FileEncrypt();
					try {
						myEncryptClass.encryptFile(mySelectedFile, mySaveFileLocation, pw);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
	}
	
}
