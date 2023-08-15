package tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Cosmetico;

class CosmeticoTest {

	@Test
	void testIncluirEstoque() {
		Cosmetico c1 = new Cosmetico("teste","teste",10.0,0.1,"rosa");
		c1.incluirEstoque(10);
		Assertions.assertEquals(10, c1.getEstoque());
		c1.incluirEstoque(0);
		Assertions.assertEquals(10, c1.getEstoque());
		c1.incluirEstoque(-1);
		Assertions.assertEquals(10, c1.getEstoque());
	}

	@Test
	void testTirarEstoque() {
		Cosmetico c1 = new Cosmetico("teste","teste",10.0,0.1,"rosa");
		c1.incluirEstoque(10);
		Assertions.assertEquals(10, c1.getEstoque());
		c1.tirarEstoque(0);
		Assertions.assertEquals(10, c1.getEstoque());
		c1.tirarEstoque(-1);
		Assertions.assertEquals(10, c1.getEstoque());
		c1.tirarEstoque(5);
		Assertions.assertEquals(5, c1.getEstoque());
	}

	@Test
	void testValorCompra() {
		Cosmetico c1 = new Cosmetico("teste","teste",10.0,0.1,"rosa");
		c1.valorCompra(5);
		System.out.println(c1.getValor());
		Assertions.assertEquals(55, c1.getValor());
	}

}
