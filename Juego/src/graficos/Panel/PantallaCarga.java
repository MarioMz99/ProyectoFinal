package graficos.Panel;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;                
import graficos.FondoSwing;
import graficos.Ventana.VentanaPrincipal;

public class PantallaCarga extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JProgressBar progressBar = new JProgressBar();

	public PantallaCarga() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("recursos/imagenes/fondos/fondoU.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		progressBar.setMaximum(35);
		progressBar.setBounds(150, 400, 250, 15);
	    this.add(progressBar);
	    VentanaPrincipal.loadProgressBar();
	    setSize(256, 256);
	    this.setOpaque(false);
		this.setBackground(new Color(0,0,0,0));
	}
}
