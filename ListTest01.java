package list;

import java.util.ArrayList;

class AAA{
	int x;
	int y;
	public int print(int x, int y) {
		return x+y;
	}
}
public class ListTest01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//기본적으로 모든타입을 저장가능 특별히 지정안할시 Object타입
		list.add(null);	//매개변수의 다형성 자기보다 작은타입을 담을수있습니다.
		list.add(3.14);
		list.add("문자열");
		list.add(new AAA());
		list.add(10);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		}
}
