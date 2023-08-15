package entities;

public abstract class Produto {
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	private double margemLucro;
	
	
	

	public Produto(String codigo, String nome, double valor, double margemLucro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.margemLucro = margemLucro;
	}
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public void incluirEstoque(int valor) {
		if(valor<=0) {
			System.out.println("Não deu não, valor negativo ou zerado ...");
		}
		else {
			this.estoque += valor;
		}
	}

	public void tirarEstoque(int valor) {
		if(valor<=0) {
			System.out.println("Não deu não, valor negativo ou zerado ...");
		}
		else if(this.estoque == 0) {
			System.out.println("Não deu não, produto indisponível ...");
		}
		else if(valor>estoque) {
			System.out.println("Não deu não, quantidade em estoque indisponível ...");
		}
		else {
			this.estoque -= valor;
		}
	}
	
	public double valorCompra(int quant){
		double valorCompra = this.valor * quant +((this.valor * quant)* this.margemLucro);
		this.setValor(valorCompra);
		return this.getValor();
		
	}
	@Override
	public String toString() {
		return codigo + "\t\t" + nome + "\t\t" + valor + "\t\t" + estoque
				+ "\t\t" + margemLucro;
	}
	
	
		
	
}
