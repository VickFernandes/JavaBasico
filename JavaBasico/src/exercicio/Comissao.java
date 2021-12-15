package exercicio;

import java.util.Scanner;

public class Comissao {
	public static  void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double salario, vcarro, comicao, vendas;
		int carros;
		

		System.out.println("Digite o valor do salário fixo mensal do funcionário:");
		salario = sc.nextInt();
		
		System.out.println("Digite o número de carros vendidos pelo funcionário:");
		carros = sc.nextInt();
		
		System.out.println("Digite o valor recebido por carro vendido:");
		vcarro = sc.nextInt();
		
		comicao = carros * vcarro;
		
		System.out.println("Digite o valor total das vendas:");
		vendas = sc.nextInt();
		
		double total = (salario + vendas + comicao);
		
		System.out.print("O valor final do salário é :" + total);
		sc.close();
	}
}
