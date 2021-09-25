package aula02;

import java.util.Scanner;

public class Hora_funcionario {
	public static void main (String []Args) {
		double horastrabalhadas = 0,salariohora = 0;
		System.out.println("Digite a quantidade de horas trabalhadas no mes:");
		java.util.Scanner s = new Scanner (System.in);
		horastrabalhadas=s.nextDouble();
		System.out.println("");
		System.out.println("Digite o salário/hora:");
		salariohora=s.nextDouble();
		System.out.println("");
		System.out.println("");
		if ((horastrabalhadas-160) <=0) {
			System.out.println("Seu salário esse mes será de: "+(horastrabalhadas*salariohora));
		} else {
			System.out.println("Seu salário esse mes será de: "+ ((160*salariohora)+((horastrabalhadas-160)*salariohora*1.5)));
		}
	}
} 