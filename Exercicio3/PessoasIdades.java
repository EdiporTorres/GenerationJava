package exercicio3;

import java.util.Scanner;

public class PessoasIdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont, num, idade21=0, idade50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		num = leia.nextInt();
		
		while(num >= 0) {
			if(num <= 21) {
				idade21++;
			} else if (num >= 50) {
				idade50++;
			}

			System.out.println("Digite uma idade: (digite -1 para cancelar)");
			num = leia.nextInt();


		}
		System.out.println("Total de pessoas menores de 21 anos: "+idade21);
		System.out.println("Total de pessoas maiores de 50 anos: "+idade50);
		

	}

}
