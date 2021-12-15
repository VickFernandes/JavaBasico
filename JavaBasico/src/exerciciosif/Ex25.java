package exerciciosif;

import java.util.Scanner;


public class Ex25 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o n�mero da sua conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Digite o d�bito: ");
		double debito = sc.nextDouble();
		
		System.out.print("Digite o cr�dito: ");
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo-debito+credito;
		
		if (saldoAtual >= 0) {
			System.out.println("A conta: " + conta + " est� com SALDO POSITIVO!");
		} 
		else if (saldoAtual <= -1) {
			System.out.println("A conta: " + conta + " est� com SALDO NEGATIVO!");
		}
		sc.close();
	}

}
