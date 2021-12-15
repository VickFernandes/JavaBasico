package exercicio;

import java.util.Scanner;

public class Circulo {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int raio;
		
		System.out.println("Digite o valor da base:");
		raio = sc.nextInt();
		
		double total = (raio * raio * 3.14);
		
		System.out.print("A área do círculo é de:" + total );
		sc.close();
	}
}
