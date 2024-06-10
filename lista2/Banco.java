package Exercicio2;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float saldo = 1000, novosaldo, entsai;
		int CodOp;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a operação que deseja: \n1 SALDO \n2 SAQUE \n3 DEPOSITO");
		CodOp = leia.nextInt();
		
		switch(CodOp) {
		case 1:
			System.out.println("Seu Saldo é: "+saldo);
			break;
		case 2:
			System.out.println("Digite o valor do saque: ");
			entsai = leia.nextFloat();
			novosaldo = saldo - entsai;
			System.out.println("Seu novo saldo é de: "+novosaldo);
			break;
		case 3:
			System.out.println("Digite o valor do deposito: ");
			entsai = leia.nextFloat();
			novosaldo = saldo + entsai;
			System.out.println("Seu novo saldo é de: "+novosaldo);
		}
	}

}
