package org.cpm.zerowastelife.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		
		String msg = event.getMsg();
		System.out.println("bean-demoListener has received from bean-demoPublisher: " + msg);
		
	}

}
