package uEC;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rouds;
	private boolean aprovada;
	protected int desafianteVida, desafiadoVida;

	public boolean marcarLuta(Lutador desafiado, Lutador desafiante) {
		this.setDesafiado(desafiado);
		this.setDesafiante(desafiante);
		if (this.getDesafiante().getCategoria().equals(this.getDesafiado().getCategoria())
				&& this.getDesafiante() != this.getDesafiado()) {
			aprovada = true;
			System.out.println("A luta foi marcada com sucesso entre os lutadores: \n");
			this.getDesafiante().status();
			this.getDesafiado().status();
			this.setDesafiadoVida(100);
			this.setDesafianteVida(100);

		} else {
			aprovada = false;
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println(aprovada);
			System.out.println(
					"A luta não pode ser marcada entre um mesmo lutador ou lutadores de categorias diferente.");
		}
		return aprovada;
	}

	public void lutar() {
		if (aprovada == true) {
			desafiado.apresentar();
			desafiante.apresentar();
			rouds = 5;
			Random vencedor = new Random();
			for (int r = 1; r <= rouds; r++) {
				System.out.println("===== ROUND " + (r) + " =====");
				double vida = vencedor.nextInt(30);
				int vdesafiado = (int) vida;
				this.setDesafiadoVida(getDesafiadoVida() - vdesafiado);
				System.out.println(
						"Situação Desafiado: " + this.getDesafiado().getNome() + ": " + this.getDesafiadoVida() + "\n");
				double vida1 = vencedor.nextInt(30);
				int vdesafiante = (int) vida1;
				this.setDesafianteVida(getDesafianteVida() - vdesafiante);
				System.out.println(
						"Situação Desafiante: " + this.getDesafiante().getNome() + ": " + this.desafianteVida + "\n");
				System.out.println("===== FIM DO ROUND =====\n");

				if (this.getDesafianteVida() > this.getDesafiadoVida() && r == 5 || this.getDesafiadoVida() == 0) {
					System.out.println("O vencedor é: " + this.getDesafiante() + " com " + (r) + " Rounds");
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					this.desafiante.status();
					break;
				} else if (this.getDesafiadoVida() > this.getDesafianteVida() && r == 5
						|| this.getDesafianteVida() == 0) {
					System.out.println("O vencedor é: " + this.getDesafiado() + " com " + (r) + " Rounds");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					this.desafiado.status();
					break;
				} else if (this.getDesafiadoVida() == 0 && this.getDesafianteVida() == 0) {
					System.out.println("Depois de uma grande luta com " + (r) + "Rouds temos um empate");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					this.desafiante.status();
					this.desafiado.status();
				}
			}

		} else {
			System.out.println("A luta não pode acontercer!");
		}
	}
	
	public int getDesafianteVida() {
		return desafianteVida;
	}

	public void setDesafianteVida(int desafianteVida) {
		this.desafianteVida = desafianteVida;
	}

	public int getDesafiadoVida() {
		return desafiadoVida;
	}

	public void setDesafiadoVida(int desafiadoVida) {
		this.desafiadoVida = desafiadoVida;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

}
