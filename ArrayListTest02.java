package list;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
	
		this.name=name;
		this.age=age;
	}
	
	
	
}
public class ArrayListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션을 사용시에는 기본형 타입의 집합은 잘 사용하지 않아요 클래스타입으로 많이씁니다.
		//웹개발자 기준
		List list = new ArrayList();
		list.add(new Person("졸려",10));
		list.add(new Person("졸려ds",20));
		
		for(Object obj : list) {
			if(obj instanceof Person) {
			Person person = (Person)obj;
			System.out.println(person.age);
			System.out.println(person.name);
			}
			else if(obj instanceof Integer) {
				Integer Person=(Integer) obj;
			}
			
		}
	}

}
