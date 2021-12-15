package exercicio;

import java.util.Scanner;

public class Idade {
	
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		
		System.out.println("Digite o valor da sua idade em anos:");
		anos = sc.nextInt();
		
		System.out.println("Digite o valor da sua idade em meses:");
		meses = sc.nextInt();
		
		System.out.println("Digite o valor da sua idade em dias:");
		dias = sc.nextInt();
		
		int total = ((anos*365) + (meses*30) + dias);
		
		System.out.print("Sua idade em dias é de:" + total );
		sc.close();
	}

}
