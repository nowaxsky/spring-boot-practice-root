package org.cpm.zerowastelife.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("execute every 5 second: " + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "*/10 * 22 ? * *")
	public void fixTimeExecution() {
		System.out.println("execute at specific time: " + dateFormat.format(new Date()));
	}
}
