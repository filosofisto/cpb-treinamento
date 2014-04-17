package com.javabasico;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.javabasico.view.PrincipalFrame;

public class AppController {

	private static AppController instance = new AppController();
	private PrincipalFrame mainScreen;
	
	public static AppController app() {
		return instance;
	}
	
	public void startApplication() {
		showMainScreen();
	}
	
	public void endApplication() {
		mainScreen.dispose();
		System.exit(0);
	}
	
	public void sobre() {
		JOptionPane.showMessageDialog(
				null, 
				"Projeto Final Turma de Java - Jan/2012", 
				"Aviso", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public JFrame getMainScreen() {
		return mainScreen;
	}

	private void showMainScreen() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				mainScreen = new PrincipalFrame();
				mainScreen.setVisible(true);
			}
		});
	}
}
