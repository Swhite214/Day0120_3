package list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList와 사용방법이 동일
		//거의 유일한 차이점 arraylist는 없지만
		//벡터에는add등 일부메서드에는 synchronized가 붙는다
		//synchronized는 메서드를 블록킹을 막습니다(동시처리 불가)
		//멀티스레드 상에서 동시처리를 막습니다.
		Vector<String> list = new Vector<String>();
		list.add("카리나");
		list.add(new String("윈터"));
		
		System.out.println("사이즈: "+list.size());
		System.out.println("index 0: "+list.get(0));
		System.out.println("index 1: "+list.get(1));
		System.out.println(list);
		list.add(1,"아이유");
		System.out.println(list);
		System.out.println("사이즈: "+list.size());
		list.add(2,"지젤");
		System.out.println(list);
		
		list.add("차은우");
		System.out.println("사이즈: "+list.size());
		list.remove(4);
		System.out.println("사이즈: "+list.size());
		System.out.println(list);
		list.add("카리나");
		System.out.println(list);//중복허용합니다 왜? 인덱스로 구별이 가능하기에
		//add랑 set헷갈리면안됩니다.
	}

}
