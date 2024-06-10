package lista6;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int indice;
		do {
			System.out.println("\t_----------MENU----------_");
			System.out.println("\t1 - Para adicionar cliente na Fila "
					+ "\n\t2 - Listar todos os Clientes \n\t3  - Retirar cliente da lista" + "\n\t0  - Sair ");
			indice = leia.nextInt();
			leia.nextLine();

			switch (indice) {
			case 1:
				System.out.println("Adicione o nome do Cliente que gostaria de adicionar: ");
				String Cliente = leia.nextLine();
				fila.add(Cliente);
				break;
			case 2:
				System.out.println("Os clientes cadastrado são: " + fila);
				break;
			case 3:
				System.out.println("Digite o nome do cliente que deseja deletar: ");
				Cliente = leia.nextLine();
				fila.remove(Cliente);
				System.out.println(fila);
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