package uEC;

import java.util.Scanner;

public class Lutas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a quantidade de lutadores a serem cadastrados: ");
		int n = ler.nextInt();
		
	
		Lutador lutador[] = new Lutador[n];

		System.out.println();
		System.out.println("========== INSCRIÇÃO ==========");
		for (int i = 0; i < n; i++) {
			ler.nextLine();
			System.out.println();
			System.out.println("Lutador n " + (i + 1));
			System.out.print("Informe o nome do lutador: ");
			String nome = ler.nextLine();
			System.out.print("Informe a nacionalidade do lutador: ");
			String nacionalidade = ler.next();
			System.out.print("Informe a idade do lutador: ");
			int idade = ler.nextInt();
			if (idade < 18) {
				System.out.println("Não é possivel marcar lutas entre menores de idade, tente novamente: ");
				idade = ler.nextInt();
			}
			System.out.print("Informe a altura do lutador: ");
			double altura = ler.nextDouble();
			System.out.print("Informe a peso do lutador: ");
			double peso = ler.nextDouble();
			System.out.print("Informe a vitorias do lutador: ");
			int vitorias = ler.nextInt();
			System.out.print("Informe a derrota do lutador: ");
			int derrotas = ler.nextInt();
			System.out.print("Informe a empates do lutador: ");
			int empates = ler.nextInt();
			lutador[i] = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
			
		}
		
		System.out.println("\nlista de lutadores");
		for (int i = 0; i < lutador.length; i++) {
			if (lutador[i] != null) {
				System.out.println((i + 1) + ": " + lutador[i].getNome());
			}
		}
		
		Luta luta = new Luta();
		System.out.print("escolha o desafiado: ");
		int desafiado = ler.nextInt() - 1;
		System.out.print("escolha o desafiante: ");
		int desafiante = ler.nextInt() - 1;
		
		luta.marcarLuta(lutador[desafiado], lutador[desafiante]);

		luta.lutar();
		
		ler.close();
	}

}
