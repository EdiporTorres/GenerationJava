package Exercicio2;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("digite sua idade: ");
		idade = leia.nextInt();
		
		
		if (idade >=60) {
			System.out.println("é sua primeira vez doando sangue?(true/false) ");
			doacao = leia.nextBoolean();
			
			if (doacao == true) 
				System.out.println(nome+" Não esta apto para doar sangue");
			else {
				System.out.println(nome+" Esta apto para doar sangue");
			}
				
		} 
		}
	}
		
