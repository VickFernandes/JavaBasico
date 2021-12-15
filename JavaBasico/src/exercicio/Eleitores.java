package exercicio;

import java.util.Scanner;

public class Eleitores {
	
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int eleitores, brancos, nulos, validos;
		
		System.out.println("Digite a quantidade total de eleitores de um município:");
		eleitores = sc.nextInt();
		
		System.out.println("Digite a quantidade total de votos brancos de um município");
		brancos = sc.nextInt();
		
		System.out.println("Digite a quantidade total de votos nulos de um município");
		nulos = sc.nextInt();
		
		System.out.println("Digite a quantidade total de votos válidos de um município");
		validos = sc.nextInt();
		
		float pbrancos, pnulos, pvalidos;
		
		pbrancos = ((brancos * 100) / eleitores);
		
		pnulos = ((nulos * 100) / eleitores);
		
		pvalidos = ((validos * 100) / eleitores);
		
		System.out.print("A porcentagem de votos brancos é de:" + pbrancos );
		sc.close();
		
		System.out.print("A porcentagem de votos nulos é de:" + pnulos );
		sc.close();
		
		System.out.print("A porcentagem de votos nulos é de:" + pvalidos );
		sc.close();
	}


}
