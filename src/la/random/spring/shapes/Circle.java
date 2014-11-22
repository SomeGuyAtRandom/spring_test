package la.random.spring.shapes;

public class Circle implements Shape{
	
	private double radius;
	private Point center;
	
	public Circle(){
		super();
		System.out.println("Circle()");
		
	}
	public Circle(double radius){
		this.radius = radius;
		this.center = new Point(0.0d,0.0d);
		System.out.println("Circle(radius)");
	}
	
	public Circle(String color, double radius){
		this.radius = radius;
		System.out.println("Circle(color, radius)");
	}
	

	@Override
	public void draw() {
		System.out.print("Circle.draw()");
		System.out.print(" with ");
		System.out.print("radius " + radius);
		System.out.print(" and ");
		System.out.print("center " + center.toString());
		System.out.println(" "  + this.hashCode());
		
	}

}
