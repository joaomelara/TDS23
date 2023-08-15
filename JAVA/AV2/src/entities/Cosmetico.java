package entities;

public class Cosmetico extends Produto {
	private String cheiroCosmetico;
	
	public Cosmetico(String codigo, String nome, double valor, double margemLucro,
			String cheiroCosmetico) {
		super(codigo, nome, valor, margemLucro);
		this.cheiroCosmetico = cheiroCosmetico;
	}
	

	public Cosmetico() {
		super();
	}


	public String getCheiroCosmetico() {
		return cheiroCosmetico;
	}

	public void setCheiroCosmetico(String cheiroCosmetico) {
		this.cheiroCosmetico = cheiroCosmetico;
	}

	@Override
	public String toString() {
		return super.getCodigo()+"\t\t"+super.getNome()+"\t\t"+ super.getValor()+"\t\t"+super.getEstoque()+"\t\t"+cheiroCosmetico+"\t\t"+super.getMargemLucro();
	}

	

	

	
	
	

	
	
	
}