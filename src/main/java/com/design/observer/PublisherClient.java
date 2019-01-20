package com.design.observer;

public class PublisherClient {

	public static void main(String[] args) {

		// creating topic.
		Topic topic = new TopicImpl();

		Message m = new Message("11211", "Hello india");
		Message m1 = new Message("11212", "Hello Singapore");
		String messageKey1 = "32DACVCG";
		String messageKey2 = "32DACVKY";
		

		// creating consumer
		ConsumerGroup o1 = new Consumer1(topic);
		ConsumerGroup o2 = new Consumer2(topic);

		// Adding consumer
		topic.addConsumer(o1);
		topic.addConsumer(o2);

		// Creating publisher.
		IPublisher p1 = new Publisher1(topic);
		IPublisher p2 = new Publisher1(topic);

		// Publishing message
		p1.publish(messageKey1, m);
		p2.publish(messageKey1, m);
		
		p1.publish(messageKey2, m1);
		p2.publish(messageKey2, m1);
		
	}
} 


		
