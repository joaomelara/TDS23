package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.CosmeticoPremium;

class CosmeticoPremiumTest {

	@Test
	void testValorCompra() {
		CosmeticoPremium c1 = new CosmeticoPremium("teste","teste",10.0,0.1,"rosa",0.1);
		c1.valorCompra(5);
		System.out.println(c1.getValor());
		Assertions.assertEquals(60, c1.getValor());
	}

}
