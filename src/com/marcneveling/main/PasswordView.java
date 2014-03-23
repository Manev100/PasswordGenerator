package com.marcneveling.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PasswordView extends JFrame implements PropertyChangeListener{
	private PasswordController controller;
	private PasswordModel model;
	private JTextField pwField;
	
	
	public PasswordView(PasswordController passwordController, PasswordModel model){
		super("Password generator");
		this.model = model;
		this.controller = passwordController;
		model.addPropertyChangeListener(this);
		
	}

	public void init(){
		setSize(600, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGui();
		setVisible(true);
		
	}
	
	private void buildGui() {
		JPanel contentPanel = new JPanel();
		
		pwField = new JTextField(20);
		pwField.setEditable(false);
		contentPanel.add(pwField);
		
		JButton generate = new JButton("Generate!");
		generate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.generate();
			}
		});
		contentPanel.add(generate);
		
		JButton copy = new JButton("Copy");
		copy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.copyToClipboard();
			}
		});
		contentPanel.add(copy);
		
		
		
		setContentPane(contentPanel);
	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if(e.getPropertyName().equals("password")){
			pwField.setText(model.getPassword());
		}
	}
}
