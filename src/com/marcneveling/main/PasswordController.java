package com.marcneveling.main;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PasswordController {
	private PasswordModel model;
	private PasswordView view;
	
	public PasswordController(PasswordModel model){
		this.model = model;
		this.view = new PasswordView(this, model);
		this.view.init();
	}
	
	public void generate(){
		model.setPassword("" + Math.random());
	}
	
	public void copyToClipboard(){
		StringSelection stringSelection = new StringSelection(model.getPassword());
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);
	}

	public void enableLetter(char c){
		
	}
	
	public void enableNumber(int i){
		
	}
	
	public void enableSign(char c){
		
	}

	public void activateChar(char c) {
		
		
	}
}
