package entities;

public class CosmeticoPremium extends Cosmetico{
	private double adicionalPremium;

	
	public CosmeticoPremium(String codigo, String nome, double valor, double margemLucro,
			String cheiroCosmetico, double adicionalPremium) {
		super(codigo, nome, valor, margemLucro, cheiroCosmetico);
		this.adicionalPremium = adicionalPremium;
	}

	public double getAdicionalPremium() {
		return adicionalPremium;
	}

	public void setAdicionalPremium(double adicionalPremium) {
		this.adicionalPremium = adicionalPremium;
	}
	
	@Override
	public double valorCompra(int quant) {
		double valorCompra = this.getValor() * quant + ((this.getValor()*quant)*this.getMargemLucro()) + ((this.getValor()*quant)*this.adicionalPremium);
		this.setValor(valorCompra);
		return this.getValor();
	}

	@Override
	public String toString() {
		return super.getCodigo()+"\t\t"+super.getNome()+"\t\t"+ super.getValor()+"\t\t"+super.getEstoque()+"\t\t"+super.getCheiroCosmetico()+"\t\t"+super.getMargemLucro()+"\t\t"+ adicionalPremium;
	}
	
	
	
	
}
