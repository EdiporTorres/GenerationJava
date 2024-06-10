package lista2;

import java.util.Scanner;

public class maiorQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor de a: ");	
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");	
		b = leia.nextInt();
		System.out.println("Digite o valor de c: ");	
		c = leia.nextInt();
		if (a+b > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		}else {
				System.out.println("A Soma de A + B é menor do que C");
		}
			
	
	}

}
