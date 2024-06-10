package lista5;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		
		for (int X:num) {
			
			System.out.println("Digite o número que você deseja encontrar: ");
			int valor = leia.nextInt();
			if (num.contains(valor)) {
				int index = num.indexOf(valor);
				System.out.println("O número "+valor+" está localizado na posição " +index);
			}else {
				System.out.println("Valor não encontrado");
				break;
			}

		}
	}

}
