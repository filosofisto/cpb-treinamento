package com.x25.logicajava.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.x25.logicajava.AppController;

public class SairActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		AppController.app().endApplication();
	}

}
