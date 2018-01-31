package shiyan;

import java.util.Scanner;

public class 键盘接收 {
	public static void main(String [] agrs) {
		int i=1;
		int a=0;
		int sum=0;
		while(true) {
			Scanner sca=new Scanner(System.in);
			System.out.println("请输入要相加的第"+i+"个数;如果输入10怎么结束计算");
			a=sca.nextInt();
			sum+=a;
			i++;
			if(a==10) {
				System.out.println("-----------------------------");
				System.out.println("结果是："+sum);
				break;
			}
		}
		
		
	}
}
