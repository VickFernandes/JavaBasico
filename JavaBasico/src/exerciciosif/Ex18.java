package exerciciosif;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual");
		
		int anoatual = sc.nextInt();
		
		System.out.println("Digite o ano do seu nascimento");
		
		int nascimento = sc.nextInt();
		
		if (nascimento - anoatual < 16) {
			System.out.println("Você não poderá votar este ano!");
		}
		
		else if (nascimento - anoatual > 15) {
			System.out.println("Você poderá votar este ano!");
		}
	sc.close();
	}

}
