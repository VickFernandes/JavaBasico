package exercicio;

import java.util.Scanner;

public class Salario {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double mensal;
		double reajuste;

		System.out.println("Digite o valor do sal�rio mensal do funcion�rio:");
		mensal = sc.nextInt();
		
		System.out.println("Digite o valor percentual do reajuste:");
		reajuste = sc.nextInt();
		
		double total = (((reajuste * mensal) / 100) + mensal);
		
		System.out.print("O valor final do sal�rio � :" + total);
		sc.close();
	}
}
