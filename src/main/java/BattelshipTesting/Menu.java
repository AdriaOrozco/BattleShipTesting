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
	public Menu(IManagerIO managerIO, MockObjGUI obj) {
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
	 */
	public void getOption(IManagerIO managerIO) {

		int option = managerIO.inInt();
		switch (option) {
		case 1:
			System.out.print("------Starting Game------");
			new Match(this.managerIO);
			break;
		case 2:
			System.out.print("Exiting Game");
			break;
		default:
			System.out.print("Invalid Option!");
			this.showMenu();
			this.getOption(managerIO);
			break;

		}

	}

}
