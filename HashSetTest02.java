package set;

import java.util.HashSet;
import java.util.Objects;

class Person{
	String name;
	public Person(String name) {
		this.name=name;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}//이런식으로 String처럼 재정의해주셔야 중복코드로 인정됩니다.
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Person)obj).name);
	}
}

public class HashSetTest02 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A"); //인덱스없습니다
		set.add("A");
		set.add("A");
		System.out.println("set 크기 : "+set.size());
		set.add(new String("A"));//값을기준으로 판단하기에 중복은 허용안됨
		System.out.println("set 크기 : "+set.size());
		System.out.println(set);
		HashSet<Person> set1 = new HashSet<Person>();
		set1.add(new Person("A"));
		set1.add(new Person("A"));
		set1.add(new Person("A"));
		set1.add(new Person("A"));
		set1.add(new Person("A"));
		System.out.println("set 크기 : "+set1.size());//기본타입이 아닌 객체타입은 중복을 체크못함
		//동일객체로 판단하지 못하는 이유 비교연산시 단순비교(참조값)
		//new String()은 클래스 내부에서 이미 equals와 HashCode()를 오버라이드했기에 값이 똑같으면 같은객체로 판단합니다.
	
		System.out.println(set1);
	}

}
