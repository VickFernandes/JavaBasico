package exerciciosif;

import java.util.Scanner;


public class Ex25 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número da sua conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Digite o débito: ");
		double debito = sc.nextDouble();
		
		System.out.print("Digite o crédito: ");
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo-debito+credito;
		
		if (saldoAtual >= 0) {
			System.out.println("A conta: " + conta + " está com SALDO POSITIVO!");
		} 
		else if (saldoAtual <= -1) {
			System.out.println("A conta: " + conta + " está com SALDO NEGATIVO!");
		}
		sc.close();
	}

}
