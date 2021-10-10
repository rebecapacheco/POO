package funcoes;
import java.util.Scanner;

public class Fatorial {
	public static void main (String[] args) {
		int numero,resultado =0;
		escreva("Este programa calcula o fatorial de um número.");
		escreva("Digite aqui o número que voce deseja fatorar:");
		Scanner s = new Scanner (System.in);
		numero=s.nextInt();
		resultado = fatoracao(numero);
		escreva (""+resultado);
	}
	
	public static void escreva (String frase) {
		System.out.println(frase); 
	}
	public static int fatoracao (int numero) {
		int fatoracao=numero;
		while (numero>1) {
			fatoracao = fatoracao*(numero-1);
			numero--;
		}
		return fatoracao;
	}
	
}
