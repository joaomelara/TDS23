programa
{
	
	funcao inicio()
	{
		cadeia C
		escreva("Qual é o seu código de trabalho?\n")
		leia(C)

		inteiro N
		escreva("Quantas horas trabalhadas?\n")
		leia(N)

		inteiro E

		se (N<50)
		{
		E = 0
		escreva ("Seu salário foi de R$", N*10, " e seu excedente foi ", E)
		}

		senao
		{
		E = N - 50
		escreva ("Seu salário inicial foi de R$", N*10, " e seu excedente foi de RS", E*20, " e portanto seu salário total foi de R$", (N*10)+(E*20)) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */