package com.dhakre.rohit.producer_consumer;

public class Consumer extends Thread {

	private Queue queue;

	public Consumer(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				Integer value = queue.pop();
				if (value == null) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Consumer is consuming - " + value + ", size -  " + queue.getSize());
					queue.notify();
				}
			}
		}
	}

}
