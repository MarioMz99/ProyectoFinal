package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;
import graficos.Panel.PanelSplash;
import graficos.Ventana.VentanaPrincipal;

public class SplashScreen {
	static boolean isRegistered;
    private static int count;
    private static Timer timer1;
    static JFrame frame = new JFrame();
    PanelSplash ps = new PanelSplash();
    
	public SplashScreen() {
		frame.setLayout(null);
    	frame.setBounds(550,250,512,512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ps);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        frame.setVisible(true);
	}
	public static void loadProgressBar() {
        ActionListener al = new ActionListener() {
            @SuppressWarnings("unused")
			private VentanaPrincipal vp;

			public void actionPerformed(ActionEvent evt) {
                count++;
                PanelSplash.progressBar.setValue(count);
                PanelSplash.progressBar.setForeground(Color.GREEN);

                if (count == 50) {
                    frame.setVisible(false);
                    createFrame();
                    timer1.stop();
                }
            }

            private void createFrame(){
            	vp = new VentanaPrincipal();
            }
        };
        timer1 = new Timer(50, al);
        timer1.start();
    }
}
