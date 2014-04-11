package com.x25.logicajava.view;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

import com.x25.logicajava.AppController;
import com.x25.logicajava.action.SairActionListener;
import com.x25.logicajava.action.ShowDialogActionListener;
import com.x25.logicajava.action.SobreActionListener;

@SuppressWarnings("serial")
public class PrincipalFrame extends JFrame implements WindowListener {

	public PrincipalFrame() {
		super("Projeto Final");

		initScreenAttr();
		initComponents();
	}

	private void initScreenAttr() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800, 600));
		setResizable(true);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	private void initComponents() {
		buildMenu();
		

		pack();
	}
	
	private void buildMenu() {
		//Cria a barra de menu
		JMenuBar menuBar = new JMenuBar();
		
		//------ Cria os menus -----------------------------
		JMenu menuSistema = new JMenu("Sistema");
		menuSistema.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menuSistema);
		
		JMenu menuTabelas = new JMenu("Tabelas");
		menuTabelas.setMnemonic(KeyEvent.VK_T);
		menuBar.add(menuTabelas);
		
		JMenu menuUtilitario = new JMenu("Utilitários");
		menuUtilitario.setMnemonic(KeyEvent.VK_U);
		menuBar.add(menuUtilitario);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menuAjuda.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menuAjuda);
		//----------------------------------------------------
		
		//Menu Sistema
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.setMnemonic(KeyEvent.VK_S);
		menuItemSair.addActionListener(new SairActionListener());
		menuSistema.add(menuItemSair);
		
		//Menu Ajuda
		JMenuItem menuItemSobre = new JMenuItem("Sobre");
		menuItemSobre.setMnemonic(KeyEvent.VK_S);
		menuItemSobre.addActionListener(new SobreActionListener());
		menuAjuda.add(menuItemSobre);
		
		//Menu Tabelas
		JMenuItem menuItemUF = new JMenuItem("Estado (UF)");
		menuItemUF.setMnemonic(KeyEvent.VK_E);
		menuItemUF.addActionListener(new ShowDialogActionListener(new EstadoFrame()));
		menuTabelas.add(menuItemUF);

		// Build the first menu.
		/*menu = new JMenu("Tabelas");
		menu.setMnemonic(KeyEvent.VK_T);
		menuBar.add(menu);

		// a group of JMenuItems
		menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,
				ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription(
				"This doesn't really do anything");
		menu.add(menuItem);

		menuItem = new JMenuItem("Both text and icon", new ImageIcon(
				"images/middle.gif"));
		menuItem.setMnemonic(KeyEvent.VK_B);
		menu.add(menuItem);

		menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menu.add(menuItem);

		// a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		rbMenuItem = new JRadioButtonMenuItem("Another one");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		// a group of check box menu items
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);

		cbMenuItem = new JCheckBoxMenuItem("Another one");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);

		// a submenu
		menu.addSeparator();
		submenu = new JMenu("A submenu");
		submenu.setMnemonic(KeyEvent.VK_S);

		menuItem = new JMenuItem("An item in the submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,
				ActionEvent.ALT_MASK));
		submenu.add(menuItem);

		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		menu.add(submenu);

		// Build second menu in the menu bar.
		menu = new JMenu("Another Menu");
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
				"This menu does nothing");
		menuBar.add(menu);*/

		this.setJMenuBar(menuBar);
	}

	@Override
	public void windowActivated(WindowEvent evt) {
		
	}

	@Override
	public void windowClosed(WindowEvent evt) {
		AppController.app().endApplication();
	}

	@Override
	public void windowClosing(WindowEvent evt) {
		AppController.app().endApplication();
	}

	@Override
	public void windowDeactivated(WindowEvent evt) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent evt) {
		
	}

	@Override
	public void windowIconified(WindowEvent evt) {
		
	}

	@Override
	public void windowOpened(WindowEvent evt) {
		
	}
}
