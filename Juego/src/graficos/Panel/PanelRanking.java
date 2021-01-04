package graficos.Panel;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import graficos.FondoSwing;

public class PanelRanking extends JPanel{
	public JButton btnBack = new JButton();
	public JTable tabla = new JTable();
	public JScrollPane jsp;
	public DefaultTableModel modeloTabla;

	public PanelRanking() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("recursos/Imagenes/fondos/fondoR.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		modeloTabla=new DefaultTableModel(){
			public boolean isCellEditable(int fila, int columna){
				return false;
			}
		};
		
		modeloTabla.addColumn("Posicion");
		modeloTabla.addColumn("Nombre");
		modeloTabla.addColumn("Puntos");
		
		tabla=new JTable(modeloTabla);
		jsp=new JScrollPane(tabla);
		jsp.setViewportView(tabla);
		
		jsp.setBounds(65,20,490,400);
		btnBack.setBounds(554, 0, 64, 64);
		
		btnBack.setOpaque(false);
		btnBack.setBackground(new Color(0,0,0,0));
		btnBack.setBorderPainted(false);
		
		ImageIcon title = new ImageIcon("recursos/Imagenes/botones/back.png");
		btnBack.setIcon(new ImageIcon(title.getImage().getScaledInstance(btnBack.getWidth(),btnBack.getHeight(), Image.SCALE_SMOOTH)));
		
		add(jsp);
		add(btnBack);
	}
}
