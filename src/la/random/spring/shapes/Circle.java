package la.random.spring.shapes;

public class Circle extends Shape{
	
	private String color;
	private int radius;
	
	public Circle(){
		super();
		System.out.println("Circle()");
		
	}
	public Circle(int radius){
		this.radius = radius;
		this.color = "none";
		System.out.println("Circle(radius)");
	}
	
	public Circle(String color, int radius){
		this.radius = radius;
		this.color = color;
		System.out.println("Circle(color, radius)");
	}
	
	public Circle(String color){
		this.radius = -1;
		this.color = color;
		System.out.println("Circle(color)");
	}
	
	@Override
	public void draw() {
		System.out.print("Circle.draw()");
		System.out.print(" with ");
		System.out.print("radius " + radius);
		System.out.print(" and ");
		System.out.print("color " + color);
		System.out.println(" "  + this.hashCode());
		
	}

}
