package �������;
public class ��Ʊ implements Runnable {
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
					.getName()+"ʣ��Ʊ��"+cunt+"��");
			cunt--;
		}
	}
	public void run() {
		while(cunt>0) {
			pp();	
		}
	}
}
