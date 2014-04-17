package com.javabasico.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.javabasico.AppController;

public class SobreActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		AppController.app().sobre();
	}

}
