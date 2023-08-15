
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cosmetico;
import entities.CosmeticoPremium;
import entities.Produto;

public class AppCosmeticos {
		public static List<Cosmetico> cadastro = new ArrayList<>();
		public static List<CosmeticoPremium> cadastro1 = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cosmetico c1 = new Cosmetico();
		Scanner input = new Scanner(System.in);
		
		
		int op;
		char res;
		String codigo;
		String nome;
		double valor;
		int estoque;
		double margemLucro;
		String cheiroCosmetico;
		double adicional;
		
		System.out.println("LOJA COSMÉTICOS - O MELHOR PARA VOCÊ");
		System.out.println("1-CADASTRAR NOVOS PRODUTOS\n2-SAIR");
		
		op = input.nextInt();
		if(op == 1) {
			System.out.println("CODIGO DO COSMETICO: ");
			codigo = input.next();
			
			System.out.println("NOME DO COSMETICO: ");
			nome = input.next();
			
			System.out.println("VALOR DO COSMETICO: ");
			valor = input.nextDouble();
			
			System.out.println("ESTOQUE DO COSMETICO: ");
			estoque = input.nextInt();
			c1.incluirEstoque(estoque);
			
			System.out.println("MARGEM DO COSMETICO: ");
			margemLucro = input.nextDouble();
			
			System.out.println("CHEIRO DO COSMETICO: ");
			cheiroCosmetico = input.next();
			
			
			System.out.println("É PREMIUM?");
			res = input.next().toUpperCase().charAt(0);
			if(res == 'N') {
				cadastro.add(new Cosmetico(codigo, nome, valor, margemLucro, cheiroCosmetico));
			}
			else if(res == 'S') {
				System.out.println("PORCENTAGEM ADICIONAL: ");
				adicional = input.nextDouble();
				cadastro1.add(new CosmeticoPremium(codigo, nome, valor, margemLucro, cheiroCosmetico, adicional));
				
			}
			
			System.out.println("SE POSSUIR ADICIONAL É PREMIUM\n\n");
			System.out.println("COD\t\tNOME\t\tVALOR\t\tESTOQUE\t\tCHEIRO\t\tMARGEM\t\tADICIONAL\n");
			for(Cosmetico x: cadastro) {
			System.out.println(x);
			System.out.println("\n");
			}
			for(CosmeticoPremium X: cadastro1) {
			System.out.println(X.toString());
			System.out.println("\n");
			main(args);
			}
			
		}
		if(op == 2) {
			System.out.println("LOJA COSMÉTICOS TOP --> SEUS PRODUTOS CADASTRADOS:\n\n");
			System.out.println("COD\t\tNOME\t\tVALOR\t\tESTOQUE\t\tCHEIRO\t\tMARGEM\t\tADICIONAL\n");
			for(Cosmetico x: cadastro) {
			System.out.println(x);
			System.out.println("\n");
			}
			for(CosmeticoPremium X: cadastro1) {
			System.out.println(X.toString());
			System.out.println("\n");
			System.out.println("\n\nADEUS E VOLTE SEMPRE");
			
		}
		
	}
	}
}
