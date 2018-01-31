package ²¢·¢±à³Ì;

public class Text {

	public static void main(String[] args) {
//		Thread a=new Thread1();
//		Thread b=new Thread2();
//		Runnable r=new Thread3();
//		Thread c=new Thread(r);
//		a.start();
//		b.start();
//		c.start();
//		System.out.println("");
		Thread a=new Thread4();
		Thread b=new Thread5();
		Runnable r=new Thread6();
		Thread c=new Thread(r);
		a.start();
		b.start();
		c.start();
	}

}
