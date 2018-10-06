package gui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;

/**
 * Creates the JFrame for the application which will be the container of
 * the panel tabs.
 * 
 * @author Ryan Hansen
 */
public class GUI {

	private static final Dimension DEFAULT_SIZE = new Dimension(500, 400);
	private static JFrame myFrame = new JFrame("AWS Project");
	private static JMenuBar myMenuBar;
	private static JTabbedPane myTabbedPanes;

	public void start() {
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setPreferredSize(DEFAULT_SIZE);

		myMenuBar = new MenuBar();		
		myTabbedPanes = new TabbedPanes(myFrame);

		myFrame.setJMenuBar(myMenuBar);
		myFrame.add(myTabbedPanes);
		
		myFrame.pack();
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
	}

}
