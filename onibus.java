package onibus.aula1;
import java.util.Scanner;

public class onibus {
	public static void main (String []Args) {
		String destino = "";
		int numero = 0;
	
		System.out.println("Digite o seu destino:");
		System.out.println("Norte");
		System.out.println("Nordeste");
		System.out.println("Centro-Oeste");
		java.util.Scanner s = new Scanner(System.in);
		destino = s.next();
		System.out.println("");
		System.out.println("Digite 1 somente para ida");
		System.out.println ("Digite 2 para ida e volta");
		numero = s.nextInt();
	
		System.out.println("");
		
		if (numero == 2) {
			if (destino.equalsIgnoreCase("norte")) {
				System.out.println("As Passagens custarão R$740");
			}
			if (destino.equalsIgnoreCase("nordeste")) {
				System.out.println("As Passagens custarão R$655");
			}
			if (destino.equalsIgnoreCase("centro-oeste")) {
				System.out.println("As Passagens custarão R$807");
			}
		}
		if (numero == 1) {
			if (destino.equalsIgnoreCase("norte")) {
				System.out.println("A Passagem custará R$400");
			}
			if (destino.equalsIgnoreCase("nordeste")) {
				System.out.println("A Passagem custará R$345");
			}
			if (destino.equalsIgnoreCase("centro-oeste")) {
				System.out.println("A Passagem custará R$448");
			}
		}
	}
}
