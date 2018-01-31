package ºØ∫œ¿‡;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringBuffer {

	public static void main(java.lang.String[] args) {
	/*	String str=new String("aaa");
		String aa=new String("aaa");
		System.out.println(str.equals(aa));*/
		
		
		/*StringBuffer str=new StringBuffer();
		str.append("123");
		str.append("aa");
		System.out.println(str);
		StringBuilder builder=new StringBuilder();
		builder.append(13);
		builder.append(111);
		System.out.println(builder);*/
		
		HashSet set=new HashSet();
		set.add("111111");
		set.add("222222");
		set.add("222223");
		set.add("222224");
		set.add("222225");
		set.add("222222");
		for(Object ss:set) {
			System.out.println(ss);
		}
		
		
		
		/*ArrayList list=new ArrayList();
		list.add(123);
		list.add(456);
		list.add(4567);
		list.remove(1);
		list.add(1, "asdf");
		for(Object li:list) {
		System.out.println(li);}*/
		
		
		/*HashMap map=new HashMap();
		map.put(1, "123");
		map.put(2, "456");
		map.put(3, "789");
		Set set=map.keySet();
		for(Object key:set) {
			System.out.println(map.get(key));
			
		}*/
		
		
		/*HashMap n=new HashMap();
		n.put(1, 123);
		n.put(2, 456);
		n.put(3, 789);
		Set set=n.keySet();

		for(Object mm:set) {
			System.out.print(n.get(mm));
		}*/
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
