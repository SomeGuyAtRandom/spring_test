package la.random.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.random.spring.shapes.Circle;
import la.random.spring.shapes.Drawing;
import la.random.spring.shapes.Polygon;
import la.random.spring.shapes.Polygon;
import la.random.spring.shapes.Triangle;

public class Main {

	public static void main(String[] args) {
		demo11();
	}
	
	public static void demo11(){
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
		
		
	}
	public static void demo10(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle1 = (Polygon)context.getBean("triangle1");
		Polygon triangle2 = (Polygon)context.getBean("triangle2");
		Drawing drawing = new Drawing();
		
		drawing.setShape(triangle1);
		drawing.drawShape();
		drawing.setShape(triangle2);
		drawing.drawShape();
	}
	
	public static void demo09(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle1 = (Polygon)context.getBean("triangle1");
		Polygon triangle2 = (Polygon)context.getBean("triangle1");
		
		Drawing drawing = new Drawing();
		drawing.setShape(triangle1);
		drawing.drawShape();
		
		drawing.setShape(triangle2);
		drawing.drawShape();
		
	}
	
	public static void demo08(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle1 = (Polygon)context.getBean("triangle1");
		Polygon triangle2 = (Polygon)context.getBean("triangle2");
		
		Drawing drawing = new Drawing();
		drawing.setShape(triangle1);
		drawing.drawShape();
		
		drawing.setShape(triangle2);
		drawing.drawShape();
		
	}
	
	public static void demo07(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle = (Polygon)context.getBean("polygon");
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
	}
	
	
	public static void demo06(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon polygon = (Polygon)context.getBean("polygon");
		Drawing drawing = new Drawing();
		drawing.setShape(polygon);
		drawing.drawShape();
	}
	
	public static void demo05(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle = (Polygon)context.getBean("RtTriangle");
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
		
	}
	public static void demo04(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle = (Polygon)context.getBean("triangle");
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
		System.out.println("done with triangle part....");
		Circle circle1 = (Circle)context.getBean("circle1");
		drawing.setShape(circle1);
		drawing.drawShape();
		
		Circle circle2 = (Circle)context.getBean("circle2");
		drawing.setShape(circle2);
		drawing.drawShape();
		
		Circle circle3 = (Circle)context.getBean("circle3");
		drawing.setShape(circle3);
		drawing.drawShape();
	}
	public static void demo03(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle = (Polygon)context.getBean("triangle");
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
		System.out.println("done with triangle part....");
		Circle circle = (Circle)context.getBean("circle1");
		drawing.setShape(circle);
		drawing.drawShape();
		
		// Note the following get error : cannot be cast 
		// Circle circle = (Circle)context.getBean("triangle");
		
	}

	private static void demo02(){
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Polygon triangle = (Polygon)context.getBean("triangle");

		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
	}

	private static void demo01(){
		// Polymorphic demo
		Drawing drawing = new Drawing();
		Polygon triangle = new Polygon();
		drawing.setShape(triangle);
		drawing.drawShape();
		
		Circle circle = new Circle();
		drawing.setShape(circle);
		drawing.drawShape();
	}

}
