package la.random.spring.shapes;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
		System.out.println("DrawEvent(obj)");
	}
	
	@Override
	public String toString(){
		return "DrawEvent.toString()";
	}

}
