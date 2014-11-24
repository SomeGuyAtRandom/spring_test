package la.random.spring.shapes;

public class Point {
	private double x;
	private double y;
	
	public Point(){
		System.out.println("Point()");
	}
	
	public Point(double x, double y){
		System.out.println("Point(" + x + "," + y + ")");
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}

}
