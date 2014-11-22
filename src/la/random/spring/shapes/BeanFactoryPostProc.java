package la.random.spring.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProc implements BeanFactoryPostProcessor {

	public BeanFactoryPostProc(){
		System.out.println("BeanFactoryPostProc()");
	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProc.postProcessBeanFactory(beanFactory)");
		
	}

}
