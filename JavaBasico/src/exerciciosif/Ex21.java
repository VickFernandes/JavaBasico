package exerciciosif;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual foi o horário de ínicio da partida?");
		
		int inicio = sc.nextInt();
		
		System.out.println("Qual foi o horário do término da partida?");
		
		int fim = sc.nextInt();
		
		int total = (fim - inicio);
		
		System.out.println("A partida durou " + total + " horas");
		
		sc.close();
	}

}
