package exerciciosif;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade atual em estoque: ");
		int estoqueA = sc.nextInt();
		
		System.out.print("Digite a quantidade m�xima para o estoque: ");
		int estoqueMax = sc.nextInt();
		
		System.out.print("Digite a quantidade m�nima para o estoque: ");
		int estoqueMin = sc.nextInt();
		
		double estoqueMedio = (estoqueMax+estoqueMin)/2;
		
		if (estoqueA >= estoqueMedio) {
			System.out.println("N�o efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
		
		sc.close();
	}

}
