package gui;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * the panel for selecting files for decryption and encryption
 * 
 * @author Ryan Hansen
 */
public class CryptoPanel extends JPanel {

	private static final long serialVersionUID = -8438576029794021570L;
	private JPanel myButtonPanel;
	private CryptoTextArea myTextArea;

	
	public CryptoPanel(final JFrame theJFrame) {
		super();
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createLineBorder(getBackground(), 10, false));
		
		myTextArea = new CryptoTextArea();
		this.add(myTextArea, BorderLayout.CENTER);
		
		myButtonPanel = new CryptoButtonPanel(myTextArea);
		this.add(myButtonPanel, BorderLayout.NORTH);
	}

}
