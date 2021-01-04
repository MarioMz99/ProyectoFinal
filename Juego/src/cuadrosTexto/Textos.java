package cuadrosTexto;

public class Textos {
	
	private int id;
	private String texto;

	public Textos(int id, String texto) {
		this.id = id;
		this.texto = texto;
	}	
	
	public String getTexto() {
		return texto;
	}
	
	public int getId() {
		return id;
	}		
}
