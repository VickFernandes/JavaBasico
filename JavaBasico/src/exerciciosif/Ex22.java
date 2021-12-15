package exerciciosif;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas horas foram trabalhadas pelo funcionário?" );
		int horas = sc.nextInt();
		
		System.out.println("Digite o salário que o funcionário recebe por hora trabalhada:" );
		double salario = sc.nextInt();
		
		int horaextra = (horas - 40);
		
		if (horas > 40) {
			double total = (horas * salario) + (salario * horaextra * 0.5);
			
			System.out.println("O salário final será de: " + total + "R$");
		}
		else if (horas < 40) {
			double total2 = horas * salario;
			
			System.out.println("O salário final será de: " + total2 + "R$" );
			}
		sc.close();
	}
}
