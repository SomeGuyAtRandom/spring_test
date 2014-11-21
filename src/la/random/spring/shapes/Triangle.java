package la.random.spring.shapes;

public class Triangle extends Shape{
	
	public Triangle(){
		System.out.println("Triangle()");
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}


}
