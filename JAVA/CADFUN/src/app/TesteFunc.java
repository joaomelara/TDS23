package app;

import entities.Terceiro;
import entities.funcionario;

public class TesteFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		funcionario func1 = new funcionario("mat001","Epaminondas",10.00,20);
		Terceiro terc1 = new Terceiro("tac001","Vicinius",20.00,30,"Bradesco",40.00);
		
		System.out.printf("Oi %s, seu salário é R$%.2f\n", func1.getNome(),func1.retornarSalario());

		func1.setNome("Creuzo");
		func1.setHorasTrabalhadas(40);
		
		System.out.printf("Oi %s, seu salário é R$%.2f", func1.getNome(),func1.retornarSalario());
	}

}
