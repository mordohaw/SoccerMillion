package fr.will.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SmLauncher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new SmFrame();
				
			}
		});
		
	}

}
