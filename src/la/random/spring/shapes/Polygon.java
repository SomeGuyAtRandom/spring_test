package la.random.spring.shapes;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Polygon extends Shape implements ApplicationContextAware, BeanNameAware, InitializingBean {
	
	private List <Point> points;
	private ApplicationContext context;
	
	
	public Polygon(){
		System.out.println("Triangle()");
	}
	
	public Polygon(List <Point> points){
		this.points = points;
		System.out.println("Polygon(points)");
	}
	
	
	@Override
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

	// ApplicationContextAware
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Polygon.setApplicationContext()");
		this.context = context;
	}

	// BeanNameAware
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Polygon.setBeanName(" + name + ")");
		
		
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	
	// InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Polygon.afterPropertiesSet()");
	}
	
	


}
