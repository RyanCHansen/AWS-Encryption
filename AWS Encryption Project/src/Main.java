import gui.GUI;

import java.awt.EventQueue;

/**
 * Project to learn/use a variety of AWS features as well as some built-in Java
 * encryption libraries.
 * 
 * Phase 1: -Establish basic GUI. -Enable encryption/decryption of .txt files
 * locally.
 * 
 * Phase 2: -Use AWS Lambda service for encryption/decryption methods. -Use AWS
 * S3 cloud storage as option for storing encrypted files.
 * 
 * Phase 3: -TBD
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
