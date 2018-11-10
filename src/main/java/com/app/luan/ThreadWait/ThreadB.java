package com.app.luan.Thread.ThreadWait;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock){
		super();
		this.lock = lock;
	}

	@Override
	public void run(){
		synchronized (lock){
			for (int i = 0 ; i < 10 ; i++){
				MyList.add();
				if (MyList.size() == 5){
					lock.notify();
					System.out.println("以及发出去通知了!");
				}
				System.out.println("添加了"+(i+1)+"个元素！");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
