package graficos;

public final class Sprite {
	private final int lado;
	
	private int x;
	private int y;
	
	public int[] pixeles;
	private HojaSprite hoja;
	
	///sprite personaje
	public static final Sprite DER0 = new Sprite(32,0,0,0, HojaSprite.jugador);
	public static final Sprite DER1 = new Sprite(32,1,0,0, HojaSprite.jugador);
	public static final Sprite DER2 = new Sprite(32,2,0,0, HojaSprite.jugador);
	public static final Sprite DER3 = new Sprite(32,3,0,0, HojaSprite.jugador);
	public static final Sprite DER4 = new Sprite(32,4,0,0, HojaSprite.jugador);
	public static final Sprite DER5 = new Sprite(32,5,0,0, HojaSprite.jugador);
	public static final Sprite DER6 = new Sprite(32,6,0,0, HojaSprite.jugador);
	
	public static final Sprite IZQ0 = new Sprite(32,0,1,0, HojaSprite.jugador);
	public static final Sprite IZQ1 = new Sprite(32,1,1,0, HojaSprite.jugador);
	public static final Sprite IZQ2 = new Sprite(32,2,1,0, HojaSprite.jugador);
	public static final Sprite IZQ3 = new Sprite(32,3,1,0, HojaSprite.jugador);
	public static final Sprite IZQ4 = new Sprite(32,4,1,0, HojaSprite.jugador);
	public static final Sprite IZQ5 = new Sprite(32,5,1,0, HojaSprite.jugador);
	public static final Sprite IZQ6 = new Sprite(32,6,1,0, HojaSprite.jugador);

	
	///fin
	
	///colecion de sprites
		public static final Sprite VACIO1 = new Sprite(32,9,9,0,HojaSprite.mapa);
		public static final Sprite ARENA = new Sprite(32,0,0,0,HojaSprite.mapa);
		public static final Sprite PASTO = new Sprite(32,1,0,0,HojaSprite.mapa);
		public static final Sprite AGUA = new Sprite(32,2,0,0,HojaSprite.mapa);
		public static final Sprite PIEDRA = new Sprite(32,3,0,0,HojaSprite.mapa);
		public static final Sprite TIERRA = new Sprite(32,4,0,0,HojaSprite.mapa);
		public static final Sprite BOCHO = new Sprite(32,6,0,0,HojaSprite.mapa);
		public static final Sprite CALLE = new Sprite(32,7,0,0,HojaSprite.mapa);
		public static final Sprite CAMINO1 = new Sprite(32,9,0,0,HojaSprite.mapa);
		public static final Sprite C_POLICIA = new Sprite(32,0,2,0,HojaSprite.mapa);
		public static final Sprite LAVA = new Sprite(32,1,2,0,HojaSprite.mapa);
		public static final Sprite MAGMA = new Sprite(32,2,2,0,HojaSprite.mapa);
		public static final Sprite ROCA = new Sprite(32,3,2,0,HojaSprite.mapa);
		public static final Sprite LAVACUP = new Sprite(32,5,2,0,HojaSprite.mapa);
		public static final Sprite CAMINO2 = new Sprite(32,6,2,0,HojaSprite.mapa);
		public static final Sprite CAMINO3 = new Sprite(32,7,2,0,HojaSprite.mapa);
		public static final Sprite SSTOP = new Sprite(32,8,2,0,HojaSprite.mapa);
		public static final Sprite EDIFICIO = new Sprite(32,0,3,0,HojaSprite.mapa);
		public static final Sprite C_VERTICAL = new Sprite(32,1,3,0,HojaSprite.mapa);
		public static final Sprite C_HORIZONTAL = new Sprite(32,2,3,0,HojaSprite.mapa);
		public static final Sprite LADRILLOS = new Sprite(32,4,3,0,HojaSprite.mapa);
		public static final Sprite ARBOL = new Sprite(32,6,3,0,HojaSprite.mapa);
		public static final Sprite ROCA2 = new Sprite(32,7,3,0,HojaSprite.mapa);
		public static final Sprite LODO = new Sprite(32,8,3,0,HojaSprite.mapa);
		public static final Sprite AGUA2 = new Sprite(32,9,3,0,HojaSprite.mapa);
		public static final Sprite ESCALERA = new Sprite(32,0,4,0,HojaSprite.mapa);
		public static final Sprite CAMINO4 = new Sprite(32,1,4,0,HojaSprite.mapa);
		public static final Sprite DECORACION1 = new Sprite(32,3,4,0,HojaSprite.mapa);
		public static final Sprite FABRICA1 = new Sprite(32,4,4,0,HojaSprite.mapa);
		public static final Sprite DEP_AGUA = new Sprite(32,5,4,0,HojaSprite.mapa);
		public static final Sprite FABRICA2 = new Sprite(32,6,4,0,HojaSprite.mapa);
		public static final Sprite CEMENTERIO = new Sprite(32,7,4,0,HojaSprite.mapa);
		public static final Sprite HOSPITAL = new Sprite(32,8,4,0,HojaSprite.mapa);
		public static final Sprite OF_POLICIA = new Sprite(32,9,4,0,HojaSprite.mapa);
		public static final Sprite NIEVE = new Sprite(32,0,5,0,HojaSprite.mapa);
		public static final Sprite PASTO_NIEVE = new Sprite(32,1,5,0,HojaSprite.mapa);
		public static final Sprite HIELO = new Sprite(32,2,5,0,HojaSprite.mapa);
		public static final Sprite PASTO_HOJA = new Sprite(32,3,5,0,HojaSprite.mapa);
		public static final Sprite ROCA3 = new Sprite(32,4,5,0,HojaSprite.mapa);
		public static final Sprite ARENA2 = new Sprite(32,3,6,0,HojaSprite.mapa);
		public static final Sprite CAMELLO = new Sprite(32,4,6,0,HojaSprite.mapa);
		public static final Sprite PIRAMIDE = new Sprite(32,5,6,0,HojaSprite.mapa);
		public static final Sprite CASA_EGYPT = new Sprite(32,6,6,0,HojaSprite.mapa);
		public static final Sprite BURRO2 = new Sprite(32,7,6,0,HojaSprite.mapa);
		public static final Sprite LAGUNA = new Sprite(32,8,6,0,HojaSprite.mapa);
		public static final Sprite AGUILA = new Sprite(32,9,6,0,HojaSprite.mapa);
		
		
		
		//Personajes
		public static final Sprite MEX1 = new Sprite(32,5,0,0,HojaSprite.mapa);
		public static final Sprite BMAN = new Sprite(32,8,0,0,HojaSprite.mapa);
		public static final Sprite BURRO = new Sprite(32,0,1,0,HojaSprite.mapa);
		public static final Sprite MIGUEL = new Sprite(32,1,1,0,HojaSprite.mapa);
		public static final Sprite POLICIA = new Sprite(32,2,1,0,HojaSprite.mapa);
		public static final Sprite MORELOS = new Sprite(32,3,1,0,HojaSprite.mapa);
		public static final Sprite PIPILA = new Sprite(32,4,1,0,HojaSprite.mapa);
		public static final Sprite ALLENDE = new Sprite (32,5,1,0,HojaSprite.mapa);
		public static final Sprite MARIO = new Sprite(32,6,1,0,HojaSprite.mapa);
		public static final Sprite CACTUS = new Sprite(32,7,1,0,HojaSprite.mapa);
		public static final Sprite BANDERA = new Sprite(32,8,1,0,HojaSprite.mapa);
		public static final Sprite CHILE = new Sprite(32,9,1,0,HojaSprite.mapa);
		public static final Sprite LAVAMAN = new Sprite(32,4,2,0,HojaSprite.mapa);
		public static final Sprite HAMBUSGUESA = new Sprite(32,9,2,0,HojaSprite.mapa);
		public static final Sprite GOKU = new Sprite(32,3,3,0,HojaSprite.mapa);
		public static final Sprite GLADIADOR = new Sprite(32,3,4,0,HojaSprite.mapa);
		public static final Sprite SONIC = new Sprite(32,5,3,0,HojaSprite.mapa);
		public static final Sprite ANUBIS1 = new Sprite(32,5,5,0,HojaSprite.mapa);
		public static final Sprite ANUBIS2 = new Sprite(32,6,5,0,HojaSprite.mapa);
		public static final Sprite FARAON1 = new Sprite(32,7,5,0,HojaSprite.mapa);
		public static final Sprite FARAON2 = new Sprite(32,8,5,0,HojaSprite.mapa);
		public static final Sprite CLEO1 = new Sprite(32,9,5,0,HojaSprite.mapa);
		public static final Sprite CLEO2 = new Sprite(32,0,6,0,HojaSprite.mapa);
		public static final Sprite ARQUERO = new Sprite(32,1,6,0,HojaSprite.mapa);
		public static final Sprite MOMIA = new Sprite(32,2,6,0,HojaSprite.mapa);
		public static final Sprite S_ARMA1 = new Sprite(32,0,7,0,HojaSprite.mapa);
		public static final Sprite S_ARMA2 = new Sprite(32,1,7,0,HojaSprite.mapa);
		public static final Sprite S_ARMA3 = new Sprite(32,2,7,0,HojaSprite.mapa);
		public static final Sprite S_ARMA4 = new Sprite(32,3,7,0,HojaSprite.mapa);
		
		//fin de la coleccion
	
	public Sprite(final int lado, final int columna, final int fila, final int version, final HojaSprite hoja) {
		this.lado = lado;

		pixeles = new int[lado * lado];

		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;

		cargarSprite(version);
	}
	
	public int obtenLado() {
		return lado;
	}

	private void cargarSprite(int version) {
		if (version == 0) {
			cargaNormal();
		} else {
			cargaManipulada(version);
		}
	}

	private void cargaNormal() {
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
	}

	private void cargaManipulada(int version) {
		int[] pixelesTemporales = iniciarPixelesTemporales();

		switch (version) {
			case 1 :
				invertirX(pixelesTemporales);
				break;
			case 2 :
				invertirY(pixelesTemporales);
				break;
			case 3 :
				invertirXY(pixelesTemporales);
				break;
			case 4 :
				rotar90I(pixelesTemporales);
				break;
			case 5 :
				rotar90D(pixelesTemporales);
				break;
			case 6 :
				rotarI90InvertirY(pixelesTemporales);
				break;
			case 7 :
				rotarD90InvertirY(pixelesTemporales);
				break;
			default :
				cargaNormal();
		}
	}

	private int[] iniciarPixelesTemporales() {
		int[] pixelesTemporales = new int[lado * lado];
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				pixelesTemporales[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
		return pixelesTemporales;
	}

	// 1
	private void invertirX(int[] pixelesTemporales) {
		int i = 0;
		for (int y = 0; y < lado; y++) {
			for (int x = lado - 1; x > -1; x--) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 2
	private void invertirY(int[] pixelesTemporales) {
		int i = 0;
		for (int y = lado - 1; y > -1; y--) {
			for (int x = 0; x < lado; x++) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 3
	private void invertirXY(int[] pixelesTemporales) {
		for (int i = 0; i < pixeles.length; i++) {
			pixeles[i] = pixelesTemporales[pixelesTemporales.length - 1 - i];
		}
	}

	// 4
	private void rotar90I(int[] pixelesTemporales) {
		int i = 0;
		for (int x = lado - 1; x > -1; x--) {
			for (int y = 0; y < lado; y++) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 5
	private void rotar90D(int[] pixelesTemporales) {
		int i = 0;
		for (int x = 0; x < lado; x++) {
			for (int y = lado - 1; y > -1; y--) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 6
	private void rotarI90InvertirY(int[] pixelesTemporales) {
		int i = 0;
		for (int x = 0; x < lado; x++) {
			for (int y = 0; y < lado; y++) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 7
	private void rotarD90InvertirY(int[] pixelesTemporales) {
		int i = 0;
		for (int x = lado - 1; x > -1; x--) {
			for (int y = lado - 1; y > -1; y--) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}
	public int getLado() {
		return lado;
	}
	
}
