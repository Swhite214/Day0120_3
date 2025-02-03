package set;

import java.util.HashSet;
import java.util.Iterator;//자바유틸에있는거지 스윙으로하면 안됩니다.

public class HashSetTest {

	public static void main(String[] args) {
		// HashSet: 해시기반, 가장 많이 사용
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100); //인덱스없습니다
		set.add(10);
		set.add(1);
		
		System.out.println("set 크기 : "+set.size());
		System.out.println(set);
		set.add(100);//중복허용이안되므로 사이즈 변함없음
		System.out.println("set 크기 : "+set.size());
		System.out.println(set);
		//인덱스가 없기때문에 단독으로 읽기기능이없어요(get) iterator를 이용합니다.
		
		Iterator <Integer> it =set.iterator();
		while(it.hasNext()) {
			int num=(int)it.next();//언박싱
			System.out.println(num);
		}
		//혹은
		for(int num:set) {
			System.out.println(num);
		}
	}

}
