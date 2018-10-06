package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 * Button panel which contains an assortment of JButtons and corresponding
 * JLabels for accomplishing various tasks for the program.
 * 
 * @author Ryan Hansen
 */
public class CryptoButtonPanel extends JPanel {

	private static final long serialVersionUID = -2721771454588322224L;
	private JFileChooser myJFC = new JFileChooser("C:\\Users\\RyanC\\Desktop");
	private CryptoTextArea myTextArea;
	private JButton myFileChooserButton;
	private JButton myEncryptionButton;
	private JButton myDecryptionButton;

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
				myJFC.setDialogTitle("File Selection");
				final int returnVal = myJFC.showOpenDialog(myFileChooserButton);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					
					File selectedFile = myJFC.getSelectedFile();
					myTextArea.writeToTextArea("File Selected : " + selectedFile.toString());
				}
			}
		});
		
	}
	
}
