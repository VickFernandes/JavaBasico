package exerciciosif;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O Primeiro valor � o maior!");}
		
		else if (valor1 < valor2) {
			System.out.println("O Segundo valor � o maior!");
			}
		sc.close();
		}
}
