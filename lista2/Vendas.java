package lista2;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, quantidade, preco, valorT;
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um dos produtos: 1 Cachorro Quente R$ 10.00"
				+ "\n 2 X-Salada R$ 15.00 \t \n 3 X-Bacon R$ 18.00 \t \n 4 Bauru R$ 12.00"
				+ "\n 5 Refrigerante R$ 8.00 \t \n 6 Suco de laranja R$ 13.00");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Voce escolheu: Cachorro Quente R$ 10.00 ");
			System.out.println("escolha a quantidade que gostaria de comprar");
			quantidade = leia.nextInt();
			preco = 10 * quantidade;
			System.out.println("Voce comprou " + quantidade + " cachorro quente e o total foi " + preco + " Reais");
			break;
		case 2:
			System.out.println("Voce escolheu: X-Salada R$ 15.00 ");
			System.out.println("escolha a quantidade que gostaria de comprar");
			quantidade = leia.nextInt();
			preco = 15 * quantidade;
			System.out.println("Voce comprou " + quantidade + " X-Salada e o total foi " + preco + " Reais");
			break;
		case 3:
			System.out.println("Voce escolheu: X-Bacon R$ 18.00 ");
			System.out.println("escolha a quantidade que gostaria de comprar");
			quantidade = leia.nextInt();
			preco = 18 * quantidade;
			System.out.println("Voce comprou " + quantidade + " X-Bacon e o total foi " + preco + " Reais");
			break;

		case 4:
			System.out.println("Voce escolheu: Bauru R$ 12.00 ");
			System.out.println("escolha a quantidade que gostaria de comprar");
			quantidade = leia.nextInt();
			preco = 12 * quantidade;
			System.out.println("Voce comprou " + quantidade + " Bauru e o total foi " + preco + " Reais");
			break;

		case 5:
			System.out.println("Voce escolheu: Refrigerante R$ 8.00 ");
			System.out.println("escolha a quantidade que gostaria de comprar");
			quantidade = leia.nextInt();
			preco = 8 * quantidade;
			System.out.println("Voce comprou " + quantidade + " Refrigerante e o total foi " + preco + " Reais");
			break;

		case 6:
			System.out.println("Voce escolheu: Suco de laranja R$ 13.00 ");
			System.out.println("escolha a quantidade que gostaria de comprar");
			quantidade = leia.nextInt();
			preco = 13 * quantidade;
			System.out.println("Voce comprou " + quantidade + " Suco de laranja e o total foi " + preco + " Reais");
			break;

			default:
				System.out.println("Opção Invalida");
			
		}
	}

}
