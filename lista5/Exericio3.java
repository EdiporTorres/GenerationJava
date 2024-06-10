package lista5;
import java.util.*;

public class Exericio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer>num = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			int n = leia.nextInt();
			num.add(n);
		}
		System.out.println("Os numeros digitados foram: ");
		Iterator<Integer> numeros = num.iterator();
		while (numeros.hasNext()){
			System.out.println(numeros.next());
		}
	}
	}

