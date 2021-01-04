package graficos.Panel;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import graficos.FondoSwing;
import graficos.SplashScreen;

@SuppressWarnings("serial")
public class PanelSplash extends JPanel{
	
	public static JProgressBar progressBar = new JProgressBar();

	public PanelSplash() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("recursos/imagenes/fondos/splash3.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		progressBar.setMaximum(50);
		progressBar.setBounds(0, 240, 250, 15);
	    this.add(progressBar);
	    SplashScreen.loadProgressBar();
	    setSize(256, 256);
	    this.setOpaque(false);
		this.setBackground(new Color(0,0,0,0));
	}
}
