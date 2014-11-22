package la.random.spring.shapes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle extends Shape implements InitializingBean , DisposableBean{
	
	private Point diangle;
	
	public Rectangle(){
		System.out.println("Rectangle()");
	}
	
	public Rectangle(Point diangle){
		System.out.println("Rectangle(diangle)");
	}
	
	@Override
	public void draw(){
		System.out.println("Rectangle.draw() @ point: " + diangle.toString() + "");
	}
	
	public Point getDiangle() {
		return diangle;
	}

	public void setDiangle(Point diangle) {
		this.diangle = diangle;
	}

	public void destroyMethod(){
		System.out.println("Rectangle.destroyMethod()");
	}
	
	public void initMethod(){
		System.out.println("Rectangle.initMethod()");
	}
	
	public void defaultInitMethod(){
		System.out.println("Rectangle.defaultInitMethod()");
	}
	
	
	public void defaultDestroyMethod(){
		System.out.println("Rectangle.defaultDestroyMethod()");
	}
	
	
	
	@Override
	public void destroy() throws Exception{
		System.out.println("Rectangle.destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Rectangle.afterPropertiesSet()");
		
	}
}
