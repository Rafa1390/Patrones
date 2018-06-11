package ac.cr.cenfotec.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.FactoresPrimos;

public class FactoresPrimosTest {
	
	FactoresPrimos factPri;
	ArrayList<Integer> listaPrimos;
	
	@Before
	public void init() {
		factPri = new FactoresPrimos();
		listaPrimos = new ArrayList<Integer>();
	}
	
	@Test
	public void testA() {
		listaPrimos.addAll(Arrays.asList());
		assertEquals(listaPrimos,factPri.generate(1));
	}

	@Test
	public void testB() {
		listaPrimos.addAll(Arrays.asList(2));
		assertEquals(listaPrimos,factPri.generate(2));
	}
	
	@Test
	public void testC() {
		listaPrimos.addAll(Arrays.asList(3));
		assertEquals(listaPrimos,factPri.generate(3));
	}
	
	@Test
	public void testD() {
		listaPrimos.addAll(Arrays.asList(2,2));
		assertEquals(listaPrimos,factPri.generate(4));
	}
	
	@Test
	public void testE() {
		listaPrimos.addAll(Arrays.asList(5));
		assertEquals(listaPrimos,factPri.generate(5));
	}
	
	@Test
	public void testF() {
		listaPrimos.addAll(Arrays.asList(2,3));
		assertEquals(listaPrimos,factPri.generate(6));
	}
	
	@Test
	public void testG() {
		listaPrimos.addAll(Arrays.asList(7));
		assertEquals(listaPrimos,factPri.generate(7));
	}
	
	@Test
	public void testH() {
		listaPrimos.addAll(Arrays.asList(2,2,2));
		assertEquals(listaPrimos,factPri.generate(8));
	}
	
	@Test
	public void testI() {
		listaPrimos.addAll(Arrays.asList(3,3));
		assertEquals(listaPrimos,factPri.generate(9));
	}
	
	@Test
	public void testJ() {
		listaPrimos.addAll(Arrays.asList(2,2,3,3));
		assertEquals(listaPrimos,factPri.generate(36));
	}
	
	@Test
	public void testK() {
		listaPrimos.addAll(Arrays.asList(2,3,7));
		assertEquals(listaPrimos,factPri.generate(42));
	}
	
	@Test
	public void testL() {
		listaPrimos.addAll(Arrays.asList(2,2,3,5,7,11));
		assertEquals(listaPrimos,factPri.generate(4620));
	}
}
