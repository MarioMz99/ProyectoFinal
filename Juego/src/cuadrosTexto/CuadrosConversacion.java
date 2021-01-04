package cuadrosTexto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import control.Teclado;
import entes.criaturas.Jugador;
import entes.criaturas.PersonajesMapa;
//import graficos.Ventana.VentanaPrincipal;

public class CuadrosConversacion {
	
	public static int rango = 10;
	public static void CrearCuadrosConversacion(Graphics g, Jugador jugador, int ancho, int alto, Teclado teclado,
			int posicionX, int posicionY, PersonajesMapa pm) {
		Font fuente = new Font("Agency FB", Font.BOLD, 20);

		BufferedImage imagen = null;
		try {
			imagen = ImageIO.read(new File("recursos/Imagenes/otras/Menu_2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ((jugador.obtenerPosicionX() == posicionX || (jugador.obtenerPosicionX() < posicionX + rango
				&& jugador.obtenerPosicionX() > posicionX - rango)
				&& (jugador.obtenerPosicionY() == posicionY || (jugador.obtenerPosicionY() < posicionY + rango
						&& jugador.obtenerPosicionY() > posicionY - rango))
				&& teclado.select)) {
			g.setFont(fuente);
			g.drawImage(imagen, 0, ((alto * 2) / 3) + 1, ancho, alto / 3, null);
			g.setColor(Color.black);
			g.drawString(pm.getTexto1(), 64, ancho / 2 + 16);
			g.drawString(pm.getTexto2(), 64, ancho / 2 + 48);
			g.drawString(pm.getTexto3(), 64, ancho / 2 + 80);
			g.drawString(pm.getTexto4(), 64, ancho / 2 + 112);
			g.drawString(pm.getTexto5(), 256, ancho / 2 + 80);
			g.drawString(pm.getTexto6(), 256, ancho / 2 + 112);
			g.create();
		}
	}

	public static void CrearCuadrosConversacion(Graphics g, Jugador jugador, int ancho, int alto, Teclado teclado,
			int posicionX, int posicionY, String text, PersonajesMapa pm) {
		Font fuente = new Font("Agency FB", Font.BOLD, 20);

		BufferedImage imagen = null;
		try {
			imagen = ImageIO.read(new File("recursos/Imagenes/otras/Menu_2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ((jugador.obtenerPosicionX() == posicionX || (jugador.obtenerPosicionX() < posicionX + rango
				&& jugador.obtenerPosicionX() > posicionX - rango)
				&& (jugador.obtenerPosicionY() == posicionY || (jugador.obtenerPosicionY() < posicionY + rango
						&& jugador.obtenerPosicionY() > posicionY - rango))
				&& teclado.select)) {
			g.setFont(fuente);
			g.drawImage(imagen, 0, ((alto * 2) / 3) + 1, ancho, alto / 3, null);
			g.setColor(Color.black);
			g.drawString(text, 64, ancho / 2 + 16);
			g.drawString(pm.getPreguntas().getRespuestasP().getRespuesta(0), 64, ancho / 2 + 48);
			g.drawString(pm.getPreguntas().getRespuestasP().getRespuesta(1), 64, ancho / 2 + 80);
			g.drawString(pm.getPreguntas().getRespuestasP().getRespuesta(2), 256, ancho / 2 + 48);
			g.drawString(pm.getPreguntas().getRespuestasP().getRespuesta(3), 256, ancho / 2 + 80);
			g.create();
		} else {
			g.dispose();
		}
	}

	public static void CrearTextos(Graphics g, PersonajesMapa pm, Jugador jugador, int ancho, int alto,
			Teclado teclado) {
		int posicionX = pm.getX();
		int posicionY = pm.getY();

		String texto = pm.seleccionPregutas();

		CrearCuadrosConversacion(g, jugador, ancho, alto, teclado, posicionX, posicionY, texto, pm);
	}

	public static void CrearTextos(Graphics g, PersonajesMapa pm, Jugador jugador, int ancho, int alto, Teclado teclado,
			int num) {
		int posicionX = pm.getX();
		int posicionY = pm.getY();

		CrearCuadrosConversacion(g, jugador, ancho, alto, teclado, posicionX, posicionY, pm);
	}
	
	public static void responderPreguntas(Teclado teclado, Graphics g, PersonajesMapa pm , Jugador jugador) {
		if(teclado.resp1) {
			if(pm.getPreguntas().getRespuestasP().getRespuestaC() == 1) {
				g.drawString("Correcta", 0, 256);
				jugador.setpuntos(pm.getPreguntas().getPuntos());
				pm.setVisible();
			} else {
				g.drawString("Incorrecta", 0, 256);
				jugador.setVidas(1);
			}
		} 
		
		if(teclado.resp2) {
			if(pm.getPreguntas().getRespuestasP().getRespuestaC() == 2) {
				g.drawString("Correcta", 0, 256);
				jugador.setpuntos(pm.getPreguntas().getPuntos());
				pm.setVisible();
			} else {
				g.drawString("Incorrecta", 0, 256);
				jugador.setVidas(1);
			}
		}
		
		if(teclado.resp3) {
			if(pm.getPreguntas().getRespuestasP().getRespuestaC() == 3) {
				g.drawString("Correcta", 0, 256);
				jugador.setpuntos(pm.getPreguntas().getPuntos());
				pm.setVisible();
			} else {
				g.drawString("Incorrecta", 0, 256);
				jugador.setVidas(1);
			}
		}
		
		if(teclado.resp4) {
			if(pm.getPreguntas().getRespuestasP().getRespuestaC() == 4) {
				g.drawString("Correcta", 0, 256);
				jugador.setpuntos(pm.getPreguntas().getPuntos());
				pm.setVisible();
			} else {
				g.drawString("Incorrecta", 0, 256);
				jugador.setVidas(1);
			}
		}		
	}
}
