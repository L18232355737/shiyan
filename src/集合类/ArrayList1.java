package ¼¯ºÏÀà;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(StringBuffer[] args) {
		List list=new ArrayList();

		System.out.println(list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
