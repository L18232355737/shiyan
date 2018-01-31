package ²¢·¢±à³Ì;

public class Thread3 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++){
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("12");
		}
	}

}
