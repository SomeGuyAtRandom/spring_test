package la.random.spring.shapes;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class EventListener implements ApplicationListener {
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.print("EventListener.onApplicationEvent(event) :");
		System.out.println(event.toString());
	}

}
