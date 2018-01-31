package 并发编程;
public class 买票 implements Runnable {
	Object lock=new Object();
	int cunt=40;
	
	public synchronized void pp() {
		if(cunt!=0) {
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()
					.getName()+"剩于票数"+cunt+"张");
			cunt--;
		}
	}
	public void run() {
		while(cunt>0) {
			pp();	
		}
	}
}
