package exercicio3;

import java.util.Scanner;

public class WhileEmpresa {

	public static void main(String[] args) {
		int idade=0, identGen, codCargo, backe = 0, MulhersT = 0, HomenscT = 0, noBin = 0, num=0;
		float mediaIdade;
		String continua = "S";
		Scanner leia = new Scanner(System.in);

		while (!continua.equals("n")) {
			num++;
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Escolha seu Genero: \n1 mulher cis"
					+ "\n2 Homem Cis \n3 Não Binario \n4 Mulher Trans \n5 Homem Trans \n6 Outro");
			identGen = leia.nextInt();
			System.out.println("EScolha o tipo de Desenvolvedor voce é: \n1 Backend \n2 Front End"
					+ "\n3 Mobile \n4 FullStack");
			codCargo = leia.nextInt();

			System.out.println("Idade: " + idade);
			switch (identGen) {
			case 1:
				System.out.println("Mulher Cis");
				break;
			case 2:
				System.out.println("Homem Cis");
				break;
			case 3:
				System.out.println("Não Binário");
				break;
			case 4:
				System.out.println("Mulher Trans");
				break;
			case 5:
				System.out.println("Homem Tran");
				break;
			case 6:
				System.out.println("Outro");
				break;

			}

			switch (codCargo) {
			case 1:
				System.out.println("Backend");
				break;
			case 2:
				System.out.println("Frontend");
				break;
			case 3:
				System.out.println("Mobile");
				break;
			case 4:
				System.out.println("FullStack");
				break;
			}
			if (codCargo == 1) {
				backe++;

			}
			if (identGen == 1 || identGen == 4 && codCargo == 2) {
				MulhersT++;
			}
			if (identGen == 2 || identGen == 5 && codCargo == 3 && idade >= 40) {
				HomenscT++;
			}
			if (identGen == 3 && codCargo == 4 && idade <= 30) {
				noBin++;
			}

			System.out.println("Deseja continuar (S/N):");
			continua = leia.next();

		}
		mediaIdade = idade / num;
		System.out.println("O número de pessoas desenvolvedoras Backend = " + backe);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend = " + MulhersT);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos = " + HomenscT);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos = " + noBin);
		System.out.println("O numero de pessoas que respondeu a pesquisa é: "+num);
		System.out.println("A Media de idade da pesquisa é: "+mediaIdade);
		
		
	}
}
