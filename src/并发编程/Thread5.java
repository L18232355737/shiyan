package ²¢·¢±à³Ì;

public class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<21;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("2");
		}
	
	}
}
