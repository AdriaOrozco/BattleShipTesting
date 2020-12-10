package BattelshipTesting;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import interfaces.IManagerIO;

/**
 * Menu class - Print and choose diferent game options
 * 
 * @author Cristian Vega
 *
 */
public class Menu {

	IManagerIO managerIO;
	JTextArea pantalla;
	MockObjGUI gui;
	public Menu(IManagerIO managerIO, MockObjGUI obj) throws InterruptedException {
		this.managerIO = managerIO;
		gui=obj;
		this.showMenu();
		getOption(managerIO);
		
	}

	/**
	 * Displays the main menu of the game
	 */
	public void showMenu() {
		pantalla=gui.getDisplay();
		pantalla.append("------Main Menu------\n");
		pantalla.append("1- Play\n");
		pantalla.append("2- Exit\n");
	}

	/**
	 * The user selects the option
	 * 
	 * @param managerIO
	 * @throws InterruptedException 
	 */
	public void getOption(IManagerIO managerIO) throws InterruptedException {

		//int option = managerIO.inInt();
		
		int option=gui.getDisplay2();
		Thread.sleep(500);
		pantalla.setText("");
		switch (option) {
			case 1:
				pantalla.append("------Starting Game------");
				new Match(this.managerIO, gui);
				break;
			case 2:
				pantalla.append("Exiting Game");
				break;
			default:
				this.showMenu();
				this.getOption(managerIO);
				break;

		}
		
	}

}
