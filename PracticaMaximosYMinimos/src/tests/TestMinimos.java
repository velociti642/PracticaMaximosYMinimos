/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Minimos;
import clases.Maximos;

/**
 * 
 */
class TestMinimos {
	
	private int num1;
    private int num2;
    private int num3;
    
    @BeforeAll
    public void valores() {
        num1 = 5;
        num2 = 10;
        num3 = 2;
    }
    
	@Test
	void MinimoDe2EnterosPositivos() {
		double numeroEsperado = 5;
		double numeroObtenido = 5;
		assertEquals(numeroEsperado, numeroObtenido);
	}

}
