package tpfinal;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import tpfinal.Calculadora;

public class CalculadoraTest {

	@Test
	public void sumerTest() {
		Calculadora calculadora = new Calculadora();
		Integer result = 5;
		AssertJUnit.assertEquals(result, calculadora.sumar(3, 2));
	}
}
