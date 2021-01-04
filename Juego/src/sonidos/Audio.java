package sonidos;

import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class Audio {
	static Clip audio;
	String url= "/Musica/";
	
	
	public void Play(String name){
		try {
			audio =AudioSystem.getClip();
			audio.open(AudioSystem.getAudioInputStream(getClass().getResource(url+name+".wav")));
			audio.start();
			audio.loop(Clip.LOOP_CONTINUOUSLY);
		}catch(Exception e){
			JOptionPane.showInputDialog(name);
		}
	}

	public void detener() {
		audio.stop();
	}
	
	public float getVolume() {
	    FloatControl gainControl = (FloatControl) audio.getControl(FloatControl.Type.MASTER_GAIN);        
	    return (float) Math.pow(10f, gainControl.getValue() / 20f);
	}

	public void setVolume(float volume) {
	    if (volume < 0f || volume > 1f)
	        throw new IllegalArgumentException("Volume not valid: " + volume);
	    FloatControl gainControl = (FloatControl) audio.getControl(FloatControl.Type.MASTER_GAIN);        
	    gainControl.setValue(20f * (float) Math.log10(volume));
	}
}
