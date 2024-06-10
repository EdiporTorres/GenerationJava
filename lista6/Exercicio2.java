package lista6;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int indice;
		do {
			System.out.println("\t_----------MENU----------_");
			System.out.println("\t1 - Para adicionar livro na pilha "
					+ "\n\t2 - Listar todos os Livros \n\t3  - Retirar Livros da pilha" + "\n\t0  - Sair ");
			indice = leia.nextInt();
			leia.nextLine();

			switch (indice) {
			case 1:
				System.out.println("Adicione o nome do livro que gostaria de adicionar: ");
				String Livro = leia.nextLine();
				pilha.push(Livro);
				break;
			case 2:
				System.out.println("Os livros cadastrados são: " + pilha);
				break;
			case 3:
				System.out.println("Digite o nome do livro que deseja deletar: ");
				Livro = leia.nextLine();
				pilha.remove(Livro);
				System.out.println(pilha);
				break;
			case 0:
				System.out.println("Finalizando programa..");
				break;
			default:
				System.out.println("Comando Invalido");
			}
		} while (indice != 0);

	}
}