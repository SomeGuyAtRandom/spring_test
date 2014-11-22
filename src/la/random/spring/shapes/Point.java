package la.random.spring.shapes;

public class Point {
	private int x;
	private int y;
	
	public Point(){
		System.out.println("Point()");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	public void cleanUp(){
		System.out.println("Point.cleanUp()");
	}
	
	public void init(){
		System.out.println("Point.init()");
	}
	
	public void defaultInitMethod(){
		System.out.println("Point.defaultInitMethod()");
	}
	
	
	public void defaultDestroyMethod(){
		System.out.println("Point.defaultDestroyMethod()");
	}

}
