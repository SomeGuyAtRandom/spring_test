package la.random.spring.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle extends Shape implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context;
	
	
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
	
	public Triangle(Point pointA, Point pointB, Point pointC){
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		
		System.out.println("Triangle()");
	}
	
	
	@Override
	public void draw() {
		System.out.print("Triangle.draw()");
		System.out.print(" with ");
		System.out.print("A: " + pointA.toString());
		System.out.print(",B: " + pointB.toString());
		System.out.print(",C: " + pointC.toString());
		System.out.print(",C: " + pointC.toString());
		System.out.println(" "  + this.hashCode());
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Triangle.setApplicationContext()");
		this.context = context;
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Triangle.setBeanName(" + name + ")");
		
		
	}
	
	


}
