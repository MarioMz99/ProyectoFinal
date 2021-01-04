package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
	protected int ancho;
	protected int alto;
	
	protected int[] cuadros;
	protected Cuadro[] cuadroCatalogo;
	
	public Mapa(String ruta) {
		cargarMapa(ruta);
		generarMapa();
	}
	
	protected void cargarMapa(String ruta) {
	}
 	
	protected void generarMapa() {
	}
	
	public void actualizar() {
	}
	
	public void mostrar(final int compesacionX,final int compesacionY, final Pantalla pantalla) {
		
		pantalla.setDiferencia(compesacionX, compesacionY);
		
		int o = compesacionX >> 5 ;
		int e = (compesacionX + pantalla.getAncho() + Cuadro.LADO) >> 5;
		int n = compesacionY >> 5;
		int s = (compesacionY + pantalla.getAlto() + Cuadro.LADO) >> 5 ;

		for(int y = n; y < s ; y++) {
			for(int x = o ; x < e ; x++) {
				if(x < 0 || y < 0 || x >= ancho || y >= alto ) {
					Cuadro.VACIO1.mostrar(x, y, pantalla);
				}else {
					cuadroCatalogo[x + y * ancho].mostrar(x, y, pantalla);
					
				}
			}
		}
	}
	
	public Cuadro getCuadroCatalogo(int posicion) {
		return cuadroCatalogo[posicion];
	}
	
	public int getAncho() {
		return ancho;
	}
}
