//Enkhbaatar Idersaikhan 3112121
package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

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
    	Rhombus rhombus = new Rhombus("Rhombus", 6.0, 8.0, 5.0);
    	assertEquals((6.0*8.0)/2, rhombus.area(),EPSILON);
    	assertEquals(4*5.0, rhombus.perimeter(),EPSILON);
    	assertEquals("Shape: Rhombus, Diagonalp: 6.0, Diagonalq: 8.0, Side: 5.0", rhombus.toString());    	
    }

    @Test
    public void testRightAngledTriangle() {   
    	RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3.0, 4.0,5.0); //hypotenuse √(3^2+4^2)= 5
    	assertEquals((3.0*4.0)/2, triangle.area(),EPSILON);
    	assertEquals(3.0+4.0+5.0, triangle.perimeter(),EPSILON);
    	assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0, Hypotenuse:5.0", triangle.toString());
    }

    @Test
    public void testIntegration() {    
    	ArrayList<Shape> shapes = new ArrayList<>();
    	
    	// Adding two instances of each shape
    	shapes.add(new Circle("Circle1", 3.5));
    	shapes.add(new Circle("Circle2", 5.0));
    	shapes.add(new Rhombus("Rhombus1", 6.0, 8.0,5.0));
    	shapes.add(new Rhombus("Rhombus2", 10.0, 12.0, 7.0));
    	shapes.add(new RightAngledTriangle("Triangle1", 3.0, 4.0, 5.0));
    	shapes.add(new RightAngledTriangle("Triangle2", 6.0, 8.0, 10.0));
    	
    	for(Shape shape: shapes) {
    		assertTrue(shape.area()>0);
    		assertTrue(shape.perimeter()>0);
    		assertNotNull(shape.toString());
    	}
    	
    	
    }

}
