package org.cpm.zerowastelife.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name="註解式攔截的add操作")
	public void add() {};
}
