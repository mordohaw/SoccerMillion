package fr.will.swing;

import javax.swing.JFrame;

public abstract class Frame extends JFrame {

	public Frame(String title){
		setTitle(title);
		setSize(1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
