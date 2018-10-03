package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main JPanel class which will reside inside the main JFrame. This panel
 * will contain all other JPanels for the application.
 * 
 * @author Ryan Hansen
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = -8438576029794021570L;
	private final JFrame myJFrame;

	public MainPanel(final JFrame theJFrame) {
		super();
		myJFrame = theJFrame;
		
		this.setLayout(new BorderLayout());
		
		final JPanel buttonPanel = new ButtonPanel(myJFrame);
		this.add(buttonPanel, BorderLayout.WEST);
	}



}
