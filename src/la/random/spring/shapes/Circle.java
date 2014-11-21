package la.random.spring.shapes;

public class Circle extends Shape{
	
	public Circle(){
		super();
		System.out.println("Circle()");
		
	}
	
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

}
