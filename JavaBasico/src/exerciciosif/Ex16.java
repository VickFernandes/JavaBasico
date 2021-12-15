package exerciciosif;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double menos= 1.30;
		double mais= 1.00;
		
		System.out.println("Quantas maçãs foram compradas?");
		
		double macas = sc.nextInt();
		
		double total1, total2;
		
		if (macas > 12) {
			
			total1 = macas * menos;
			
			System.out.println("O valor a ser pago é igual a: " + total1);
		}
		
		else if (macas < 12) {
			
			total2 = macas * mais;
			
			System.out.println("O valor a ser pago é igual a: " + total2);
		}
		sc.close();
	}

} 
