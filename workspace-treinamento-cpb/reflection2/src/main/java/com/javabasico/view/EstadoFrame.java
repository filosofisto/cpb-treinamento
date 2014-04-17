package com.javabasico.view;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import com.javabasico.AppController;

@SuppressWarnings("serial")
public class EstadoFrame extends JDialog {

	public EstadoFrame() {
		super(AppController.app().getMainScreen());

		initScreenAttr();
		initComponents();
	}

	private void initScreenAttr() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(500, 300));
		setResizable(false);
	}

	private void initComponents() {

		pack();
	}
	
}
