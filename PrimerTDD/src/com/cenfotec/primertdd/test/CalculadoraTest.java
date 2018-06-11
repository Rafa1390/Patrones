package com.cenfotec.primertdd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cenfotec.primertdd.Calculadora;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@Before
	public void init() {
		System.out.println("Hola");
		calc = new Calculadora();
	}

	@Test
	public void testSuma() {
		assertEquals(2,calc.suma(1, 1));
	}
	
	@Test
	public void testResta() {
		assertEquals(0,calc.resta(1, 1));
	}
	
	@Test
	public void testMult() {
		assertEquals(1,calc.mult(1, 1));
	}
	
	@Test
	public void testDiv() {
		assertEquals(1,calc.div(1, 1));
	}

}
