package exercicio;

import java.util.Scanner;

public class Retangulo {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int base;
		int altura;
		
		System.out.println("Digite o valor da base:");
		base = sc.nextInt();
		
		System.out.println("Digite o valor da altura:");
		altura = sc.nextInt();
		
		int total = (base * altura);
		
		System.out.print("A área do retângulo é de:" + total );
		sc.close();
	}

}
