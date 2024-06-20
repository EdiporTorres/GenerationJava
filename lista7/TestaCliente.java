package lista7;

import java.util.Scanner;

import lista7.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner leia = new Scanner(System.in);
		n = leia.nextInt();

		for (int i = 0; i <= n; i++)
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}

	}
}
