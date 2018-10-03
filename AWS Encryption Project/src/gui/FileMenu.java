package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * File menu which is placed inside the MenuBar.
 * 
 * @author Ryan Hansen
 */
public class FileMenu extends JMenu {

	private static final long serialVersionUID = 4163657867326062798L;

	public FileMenu() {
		super("File");
		setMnemonic(KeyEvent.VK_F);
		
		final JMenuItem miExit = new JMenuItem("Exit", KeyEvent.VK_X);
        miExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                System.exit(0);
            }         
        });
        add(miExit);
	}

}
