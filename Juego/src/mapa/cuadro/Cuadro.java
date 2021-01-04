package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {
	
	public Sprite sprite;
	
	private boolean solido;
	public static final int LADO = 32;

	//coleccion de cuadros
		public static final Cuadro VACIO1 = new Cuadro(Sprite.VACIO1, true);
		public static final Cuadro ARENA = new Cuadro(Sprite.ARENA, true);
		public static final Cuadro PASTO = new Cuadro(Sprite.PASTO, true);
		public static final Cuadro AGUA = new Cuadro(Sprite.AGUA, true);
		public static final Cuadro PIEDRA = new Cuadro(Sprite.PIEDRA);
		public static final Cuadro TIERRA = new Cuadro(Sprite.TIERRA, true);
		public static final Cuadro BOCHO = new Cuadro(Sprite.BOCHO);
		public static final Cuadro CALLE = new Cuadro(Sprite.CALLE);
		public static final Cuadro BMAN = new Cuadro(Sprite.BMAN, true);
		public static final Cuadro CAMINO1 = new Cuadro(Sprite.CAMINO1);
		public static final Cuadro C_POLICIA = new Cuadro(Sprite.C_POLICIA);
		public static final Cuadro LAVA = new Cuadro(Sprite.LAVA, true);
		public static final Cuadro MAGMA = new Cuadro(Sprite.MAGMA, true);
		public static final Cuadro ROCA = new Cuadro(Sprite.ROCA);
		public static final Cuadro LAVACUP = new Cuadro(Sprite.LAVACUP);
		public static final Cuadro CAMINO2 = new Cuadro(Sprite.CAMINO2);
		public static final Cuadro CAMINO3 = new Cuadro(Sprite.CAMINO3);
		public static final Cuadro SSTOP = new Cuadro(Sprite.SSTOP);
		public static final Cuadro EDIFICIO = new Cuadro(Sprite.EDIFICIO);
		public static final Cuadro C_VERTICAL = new Cuadro(Sprite.C_VERTICAL);
		public static final Cuadro C_HORIZONTAL = new Cuadro(Sprite.C_HORIZONTAL);
		public static final Cuadro LADRILLOS = new Cuadro(Sprite.LADRILLOS);
		public static final Cuadro ARBOL = new Cuadro(Sprite.ARBOL, true);
		public static final Cuadro ROCA2 = new Cuadro(Sprite.ROCA2);
		public static final Cuadro LODO = new Cuadro(Sprite.LODO, true);
		public static final Cuadro AGUA2 = new Cuadro(Sprite.AGUA2);
		public static final Cuadro ESCALERA = new Cuadro(Sprite.ESCALERA);
		public static final Cuadro CAMINO4 = new Cuadro(Sprite.CAMINO4);
		public static final Cuadro DECORACION1 = new Cuadro(Sprite.DECORACION1);
		public static final Cuadro FABRICA1 = new Cuadro(Sprite.FABRICA1);
		public static final Cuadro DEP_AGUA = new Cuadro(Sprite.DEP_AGUA);
		public static final Cuadro FABRICA2 = new Cuadro(Sprite.FABRICA2);
		public static final Cuadro CEMENTERIO = new Cuadro(Sprite.CEMENTERIO);
		public static final Cuadro HOSPITAL = new Cuadro(Sprite.HOSPITAL);
		public static final Cuadro OF_POLICIA = new Cuadro(Sprite.OF_POLICIA);
		public static final Cuadro NIEVE = new Cuadro(Sprite.NIEVE, true);
		public static final Cuadro PASTO_NIEVE = new Cuadro(Sprite.PASTO_NIEVE);
		public static final Cuadro HIELO = new Cuadro(Sprite.HIELO, true);
		public static final Cuadro PASTO_HOJA = new Cuadro(Sprite.PASTO_HOJA);
		public static final Cuadro ROCA3 = new Cuadro(Sprite.ROCA3, true);
		public static final Cuadro ARENA2 = new Cuadro(Sprite.ARENA2, true);
		public static final Cuadro CAMELLO = new Cuadro(Sprite.CAMELLO);
		public static final Cuadro PIRAMIDE = new Cuadro(Sprite.PIRAMIDE);
		public static final Cuadro CASA_EGYPT = new Cuadro(Sprite.CASA_EGYPT);
		public static final Cuadro BURRO2 = new Cuadro(Sprite.BURRO2);
		public static final Cuadro LAGUNA = new Cuadro(Sprite.LAGUNA);
		public static final Cuadro AGUILA = new Cuadro(Sprite.AGUILA);
		
		
		//Personajes
		public static final Cuadro MEX1 = new Cuadro(Sprite.MEX1, true);
		public static final Cuadro BURRO = new Cuadro(Sprite.BURRO, true);
		public static final Cuadro MIGUEL = new Cuadro(Sprite.MIGUEL, true);
		public static final Cuadro POLICIA = new Cuadro(Sprite.POLICIA, true);
		public static final Cuadro MORELOS = new Cuadro(Sprite.MORELOS, true);
		public static final Cuadro PIPILA = new Cuadro(Sprite.PIPILA, true);
		public static final Cuadro ALLENDE = new Cuadro(Sprite.ALLENDE, true);
		public static final Cuadro MARIO = new Cuadro(Sprite.MARIO, true);
		public static final Cuadro CACTUS = new Cuadro(Sprite.CACTUS, true);
		public static final Cuadro BANDERA = new Cuadro(Sprite.BANDERA, true);
		public static final Cuadro CHILE  = new Cuadro(Sprite.CHILE, true);
		public static final Cuadro LAVAMAN = new Cuadro(Sprite.LAVAMAN, true);
		public static final Cuadro HAMBURGUESA = new Cuadro(Sprite.HAMBUSGUESA, true);
		public static final Cuadro GOKU  = new Cuadro(Sprite.GOKU, true);
		public static final Cuadro SONIC  = new Cuadro(Sprite.SONIC, true);
		public static final Cuadro GLADIADOR = new Cuadro(Sprite.GLADIADOR, true);
		public static final Cuadro ANUBIS1  = new Cuadro(Sprite.ANUBIS1, true);
		public static final Cuadro ANUBIS2  = new Cuadro(Sprite.ANUBIS2, true);
		public static final Cuadro FARAON1  = new Cuadro(Sprite.FARAON1, true);
		public static final Cuadro FARAON2  = new Cuadro(Sprite.FARAON2, true);
		public static final Cuadro CLEO1  = new Cuadro(Sprite.CLEO1, true);
		public static final Cuadro CLEO2  = new Cuadro(Sprite.CLEO2, true);
		public static final Cuadro ARQUERO  = new Cuadro(Sprite.ARQUERO, true);
		public static final Cuadro MOMIA  = new Cuadro(Sprite.MOMIA, true);
		public static final Cuadro S_ARMA1 = new Cuadro(Sprite.S_ARMA1, true);
		public static final Cuadro S_ARMA2 = new Cuadro(Sprite.S_ARMA2, true);
		public static final Cuadro S_ARMA3 = new Cuadro(Sprite.S_ARMA3, true);
		public static final Cuadro S_ARMA4 = new Cuadro(Sprite.S_ARMA4, true);
		
	public Cuadro(Sprite sprite) {
		this.sprite=sprite;
		solido = false;
	}
	
	public Cuadro(Sprite sprite , boolean solido) {
		this.sprite=sprite;
		this.solido = solido;
	}
	public void mostrar(int x, int y , Pantalla pantalla) {
		pantalla.mostrarCuadro(x << 5 , y  << 5, this);
	}
	
	public boolean isSolido() {
		return solido;
	}
}

