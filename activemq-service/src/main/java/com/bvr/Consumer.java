package com.bvr;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	
	@JmsListener(destination="bvr.queue")
	public void receiveQueue(String text) {
		System.out.println("\n Consumer - listener program is diplaying below data");
		System.out.println(text);
	}
}
