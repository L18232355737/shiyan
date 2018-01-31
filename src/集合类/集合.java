package 集合类;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 集合 {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("123456");
		set.add("asdfaa");
		set.add(789456);
		for(Object aa:set) {
			System.out.println(aa);
		}
		
		Map map=new HashMap();
		map.put(1, "adfdf");
		map.put(2, "11111");
		map.put(3, "李帅岭");
		Set set1=map.keySet();
		for(Object key:set1) {
			System.out.println(map.get(key));
		}
		
		List list=new ArrayList();
		list.add("大");
		list.add("傻");
		list.add("二");
		list.add("傻");
		list.size();
		System.out.print(list.contains("大"));
		for(Object li:list) {
			System.out.print(li);
		}
	}
	

}
