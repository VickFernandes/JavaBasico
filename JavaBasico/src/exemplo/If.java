package exemplo;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("A pessoa n�o pode adquirir bebida alco�lica");}
			
		else {
			System.out.println("A pessoa pode adquirir bebida alco�lica");
		}
		sc.close();
	}
}
