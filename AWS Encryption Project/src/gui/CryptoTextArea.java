package gui;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextArea;

/**
 * JTextArea which will be used for giving feedback to the user on the Crypto panel.
 * 
 * @author Ryan Hansen
 */
public class CryptoTextArea extends JTextArea {

	private static final long serialVersionUID = 4102610971352163909L;
	
	public CryptoTextArea() {
		super();
		//this.setLineWrap(true);
		this.setEditable(false);
	}
	
	/**
	 * Used to add a time stamp to the text which will be printed in
	 * the JTextArea.
	 * 
	 * @param theText the text to be printed.
	 */
	public void writeToTextArea(String theText) {	
		this.append(timeFormatter() + " - " + theText + "\n");
	}
	
	
	/**
	 * simple method which returns a string of a time stamp.
	 * 
	 * @return String time stamp in (HH:mm:ss) format.
	 */
	public String timeFormatter() {
		LocalTime lt = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String theTime = lt.format(formatter);
		return theTime;
	}

}
