package capgMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactorialTest {
	
	Factorial factorial;
	

	@BeforeEach
	void setUp() throws Exception {
		factorial=new Factorial();
	}

	@Test
	void testGetFactorial() {
		//fail("Not yet implemented");
		assertEquals(24,factorial.getFactorial(4));
		assertEquals(120,factorial.getFactorial(5));
		assertEquals(720,factorial.getFactorial(6));
	}

}
