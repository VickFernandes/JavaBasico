package exercicio;

import java.util.Scanner;

public class Sucessor {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite o valor:");
		valor = sc.nextInt();
		
		int total = (valor + 1);
		
		System.out.print("O sucessor desse valor é :" + total);
		sc.close();
	}

}
