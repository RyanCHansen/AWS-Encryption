package gui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Tabbed pane class which will be the main container inside the JFrame.
 * Holds all of the panels for each specific task.
 * 
 * @author Ryan Hansen
 */
public class TabbedPanes extends JTabbedPane {

	private static final long serialVersionUID = 8277740541486786213L;
	private JPanel myFilePanel;

	public TabbedPanes(JFrame theJFrame) {
		super();
		myFilePanel = new CryptoPanel(theJFrame);
		this.add("Crypto Panel", myFilePanel);
		this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5, false));
			
		//temporary panels - will change/use later
		final JPanel tempPanel = new JPanel();
		final JPanel tempPanel2 = new JPanel();
		this.add("Temp Panel 1", tempPanel);
		this.add("Temp Panel 2", tempPanel2);
	}
}
