package graficos.Panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import graficos.FondoSwing;

@SuppressWarnings("serial")
public class PanelUsuario extends JPanel {
	JLabel lblName = new JLabel();
	public JButton btnLogin =  new JButton();
	public JTextField txtUsuario = new JTextField();
	
	public PanelUsuario() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("recursos/imagenes/fondos/fondoU.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		this.setLayout(null); 
		this.setVisible(true);
		this.setBounds(400,100,550,500);
		txtUsuario.setBounds(135, 100, 350, 100);
		btnLogin.setBounds(210, 200, 200, 100);
		lblName.setBounds(115, 0, 400, 100);

		Font fuente = new Font("Agency FB", Font.BOLD, 30);
		
		txtUsuario.setFont(fuente); 
		txtUsuario.setForeground(new Color(48, 172, 108));
		txtUsuario.setOpaque(false);
		txtUsuario.setBackground(new Color(0,0,0,0));
		
		btnLogin.setOpaque(false);
		btnLogin.setBackground(new Color(0,0,0,0));
		btnLogin.setBorderPainted(false);
		
		ImageIcon title = new ImageIcon("recursos/Imagenes/otras/login.png");
		lblName.setIcon(new ImageIcon(title.getImage().getScaledInstance(lblName.getWidth(), lblName.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon icon = new ImageIcon("recursos/Imagenes/otras/ingresar.png");
		btnLogin.setIcon(new ImageIcon(icon.getImage().getScaledInstance(btnLogin.getWidth(), btnLogin.getHeight(), Image.SCALE_SMOOTH)));
		
		add(txtUsuario);
		add(lblName);
		add(btnLogin);
	}
}
