package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.AnnoBisiesto;

public class AnnoBisiestoTest {
	
	AnnoBisiesto aB;
	
	@Before
	public void init() {
		aB = new AnnoBisiesto();
	}
	
	@Test
	public void testAnnoBisiesto() {
		assertEquals(false, aB.isBisiesto(1900));
	}

	@Test
	public void testDivisible4() {
		assertEquals(true, aB.isBisiesto(1916));
		assertEquals(false, aB.isBisiesto(1917));
	}
	
	@Test
	public void testDivisible4y100() {
		assertEquals(false, aB.isBisiesto(1900));
		assertEquals(false, aB.isBisiesto(2100));
	}

	@Test
	public void testDivisible400() {
		assertEquals(true, aB.isBisiesto(1600));
		assertEquals(true, aB.isBisiesto(2000));
	}
}
