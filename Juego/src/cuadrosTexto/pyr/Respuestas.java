package cuadrosTexto.pyr;

public class Respuestas {
	private String [] respuestas;
	private int respuestaC;
	
	public static String[] respuestasB1S = {"1.- Ninguno","2.- Todos ","3.- Febrero","4.- Marzo"};
	public static String[] respuestasB2S = {"1.- Tetris","2.- Minecraft ","3.- COD","4.- Fifa"};
	public static String[] respuestasB3S = {"1.- 1646","2.- 1914 ","3.- 1939","4.- 1984"};
	public static String[] respuestasB4S = {"1.- Guajillo","2.- Carolina Reaper","3.- Jalapeño","4.- Ghost Scorpion"};
	
	public static String[] respuestas1S = {"1.- XX","2.- XIX ","3.- XV","4.- XXI"};
	public static String[] respuestas2S = {"1.- HeartBreaker","2.- Revolver ","3.- Peace Maker","4.- M1911"};
	public static String[] respuestas3S = {"1.- 11 años","2.- 3 años","3.- 5 años","4.- 3 meses"};
	public static String[] respuestas4S = {"1.- Mexico","2.- Tenochtitlan","3.- Nuevo Mexico","4.- Nueva Espana"};
	public static String[] respuestas5S = {"1.- 1910","2.- 1924","3.- 1821","4.- 1521"};
	public static String[] respuestas6S = {"1.- 12 grados","2.- 5500 grados","3.- 1000 grados","4.- 110 watts"};
	public static String[] respuestas7S = {"1.- Independencia","2.- Revolucion","3.- Guerra de pasteles","4.- Civil"};
	public static String[] respuestas8S = {"1.- Miguel Hidalgo","2.- Morelos","3.- Napoleon","4.- Juan Escutia"};
	public static String[] respuestas9S = {"1.- Estados Unidos","2.- Fracia","3.- Italia","4.- Venezuela"};
	public static String[] respuestas10S = {"1.- Torre Eiffel","2.- Torre de Pisa","3.- El coliseo","4.- Big ben"};
	public static String[] respuestas11S = {"1.- 24 febrero","2.- 14 febrero","3.- 30 octubre","4.- 18 julio"};
	public static String[] respuestas12S = {"1.- Goku","2.- Sun Wukong","3.- Yamato","4.- Kakashi"};
	public static String[] respuestas13S = {"1.- 1810","2.- 1999","3.- 1965","4.- 1940"};
	public static String[] respuestas14S = {"1.- Sega Genesis","2.- Nintendo 64","3.- Family com","4.- Magnavox Odyssey"};
	public static String[] respuestas15S = {"1.- Elefante","2.- Ballena","3.- T-Rex","4.- Mamut"};
	public static String[] respuestas16S = {"1.- Japonesa","2.- Egipcia","3.- Mexica","4.- Musulmana"};
	public static String[] respuestas17S = {"1.- De Giza","2.- Teotihuacan","3.- Tajin","4.- De Roma"};
	public static String[] respuestas18S = {"1.- Rio amazona","2.- Rio Colorado","3.- Rio Nilo","4.- Rio Tamesis"};
	public static String[] respuestas19S = {"1.- EL gato","2.- El perro","3.- Dragon","4.- Mono"};
	public static String[] respuestas20S = {"1.- Ra","2.- Thor","3.- Anubis","4.- Zeus"};
	public static String[] respuestas21S = {"1.- Luis y antonio","2.- Paul y Ali","3.- Edgar y Mario","4.- Erick y Val"};
	
	public static Respuestas respuestasB1 = new Respuestas(respuestasB1S,2); 
	public static Respuestas respuestasB2 = new Respuestas(respuestasB2S,2); 
	public static Respuestas respuestasB3 = new Respuestas(respuestasB3S,1); 
	public static Respuestas respuestasB4 = new Respuestas(respuestasB4S,2); 
	
	public static Respuestas respuestas1 = new Respuestas(respuestas1S,2);
	public static Respuestas respuestas2 = new Respuestas(respuestas2S,3);
	public static Respuestas respuestas3 = new Respuestas(respuestas3S,1);
	public static Respuestas respuestas4 = new Respuestas(respuestas4S,4);
	public static Respuestas respuestas5 = new Respuestas(respuestas5S,2);
	public static Respuestas respuestas6 = new Respuestas(respuestas6S,2);
	public static Respuestas respuestas7 = new Respuestas(respuestas7S,1);
	public static Respuestas respuestas8 = new Respuestas(respuestas8S,1);
	public static Respuestas respuestas9 = new Respuestas(respuestas9S,3);
	public static Respuestas respuestas10 = new Respuestas(respuestas10S,2);
	public static Respuestas respuestas11 = new Respuestas(respuestas11S,1);
	public static Respuestas respuestas12 = new Respuestas(respuestas12S,2);
	public static Respuestas respuestas13 = new Respuestas(respuestas13S,4);
	public static Respuestas respuestas14 = new Respuestas(respuestas14S,4);
	public static Respuestas respuestas15 = new Respuestas(respuestas15S,4);
	public static Respuestas respuestas16 = new Respuestas(respuestas16S,2);
	public static Respuestas respuestas17 = new Respuestas(respuestas17S,1);
	public static Respuestas respuestas18 = new Respuestas(respuestas18S,3);
	public static Respuestas respuestas19 = new Respuestas(respuestas19S,1);
	public static Respuestas respuestas20 = new Respuestas(respuestas20S,3);
	public static Respuestas respuestas21 = new Respuestas(respuestas21S,3);

	public Respuestas(String[] respuestas, int respuestasC) {
		this.respuestas = respuestas;
		this.respuestaC = respuestasC;
	}
	
	public String getRespuesta(int i) {
		return respuestas[i];
	}
	
	public int getRespuestaC() {
		return respuestaC;
	}
}
