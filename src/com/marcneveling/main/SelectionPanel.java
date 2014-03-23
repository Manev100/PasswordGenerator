package com.marcneveling.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectionPanel extends JPanel {
	private PasswordController controller;
	private HashMap<Character, JButton> buttonsMapping;
	
	public SelectionPanel(PasswordController controller, List<Character> options){
		super();
		this.controller = controller;
		buttonsMapping = new HashMap<>();
		build(options);
	}
	private void build(List<Character> options) {
		for(Character c: options){
			JButton button = new JButton("" + c);
			buttonsMapping.put(c, button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton source = (JButton) e.getSource();
					
					controller.activateChar(source.getText().toCharArray()[0]);
				}
			});
			add(button);
		}
	}
}
