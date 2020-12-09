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
	JTextArea display2;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton boton9;
	JButton boton0;
	JButton enter;
	private int valor;
	private boolean isPressed=false;
    
	public MockObjGUI(){

		//Declaro métodos en el constructor para simplificar el código
		initDisplay();
		initBotones();
		initAcciones();
		initPantalla(); //El JFrame lo último apra que me pinte correctamente los botones
        
	}
	public int getValor() {return valor;}
    public JTextArea getDisplay() {return display;}
    public boolean getPress() {return isPressed;}
    public int getDisplay2() {
    	int valor2=valor;
    	valor=0;
    	return valor2;}
	private void initPantalla(){
        
		setTitle("BattleShip");
		setSize(1200,1000);
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
		display.setSize(700,900);
		display.setOpaque(true);
		display.setBackground(Color.BLACK);
		display.setForeground(Color.GREEN);
		display.setBorder(new LineBorder(Color.DARK_GRAY));
		display.setFont(new Font("MONOSPACED",PLAIN,14));
		//display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFocusable(true);
		add(display);
		
		display2 = new JTextArea("");
		display2.setBounds(750,350,1,1);
		display2.setSize(700,600);
		display2.setOpaque(true);
		display2.setBackground(Color.BLACK);
		display2.setForeground(Color.GREEN);
		display2.setBorder(new LineBorder(Color.DARK_GRAY));
		display2.setFont(new Font("MONOSPACED",PLAIN,14));
		//display.setHorizontalAlignment(SwingConstants.RIGHT);
		display2.setFocusable(true);
		add(display2);
        
		//Eventos de entrada de teclado
		display.addKeyListener(new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
					display.setText(display.getText());  
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
            
		});
        
	}
    
	//Propiedades y estilos de los JButton
	private void initBotones(){
        
		boton1 = new JButton("1");
		boton1.setBounds(750,90,100,50);
		boton1.setOpaque(true);
		add(boton1);
		boton2 = new JButton("2");
		boton2.setBounds(870,90,100,50);
		boton2.setOpaque(true);
		add(boton2);
		boton3 = new JButton("3");
		boton3.setBounds(990,90,100,50);
		boton3.setOpaque(true);
		add(boton3);
		boton4 = new JButton("4");
		boton4.setBounds(750,150,100,50);
		boton4.setOpaque(true);
		add(boton4);
		boton5 = new JButton("5");
		boton5.setBounds(870,150,100,50);
		boton5.setOpaque(true);
		add(boton5);
		boton6 = new JButton("6");
		boton6.setBounds(990,150,100,50);
		boton6.setOpaque(true);
		add(boton6);
		boton7 = new JButton("7");
		boton7.setBounds(750,220,100,50);
		boton7.setOpaque(true);
		add(boton7);
		boton8 = new JButton("8");
		boton8.setBounds(870,220,100,50);
		boton8.setOpaque(true);
		add(boton8);
		boton9 = new JButton("9");
		boton9.setBounds(990,220,100,50);
		boton9.setOpaque(true);
		add(boton9);
		boton0 = new JButton("0");
		boton0.setBounds(800,290,100,50);
		boton0.setOpaque(true);
		add(boton0);
		enter = new JButton("Enter");
		enter.setBounds(950,290,100,50);
		enter.setOpaque(true);
		add(enter);
	}
    
	//Eventos de acción de botón
	private void initAcciones(){
		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "1");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "2");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "3");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "4");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "5");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "6");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "7");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "8");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "9");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		boton0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display2.setText(display2.getText() + "0");
				isPressed=false;
				valor=0;
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
		enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text=display2.getText();
				display2.append(text);
				valor=Integer.parseInt(text);
				isPressed=true;
				display2.setText("");
				//display.requestFocus(); //devuelvo foco a display para que funcione el KeyListener
			

			}
		});
	}
    
     
	public static void main(String[] args) throws InterruptedException {
		IManagerIO managerIO = new ManagerIO();
		MockObjGUI obj =new MockObjGUI();
		new Menu(managerIO, obj);
		
   
	}
    
}

