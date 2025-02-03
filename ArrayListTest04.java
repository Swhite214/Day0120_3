package list;

import java.util.ArrayList;

public class ArrayListTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		//데이터 삽입(중간삽입도가능! 자동으로 인덱스 밀어줘요),삭제,읽기,검색
		//인덱스를 제공합니다.
		list.add(1);//index 0
		list.add(2);
		
		Integer b=list.get(0); //index 0번인덱스
		
		System.out.println(b);
		
		list.add(0,10);
		System.out.println(list);//0번인덱스에 10을 넣은상태에요 이러면 인덱스가 하나씩 밀립니다.
		list.add(100); //이렇게 추가할시 제일 마지막 인덱스에 추가됩니다.
		System.out.println(list);
		list.set(0, 5);
		System.out.println(list);
		list.remove(3);//인덱스번호임
		System.out.println(list);
		list.remove((Integer)5);//이렇게도가능합니다.
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);//와우 전부 비워지네요~
	}

}
