package Exercicio2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, resultado;
		int codOperacao;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("Digite a operação desejada: \n1 Soma \n2 Subtração \n3 Multiplicação \n4 divisão");
		codOperacao = leia.nextInt();
		switch (codOperacao) {
		case 1:
			resultado = n1 + n2;
			System.out.println("O resultado do seu calculo é: "+resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.println("O resultado do seu calculo é: "+resultado);
			break;
		case 3:
			resultado = n1 * n2;
			System.out.println("O resultado do seu calculo é: "+resultado);
			break;
		case 4:
			resultado = n1 / n2;
			System.out.println("O resultado do seu calculo é: "+resultado);
			break;
			default:
				System.out.println("Codigo invalido!!!");
		
		}
	}

}
