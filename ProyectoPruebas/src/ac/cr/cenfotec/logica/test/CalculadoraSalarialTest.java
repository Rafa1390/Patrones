package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ac.cr.cenfotec.logica.CalculadoraSalarial;
import ac.cr.cenfotec.logica.TipoEmpleado;

public class CalculadoraSalarialTest {
	
	CalculadoraSalarial calcSal = new CalculadoraSalarial();

	@Test
	public void test1() {
		assertEquals(1360, calcSal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000, 8),0.0f);
	}
	
	@Test
	public void test2() {
		assertEquals(1260, calcSal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500, 3),0.0f);
	}

	@Test
	public void test3() {
		assertEquals(1100, calcSal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1499.99f, 0),0.0f);
	}
	
	@Test
	public void test4() {
		assertEquals(1760, calcSal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1250, 8),0.0f);
	}
	
	@Test
	public void test5() {
		assertEquals(1600, calcSal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1000, 0),0.0f);
	}
	
	@Test
	public void test6() {
		assertEquals(1560, calcSal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 999.99f, 3),0.0f);
	}
	
	@Test
	public void test7() {
		assertEquals(1500, calcSal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 500, 0),0.0f);
	}
	
	@Test
	public void test8() {
		assertEquals(1660, calcSal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0, 8),0.0f);
	}
	
	@Test (expected = AssertionError.class)
	public void test9() {
		assertEquals(0, calcSal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, -1, 8), 0.f);
	}
	
	@Test (expected = AssertionError.class)
	public void test10() {
		assertEquals(0, calcSal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500, -1), 0.f);
	}
	
	@Test (expected = Exception.class)
	public void test11() {
		assertEquals(0, calcSal.calculaSalarioBruto(null, 1500, 8), 0.f);
	}
}
