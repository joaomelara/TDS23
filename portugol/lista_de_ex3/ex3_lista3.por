programa
{
	
	funcao inicio()
	{
		inteiro num = 0
		inteiro media = 0
		inteiro quant = 0
		inteiro total = 0

		enquanto(num>0)
			se(num>=0){
			escreva("Digite números: \n")
			leia(num)
			quant++
			total += num
			media = total/quant
			
			}
			senao
			pare

		escreva("MEDIA DOS NUMEROs: ", media)
		escreva("\nQUANT DOS NUMEROs: ", quant)
		escreva("\nTOTAL DOS NUMEROs: ", total)
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */