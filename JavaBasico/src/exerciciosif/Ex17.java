package exerciciosif;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		
		double n1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota do aluno:");
		
		double n2 = sc.nextInt();
	
		double media;
		
		media = (n1 + n2) / 2;
		
		if (media < 6) {
			System.out.println("O aluno foi reprovado");
		}
		else {
			System.out.println("O aluno foi aprovado");
		}
		sc.close();
	}

}
