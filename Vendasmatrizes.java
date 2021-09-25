package vetores;

import java.util.Scanner;

public class Vendasmatrizes {

	public static void main(String[] args) {
		int [][] trimestresregioes = new int [4][5];
		int soma = 0;
		String resposta;
		Scanner s = new Scanner (System.in);	
		
		
		//ler a matriz 4x5 (trimestre x regiao)
		for (int i=0; i<trimestresregioes.length;i++) {
		
			for (int j=0; j<trimestresregioes[i].length;j++) {
				System.out.println("Digite as vendas do "+i+" trimestre e "+j+" regiao:");
				trimestresregioes[i][j]=s.nextInt();
				soma = soma+trimestresregioes[i][j];
			}
			System.out.println("");
		}
		System.out.println("Voce deseja checar se está tudo certo?");
		System.out.println("Digite 'Sim' para sim");
		System.out.println("Digite 'Nao' para nao");
		resposta=s.next();
		
		
		//mostrar a tabela
		if (resposta.equalsIgnoreCase("sim")) {
			for (int i=0; i<trimestresregioes.length;i++) {
				for (int j=0; j<trimestresregioes[i].length;j++) {
					System.out.print(trimestresregioes[i][j]+"   ");
				}
				System.out.println("");
			}
		}
		
		
		
		
	}

}
