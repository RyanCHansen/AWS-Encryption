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
	private JPanel myCryptoPanel;
	private JPanel myLoginPanel;

	public TabbedPanes(JFrame theJFrame) {
		super();
		this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5, false));
		
		//adds the login panel as the first tabbed pane.
		myLoginPanel = new LoginPanel();
		this.add("Login Panel", myLoginPanel);
		
		//adds crypto panel as the second pane.
		myCryptoPanel = new CryptoPanel(theJFrame);
		this.add("Crypto Panel", myCryptoPanel);
			
		//temporary panels - will change/use later
		final JPanel tempPanel = new JPanel();
		final JPanel tempPanel2 = new JPanel();
		this.add("Temp Panel 1", tempPanel);
		this.add("Temp Panel 2", tempPanel2);
	}
}
