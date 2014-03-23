package com.marcneveling.main;

public class Main {
	public static void main(String[] args) {
		PasswordModel model = new PasswordModel();
		new PasswordController(model);
	}
}
