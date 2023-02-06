package com.greedy.section02.daemon;

public class CountDown extends Thread {
	
	@Override
	public void run() {
		for(int i = 50; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}

}
