package org.cpm.zerowastelife.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("org.cpm.zerowastelife.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
