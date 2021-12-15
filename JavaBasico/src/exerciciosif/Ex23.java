package exerciciosif;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pesoIdeal = 0;
		
		System.out.print("Digite seu nome: ");
		var nome = sc.next();
		
		System.out.println("Digite seu gênero: [1] Feminino [2] Masculino");
		var genero = sc.nextInt();
		
		System.out.print("Qual sua altura? ");
		double altura = sc.nextDouble();
		
		if (genero == 2) {
			pesoIdeal = (72.7 * altura) - 58;
			} 
		else if (genero == 1) {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
			System.out.println("Olá, " + nome + ". O peso igual para seu gênero é igual a: " + pesoIdeal);
		sc.close();
	}

}
