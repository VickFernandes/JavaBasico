package exerciciosif;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = sc.nextInt();
		
		System.out.print("Digite um valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("A ordem crescente é: " + valor2 + " e " + valor1);
		} else if (valor2 > valor1) {
			System.out.println("A ordem crescente é: " + valor1 + " e " + valor2);
		}
		sc.close();
	}
}