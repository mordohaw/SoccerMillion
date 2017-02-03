package fr.will.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SmFrame extends Frame {

	public SmFrame() {
		super("Soccer Million");
		this.add(new MainFramePanel());
		JButton button1 = new JButton("First button");
		this.add(button1);

	}

}
