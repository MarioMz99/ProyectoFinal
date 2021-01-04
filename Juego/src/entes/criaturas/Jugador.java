
package entes.criaturas;

import graficos.Pantalla;
import graficos.Sprite;
import graficos.Ventana.VentanaPrincipal;
import mapa.Mapa;

import static graficos.Sprite.IZQ0;
import control.Teclado;

public class Jugador extends Criatura {
	int i = 0;

	private Teclado teclado;
	private int animacion;
	private int vidas;
	private int puntos;

	public Jugador(Mapa mapa, Teclado teclado, Sprite sprite) {
		this.teclado = teclado;
		this.sprite = sprite;
		this.mapa = mapa;
	}

	public Jugador(Mapa mapa,Teclado teclado, Sprite sprite, int posicionX, int posicionY, int vidas, int puntos) {
		this.teclado = teclado;
		this.sprite = sprite;
		this.x = posicionX;
		this.y = posicionY;
		this.mapa = mapa;
		this.vidas = vidas;
		this.puntos = puntos;
	}

	public void actualizar(boolean act) {
		if(act) {
			int desplazamientoX = 0;
			int desplazamientoY = 0;

			int velocidadMovimiento = 2;

			if (animacion < 32767) {
				animacion++;
			} else {
				animacion = 0;
			}

			if (teclado.correr) {
				velocidadMovimiento = 6;
			}

			if (teclado.arriba) {
				desplazamientoY -= velocidadMovimiento ;
			}
			if (teclado.abajo) {
				desplazamientoY += velocidadMovimiento ;
			}
			if (teclado.izquierda) {
				desplazamientoX -= velocidadMovimiento ;
			}
			if (teclado.derecha) {
				desplazamientoX += velocidadMovimiento;
			}
			if(teclado.continuar) {
				VentanaPrincipal.game.setEnabled(true);
			}
			
			if(teclado.abrir) {
			
			}

			if (desplazamientoX != 0 || desplazamientoY != 0) {
				mover(desplazamientoX, desplazamientoY);
				enMovimiento = true;
			} else {
				enMovimiento = false;
			}

			int resto = animacion % 80;

			
			if (direccion == 'o'|| direccion == 'n'|| direccion == 's') {
				sprite = Sprite.IZQ0;
				if (enMovimiento) {
					if (resto > 10 && resto <= 20) {
						sprite = Sprite.IZQ1;
					} else if (resto > 20 && resto <= 30) {
						sprite = Sprite.IZQ0;
					} else if (resto > 30 && resto <= 40) {
						sprite = Sprite.IZQ2;
					} else if (resto > 40 && resto <= 50){
						sprite = Sprite.IZQ3;
					} else if (resto > 50 && resto <= 60){
						sprite = Sprite.IZQ4;
					} else if (resto > 60 && resto <= 70){
						sprite = Sprite.IZQ5;
					} else if(resto > 70) {
						sprite = Sprite.IZQ6;
					} else {
						sprite = IZQ0;
					}
				}
			}
			
			if (direccion == 'e' || direccion == 'n'|| direccion == 's') {
				sprite = Sprite.DER0;
				if (enMovimiento) {
					if (resto > 10 && resto <= 20) {
						sprite = Sprite.DER1;
					} else if (resto > 20 && resto <= 30) {
						sprite = Sprite.DER0;
					} else if (resto > 30 && resto <= 40) {
						sprite = Sprite.DER2;
					} else if (resto > 40 && resto <= 50) {
						sprite = Sprite.DER3;
					} else if (resto > 50 && resto <= 60) {
						sprite = Sprite.DER4;
					} else if (resto > 60 && resto <= 70 ) {
						sprite = Sprite.DER5;
					} else if (resto > 70) {
						sprite = Sprite.DER6;
					} else {
						sprite = Sprite.DER1;
					}
				}
			}
		}
		
	}

	public int getpuntos() {
		return puntos;
	}
	
	public void setpuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void setVidas(int vidas) {
		this.vidas -= vidas;
	}
	
	public void mostrar(Pantalla pantalla) {
		pantalla.mostrarJugador(x, y, this);
	}
}