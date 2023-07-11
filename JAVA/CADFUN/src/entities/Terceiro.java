package entities;

public class Terceiro extends funcionario {
	private String codEmpresa;
	private double adicionalTerceiro;
	
	
	
	public Terceiro(String matricula, String nome, double valorHora, int horasTrabalhadas, String codEmpresa,
			double adicionalTerceiro) {
		super(matricula, nome, valorHora, horasTrabalhadas);
		this.codEmpresa = codEmpresa;
		this.adicionalTerceiro = adicionalTerceiro;
	}
		

	public String getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public double getAdicionalTerceiro() {
		return adicionalTerceiro;
	}

	public void setAdicionalTerceiro(double adicionalTerceiro) {
		this.adicionalTerceiro = adicionalTerceiro;
	}
	@Override
	public double retornarSalario() {
		return(super.getValorHora()*super.getHorasTrabalhadas()+this.adicionalTerceiro);
	}
	
}
