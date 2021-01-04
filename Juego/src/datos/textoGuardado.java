package datos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textoGuardado extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jlb1;
	private JButton jb1;
	private JPanel jp1;
	
	public textoGuardado() {
		super("GAME SAVED");
		this.setBounds(520, 500, 350, 130);
		crearEtiquetas();
		crearBoton();
		crearPanel();
		this.setVisible(true);
	}
	
	public void crearEtiquetas() {
		jlb1 = new JLabel("EL JUAGO SE HA GUARDADO CON EXITO... SALIENDO");
	}
	
	
	public void crearBoton() {
		jb1 = new JButton("OK");
		jb1.addActionListener(this);
	}
	
	public void crearPanel() {
		jp1 = new JPanel();
		jp1.add(jlb1);
		jp1.add(jb1);
		getContentPane().add(jp1, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jb1) {
            System.exit(0);
        }
		
	}
	
}
