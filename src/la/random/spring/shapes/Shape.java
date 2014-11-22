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
	
	public void cleanUp(){
		System.out.println("Shape.cleanUp()");
	}
	
	public void init(){
		System.out.println("Shape.init()");
	}
	
	public void defaultInitMethod(){
		System.out.println("Shape.defaultInitMethod()");
	}
	
	
	public void defaultDestroyMethod(){
		System.out.println("Shape.defaultDestroyMethod()");
	}
	


}
