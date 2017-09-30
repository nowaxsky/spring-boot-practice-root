package org.cpm.zerowastelife.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outputResult() {
		System.out.println("get bean from combination annotation config");
	}
}
