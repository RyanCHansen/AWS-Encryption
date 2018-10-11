import gui.GUI;

import java.awt.EventQueue;

/**
 * Project to learn/use a variety of AWS features as well as an external
 * cryptographic library.
 * 
 * @author Ryan Hansen
 * @version 0.1
 */
public class Main {

	public static void main(String[] args) {

		// Start the GUI
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GUI().start();
			}
		});
	}

}
