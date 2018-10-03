package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * Menu bar for the application. Various drop-down menus will be added
 * for ease of access to specific features.
 * 
 * @author Ryan Hansen
 */
public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = -9132887326381921444L;

	public MenuBar() {
		super();
		
		final JMenu fileMenu = new FileMenu();
		add(fileMenu);
	}

}
