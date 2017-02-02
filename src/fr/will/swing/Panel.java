package fr.will.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import fr.will.content.*;

public class Panel extends JPanel {

	public Panel(){
		Questionnaire questionnaire1 = new Questionnaire();
				//init component
				JButton button1 = new JButton("First button");
				JLabel label1 = new JLabel("first label");
				JTextField textField = new JTextField(20);
				JPasswordField passw = new JPasswordField(20);

				JComboBox<String> combobox = new JComboBox<String>();

				for(int i=0;i<4;i++){
					combobox.addItem(questionnaire1.getAnsTabQ1(i).getContent());
				}


				this.add(button1);
				this.add(label1);
				this.add(textField);
				this.add(textField);
				this.add(passw);
				this.add(combobox);

	}
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
