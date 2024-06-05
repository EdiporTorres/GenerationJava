package Exercicio2;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int numcargo;
		float salario, novosalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite seu Salario: ");
		salario = leia.nextFloat();
		System.out.println("Digite o codigo do seu cargo:  \n 1 gerente"
				+ "+\n 2 Vendedor \n 3 Supervisor \n 4 Motorista \n 5 Estoquista \n 6 Tecnito de TI");
		numcargo = leia.nextInt();
	switch (numcargo) {
	case 1:
		novosalario = salario + (salario * 10/100);
		System.out.println("Seu nome é: "+nome+" \nGerente \nseu novo salario é: "+novosalario);
	break;
	case 2:
		novosalario = salario + (salario * 7/100);
		System.out.println("Seu nome é: "+nome+" \nVendedor \nseu novo salario é: "+novosalario);
	break;
	case 3:
		novosalario = salario + (salario * 9/100);
		System.out.println("Seu nome é: "+nome+" \nSupervisor \nseu novo salario é: "+novosalario);
	break;
	case 4:
		novosalario = salario + (salario * 6/100);
		System.out.println("Seu nome é: "+nome+" \nMotorista \nseu novo salario é: "+novosalario);
	break;
	case 5:
		novosalario = salario + (salario * 5/100);
		System.out.println("Seu nome é: "+nome+" \nEstoquista \nseu novo salario é: "+novosalario);
	break;
	case 6:
		novosalario = salario + (salario * 8/100);
		System.out.println("Seu nome é: "+nome+" \nTécnico de TI \nseu novo salario é: "+novosalario);
	break;
	default:
		System.out.println("Opção invalida");
	}
	
	
	}

}
