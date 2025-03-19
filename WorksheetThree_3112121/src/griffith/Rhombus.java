//Enkhbaatar Idersaikhan 3112121
package griffith;

public class Rhombus extends Shape{
	
	private double diagonalp;
	private double diagonalq;
	private double side;

	public Rhombus(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Diagonal: "+ diagonalp+ ", Diagonal2: " + diagonalq+ ", Side:" + side;
	}

}
