package la.random.spring.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	private double radius;
	private Point center;
	
	public Circle(){
		super();
		System.out.println("Circle()");
		
	}
	
//	public Circle(double radius){
//		this.radius = radius;
//		this.center = new Point(0.0d,0.0d);
//		System.out.println("Circle(radius)");
//	}
	
	
	public Circle(Point center){
		System.out.println("Circle(center)");
	}
	

	@Override
	public void draw() {
		System.out.print("Circle.draw()");
		System.out.print(" with ");
		System.out.print("radius " + radius);
		System.out.print(" and ");
		if(center==null){
			System.out.print("center null");
		} else {
			System.out.print("center " + center.toString());
		}
		System.out.println(" "  + this.hashCode());
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	
	// @Required - for demo 18
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

}
