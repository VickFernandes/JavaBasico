package exercicio;

import java.util.Scanner;

public class Triangulo {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int base;
		int altura;
		
		System.out.println("Digite o valor da base:");
		base = sc.nextInt();
		
		System.out.println("Digite o valor da altura:");
		altura = sc.nextInt();
		
		int total = ((base * altura) / 2 );
		
		System.out.print("A �rea do triangulo � de:" + total );
		sc.close();
	}

}
