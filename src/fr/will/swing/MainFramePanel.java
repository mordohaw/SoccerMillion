package fr.will.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import fr.will.content.Questionnaire;

public class MainFramePanel extends GlobalPanel  {
	public MainFramePanel(){
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

				button1.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						 SmFrame Fr2 = new SmFrame();
						 Fr2.setVisible(true); // Main Form to show after the Login Form..



					}

				});


				this.add(button1);
				this.add(label1);
				this.add(textField);
				this.add(textField);
				this.add(passw);
				this.add(combobox);

	}

}
