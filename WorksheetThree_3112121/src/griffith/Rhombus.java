//Enkhbaatar Idersaikhan 3112121
package griffith;

public class Rhombus extends Shape{
	
	private double diagonalp;
	private double diagonalq;
	private double side;

	public Rhombus(String name, double diagonalp, double diagonalq, double side) {
		super(name);
		this.diagonalp = diagonalp;
		this.diagonalq = diagonalq;
		this.side = side;
	}
	
	public double getDiagonalp() {
		return diagonalp;
	}
	
	public double getDiagonalq() {
		return diagonalq;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public double area() {
		return (diagonalp*diagonalq) /2;
	}

	@Override
	public double perimeter() {
		return 4*side;
	}
	
	@Override
	public String toString() {
		return "Shape: "+getName()+", Diagonalp: "+ diagonalp+ ", Diagonalq: " + diagonalq+ ", Side: " + side;
	}

}
