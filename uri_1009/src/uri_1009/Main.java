package uri_1009;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total
		 * de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor
		 * ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber
		 * no final do m�s, com duas casas decimais.
		 * 
		 * Entrada O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2
		 * valores de dupla precis�o (double) com duas casas decimais, representando o
		 * sal�rio fixo do vendedor e montante total das vendas efetuadas por este
		 * vendedor, respectivamente.
		 * 
		 * Sa�da Imprima o total que o funcion�rio dever� receber, conforme exemplo
		 * fornecido.
		 * 
		 * Exemplos de Entrada Exemplos de Sa�da 
		 * JOAO 500.00 1230.30
		 * 
		 * TOTAL = R$ 684.54
		 * 
		 * PEDRO 700.00 0.00
		 * 
		 * TOTAL = R$ 700.00
		 * 
		 * MANGOJATA 1700.00 1230.50
		 * 
		 * TOTAL = R$ 1884.58
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		double salary = sc.nextDouble();
		double sales = sc.nextDouble();
		double total = (salary + (sales * 0.15));

		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}