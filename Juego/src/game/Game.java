package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
//import java.io.IOException;

import control.Teclado;
import cuadrosTexto.CuadrosConversacion;
//import cuadrosTexto.Textos;
//import cuadrosTexto.pyr.Preguntas;
import entes.criaturas.Jugador;
import entes.criaturas.PersonajesMapa;
import graficos.Pantalla;
import graficos.Sprite;
import graficos.Ventana.VentanaPrincipal;
import mapa.Mapa;
import mapa.MapaCargado;
import datos.Archivos;
import datos.textoGuardado;

public class Game extends Canvas implements Runnable {

	int i = 0;
	int cont = 0;

	private static final long serialVersionUID = 2906774259158170026L;
	private static final int ANCHO = 625;
	private static final int ALTO = 440;

	private static volatile boolean enFuncionamiento = true;

	private static String CONTADOR_APS = "";
	private static String CONTADOR_FPS = "";
	
	private static boolean movimiento = true;

	private static int aps = 0;
	private static int fps = 0;

	private static Thread thread;
	private static Teclado teclado;
	private static Pantalla pantalla;

	private static Mapa mapa;
	private static Jugador jugador;

	private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
	private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
	
	private int[] guardado = {85,-6,2000,0};//Valores iniciales

	public Game(){
		setPreferredSize(new Dimension(ANCHO, ALTO));
		PersonajesMapa.crearPersonajes();
		teclado = new Teclado();
		addKeyListener(teclado);
		pantalla = new Pantalla(ANCHO, ALTO);

		mapa = new MapaCargado("/mapas/MapaPix.png");
			
		//Generar funcion para iniciar con el guardado
			Archivos a = new Archivos();
			String ruta = "C:\\Users\\mario\\Downloads\\Juego\\recursos\\Guardado\\save1.txt";
			guardado = a.leerTxt(ruta); 
		//	
		jugador = new Jugador(mapa, teclado, Sprite.DER0, guardado[0], guardado[1], guardado[2], guardado[3]);
		
	}

	public synchronized void iniciar() {
		thread = new Thread(this, "Graficos");
		enFuncionamiento = true;
		if(enFuncionamiento) {
			thread.start();
		}
	}

	public synchronized void detener() {
		enFuncionamiento = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void actualizar() {
		teclado.actualizar();
		//jugador.actualizar(true);
		jugador.actualizar(movimiento);

		aps++;
	}

	private void mostrar() {
		BufferStrategy estrategia = getBufferStrategy();

		if (estrategia == null) {
			createBufferStrategy(3);
			return;
		}

		// pantalla.limpiar();
		mapa.mostrar(jugador.obtenerPosicionX() - pantalla.getAncho() / 2 + jugador.getSprite().getLado(),
				jugador.obtenerPosicionY() - pantalla.getAlto() / 2 + jugador.getSprite().getLado() / 2, pantalla);
		jugador.mostrar(pantalla);
		System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);

		Graphics g = estrategia.getDrawGraphics();
		Font fuente = new Font("Agency FB", Font.BOLD, 20);
		g.setFont(fuente);
		g.setColor(Color.black);
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
		g.drawString(CONTADOR_APS, 10, 20);
		g.drawString(CONTADOR_FPS, 10, 40);
		g.drawString("X: " + jugador.obtenerPosicionX(), 10, 60);
		g.drawString("Y: " + jugador.obtenerPosicionY(), 10, 80);
		if(jugador.getVidas() < 0) {
			g.drawString("Juego terminado", ANCHO/3 , ALTO/2);
		}
		g.drawString("Energia: " + jugador.getVidas(), 10, 100);
		g.drawString("Puntos: " + jugador.getpuntos(), 10, 120);


		
			
		if (teclado.select) {
			for (int i = 0; i < PersonajesMapa.pm.length; i++) {
				if ((jugador.obtenerPosicionX() == PersonajesMapa.pm[i].getX()
						|| (jugador.obtenerPosicionX() < PersonajesMapa.pm[i].getX() + CuadrosConversacion.rango
						&& jugador.obtenerPosicionX() > PersonajesMapa.pm[i].getX() - CuadrosConversacion.rango))
						&& (jugador.obtenerPosicionY() == PersonajesMapa.pm[i].getY()
								|| (jugador.obtenerPosicionY() < PersonajesMapa.pm[i].getY() + CuadrosConversacion.rango
								&& jugador.obtenerPosicionY() > PersonajesMapa.pm[i].getY() - CuadrosConversacion.rango))
						&& PersonajesMapa.pm[i].getId() > 3 && PersonajesMapa.pm[i].getVisble()) {
					
					CuadrosConversacion.CrearTextos(g, PersonajesMapa.pm[i], jugador, ANCHO, ALTO, teclado);
					CuadrosConversacion.responderPreguntas(teclado, g, PersonajesMapa.pm[i], jugador);
					movimiento = false;
										
				} else if ((jugador.obtenerPosicionX() == PersonajesMapa.pm[i].getX()
						|| (jugador.obtenerPosicionX() < PersonajesMapa.pm[i].getX() + CuadrosConversacion.rango
						&& jugador.obtenerPosicionX() > PersonajesMapa.pm[i].getX() - CuadrosConversacion.rango))
						&& (jugador.obtenerPosicionY() == PersonajesMapa.pm[i].getY()
								|| (jugador.obtenerPosicionY() < PersonajesMapa.pm[i].getY() + CuadrosConversacion.rango
								&& jugador.obtenerPosicionY() > PersonajesMapa.pm[i].getY() - CuadrosConversacion.rango)) 
						&& PersonajesMapa.pm[i].getVisble()) {
					CuadrosConversacion.CrearTextos(g, PersonajesMapa.pm[i], jugador, ANCHO, ALTO, teclado, 0);
					movimiento = false;
				}
			}
			
			if(((jugador.obtenerPosicionX() == 3349 || (jugador.obtenerPosicionX() < 3359 && jugador.obtenerPosicionX() > 3339))
					&& (jugador.obtenerPosicionY() == 4384 || (jugador.obtenerPosicionY() < 4394 && jugador.obtenerPosicionY() > 4374))) 
					&& !PersonajesMapa.pm[20].getVisble()) {
				VentanaPrincipal.game.setVisible(false);
				VentanaPrincipal.menu.setVisible(true);
				this.detener();
			}	
		}
		else {
			movimiento = true;
		}
		
		
		if(teclado.guardar) {
			
			
			Archivos a = new Archivos();
			
			if(cont < 1) {
			new textoGuardado();
			String ruta = "recursos/Guardado/save1.txt";
			a.escribirTxt(ruta, jugador.x, jugador.y,jugador.getVidas(),jugador.getpuntos());		
			cont++;
			}
			
		}
		

		g.dispose();

		estrategia.show();
		fps++;
	}

	public void run() {
		final int NS_POR_SEGUNDO = 1000000000;
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / 60;

		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();

		double tiempoTranscurrido;
		double delta = 0;

		requestFocus();

		while (enFuncionamiento) {
			final long inicioBucle = System.nanoTime();

			tiempoTranscurrido = inicioBucle - referenciaActualizacion;
			referenciaActualizacion = inicioBucle;

			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;

			while (delta >= 1) {
				actualizar();
				delta--;
			}

			mostrar();

			if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				CONTADOR_APS = "APS: " + aps;
				CONTADOR_FPS = "FPS: " + fps;

				aps = 0;
				fps = 0;
				referenciaContador = System.nanoTime();
			}
		}
	}

}
