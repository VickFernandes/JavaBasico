package exercicio;

import java.util.Scanner;

public class Graus {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit;
		
		System.out.println("Digite o valor em graus Fahrenheit :");
		fahrenheit = sc.nextInt();
		
		double total = (((fahrenheit - 32)/9)*5);
		
		System.out.print("O valor dado, em Celcius, é igual a:" + total);
		sc.close();
	}
}
