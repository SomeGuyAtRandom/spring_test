package la.random.spring.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, ApplicationContextAware, 
										BeanNameAware, InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext applicationContext;
	
	public Triangle(){
		System.out.println("Triangle()");
	}

	public Triangle( Point pointA,  Point pointB,  Point pointC){
		System.out.println("Triangle(A,B,C)");
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		
	}

	@Override
	public void draw() {
		System.out.print("Triangle.draw()");
		System.out.print(" with ");
		if(pointA==null){
			System.out.print("A: null");
		}else {
			System.out.print("A: " + pointA.toString());
		}
		if(pointB==null){
			System.out.print(", B: null");
		}else {
			System.out.print(", B: " + pointB.toString());
		}
		if(pointC==null){
			System.out.print("C: null");
		}else {
			System.out.print(", C: " + pointC.toString());
		}
		System.out.println(" "  + this.hashCode());
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle.afterPropertiesSet()");
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Triangle.setBeanName(" + name +")");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("Triangle.setApplicationContext()");
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Triangle.destroy()");
		
	}

}
