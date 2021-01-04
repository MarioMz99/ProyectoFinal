package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa{

	private int[] pixeles;
	
	public MapaCargado(String ruta) {
		super(ruta);
	}
	
	protected void cargarMapa(String ruta) {
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
			
			ancho = imagen.getWidth();
			alto = imagen.getHeight();
			
			cuadroCatalogo = new Cuadro[ancho * alto];
			pixeles = new int [ancho * alto];
			
			imagen.getRGB(0, 0, ancho, alto,pixeles, 0, ancho);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void generarMapa() {
		for(int i = 0; i < pixeles.length; i++) {
			switch(pixeles[i]) {
			case 0xffefedab:
				cuadroCatalogo[i] = Cuadro.ARENA;
				continue;
			case 0xff6add4b:
				cuadroCatalogo[i] = Cuadro.PASTO;
				continue;
			case 0xff5aaee4:
				cuadroCatalogo[i] = Cuadro.AGUA;
				continue;
			case 0xffc0c0c0:
				cuadroCatalogo[i] = Cuadro.PIEDRA;
				continue;
			case 0xff94785c:
				cuadroCatalogo[i] = Cuadro.TIERRA;
				continue;
			case 0xff78502d:
				cuadroCatalogo[i] = Cuadro.MEX1;
				continue;
			case 0xff78aaff:
				cuadroCatalogo[i] = Cuadro.BOCHO;
				continue;
			case 0xffc8c8c8:
				cuadroCatalogo[i] = Cuadro.CALLE;
				continue;
			case 0xff8c6f38:
				cuadroCatalogo[i] = Cuadro.BMAN;
				continue;
			case 0xff323232:
				cuadroCatalogo[i] = Cuadro.CAMINO1;
				continue;
			case 0xff9d5224:
				cuadroCatalogo[i] = Cuadro.BURRO;
				continue;
			case 0xff832724:
				cuadroCatalogo[i] = Cuadro.MIGUEL;
				continue;
			case 0xff3033ff: 
				cuadroCatalogo[i] = Cuadro.POLICIA;
				continue; 
			case 0xff30a530:
				cuadroCatalogo[i] = Cuadro.MORELOS;
				continue;
			case 0xffe8d1c0:
				cuadroCatalogo[i] = Cuadro.PIPILA;
				continue;
			case 0xff5e85b1:
				cuadroCatalogo[i] = Cuadro.ALLENDE;
				continue;
			case 0xffa01e1e:
				cuadroCatalogo[i] = Cuadro.MARIO;
				continue;
			case 0xff82aa41: 
				cuadroCatalogo[i] = Cuadro.CACTUS;
				continue;
			case 0xffbf3c3c:
				cuadroCatalogo[i] = Cuadro.BANDERA;
				continue;
			case 0xffbd1414:
				cuadroCatalogo[i] = Cuadro.CHILE;
				continue;
			case 0xffc873c8: 
				cuadroCatalogo[i] = Cuadro.C_POLICIA;
				continue;
			case 0xffbd4318: 
				cuadroCatalogo[i] = Cuadro.LAVA;
				continue;
			case 0xffc80000:
				cuadroCatalogo[i] = Cuadro.MAGMA;
				continue;
			case 0xff606060: 
				cuadroCatalogo[i] = Cuadro.ROCA;
				continue;
			case 0xffb66832:
				cuadroCatalogo[i] = Cuadro.LAVAMAN;
				continue;
			case 0xffb84418: 
				cuadroCatalogo[i] = Cuadro.LAVACUP;
				continue;
			case 0xff646464: 
				cuadroCatalogo[i] = Cuadro.CAMINO2;
				continue;
			case 0xff969696:	
				cuadroCatalogo[i] = Cuadro.CAMINO3;
				continue;
			case 0xffe13c3c: 
				cuadroCatalogo[i] = Cuadro.SSTOP;
				continue;
			case 0xffa0733c: 
				cuadroCatalogo[i] = Cuadro.HAMBURGUESA;
				continue;
			case 0xffb3babd:
				cuadroCatalogo[i] = Cuadro.EDIFICIO;
				continue;
			case 0xffed631a: 
				cuadroCatalogo[i] = Cuadro.GOKU;
				continue;
			case 0xff1d35dd: 
				cuadroCatalogo[i] = Cuadro.SONIC;
				continue;
			case 0xfffad3e:
				cuadroCatalogo[i] = Cuadro.C_VERTICAL;
				continue;
			case 0xffceba3e: 
				cuadroCatalogo[i] = Cuadro.C_HORIZONTAL;
				continue;
			case 0xffaf2421:
				cuadroCatalogo[i] = Cuadro.LADRILLOS;
				continue;
			case 0xff72a721: 
				cuadroCatalogo[i] = Cuadro.ARBOL;
				continue;
			case 0xffc7c4c2: 
				cuadroCatalogo[i] = Cuadro.ROCA2;
				continue;
			case 0xff965c35: 
				cuadroCatalogo[i] = Cuadro.LODO;
				continue;
			case 0xff3232af:
				cuadroCatalogo[i] = Cuadro.AGUA2;
				continue;
			case 0xff493c27: 
				cuadroCatalogo[i] = Cuadro.GLADIADOR;
				continue;
			case 0xffaf9b82: 
				cuadroCatalogo[i] = Cuadro.ESCALERA;
				continue;
			case 0xff7e8035: 
				cuadroCatalogo[i] = Cuadro.CAMINO4;
				continue;
			case 0xff7e591d: 
				cuadroCatalogo[i] = Cuadro.DECORACION1;
				continue;
			case 0xff072b1d: 
				cuadroCatalogo[i] = Cuadro.FABRICA1;
				continue;
			case 0xff2250a4: 
				cuadroCatalogo[i] = Cuadro.DEP_AGUA;
				continue;
			case 0xff6179a4: 
				cuadroCatalogo[i] = Cuadro.FABRICA2;
				continue;
			case 0xff1a1d1f: 
				cuadroCatalogo[i] = Cuadro.CEMENTERIO;
				continue;
			case 0xffe8e6e6: 
				cuadroCatalogo[i] = Cuadro.HOSPITAL;
				continue;
			case 0xff4482e6: 
				cuadroCatalogo[i] = Cuadro.OF_POLICIA;
				continue;
			case 0xff6482dc:
				cuadroCatalogo[i] = Cuadro.NIEVE;
				continue;
			case 0xff60df98: 
				cuadroCatalogo[i] = Cuadro.PASTO_NIEVE;
				continue;
			case 0xff60dfdd: 
				cuadroCatalogo[i] = Cuadro.HIELO;
				continue;
			case 0xff4f7e41: 
				cuadroCatalogo[i] = Cuadro.PASTO_HOJA;
				continue;
			case 0xff4f5241: 
				cuadroCatalogo[i] = Cuadro.ROCA3;
				continue;
			case 0xffa2af52:
				cuadroCatalogo[i] = Cuadro.ANUBIS1;
				continue;
			case 0xffbfc46d: 
				cuadroCatalogo[i] = Cuadro.ANUBIS2;
				continue;
			case 0xff555c6d: 
				cuadroCatalogo[i] = Cuadro.FARAON1;
				continue;
			case 0xff57728d: 
				cuadroCatalogo[i] = Cuadro.FARAON2;
				continue;
			case 0xffd1c441: 
				cuadroCatalogo[i] = Cuadro.CLEO1;
				continue;
			case 0xff9d8741:
				cuadroCatalogo[i] = Cuadro.CLEO2;
				continue;
			case 0xff655c41:
				cuadroCatalogo[i] = Cuadro.ARQUERO;
				continue;
			case 0xffebe641:
				cuadroCatalogo[i] = Cuadro.MOMIA;
				continue;
			case 0xfffabb1a: 
				cuadroCatalogo[i] = Cuadro.ARENA2;
				continue;
			case 0xfff59852:
				cuadroCatalogo[i] = Cuadro.CAMELLO;
				continue;
			case 0xffe27737: 
				cuadroCatalogo[i] = Cuadro.PIRAMIDE;
				continue;
			case 0xff8d7737: 
				cuadroCatalogo[i] = Cuadro.CASA_EGYPT;
				continue;
			case 0xffbd9b72: 
				cuadroCatalogo[i] = Cuadro.BURRO2;
				continue;
			case 0xff386bba: 
				cuadroCatalogo[i] = Cuadro.LAGUNA;
				continue;
			case 0xff615e35:
				cuadroCatalogo[i] = Cuadro.AGUILA;
				continue;
			case 0xff326056: // 50,96,86
				cuadroCatalogo[i] = Cuadro.S_ARMA1;
				continue;
			case 0xff7b96aa: //123,150,170
				cuadroCatalogo[i] = Cuadro.S_ARMA2;
				continue;
			case 0xff8bbd77://139,189,119
				cuadroCatalogo[i] = Cuadro.S_ARMA3;
				continue;
			case 0xfff78c65: //247,140,101
				cuadroCatalogo[i] = Cuadro.S_ARMA4;
				continue;
			default:
				cuadroCatalogo[i] = Cuadro.VACIO1;
			}
			
		}
	}
}
