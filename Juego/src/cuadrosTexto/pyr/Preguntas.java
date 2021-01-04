package cuadrosTexto.pyr;

import cuadrosTexto.Textos;
import graficos.Ventana.VentanaPrincipal;

public class Preguntas extends Textos{

	private Respuestas respuestas;
	private int puntos; 
	public static String name =  VentanaPrincipal.pu.txtUsuario.getText();
	
	public static Preguntas preguntaB1 = new Preguntas(18, "Hola "+name+" ¿Cuántos meses tienen 28 días?",  Respuestas.respuestasB1,  5);
	public static Preguntas preguntaB2 = new Preguntas(19, "Hola "+name+" ¿Cual es el juego mas jugado?",  Respuestas.respuestasB2,  5);
	public static Preguntas preguntaB3 = new Preguntas(20, "Hola "+name+" ¿En que año se descubrio la electricidad?",  Respuestas.respuestasB3,  10);
	public static Preguntas preguntaB4 = new Preguntas(21, "Hola "+name+" ¿Cual es el chile mas picante del mundo?",  Respuestas.respuestasB4,  10);
	
	public static Preguntas pregunta1 = new Preguntas(0, "Hola "+name+" ¿En que año empezo la era del Viejo Oeste?",  Respuestas.respuestas1,  10);
	public static Preguntas pregunta2 = new Preguntas(1, "Hola "+name+" ¿Cual era el nombre coloquial de arma mas usada del Viejo Oeste?",  Respuestas.respuestas2,  10);
	public static Preguntas pregunta3 = new Preguntas(2, "Hola "+name+" ¿Cuantos años duro la independencia de Mexico?",  Respuestas.respuestas3,  10);
	public static Preguntas pregunta4 = new Preguntas(3, "Hola "+name+" ¿Como se llamaba Mexico antes de la independecia?",  Respuestas.respuestas4,  10);
	public static Preguntas pregunta5 = new Preguntas(4, "Hola "+name+" ¿En que año termino la revolucion Mexicana?",  Respuestas.respuestas5,  10);
	public static Preguntas pregunta6 = new Preguntas(5, "Hola "+name+" ¿Cual es al temperatura del sol?",  Respuestas.respuestas6,  10);
	public static Preguntas pregunta7 = new Preguntas(6, "Hola "+name+" Soy Jose Maria Morelos, ¿Sabes en que Guerra Participe?",  Respuestas.respuestas7,  10);
	public static Preguntas pregunta8 = new Preguntas(7, "Hola "+name+" ¿Sabes cual es mi nombre?",  Respuestas.respuestas8,  10);
	public static Preguntas pregunta9 = new Preguntas(8, "Hola "+name+" ¿Sabes cual es el pais involucrado con la guerra de pasteles en Mexico?",  Respuestas.respuestas9,  10);
	public static Preguntas pregunta10 = new Preguntas(9, "Hola "+name+" ¿Cual es el monumento mas famoso en italia?",  Respuestas.respuestas10,  10);
	public static Preguntas pregunta11 = new Preguntas(10, "Hola "+name+" ¿Cuando es el dia de la bandera?",  Respuestas.respuestas11,  10);
	public static Preguntas pregunta12 = new Preguntas(11, "Hola "+name+" ¿En que personaje estoy basado?",  Respuestas.respuestas12,  10);
	public static Preguntas pregunta13 = new Preguntas(12, "Hola "+name+" ¿En que año se fundo el primer McDonalds?",  Respuestas.respuestas13,  10);
	public static Preguntas pregunta14 = new Preguntas(13, "Hola "+name+" ¿Cual fue la primer consola?",  Respuestas.respuestas14,  10);
	public static Preguntas pregunta15 = new Preguntas(14, "Hola "+name+" ¿Cual era el mamifero mas grande del mundo?",  Respuestas.respuestas15,  10);
	public static Preguntas pregunta16 = new Preguntas(15, "Hola "+name+" ¿Cual es la cultura que momificaba?",  Respuestas.respuestas16,  10);
	public static Preguntas pregunta17 = new Preguntas(16, "Hola "+name+" ¿Cual es el nombre de las piramides en egipto?",  Respuestas.respuestas17,  10);
	public static Preguntas pregunta18 = new Preguntas(17, "Hola "+name+" ¿Cual es el nombre del rio de Egipto?",  Respuestas.respuestas18,  10);
	public static Preguntas pregunta19 = new Preguntas(18, "Hola "+name+" ¿Que animal es sagrado para nosotros los Egipcios?",  Respuestas.respuestas19,  10);
	public static Preguntas pregunta20 = new Preguntas(19, "Hola "+name+" ¿Cual es el nombre del dios del Sol?",  Respuestas.respuestas20,  10);
	public static Preguntas pregunta21 = new Preguntas(20, "Hola "+name+" ¿Cual son los nombres de los creadores del juego?",  Respuestas.respuestas21,  10);

	public Preguntas(int id, String texto, Respuestas respuestas, int puntos) {
		super(id, texto);
		this.respuestas = respuestas;
		this.puntos = puntos;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public Respuestas getRespuestasP() {
		return respuestas;
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
}
