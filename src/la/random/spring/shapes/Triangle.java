package la.random.spring.shapes;

public class Triangle extends Shape{

	private String type;

	public Triangle(){
		System.out.println("Triangle()");
	}
	
	@Override
	public void draw() {
		System.out.print("Triangle.draw()");
		System.out.print(" with ");
		System.out.print("type " + type);
		System.out.println();
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	


}
