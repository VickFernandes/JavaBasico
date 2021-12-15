package exercicio;

import java.util.Scanner;

public class Antecessor {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite o valor:");
		valor = sc.nextInt();
		
		int total = (valor - 1);
		
		System.out.print("O antecessor desse valor é :" + total);
		sc.close();
	}
}
