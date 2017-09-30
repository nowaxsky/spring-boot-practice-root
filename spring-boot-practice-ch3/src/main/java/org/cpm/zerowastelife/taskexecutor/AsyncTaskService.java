package org.cpm.zerowastelife.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("execute async task: " + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("execute async task +1: " + (i+1));
	}
}
