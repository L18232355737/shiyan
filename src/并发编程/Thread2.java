package �������;


public class Thread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++){
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�Է�1");
		}
	}
}
