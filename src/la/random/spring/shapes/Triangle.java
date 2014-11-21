package la.random.spring.shapes;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle extends Shape implements ApplicationContextAware, BeanNameAware {
	
	private List <Point> points;
	
	
	private ApplicationContext context;
	
	
	public Triangle(){
		System.out.println("Triangle()");
	}
	
	public Triangle(List <Point> points){
		this.points = points;
		System.out.println("Triangle(points)");
	}
	
	
	@Override
	public void draw() {
		System.out.print("Triangle.draw()");
		System.out.print(" with ");

		for(Point p : points){
			if(p==null){
				System.out.print("p: null");
			} else {
				System.out.print("p: " + p.toString());
			}
		}
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

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	


}
