package exerciciosif;

import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o sal�rio fixo do funcion�rio: ");
		double Fixo = sc.nextDouble();
		
		System.out.print("Digite o valor total das suas vendas: ");
		int vendasT = sc.nextInt();

		System.out.print("Digite o n�mero de carros vendidos: ");
		int carrosV = sc.nextInt();
		
		System.out.print("Digite o valor que o funcion�rio recebe por carro: ");
		double comissaoC = sc.nextDouble();
		
		double comissaoF = carrosV*comissaoC;
		double comissaoV = 0.05*vendasT;
		
		double salarioFinal = Fixo + comissaoF + comissaoV;
		
		System.out.println("O sal�rio do funcion�rio este m�s ser� de: R$" + salarioFinal);		
		sc.close();
	}

}
