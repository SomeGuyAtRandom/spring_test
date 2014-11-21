package la.random.spring.shapes;

public class Triangle extends Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle(){
		System.out.println("Triangle()");
	}
	
	@Override
	public void draw() {
		System.out.print("Triangle.draw()");
		System.out.print(" with ");
		System.out.print("A: " + pointA.toString());
		System.out.print(",B: " + pointB.toString());
		System.out.print(",C: " + pointC.toString());
		System.out.println();
	}
	
	


}
