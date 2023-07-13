package app;

import java.util.Scanner;

import entities.Corrente;
import entities.Empresa;
import entities.Poupanca;

public class AppConta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Poupanca p1 = new Poupanca(1, "1111111", 10);
		Corrente c1 = new Corrente (1, "1111111", 3);
		Empresa e1 = new Empresa (1, "111111", 1);
		Especial e2 = new Especial (1, "111111");
		Estudantil e3 = new Estudantil (1,"111111");
		
		int res;
		String r = "";
		int ani;
		String x = "";
		
		System.out.println("1 - Conta Poupança ");
		System.out.println("2 - Conta Corrente ");
		System.out.println("3 - Conta Especial ");
		System.out.println("4 - Conta Empresa ");
		System.out.println("5 - Conta Estundatil ");
		System.out.println("6 - Sair ");
		System.out.print("Qual vc quer?????: ");
		res = input.nextInt();
		if (res == 1) {
			p1.ativar();
			System.out.println("Conta poupança");
			System.out.println("Saldo atual :"+p1.getSaldo());
			System.out.println("Movimento : D - Debito, C - Credito");
			r = input.next();
			for(int i = 1; i <= 2; i++) {
				if(r.equals("D")){
					if (p1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito");
						p1.credito(input.nextInt());
					}else {
						System.out.println("Valor para debitar: ");
						p1.debito(input.nextInt());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					p1.credito(input.nextInt());
				}
				System.out.println("Saldo atual :"+p1.getSaldo());
				System.out.println("Movimento : D - Debito, C - Credito");
				r = input.next();
			}
			System.out.println("Qual o dia de hj?:  ");
			ani = input.nextInt();
			p1.correcao(ani);
			System.out.println(p1.getSaldo());
		}
		if (res == 2) {
			p1.ativar();
			System.out.println("Conta poupança");
			System.out.println("Saldo atual :"+p1.getSaldo());
			System.out.println("Movimento : D - Debito, C - Credito, S - Sair");
			r = input.next();
			for(int i = 1; i <= 2; i++) {
				if(r.equals("D")){
					if (p1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito");
						p1.credito(input.nextInt());
					}else {
						System.out.println("Valor para debitar: ");
						p1.debito(input.nextInt());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					p1.credito(input.nextInt());
				}else if(r.equals("S")) {
					System.out.println("Vc quer uns cheques, meu mano?");
					r = input.next();
						if(r.equals("S"))
						{
							System.out.println("Quantos cheques você quer? (Até 3");
							c1.pediTalao(input.nextInt());
							System.out.println("Obrigado, até a próxima");
							break;
						}
						else if(r.equals("N")) {
							System.out.println("Obrigado, até a próxima");
							break;
						}
						
				}
			}
			if (res == 5) {
			for(int i = 1; i <= 2; i++) {
				if(r.equals("D")){
					if (p1.getSaldo() == 0) {
						System.out.println("Saldo insuficiente faça um Credito");
						p1.credito(input.nextInt());
					}else {
						System.out.println("Valor para debitar: ");
						p1.debito(input.nextInt());
					}					
				}else if(r.equals("C")) {
					System.out.println("Valor para Credito ");
					p1.credito(input.nextInt());
				}
				System.out.println("Saldo atual :"+p1.getSaldo());
				System.out.println("Movimento : D - Debito, C - Credito");
				r = input.next();
			}
			System.out.println("Deseja utilizar o cédito estudantil?:  ");
			ani = input.nextInt();
			}
			if(x.equals("S")) {
				
			}
		}
	
		
	}

}