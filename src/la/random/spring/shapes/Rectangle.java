package la.random.spring.shapes;

public class Rectangle extends Shape{
	
	private Point diangle;
	
	public Rectangle(){
		System.out.println("Rectangle()");
	}
	
	public Rectangle(Point diangle){
		System.out.println("Rectangle(diangle)");
	}
	
	@Override
	public void draw(){
		System.out.println("Rectangle.draw()");
	}
	
	public Point getDiangle() {
		return diangle;
	}

	public void setDiangle(Point diangle) {
		this.diangle = diangle;
	}

	public void init(){
		System.out.println("Rectangle.init()");
	}
	
	@Override
	public void destroy() throws Exception{
		System.out.println("Rectangle.destroy()");
	}
}
