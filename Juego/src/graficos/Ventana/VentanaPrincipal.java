package graficos.Ventana;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

//import entes.criaturas.PersonajesMapa;
import game.Game;
import graficos.Panel.PanelMenu;
import graficos.Panel.PanelOpciones;
import graficos.Panel.PanelRanking;
import graficos.Panel.PanelUsuario;
import graficos.Panel.PantallaCarga;
import sonidos.Audio;

public class VentanaPrincipal{
	
	static boolean isRegistered;
    private static int count;
    private static Timer timer1;
	public static JFrame frame = new JFrame();
	public static PanelMenu menu = new PanelMenu();
	public static PanelOpciones op = new PanelOpciones();
	public static PanelRanking pr =  new PanelRanking();
	
	Component mensaje = new JLabel("Error no ha ingresado un nombre");
	public static PanelUsuario pu = new PanelUsuario();
	static PantallaCarga pc;
	public static Audio audio = new Audio();
	public static Game game;
	
	public VentanaPrincipal() {
		frame.setBounds(400,100,640,480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(op);
		frame.add(pr);
		pr.setVisible(true);
		frame.add(pu);
		
		frame.setResizable(false);
		frame.setVisible(true);

		audio.Play("audioU");
		audio.setVolume((float) 0.1);
		acciones();
	}

	private void acciones() {
		pu.btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(pu.txtUsuario.getText().equals("")) {
		            JOptionPane.showMessageDialog(mensaje, mensaje, "Error", JOptionPane.ERROR_MESSAGE, null);
				}else {
					pu.setVisible(false);
					audio.detener();
					audio.Play("audio");
					menu.etiqueta.setText("Hola "+pu.txtUsuario.getText());   
					audio.setVolume((float) 0.1);
					frame.add(menu);
				}
			}
		});
		
		menu.btnJugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				pc = new PantallaCarga();
				menu.setVisible(false);
				pc.setVisible(true);
                frame.add(pc);
				loadProgressBar();
				audio.detener();
				audio.Play("audioJugar");
				audio.setVolume((float) 0.1);
				
			}
		});
		menu.btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menu.btnOp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.add(op);
				op.setVisible(true);
				menu.setVisible(false);
			}			
		});
		
		op.btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				op.setVisible(false);
				menu.setVisible(true);
			}
		});
		
		menu.btnRank.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(false);
				pr.setVisible(true);
				frame.add(pr);
			}
		});
		
		pr.btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				menu.setVisible(true);
				pr.setVisible(false);
				pr.jsp.setVisible(false);
				pr.tabla.setVisible(false);
			}			
		});
	}
	public static void loadProgressBar() {
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                count++;
                PantallaCarga.progressBar.setValue(count);
                PantallaCarga.progressBar.setForeground(Color.GREEN);
                if (count == 35) {
                    frame.add(pc);       
						createFrame();					
                    timer1.stop();
                }
            }

            private void createFrame() {
            	game = new Game();
            	frame.add(game);
            	frame.pack();
            	pc.setVisible(false);
            	game.setVisible(true);
            	game.iniciar();
            }
        };
        timer1 = new Timer(35, al);
        timer1.start();
    }
}
