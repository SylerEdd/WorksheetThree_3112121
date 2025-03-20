//Enkhbaatar Idersaikhan 3112121
package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {
	
	private static final double EPSILON = 0.0001;
	
	@Test
	public void testCircle() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
        assertEquals("Shape: Circle, Radius: 3.5", circle.toString());
    }

    @Test
    public void testRhombus() {   	
    }

    @Test
    public void testRightAngledTriangle() {    	
    }

    @Test
    public void testIntegration() {    	
    }

}
