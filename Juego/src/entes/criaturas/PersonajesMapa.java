package entes.criaturas;

import cuadrosTexto.pyr.Preguntas;

public class PersonajesMapa extends Criatura {

	private boolean visible;
	private int id;
	private int x;
	private int y;
	private Preguntas preguntas;
	private String texto;

	private String texto1;
	private String texto2;
	private String texto3;
	private String texto4;
	private String texto5;
	private String texto6;

	public static PersonajesMapa[] pm = new PersonajesMapa[29];

	public PersonajesMapa(final int id, final int x, final int y, String texto1, String texto2, String texto3,
			String texto4, String texto5, String texto6, boolean visible) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.texto1 = texto1;
		this.texto2 = texto2;
		this.texto3 = texto3;
		this.texto4 = texto4;
		this.texto5 = texto5;
		this.texto6 = texto6;
		this.visible = visible;
	}

	public PersonajesMapa(final int id, final int x, final int y, Preguntas preguntas, boolean visible) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.preguntas = preguntas;
		this.visible = visible;
	}

	public String seleccionPregutas() {
		return preguntas.getTexto();
	}

	public String getTexto() {
		return texto;
	}
	

	public String getTexto1() {
		return texto1;
	}

	public String getTexto2() {
		return texto2;
	}

	public String getTexto3() {
		return texto3;
	}

	public String getTexto4() {
		return texto4;
	}

	public String getTexto5() {
		return texto5;
	}

	public String getTexto6() {
		return texto6;
	}

	public Preguntas getPreguntas() {
		return preguntas;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getId() {
		return id;
	}

	public boolean getVisble() {
		return visible;
		
	}
	
	public void setVisible() {
		this.visible = false;
	}
	
	public static void crearPersonajes() {

		pm[0] = new PersonajesMapa(4, 672, 93, Preguntas.pregunta1, true);
		pm[1] = new PersonajesMapa(5, 1293, 93, Preguntas.pregunta2, true);
		pm[2] = new PersonajesMapa(6, 1396, 1312, Preguntas.pregunta3, true);
		pm[3] = new PersonajesMapa(7, 1613, 1729, Preguntas.pregunta4, true);
		pm[4] = new PersonajesMapa(8, 781, 1696, Preguntas.pregunta5, true);
		pm[5] = new PersonajesMapa(9, 340, 1407, Preguntas.pregunta6, true);
		pm[6] = new PersonajesMapa(10, 397, 2368, Preguntas.pregunta7, true);
		pm[7] = new PersonajesMapa(11, 322, 2845, Preguntas.pregunta8, true);
		pm[8] = new PersonajesMapa(12, 1396, 2816, Preguntas.pregunta9, true);
		pm[9] = new PersonajesMapa(13, 1525, 2270, Preguntas.pregunta10, true);
		pm[10] = new PersonajesMapa(14, 2285, 2815, Preguntas.pregunta11, true);
		pm[11] = new PersonajesMapa(15, 3508, 2306, Preguntas.pregunta12, true);
		pm[12] = new PersonajesMapa(16, 3821, 2497, Preguntas.pregunta13, true);
		pm[13] = new PersonajesMapa(17, 3315, 2721, Preguntas.pregunta14, true);
		pm[14] = new PersonajesMapa(18, 4461, 2976, Preguntas.pregunta15, true);
		pm[15] = new PersonajesMapa(19, 4660, 2717, Preguntas.pregunta16, true);
		pm[16] = new PersonajesMapa(20, 4852, 3297, Preguntas.pregunta17, true);
		pm[17] = new PersonajesMapa(21, 4884, 3841, Preguntas.pregunta18, true);
		pm[18] = new PersonajesMapa(22, 4244, 3777, Preguntas.pregunta19, true);
		pm[19] = new PersonajesMapa(23, 3796, 3775, Preguntas.pregunta20, true);
		pm[20] = new PersonajesMapa(24, 3348, 4383, Preguntas.pregunta21, true);
		pm[21] = new PersonajesMapa(25, 481, 737, Preguntas.preguntaB1, true);
		pm[22] = new PersonajesMapa(26, 1795, 253, Preguntas.preguntaB2, true);
		pm[23] = new PersonajesMapa(27, 2548, 2335, Preguntas.preguntaB3, true);
		pm[24] = new PersonajesMapa(28, 2861, 2271, Preguntas.preguntaB4, true);
		pm[25] = new PersonajesMapa(0, 301, 224, "Hola" + Preguntas.name,
				" Bievenido al juego GO EGDAR GO \n Recuerda estos son tus Controles\n Usa:", "W = Arriba", "A = Izquierda",
				"S = Abajo", "D = Derecha", true);
		pm[26] = new PersonajesMapa(1, 194, 573, "Recuerda que puedes correr con el SHIFT",
				"Y puedes usar Q para poder hablar con los personajes", "Si quieres salir del juego y guardarlo presiona F5", "", "", "", true);
		pm[27] = new PersonajesMapa(2, 451, 829,
				"Tiene que seleccionar una de estas opciones por que solo hay una corecta.", "Selecciona", "1.-", "2.-", "3.-Correcta", "4.-", true);
		pm[28] = new PersonajesMapa(3, 899, 864, "Si te equivocas"
				+ " puedes perder un poco de tu energia.",
				"", "", "", "", "", true);
	}
}
