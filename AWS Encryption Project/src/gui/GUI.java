package gui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 * Creates the JFrame for the application which will hold
 * all of the components of the GUI.
 * 
 * @author Ryan Hansen
 */
public class GUI {

	private static final Dimension DEFAULT_SIZE = new Dimension(500, 400);
	
	public void start() {
		final JFrame frame = new JFrame("AWS Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.setPreferredSize(DEFAULT_SIZE);
		
        final JMenuBar menuBar = new MenuBar();
        final JPanel mainPanel = new MainPanel(frame);
        
        frame.setJMenuBar(menuBar);
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

}
