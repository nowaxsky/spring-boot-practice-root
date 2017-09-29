package org.cpm.zerowastelife.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;	
	}
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("the name of bean is: " + beanName);
		Resource resource = loader.getResource("classpath:org/cpm/zerowastelife/aware/test.txt");
		try {
			System.out.println("the file content loaded by ResourceLoader is " + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
