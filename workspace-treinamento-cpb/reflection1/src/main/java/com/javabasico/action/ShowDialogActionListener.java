package com.javabasico.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class ShowDialogActionListener implements ActionListener {

	private JDialog dialog;
	
	public ShowDialogActionListener(JDialog dialog) {
		this.dialog = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		dialog.setVisible(true);
	}
}
