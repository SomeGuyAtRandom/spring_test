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
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProc.postProcessAfterInitialization(bean, beanName:'" + beanName +"')");
		return bean;
	}

}
