//Enkhbaatar Idersaikhan 3112121
package griffith;

public abstract class Shape {

	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double area();
	public abstract double perimeter();
	
	@Override
	public String toString() {
		return "Shape: " + name;
	}	
}