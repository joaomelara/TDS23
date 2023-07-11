package entities;

public class Corrente extends Conta {
	private int contadorTalao = 3;
	
	public Corrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	public int getContadorTalao() {
		return contadorTalao;
	}
	public void pediTalao(int quantTalao) {
		if(quantTalao < contadorTalao && quantTalao>0) {
		this.contadorTalao =- quantTalao;
		this.credito(30.00);
		}
	}
}

