package entities;

public class funcionario {
	private String Matricula;
	private String Nome;
	private double valorHora;
	private int horasTrabalhadas;
	
	public funcionario(String matricula, String nome, double valorHora, int horasTrabalhadas) {
		super();
		Matricula = matricula;
		Nome = nome;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
		
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getValorHora() {
		return valorHora;
		}
	/*
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}*/

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double retornarSalario() {
		return (this.valorHora * this.horasTrabalhadas);
	}
	

}
	