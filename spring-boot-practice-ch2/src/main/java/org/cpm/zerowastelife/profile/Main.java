package org.cpm.zerowastelife.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
//		context.getEnvironment().setActiveProfiles("prod");
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProfileCondfig.class);
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();

	}

}
