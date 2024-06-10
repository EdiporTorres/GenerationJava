package lista5;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> MinhaLista = new ArrayList<String>();
		String Cores = null;
		Scanner leia = new Scanner(System.in);
		MinhaLista.add(Cores);
		MinhaLista.add(Cores);
		MinhaLista.add(Cores);
		MinhaLista.add(Cores);
		MinhaLista.add(Cores);

		int index = 0;
		for (String X : MinhaLista) {
			System.out.println("Digite uma cor: ");
			Cores = leia.next();
			MinhaLista.set(index, Cores);
			index++;

		}
		System.out.println("Minha Lista de Cores: " + MinhaLista);
		MinhaLista.sort(null);
		System.out.println("Cores ordernada: " + MinhaLista);
	}
}
