package list;

import java.util.ArrayList;
import java.util.List;

class Person2{
	String name;
	int age;
	public Person2(String name, int age) {
		// TODO Auto-generated constructor stub
	
		this.name=name;
		this.age=age;
	}
	
	
	
}
public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션을 사용시에는 기본형 타입의 집합은 잘 사용하지 않아요 클래스타입으로 많이씁니다.
		//웹개발자 기준
		List<Person2> list = new ArrayList<>(); //Person2만 허용
		Person2[] arr; //Person2들의 집합
		//강한타입체크
		//list.add(10); 허용하지않습니다. 자동으로 컴파일러가 체크해줍니다.
		list.add(new Person2("배고파이젠",20));
		list.add(new Person2("배고파이젠",40));
		
		for(Person2 p:list) {//제네릭으로 타입을 강화해주었기에 Object가아닌 클래스타입
			//캐스팅이 필요가없어졌어요 => 아니근데 그건그냥 단지 리스트에 모든 타입 짬때려서 벌어진일 아닌가?
			System.out.println("이름: " + p.name);
			System.out.println("나이: "+p.age);
			//제네릭을 쓰는이유 보셨죠? 다른요소를 못넣게 방지도되고 그러다보니 캐스팅도 필요없어져요
		}
		
		}
	}

