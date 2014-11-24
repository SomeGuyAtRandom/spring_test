package la.random.spring.shapes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//  Types 
// @Component //generic..
// @Service
// @Repository
@Controller
public class Circle implements Shape {

	private double radius;
	private Point center;

	@Autowired
	private MessageSource messageSource;

	public Circle() {
		super();
		System.out.println("Circle()");

	}

	// public Circle(double radius){
	// this.radius = radius;
	// this.center = new Point(0.0d,0.0d);
	// System.out.println("Circle(radius)");
	// }

	public Circle(Point center) {
		System.out.println("Circle(center)");
	}

	@Override
	public void draw() {

		if (messageSource == null) {

			System.out.print("Circle.draw()");
			System.out.print(" with ");
			System.out.print("radius " + radius);
			System.out.print(" and ");
			if (center == null) {
				System.out.print("center null");
			} else {
				System.out.print("center " + center.toString());
			}
			System.out.println("message source is **null** ");
			
		} else {
			Object[] args = new Object[] {getRadius(), center.getX(), center.getY()};
			String msg = messageSource.getMessage("circle.draw", args, "cound not find circle.draw in properties", null);
			System.out.println(msg);
			System.out.println("message source is **not null** ");
		}
		System.out.println(" " + this.hashCode());


	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
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
	// @Autowired
	// @Qualifier("circleRelated")
	// tutorial 20
	@Resource(name = "pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Circle.initializeCircle()");
	}

	@PreDestroy
	public void distroyCircle() {
		System.out.println("Circle.distroyCircle()");
	}

}
