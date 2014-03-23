package com.marcneveling.main;

import java.util.LinkedList;

public class PasswordModel extends AbstractModel{
	private String password;
	private LinkedList<Character> possibleLetters;
	private LinkedList<Integer> possibleNumbers;
	private LinkedList<Character> possibleSigns;
	
	public PasswordModel(){
		super();
	}

	public String getPassword() {
		return password;
	}
	
	public LinkedList<Character> getPossibleLetters() {
		return possibleLetters;
	}
	
	public LinkedList<Integer> getPossibleNumbers() {
		return possibleNumbers;
	}
	
	public LinkedList<Character> getPossibleSigns() {
		return possibleSigns;
	}
	
	
	public void activateLetter(){
		
	}
	
	public void setPassword(String password) {
		String oldPw = this.password;
		this.password = password;
		firePropertyChange("password", oldPw, password);
	}

	public void setPossibleLetters(LinkedList<Character> possibleLetters) {
		this.possibleLetters = possibleLetters;
	}

	public void setPossibleNumbers(LinkedList<Integer> possibleNumbers) {
		this.possibleNumbers = possibleNumbers;
	}

	public void setPossibleSigns(LinkedList<Character> possibleSigns) {
		this.possibleSigns = possibleSigns;
	}
}
