package la.random.spring.shapes;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Polygon {
	
	private List <Point> points;
	
	public Polygon(){
		System.out.println("Polygon()");
	}
	
	public Polygon(List <Point> points){
		this.points = points;
		System.out.println("Polygon(points)");
	}
	
	
	public void draw() {
		System.out.print("Polygon.draw()");
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


	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

}
