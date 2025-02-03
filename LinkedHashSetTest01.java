package set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest01 {

	public static void main(String[] args) {
		// Linked연결되있다.
		//Hash 처리속도가 빠르다
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("카오스 오브");
		set.add("엑잘티드 오브");
		set.add("신성한 오브");
		set.add("신성한 오브");//중복허용안함 new String또한 안되지만 클래스타입은 오버라이드 하지않는이상 중복인지 아닌지 체크잘못함
		System.out.println(set);//Linked의 특징으로 순서를 보장
		System.out.println(set.contains("사과"));
		System.out.println(set.contains("엑잘티드 오브"));
		
		set.remove("카오스 오브");
		System.out.println(set);
	}

}
