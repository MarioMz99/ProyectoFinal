package graficos.Panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import graficos.FondoSwing;


@SuppressWarnings("serial")
public class PanelMenu extends JPanel {
	public JLabel etiqueta = new JLabel();
	public JLabel lblNameG = new JLabel();
	public JButton btnJugar = new JButton();
	public JButton btnOp = new JButton();
	public JButton btnExit = new JButton();
	public JButton btnRank = new JButton();
	
	public PanelMenu() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("recursos/Imagenes/fondos/fondo.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		lblNameG.setBounds(105, 0, 400, 100);
		etiqueta.setBounds(200, 75, 200, 100);
		btnJugar.setBounds(105, 150, 400,100);
		btnOp.setBounds(135, 260, 350, 80);
		btnExit.setBounds(145, 350, 300, 60);
		btnRank.setBounds(0, 350, 96, 96);

		btnJugar.setOpaque(false);
		btnJugar.setBackground(new Color(0,0,0,0));
		btnJugar.setBorderPainted(false);
		
		btnOp.setOpaque(false);
		btnOp.setBackground(new Color(0,0,0,0));
		btnOp.setBorderPainted(false);

		btnExit.setOpaque(false);
		btnExit.setBackground(new Color(0,0,0,0));
		btnExit.setBorderPainted(false);
		
		btnRank.setOpaque(false);
		btnRank.setBackground(new Color(0,0,0,0));
		btnRank.setBorderPainted(false);
		
		Font fuente = new Font("Agency FB", Font.BOLD, 40);
		etiqueta.setFont(fuente);
		ImageIcon title = new ImageIcon("recursos/Imagenes/otras/title2.png");
		lblNameG.setIcon(new ImageIcon(title.getImage().getScaledInstance(lblNameG.getWidth(),lblNameG.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon = new ImageIcon("recursos/Imagenes/botones/jugar.png");
		btnJugar.setIcon(new ImageIcon(icon.getImage().getScaledInstance(btnJugar.getWidth(), btnJugar.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon2 = new ImageIcon("recursos/Imagenes/botones/opciones.png");
		btnOp.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(btnOp.getWidth(), btnOp.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon3 = new ImageIcon("recursos/Imagenes/botones/Salir.png");
		btnExit.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(btnExit.getWidth(), btnExit.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon4 = new ImageIcon("recursos/Imagenes/otras/rank.png");
		btnRank.setIcon(new ImageIcon(icon4.getImage().getScaledInstance(btnRank.getWidth(), btnRank.getHeight(), Image.SCALE_SMOOTH)));
		
		add(etiqueta);
        add(lblNameG);
		add(btnJugar);
		add(btnOp);
		add(btnExit);
		add(btnRank);
	}
}
