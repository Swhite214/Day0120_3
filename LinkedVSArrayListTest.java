package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVSArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<String>();
		long start=0;
		long end=0;
		start = System.nanoTime(); //long타입의 나노타임 당연히 클래스변수 static
		for(int i =0; i<100; i++) {
			arrList.add(0, ""+ i);
		}
		end = System.nanoTime();
		System.out.println("ArrayList처리시간 : " + (end-start));
		System.out.println("-------");
		LinkedList<String> linkedList = new LinkedList<String>();
		
		start = System.nanoTime();
		for(int i =0; i<100; i++) {
			linkedList.add(0, ""+ i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList처리시간 : " + (end-start));
	} //linkedlist가 압도적으로 빠르네요 약 20배 (중간삽입 삭제시)
}
