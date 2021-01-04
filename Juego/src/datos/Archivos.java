package datos;

import java.io.*;
public class Archivos {
	
	public int[] leerTxt(String ruta) {
		
		int [] texto = new int[4];
		String []temp = new String[20];
		int []aux = {0,0,0,0};
		
		try{
			@SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(new FileReader(ruta));
			
			int bfRead;
			int i=0;
			
			while((bfRead = bf.read()) != -1) {
					temp[i] = String.valueOf((char)bfRead);						
					
					i++;	
			}
			
			
					
		}catch(Exception e) {
			System.err.println("No se encontro Archivo en:" + ruta);
		}
		
		int j=0;
		for(int i = 0; temp[i] != null ; i++) {
			if(temp[i].charAt(0) == 32) {
				j++;
			}
			else {
				aux[j] = aux[j]*10 + Integer.parseInt(temp[i]);
			}
						
		}
		
		texto[0] = aux[0];
		texto[1] = aux[1];
		texto[2] = aux[2];
		texto[3] = aux[3];
		
		return texto;
		
	}
	
	public void escribirTxt(String ruta, int x, int y, int vida, int puntos) {
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
			f = new File(ruta);
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.write(x + " " + y + " " + vida + " " + puntos);
			
			wr.close();
			bw.close();
			
		}catch(Exception e) {
			System.err.println("No se encontro Archivo en:" + ruta);
		}
		
	}
	
}
