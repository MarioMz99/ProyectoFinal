package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//import graficos.Ventana.VentanaPrincipal;

public class Teclado implements KeyListener {

	int i = 0;
	private final static int numeroTeclados = 200;
	private final boolean[] teclas = new boolean[numeroTeclados];
	private final boolean[] teclasStaticas = new boolean[numeroTeclados];
	private final boolean[] teclasR = new boolean[numeroTeclados];

	public boolean arriba;
	public boolean abajo;
	public boolean izquierda;
	public boolean derecha;
	public boolean salir;
	public boolean correr;
	public boolean abrir;
	public boolean continuar;
	public boolean select;
	public boolean pausa;
	
	public boolean resp1;
	public boolean resp2;
	public boolean resp3;
	public boolean resp4;
	public boolean guardar;
	public boolean cargar;
	
	public void actualizar() {
		arriba = teclas[KeyEvent.VK_W];
		abajo = teclas[KeyEvent.VK_S];
		izquierda = teclas[KeyEvent.VK_A];
		derecha = teclas[KeyEvent.VK_D];
		
		correr = teclas[KeyEvent.VK_SHIFT];
				
		abrir = teclas[KeyEvent.VK_P];
		
		continuar = teclas[KeyEvent.VK_O];
		guardar = teclas[KeyEvent.VK_F5];
		cargar = teclas[KeyEvent.VK_F9];
		
		select =  teclasStaticas[KeyEvent.VK_Q];
		
		pausa =  teclasStaticas[KeyEvent.VK_ESCAPE];
		
		resp1 =  teclasR[KeyEvent.VK_1];
		resp2 =  teclasR[KeyEvent.VK_2];
		resp3 =  teclasR[KeyEvent.VK_3];
		resp4 =  teclasR[KeyEvent.VK_4];
	}
	
	public void keyPressed(KeyEvent e) {
		teclas[e.getKeyCode()] = true;
		teclasR[e.getKeyCode()] = true;
		if(i == 0) {
			teclasStaticas[e.getKeyCode()] = true;
			i = 1;
		}else {
			teclasStaticas[e.getKeyCode()] = false;
			i = 0;
		}
	}

	public void keyReleased(KeyEvent e) {
		teclas[e.getKeyCode()] = false;
		teclasR[e.getKeyCode()] = false;
	}

	public void keyTyped(KeyEvent arg0) {
		
	}	
}
