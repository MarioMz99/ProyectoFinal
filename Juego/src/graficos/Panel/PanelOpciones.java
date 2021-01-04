package graficos.Panel;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import graficos.FondoSwing;

public class PanelOpciones extends JPanel{
	public JButton btnBack = new JButton();

	public PanelOpciones() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("recursos/Imagenes/fondos/fondoOp.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		btnBack.setBounds(554, 0, 64, 64);
		
		btnBack.setOpaque(false);
		btnBack.setBackground(new Color(0,0,0,0));
		btnBack.setBorderPainted(false);
		
		ImageIcon title = new ImageIcon("recursos/Imagenes/botones/back.png");
		btnBack.setIcon(new ImageIcon(title.getImage().getScaledInstance(btnBack.getWidth(),btnBack.getHeight(), Image.SCALE_SMOOTH)));
		
		add(btnBack);
	}
}
