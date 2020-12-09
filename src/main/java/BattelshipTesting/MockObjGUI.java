package BattelshipTesting;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import interfaces.IManagerIO;


public class MockObjGUI extends JFrame{

	JTextArea display;
	JButton boton1;
    
	public MockObjGUI(){

		//Declaro métodos en el constructor para simplificar el código
		initDisplay();
		initBotones();
		initAcciones();
		initPantalla(); //El JFrame lo último apra que me pinte correctamente los botones
        
	}
    public JTextArea getDisplay() {return display;}
	private void initPantalla(){
        
		setTitle("Eventos");
		setSize(800,800);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
        
	}
    
	private void initDisplay(){
        
		//Propiedades y estilos del JLabel
		display = new JTextArea("");
		display.setBounds(15, 15, 195, 60);
		display.setSize(700,700);
		display.setOpaque(true);
		display.setBackground(Color.BLACK);
		display.setForeground(Color.GREEN);
		display.setBorder(new LineBorder(Color.DARK_GRAY));
		display.setFont(new Font("MONOSPACED",PLAIN,14));
		//display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFocusable(true);
		add(display);
        
		//Eventos de entrada de teclado
		display.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				String ch = String.valueOf(e.getKeyChar());
					display.setText(display.getText() + ch);  
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
            
		});
        
	}
    
	//Propiedades y estilos de los JButton
	private void initBotones(){
        
		boton1 = new JButton("Pulsa o teclea 1");
		boton1.setBounds(15,90,195,50);
		boton1.setOpaque(true);
		add(boton1);

	}
    
	//Eventos de acción de botón
	private void initAcciones(){
		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//display.setText(display.getText() + "1");
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});

	}
    
     
	public static void main(String[] args) {
		IManagerIO managerIO = new ManagerIO();
		MockObjGUI obj =new MockObjGUI();
		new Menu(managerIO, obj);
		
   
	}
    
}

