package exercicio;

import java.util.Scanner;

public class Carro {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double fabrica;
		
		System.out.println("Digite o custo de fábrica do carro:");
		fabrica = sc.nextInt();
		
		double total = ( (fabrica * 0.28) + (fabrica * 0.45) + fabrica );
		
		System.out.print("O valor final é de:" + total);
		sc.close();
	}

}
