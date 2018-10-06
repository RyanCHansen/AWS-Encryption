package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * the panel for selecting files for decryption and encryption
 * 
 * @author Ryan Hansen
 */
public class CryptoPanel extends JPanel {

	private static final long serialVersionUID = -8438576029794021570L;
	private static JPanel myButtonPanel;

	public CryptoPanel(final JFrame theJFrame) {
		super();
		this.setLayout(new BorderLayout());
		
		myButtonPanel = new CryptoButtonPanel(theJFrame);
		this.add(myButtonPanel, BorderLayout.WEST);
	}

}
