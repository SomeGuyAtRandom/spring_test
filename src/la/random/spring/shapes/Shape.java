package la.random.spring.shapes;

public class Shape {
	
	public Shape(){
		System.out.println("Shape()");
	}
	
	public void draw(){
		System.out.println("Shape.draw()");
	}
	
	public void destroy() throws Exception{
		System.out.println("Shape.destroy()");
	}


}
