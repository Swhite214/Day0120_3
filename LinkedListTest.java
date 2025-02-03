package list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("자바");
		list.add(0,"c언어");
		list.add("ORACLE");
		list.add("HTML");
		list.add("자바");
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.remove(0));
		System.out.println(list); //
	}

}
