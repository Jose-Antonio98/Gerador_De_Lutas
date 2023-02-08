package uEC;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private double peso, altura;

	// Construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}

	// Metodos especiais
	public void apresentar() {
		System.out.println("Vem agora o lutador " + this.getNome() + " pais de orígem " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e com " + this.getAltura() + " de altura e pesando "
				+ this.getPeso() + " Kilos");
		System.out.println("E um card de " + this.getVitorias() + " Vitorias " + this.getDerrotas() + " Derrotas e "
				+ this.getEmpates() + " Empates\n");
	}

	public void status() {
		System.out.println("Nome: " + this.getNome() + " de categoria: " + this.getCategoria());
		System.out.println("Total de lutas: " + (this.getVitorias() + this.getDerrotas() + this.getEmpates()) + "\n");

	}
	
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "invalido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
