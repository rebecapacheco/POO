package vetores;

import java.util.Scanner;

public class Provadequimica {

	public static void main (String []Args) {
		double [] notas = new double[20];
		
	System.out.println("Digite as notas e aperte Enter");
	Scanner s = new Scanner (System.in);
	
	for (int i=0;i<notas.length;i++) {
		notas[i]=s.nextDouble(); }
	
	System.out.println("");
	System.out.println("Notas acima de 7,5:");
	
	for (int i=0;i<notas.length;i++) {
		if (notas[i]>7.5)
			System.out.println (notas[i]);
	}

	
	}
	
}
