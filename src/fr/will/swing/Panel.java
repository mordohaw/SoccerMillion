package fr.will.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	public void paintComponent(Graphics g){
		this.setBackground(Color.BLUE);
		g.drawRect(0, 0, getWidth(), getHeight());
		
		Font font = new Font("Arial",Font.ITALIC,80);
		
		try {
			Image image = ImageIO.read(new File("ressources/ucl.jpg"));
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("Soccer Million",250, 280);
		
		
	}

}
