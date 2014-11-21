package la.random.spring;

import la.random.spring.shapes.Circle;
import la.random.spring.shapes.Drawing;
import la.random.spring.shapes.Triangle;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		demo01();
		
		
		
	}

	private static void demo02(){
		
		
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
