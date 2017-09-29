package org.cpm.zerowastelife.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name="annotation aop add")
	public void add() {};
}
