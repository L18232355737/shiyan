package shiyan;

import java.util.Scanner;

public class ���̽��� {
	public static void main(String [] agrs) {
		int i=1;
		int a=0;
		int sum=0;
		while(true) {
			Scanner sca=new Scanner(System.in);
			System.out.println("������Ҫ��ӵĵ�"+i+"����;�������10��ô��������");
			a=sca.nextInt();
			sum+=a;
			i++;
			if(a==10) {
				System.out.println("-----------------------------");
				System.out.println("����ǣ�"+sum);
				break;
			}
		}
		
		
	}
}
