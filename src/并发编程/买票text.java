package �������;

public class ��Ʊtext {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable piao =new ��Ʊ();
		Thread p=new Thread(piao);
		Thread p1=new Thread(piao);
		p.start();
		p1.start();
	}
}
