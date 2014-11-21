package la.random.spring.shapes;

import java.util.List;


public class Polygon extends Shape {
	
	private List<Point>points;

	public Polygon(){
		System.out.println("Polygon()");
	}
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	@Override
	public void draw() {
		System.out.print("Polygon.draw()");
		System.out.print(" with ");
		for(Point point : points){
			System.out.print(" " + point.toString());
		}
		System.out.println();
	}
	
	

}
