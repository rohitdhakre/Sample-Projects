package com.dhakre.rohit.producer_consumer;

public class Impl {

	public static void main(String[] args) {
		Queue queue = new Queue(50);
		Consumer consumer = new Consumer(queue);
		Thread producer = new Producer(queue); // Thread or Producer
		producer.start();
		consumer.start();
	}

}
