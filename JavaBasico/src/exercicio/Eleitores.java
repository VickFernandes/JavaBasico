package exercicio;

import java.util.Scanner;

public class Eleitores {
	
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int eleitores, brancos, nulos, validos;
		
		System.out.println("Digite a quantidade total de eleitores de um munic�pio:");
		eleitores = sc.nextInt();
		
		System.out.println("Digite a quantidade total de votos brancos de um munic�pio");
		brancos = sc.nextInt();
		
		System.out.println("Digite a quantidade total de votos nulos de um munic�pio");
		nulos = sc.nextInt();
		
		System.out.println("Digite a quantidade total de votos v�lidos de um munic�pio");
		validos = sc.nextInt();
		
		float pbrancos, pnulos, pvalidos;
		
		pbrancos = ((brancos * 100) / eleitores);
		
		pnulos = ((nulos * 100) / eleitores);
		
		pvalidos = ((validos * 100) / eleitores);
		
		System.out.print("A porcentagem de votos brancos � de:" + pbrancos );
		sc.close();
		
		System.out.print("A porcentagem de votos nulos � de:" + pnulos );
		sc.close();
		
		System.out.print("A porcentagem de votos nulos � de:" + pvalidos );
		sc.close();
	}


}
