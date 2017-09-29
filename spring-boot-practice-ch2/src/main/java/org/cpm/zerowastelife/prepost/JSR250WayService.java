package org.cpm.zerowastelife.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct
	public void init() {
		System.out.println("jsr250-init-method");
	}
	
	public JSR250WayService() {
		super();
		System.out.println("constructor-JSR250WayService");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("jsr250-destroy-method");
	}
}
