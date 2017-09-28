package org.cpm.zerowastelife.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.cpm.zerowastelife.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
