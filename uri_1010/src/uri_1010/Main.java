package uri_1010;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
		 * 
		 * Entrada O arquivo de entrada contém duas linhas de dados. Em cada linha
		 * haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas
		 * decimais.
		 * 
		 * Saída A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
		 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
		 * valor deverá ser apresentado com 2 casas após o ponto.
		 * 
		 * Exemplos de Entrada Exemplos de Saída 
		 * 
		 * 12 1 5.30 16 2 5.10
		 * 
		 * VALOR A PAGAR: R$ 15.50
		 * 
		 * 13 2 15.30 161 4 5.20
		 * 
		 * VALOR A PAGAR: R$ 51.40
		 * 
		 * 1 1 15.10 2 1 15.10
		 * 
		 * VALOR A PAGAR: R$ 30.20
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();

		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();

		double total = (num1 * valor1) + (num2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}

}
