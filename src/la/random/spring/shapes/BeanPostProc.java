package la.random.spring.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProc implements BeanPostProcessor{

	public BeanPostProc(){
		System.out.println("BeanPostProc()");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProc.postProcessBeforeInitialization(bean, beanName:'" + beanName +"')");
		
		if(beanName.equals("diangle")){
			System.out.println("in postProcessBeforeInitialization");
			bean  = new Point(10.0,11.0);
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProc.postProcessAfterInitialization(bean, beanName:'" + beanName +"')");
		
		if(beanName.equals("diangle")){
			System.out.println("in postProcessAfterInitialization");
			bean  = new Point(11.0,12.0);
		}
		
		return bean;
	}

}
