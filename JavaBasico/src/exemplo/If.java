package exemplo;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("A pessoa não pode adquirir bebida alcoólica");}
			
		else {
			System.out.println("A pessoa pode adquirir bebida alcoólica");
		}
		sc.close();
	}
}
