package la.random.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.random.spring.shapes.Circle;
import la.random.spring.shapes.Drawing;
import la.random.spring.shapes.Polygon;
import la.random.spring.shapes.Polygon;
import la.random.spring.shapes.Vector;
import la.random.spring.shapes.Triangle;

public class Main {

	public static void main(String[] args) {
		// demo00_old_school();
		// demo01_intro_drawing_obj();
		// demo02_spring_xml();
		// demo03_spring_xml_value_set();
		// demo04_constructor_injection();
		// demo05_autowire();
		// demo06_collections();
		// demo07_autowire_byType();
		// demo08_application_context();
		// demo09_parent_bean();
		// demo10_lifecycle();
		// demo08_application_context();
		// demo11_bean_postProcessor();
		demo12_bean_postProcessor();
		
	}
	
	private static void demo12_bean_postProcessor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-15.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		
	}
	
	private static void demo11_bean_postProcessor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-14.xml");
		Vector vector = (Vector) context.getBean("vector");
		vector.draw();
		
		
	}
	private static void demo10_lifecycle(){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-14.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}
	
	private static void demo09_parent_bean(){

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-13.xml");
		Triangle triangle1 = (Triangle) context.getBean("triangle-parent");
		Triangle triangle2= (Triangle) context.getBean("triangle");
		Triangle triangle3 = (Triangle) context.getBean("triangle-child");
		Triangle triangle4 = (Triangle) context.getBean("triangle-over");

		triangle1.draw();
		triangle2.draw();
		triangle3.draw();
		triangle4.draw();
	}
	
	private static void demo08_application_context(){

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-12.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
	
	private static void demo07_autowire_byType(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-10.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		Circle circle2 = (Circle) context.getBean("circle2");
		circle2.draw();
	}

	private static void demo06_collections(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-09.xml");
		Polygon polygon = (Polygon) context.getBean("square");
		polygon.draw();
	}

	private static void demo05_autowire(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-08.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Vector vector = (Vector) context.getBean("vector");
		vector.draw();
		
		Vector vector2 = (Vector) context.getBean("vector2");
		vector2.draw();
		
	}

	private static void demo04_constructor_injection() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-06.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

	private static void demo03_spring_xml_value_set() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-05.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

	private static void demo02_spring_xml() {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

	private static void demo01_intro_drawing_obj() {
		// Polymorphic demo
		Drawing drawing = new Drawing();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();

		drawing.setShape(triangle);
		drawing.drawShape();

		drawing.setShape(circle);
		drawing.drawShape();
	}

	private static void demo00_old_school() {
		Triangle triangle = new Triangle();
		Circle circle = new Circle();

		circle.draw();
		triangle.draw();

	}

}
