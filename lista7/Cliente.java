package lista7;

public class Cliente {
	String nome;
	int idade;
	int altura;
	String endereço;
	int rg;

	public Cliente(int idade, int rg, String nome, String endereço, int altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.altura = altura;
		this.endereço = endereço;
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void visualizar(){
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do cliente:");
		System.out.println("***********************************************************");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Altura: "+this.altura);
		System.out.println("Ednreço: "+this.endereço);
		System.out.println("RG: "+this.rg);
		
	}
}
