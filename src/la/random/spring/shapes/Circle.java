package la.random.spring.shapes;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(){
		super();
		System.out.println("Circle()");
		
	}
	public Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.print("Circle.draw()");
		System.out.print(" with ");
		System.out.print("radius " + radius);
		System.out.println();
		
	}

}
