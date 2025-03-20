//Enkhbaatar Idersaikhan 3112121
package griffith;

public class RightAngledTriangle extends Shape{
	private double base;
	private double height;
	private double hypotenuse;

	public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
		super(name);
		this.base = base;
		this.height = height;
		this.hypotenuse = hypotenuse;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getHypotenuse() {
		return hypotenuse;
	}
	
	@Override
	public double area() {
		return base * height/2;
	}

	@Override
	public double perimeter() {
		return base+height+hypotenuse;
	}
	
	@Override
	public String toString() {
		return "Shape: "+getName()+ ", Base: "+ base+", Height: "+ height+ ", Hypotenuse:" + hypotenuse;
	}
}
