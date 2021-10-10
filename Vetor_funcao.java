package funcoes;
import java.util.Scanner;

public class Vetor_funcao {

	public static void main (String[] args) {
		double [] valores = new double[3];
		double resposta = 0;
		
		System.out.println("Digite as valores e aperte Enter");
		Scanner s = new Scanner (System.in);
		
		for (int i=0;i<valores.length;i++) {  // ler os valores digitados
			valores[i]=s.nextDouble();}
		
		escreva("");
		escreva("A média dos tres números é: ");
		resposta = media(valores); //chama a funcao média e valores entra como parametro
		System.out.println(resposta);
		
		
	}
	
	public static void escreva (String frase) {
		System.out.println(frase);}
	
	public static double media (double[]valores) {
		double  media = 0;
		
		for (int i=0;i<valores.length;i++) {  // somar os valores
			media = media + valores[i];}
		
		media = media/valores.length;
		return media; }
	
}
