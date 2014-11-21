package la.random.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import la.random.spring.shapes.Circle;
import la.random.spring.shapes.Drawing;
import la.random.spring.shapes.Triangle;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		demo02();
		
		
		
	}

	private static void demo02(){
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
		
	}

	private static void demo01(){
		// Polymorphic demo
		Drawing drawing = new Drawing();
		Triangle triangle = new Triangle();
		
		drawing.setShape(triangle);
		drawing.drawShape();
		
		Circle circle = new Circle();
		
		drawing.setShape(circle);
		drawing.drawShape();
	}

}
