package aula02;
import java.util.Scanner;

public class Raizquadrada {
	public static void main (String []Args) {
		double c=0,x=0,raiz=0;
		System.out.println("Digite o valor da raiz a ser calculado:");
		java.util.Scanner s = new Scanner (System.in);
		c=s.nextDouble();
		x = ((1+c)/2);
		System.out.println("n          Xn");
		System.out.println("1          " + x);
		raiz = Math.sqrt(c);
		for (int n =2;n<=10;n=n+1) {
			x = (((c/x)+x)/2);
			System.out.println(n + "          " + x);
			if (Math.abs(raiz-x)<0.00001) {        //Math.abs é tipo módulo
				break;
			}
		}
		
	}
}
