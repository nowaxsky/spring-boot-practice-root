package org.cpm.zerowastelife.prepost;

public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService() {
		super();
		System.out.println("constructor-BeanWayService");
	}
	
	public void destroy() {
		System.out.println("@Bean-destroy-methodW");
	}
}
