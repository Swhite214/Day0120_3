package set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(15);
		set.add(56);
		set.add(2431);
		set.add(27);
		set.add(234);
		set.add(456);
		set.add(68);
		set.add(9);
		System.out.println(set);
		System.out.println("----");
		
		for(int num: set) {
			System.out.println(num);
		}
	}

}
