package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprite {
	private final int ancho;
	@SuppressWarnings("unused")
	private final int alto;
	public final int[] pixeles;
	
	///coleccion de hojas de Sprites
	public static HojaSprite mapa = new HojaSprite("/texturas/spriteM.png",320,320);
	public static HojaSprite jugador = new  HojaSprite("/texturas/prueba.png",320,320);
	///fin de la colecion
	
	public HojaSprite(final String ruta, final int ancho, final int alto) {
		this.ancho=ancho;
		this.alto=alto;
		
		pixeles = new int[ancho * alto];
		
		BufferedImage imagen;
		try {
			System.out.println(HojaSprite.class.getResource(ruta));
			imagen = ImageIO.read(HojaSprite.class.getResource(ruta));
			imagen.getRGB(0, 0, ancho, alto,pixeles, 0,ancho);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getAncho() {
		return ancho;
	}
}
