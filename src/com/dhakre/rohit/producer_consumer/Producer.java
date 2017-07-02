package com.dhakre.rohit.producer_consumer;

import java.util.Random;

public class Producer extends Thread {

	private Queue queue;

	public Producer(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			synchronized (queue) {
				Integer value = queue.push(random.nextInt(100));
				if (value == null) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Producer is producing - " + value + ", size - " + queue.getSize());
					queue.notify();
				}
			}
		}
	}

}
