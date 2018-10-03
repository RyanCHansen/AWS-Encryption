package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = -2721771454588322224L;
	private final JFileChooser myJFC = new JFileChooser();
	private final JFrame myJFrame;

	public ButtonPanel(final JFrame theJFrame) {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		myJFrame = theJFrame;
		
		fillPanel();
	}

	private void fillPanel() {
		
		//adds a layer of padding
		this.add(Box.createRigidArea(new Dimension(50, 20)));
		
		//simple lable for next button
		final JLabel labelOne = new JLabel("Select File");
		this.add(labelOne);
		
		//adds a layer of padding
		this.add(Box.createRigidArea(new Dimension(20, 5)));
		
		final JButton fileChooserButton = new JButton("File...");
        this.add(fileChooserButton);   
        fileChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
            	myJFC.setDialogTitle("Open");
                final int returnVal = myJFC.showOpenDialog(fileChooserButton);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    
                }
                
            }
        });
	}
}
