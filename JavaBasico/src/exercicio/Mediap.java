package exercicio;

import java.util.Scanner;

public class Mediap {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		
		System.out.println("Digite a primeira nota do aluno:");
		n1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota do aluno:");
		n2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota do aluno:");
		n3 = sc.nextInt();
		
		int total = ((n1*2 + n2*3 + n3*5)/10);
		
		System.out.print("A média final do aluno é:" + total);
		sc.close();
	}
}
