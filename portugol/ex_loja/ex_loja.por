programa
{
	
	funcao inicio()
	{
		cadeia input
		
		escreva ("Loja foda \n")
		escreva ("slogan foda \n")
		escreva ("quer comprar com nois ?: ")
		leia (input)

		se (input == "S"){
			telaprimaria()
		}senao{
			escreva ("xau")
		}
		
		
	}
	funcao telaprimaria (){
		escreva ("Loja foda \n")
		escreva ("slogan foda \n")
		
		cadeia codigo[] = {"GRP0X-01","GRP0X-02","GRP0X-03","GRP0X-04","GRP0X-05","GRP0X-06","GRP0X-07","GRP0X-08","GRP0X-09","GRP0X-10"}
		cadeia produto[] = {"BONÉ","CALÇA","BERMUDA AFRO","BATA","CAMISA AFRO","SAIA RODADA","SAIA STYLE","MACACÃO","CAMISETA TEMATICA","CALÇA SOCIAL AFRO"}
		real valor [] = {100.00,150.00,90.00,140.00,150.00,90.00,90.00,150.00,100.00,95.50}
		inteiro estoque [] = {10,10,10,10,10,10,10,10,10,10}
		cadeia carrinho [] = {"","","","","","","","","","","",""}
		
		para(inteiro j = 0; j < 10; j++){
			escreva(codigo[j], "\t")
			escreva(produto[j], "\t" )
			escreva("Valor: ", valor[j], "\t")
			escreva("Estoque: ", estoque[j], "\t")
			escreva("Carrinho: ",carrinho[j], "\t")
			escreva("\n")
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */