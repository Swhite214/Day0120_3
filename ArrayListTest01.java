package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();//Arraylist는 List라는 인터페이스를 부모로둔클래스입니다.
		list.add(10);
		list.add(3.14);
		list.add("문자열");
		list.add(new AAA());
		list.add(null); 
		
		for(int i=0; i<list.size(); i++) {
			Object data = list.get(i);
			if(data instanceof Integer) {//instanceof는 이 데이터타입이 인티저라면
				Integer num =(Integer) data;
				num++;
			}
			System.out.println(data);
		}
		
		int readCount=(int) list.get(0);
		list.set(4, readCount++);
		System.out.println(list);
		
		String title=(String) list.get(2);
		list.set(2, title);
		System.out.println(list);
		
		Object obj = list.get(3);
		//부모는 자식 클래스의 멤버에는 접근불가
		if(obj instanceof AAA) {
			AAA a=(AAA) list.get(3);
			System.out.println(a.x);
			System.out.println(a.y);
		}
		//결론: 컬렉션을 제네릭 없이 사용시 불편함? 네
		//사용시 강제 캐스팅해야하므로 동일한 객체 아니면 if문을 통해서 처리해야하는등
		//불편사항발생 특히 일일이 저거 instanceof치기 빡셈
	}

}
