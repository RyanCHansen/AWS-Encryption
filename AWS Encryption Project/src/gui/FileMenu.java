package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * File menu which is placed inside the MenuBar.
 * 
 * @author Ryan Hansen
 */
public class FileMenu extends JMenu {

	private static final long serialVersionUID = 4163657867326062798L;
	private JMenuItem myExitItem;
	private JMenuItem myAboutItem;

	
	public FileMenu() {
		super("File");
		this.setMnemonic(KeyEvent.VK_F);

		myExitItem = new JMenuItem("Exit", KeyEvent.VK_X);
		myExitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				System.exit(0);
			}
		});
		add(myExitItem);
		
		myAboutItem = new JMenuItem("About", KeyEvent.VK_A);
		myAboutItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent theEvent) {
				JOptionPane.showMessageDialog(null, "Created by Ryan Hansen\nVersion - 0.1",
						"About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		add(myAboutItem);
	}

}
