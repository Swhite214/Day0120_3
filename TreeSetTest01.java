package set;

import java.util.TreeSet;

public class TreeSetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(Integer.valueOf(4));
		set.add(Integer.valueOf(41));
		set.add(Integer.valueOf(213));
		set.add(Integer.valueOf(4123));
		set.add(Integer.valueOf(39285));
		set.add(Integer.valueOf(293));
		set.add(Integer.valueOf(56));
		//set.add(null); 불가능합니다
		System.out.println(set); //오름차순으로 정렬되서 나옵니다.
		System.out.println(set.first());
		System.out.println(set.last()); //정렬한 후에 값이 나옵니다.
		System.out.println(set.lower(213));//213보다 작은요소 중 가장큰값
		System.out.println(set.higher(213));//213보다 큰수 중 가장 작은값
		System.out.println(set.headSet(213));//210보다 작은수 전부다
		System.out.println(set.tailSet(213));//213포함 213보다 큰수
		System.out.println(set.subSet(41,4123)); //41이상 4123미만이네요
		System.out.println(set);//위에 것들은 원본을 변형시키지않아요
		System.out.println(set.pollFirst());//첫번째 요소를 끌어오세요
		System.out.println(set);//와우 가변이네요 끌어온 후 의 값 즉 원본을 변화시키네요
		
	}

}
