package com.bvr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class Producer implements CommandLineRunner{

	public Producer() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired 
	private Queue queue;
	
	public void send(String msg) {
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		send("JMS MESSAGE FROM ORACLE");
		System.out.println("\n ----------message was sent to queue from producer -----------\n now consumer will be automatically called beacuse of event based task");
	}
}
