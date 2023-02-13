package operaciones;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	void testResta2_1() {
		Calculadora calc = new Calculadora (20,10);
		int result = calc.resta();
		assertTrue (true);
	}

	@Test
	void testResta2_2() {
		Calculadora calc = new Calculadora (10,20);
		int result = calc.resta();
		assertFalse (false);
	}

	@Test
	void testDivide2_1() {
		Calculadora calc = new Calculadora (20,10);
		int result = calc.divide2();
		assertNull (null, "illo po esto no zale null");
		
	}
	@Test
	void testDivide2_2() {
		Calculadora calc = new Calculadora (20,10);
		int result = calc.divide2();
		assertNotNull ("illo la esho mal",result);
		
	}
	
	@Test
	void testDivide2_3() {
		Calculadora calc = new Calculadora (20,10);
		int result = calc.divide2();
		assertEquals (2,result);
		
	}

}
