package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Button panel which contains an assortment of JButtons and corresponding
 * JLabels for accomplishing various tasks for the program.
 * 
 * @author Ryan Hansen
 */
public class CryptoButtonPanel extends JPanel {

	private static final long serialVersionUID = -2721771454588322224L;
	private static final JFileChooser myJFC = new JFileChooser("C:\\Users\\RyanC\\Desktop");
	private static JFrame myJFrame;
	private static JLabel mySelectFileLabel = new JLabel("Select File");
	private static JLabel mySelectedFileLabel = new JLabel("File Selected:");
	private static JLabel myChosenFileLabel = new JLabel();
	private static JButton myFileChooserButton;

	public CryptoButtonPanel(final JFrame theJFrame) {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		myJFrame = theJFrame;

		//adds a layer of padding and a Label for the button.
		this.add(Box.createRigidArea(new Dimension(50, 20)));
		this.add(mySelectFileLabel);

		//adds a layer of padding before and after the file chooser button.
		this.add(Box.createRigidArea(new Dimension(20, 5)));
		myFileChooserButton = new JButton("File...");
		this.add(myFileChooserButton);
		this.add(Box.createRigidArea(new Dimension(50, 10)));
		
		//action listener for the file chooser button.
		myFileChooserButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				myJFC.setDialogTitle("File Selection");
				final int returnVal = myJFC.showOpenDialog(myFileChooserButton);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File selectedFile = myJFC.getSelectedFile();
					displayChosenFile(selectedFile.toString());
				}
			}
		});
	}

	/**
	 * Displays the selected file from the file chooser as a label.
	 * 
	 * @param theFile String representation of the chosen file
	 */
	void displayChosenFile(String theFile) {
		myChosenFileLabel.setText(theFile);
		
		//if : <=5 add the new label to the panel.
		//else : reset the text to the newest selected file.
		if (this.getComponentCount() <= 5) {
			this.add(mySelectedFileLabel);
			this.add(myChosenFileLabel);
		} else {
			myChosenFileLabel.setText(theFile);
		}	
		
		myJFrame.revalidate();
	}
	
	
}
